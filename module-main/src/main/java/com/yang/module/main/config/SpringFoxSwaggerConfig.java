//package com.yang.module.main.config;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Controller;
//import org.springframework.util.ReflectionUtils;
//import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.spring.web.plugins.WebFluxRequestHandlerProvider;
//import springfox.documentation.spring.web.plugins.WebMvcRequestHandlerProvider;
//
//import java.lang.reflect.Field;
//import java.util.List;
//import java.util.stream.Collectors;
//
////@EnableOpenApi
////@Configuration
//public class SpringFoxSwaggerConfig {
//
//    /**
//     * 配置基本信息
//     * @return
//     */
//    @Bean
//    public ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Swagger Test App Restful API")
//                .description("swagger test app restful api")
//                .termsOfServiceUrl("https://github.com/geekxingyun")
//                .contact(new Contact("技术宅星云","https://xingyun.blog.csdn.net","fairy_xingyun@hotmail.com"))
//                .version("1.0")
//                .build();
//    }
//
//    /**
//     * 配置文档生成最佳实践
//     * @param apiInfo
//     * @return
//     */
//    @Bean
//    public Docket createRestApi(ApiInfo apiInfo) {
//        return new Docket(DocumentationType.OAS_30)
//                .apiInfo(apiInfo)
//                .groupName("SwaggerGroupOneAPI")
//                .select()
//                .apis(RequestHandlerSelectors.withClassAnnotation(Controller.class))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    /**
//     * 增加如下配置可解决Spring Boot 6.x 与Swagger 3.0.0 不兼容问题
//     **/
//    @Bean
//    public static BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
//        return new BeanPostProcessor() {
//
//            @Override
//            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//                if (bean instanceof WebMvcRequestHandlerProvider || bean instanceof WebFluxRequestHandlerProvider) {
//                    customizeSpringfoxHandlerMappings(getHandlerMappings(bean));
//                }
//                return bean;
//            }
//
//            private <T extends RequestMappingInfoHandlerMapping> void customizeSpringfoxHandlerMappings(List<T> mappings) {
//                List<T> copy = mappings.stream()
//                        .filter(mapping -> mapping.getPatternParser() == null)
//                        .collect(Collectors.toList());
//                mappings.clear();
//                mappings.addAll(copy);
//            }
//
//            @SuppressWarnings("unchecked")
//            private List<RequestMappingInfoHandlerMapping> getHandlerMappings(Object bean) {
//                try {
//                    Field field = ReflectionUtils.findField(bean.getClass(), "handlerMappings");
//                    field.setAccessible(true);
//                    return (List<RequestMappingInfoHandlerMapping>) field.get(bean);
//                } catch (IllegalArgumentException | IllegalAccessException e) {
//                    throw new IllegalStateException(e);
//                }
//            }
//        };
//    }
//}
