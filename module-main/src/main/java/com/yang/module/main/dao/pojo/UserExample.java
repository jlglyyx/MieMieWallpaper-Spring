package com.yang.module.main.dao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andRimTokenIsNull() {
            addCriterion("rim_token is null");
            return (Criteria) this;
        }

        public Criteria andRimTokenIsNotNull() {
            addCriterion("rim_token is not null");
            return (Criteria) this;
        }

        public Criteria andRimTokenEqualTo(String value) {
            addCriterion("rim_token =", value, "rimToken");
            return (Criteria) this;
        }

        public Criteria andRimTokenNotEqualTo(String value) {
            addCriterion("rim_token <>", value, "rimToken");
            return (Criteria) this;
        }

        public Criteria andRimTokenGreaterThan(String value) {
            addCriterion("rim_token >", value, "rimToken");
            return (Criteria) this;
        }

        public Criteria andRimTokenGreaterThanOrEqualTo(String value) {
            addCriterion("rim_token >=", value, "rimToken");
            return (Criteria) this;
        }

        public Criteria andRimTokenLessThan(String value) {
            addCriterion("rim_token <", value, "rimToken");
            return (Criteria) this;
        }

        public Criteria andRimTokenLessThanOrEqualTo(String value) {
            addCriterion("rim_token <=", value, "rimToken");
            return (Criteria) this;
        }

        public Criteria andRimTokenLike(String value) {
            addCriterion("rim_token like", value, "rimToken");
            return (Criteria) this;
        }

        public Criteria andRimTokenNotLike(String value) {
            addCriterion("rim_token not like", value, "rimToken");
            return (Criteria) this;
        }

        public Criteria andRimTokenIn(List<String> values) {
            addCriterion("rim_token in", values, "rimToken");
            return (Criteria) this;
        }

        public Criteria andRimTokenNotIn(List<String> values) {
            addCriterion("rim_token not in", values, "rimToken");
            return (Criteria) this;
        }

        public Criteria andRimTokenBetween(String value1, String value2) {
            addCriterion("rim_token between", value1, value2, "rimToken");
            return (Criteria) this;
        }

        public Criteria andRimTokenNotBetween(String value1, String value2) {
            addCriterion("rim_token not between", value1, value2, "rimToken");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Integer value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Integer value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Integer value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Integer value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Integer value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Integer> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Integer> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Integer value1, Integer value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Integer value1, Integer value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("user_age is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("user_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(Integer value) {
            addCriterion("user_age =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(Integer value) {
            addCriterion("user_age <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(Integer value) {
            addCriterion("user_age >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_age >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(Integer value) {
            addCriterion("user_age <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(Integer value) {
            addCriterion("user_age <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<Integer> values) {
            addCriterion("user_age in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<Integer> values) {
            addCriterion("user_age not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(Integer value1, Integer value2) {
            addCriterion("user_age between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_age not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(String value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(String value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(String value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(String value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(String value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLike(String value) {
            addCriterion("user_birthday like", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotLike(String value) {
            addCriterion("user_birthday not like", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<String> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<String> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(String value1, String value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(String value1, String value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserDescribeIsNull() {
            addCriterion("user_describe is null");
            return (Criteria) this;
        }

        public Criteria andUserDescribeIsNotNull() {
            addCriterion("user_describe is not null");
            return (Criteria) this;
        }

        public Criteria andUserDescribeEqualTo(String value) {
            addCriterion("user_describe =", value, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserDescribeNotEqualTo(String value) {
            addCriterion("user_describe <>", value, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserDescribeGreaterThan(String value) {
            addCriterion("user_describe >", value, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("user_describe >=", value, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserDescribeLessThan(String value) {
            addCriterion("user_describe <", value, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserDescribeLessThanOrEqualTo(String value) {
            addCriterion("user_describe <=", value, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserDescribeLike(String value) {
            addCriterion("user_describe like", value, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserDescribeNotLike(String value) {
            addCriterion("user_describe not like", value, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserDescribeIn(List<String> values) {
            addCriterion("user_describe in", values, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserDescribeNotIn(List<String> values) {
            addCriterion("user_describe not in", values, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserDescribeBetween(String value1, String value2) {
            addCriterion("user_describe between", value1, value2, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserDescribeNotBetween(String value1, String value2) {
            addCriterion("user_describe not between", value1, value2, "userDescribe");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIsNull() {
            addCriterion("user_money is null");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIsNotNull() {
            addCriterion("user_money is not null");
            return (Criteria) this;
        }

        public Criteria andUserMoneyEqualTo(Integer value) {
            addCriterion("user_money =", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotEqualTo(Integer value) {
            addCriterion("user_money <>", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyGreaterThan(Integer value) {
            addCriterion("user_money >", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_money >=", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyLessThan(Integer value) {
            addCriterion("user_money <", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("user_money <=", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIn(List<Integer> values) {
            addCriterion("user_money in", values, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotIn(List<Integer> values) {
            addCriterion("user_money not in", values, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyBetween(Integer value1, Integer value2) {
            addCriterion("user_money between", value1, value2, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("user_money not between", value1, value2, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIsNull() {
            addCriterion("user_integral is null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIsNotNull() {
            addCriterion("user_integral is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralEqualTo(Integer value) {
            addCriterion("user_integral =", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotEqualTo(Integer value) {
            addCriterion("user_integral <>", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGreaterThan(Integer value) {
            addCriterion("user_integral >", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_integral >=", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLessThan(Integer value) {
            addCriterion("user_integral <", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("user_integral <=", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIn(List<Integer> values) {
            addCriterion("user_integral in", values, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotIn(List<Integer> values) {
            addCriterion("user_integral not in", values, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralBetween(Integer value1, Integer value2) {
            addCriterion("user_integral between", value1, value2, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("user_integral not between", value1, value2, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserAdNumIsNull() {
            addCriterion("user_ad_num is null");
            return (Criteria) this;
        }

        public Criteria andUserAdNumIsNotNull() {
            addCriterion("user_ad_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserAdNumEqualTo(Integer value) {
            addCriterion("user_ad_num =", value, "userAdNum");
            return (Criteria) this;
        }

        public Criteria andUserAdNumNotEqualTo(Integer value) {
            addCriterion("user_ad_num <>", value, "userAdNum");
            return (Criteria) this;
        }

        public Criteria andUserAdNumGreaterThan(Integer value) {
            addCriterion("user_ad_num >", value, "userAdNum");
            return (Criteria) this;
        }

        public Criteria andUserAdNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_ad_num >=", value, "userAdNum");
            return (Criteria) this;
        }

        public Criteria andUserAdNumLessThan(Integer value) {
            addCriterion("user_ad_num <", value, "userAdNum");
            return (Criteria) this;
        }

        public Criteria andUserAdNumLessThanOrEqualTo(Integer value) {
            addCriterion("user_ad_num <=", value, "userAdNum");
            return (Criteria) this;
        }

        public Criteria andUserAdNumIn(List<Integer> values) {
            addCriterion("user_ad_num in", values, "userAdNum");
            return (Criteria) this;
        }

        public Criteria andUserAdNumNotIn(List<Integer> values) {
            addCriterion("user_ad_num not in", values, "userAdNum");
            return (Criteria) this;
        }

        public Criteria andUserAdNumBetween(Integer value1, Integer value2) {
            addCriterion("user_ad_num between", value1, value2, "userAdNum");
            return (Criteria) this;
        }

        public Criteria andUserAdNumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_ad_num not between", value1, value2, "userAdNum");
            return (Criteria) this;
        }

        public Criteria andUserAttentionIsNull() {
            addCriterion("user_attention is null");
            return (Criteria) this;
        }

        public Criteria andUserAttentionIsNotNull() {
            addCriterion("user_attention is not null");
            return (Criteria) this;
        }

        public Criteria andUserAttentionEqualTo(Integer value) {
            addCriterion("user_attention =", value, "userAttention");
            return (Criteria) this;
        }

        public Criteria andUserAttentionNotEqualTo(Integer value) {
            addCriterion("user_attention <>", value, "userAttention");
            return (Criteria) this;
        }

        public Criteria andUserAttentionGreaterThan(Integer value) {
            addCriterion("user_attention >", value, "userAttention");
            return (Criteria) this;
        }

        public Criteria andUserAttentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_attention >=", value, "userAttention");
            return (Criteria) this;
        }

        public Criteria andUserAttentionLessThan(Integer value) {
            addCriterion("user_attention <", value, "userAttention");
            return (Criteria) this;
        }

        public Criteria andUserAttentionLessThanOrEqualTo(Integer value) {
            addCriterion("user_attention <=", value, "userAttention");
            return (Criteria) this;
        }

        public Criteria andUserAttentionIn(List<Integer> values) {
            addCriterion("user_attention in", values, "userAttention");
            return (Criteria) this;
        }

        public Criteria andUserAttentionNotIn(List<Integer> values) {
            addCriterion("user_attention not in", values, "userAttention");
            return (Criteria) this;
        }

        public Criteria andUserAttentionBetween(Integer value1, Integer value2) {
            addCriterion("user_attention between", value1, value2, "userAttention");
            return (Criteria) this;
        }

        public Criteria andUserAttentionNotBetween(Integer value1, Integer value2) {
            addCriterion("user_attention not between", value1, value2, "userAttention");
            return (Criteria) this;
        }

        public Criteria andUserFanIsNull() {
            addCriterion("user_fan is null");
            return (Criteria) this;
        }

        public Criteria andUserFanIsNotNull() {
            addCriterion("user_fan is not null");
            return (Criteria) this;
        }

        public Criteria andUserFanEqualTo(Integer value) {
            addCriterion("user_fan =", value, "userFan");
            return (Criteria) this;
        }

        public Criteria andUserFanNotEqualTo(Integer value) {
            addCriterion("user_fan <>", value, "userFan");
            return (Criteria) this;
        }

        public Criteria andUserFanGreaterThan(Integer value) {
            addCriterion("user_fan >", value, "userFan");
            return (Criteria) this;
        }

        public Criteria andUserFanGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_fan >=", value, "userFan");
            return (Criteria) this;
        }

        public Criteria andUserFanLessThan(Integer value) {
            addCriterion("user_fan <", value, "userFan");
            return (Criteria) this;
        }

        public Criteria andUserFanLessThanOrEqualTo(Integer value) {
            addCriterion("user_fan <=", value, "userFan");
            return (Criteria) this;
        }

        public Criteria andUserFanIn(List<Integer> values) {
            addCriterion("user_fan in", values, "userFan");
            return (Criteria) this;
        }

        public Criteria andUserFanNotIn(List<Integer> values) {
            addCriterion("user_fan not in", values, "userFan");
            return (Criteria) this;
        }

        public Criteria andUserFanBetween(Integer value1, Integer value2) {
            addCriterion("user_fan between", value1, value2, "userFan");
            return (Criteria) this;
        }

        public Criteria andUserFanNotBetween(Integer value1, Integer value2) {
            addCriterion("user_fan not between", value1, value2, "userFan");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressIsNull() {
            addCriterion("user_location_address is null");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressIsNotNull() {
            addCriterion("user_location_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressEqualTo(String value) {
            addCriterion("user_location_address =", value, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressNotEqualTo(String value) {
            addCriterion("user_location_address <>", value, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressGreaterThan(String value) {
            addCriterion("user_location_address >", value, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_location_address >=", value, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressLessThan(String value) {
            addCriterion("user_location_address <", value, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressLessThanOrEqualTo(String value) {
            addCriterion("user_location_address <=", value, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressLike(String value) {
            addCriterion("user_location_address like", value, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressNotLike(String value) {
            addCriterion("user_location_address not like", value, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressIn(List<String> values) {
            addCriterion("user_location_address in", values, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressNotIn(List<String> values) {
            addCriterion("user_location_address not in", values, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressBetween(String value1, String value2) {
            addCriterion("user_location_address between", value1, value2, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserLocationAddressNotBetween(String value1, String value2) {
            addCriterion("user_location_address not between", value1, value2, "userLocationAddress");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNull() {
            addCriterion("user_qq is null");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNotNull() {
            addCriterion("user_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUserQqEqualTo(String value) {
            addCriterion("user_qq =", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotEqualTo(String value) {
            addCriterion("user_qq <>", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThan(String value) {
            addCriterion("user_qq >", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThanOrEqualTo(String value) {
            addCriterion("user_qq >=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThan(String value) {
            addCriterion("user_qq <", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThanOrEqualTo(String value) {
            addCriterion("user_qq <=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLike(String value) {
            addCriterion("user_qq like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotLike(String value) {
            addCriterion("user_qq not like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqIn(List<String> values) {
            addCriterion("user_qq in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotIn(List<String> values) {
            addCriterion("user_qq not in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqBetween(String value1, String value2) {
            addCriterion("user_qq between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotBetween(String value1, String value2) {
            addCriterion("user_qq not between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNull() {
            addCriterion("user_wechat is null");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNotNull() {
            addCriterion("user_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andUserWechatEqualTo(String value) {
            addCriterion("user_wechat =", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotEqualTo(String value) {
            addCriterion("user_wechat <>", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThan(String value) {
            addCriterion("user_wechat >", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThanOrEqualTo(String value) {
            addCriterion("user_wechat >=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThan(String value) {
            addCriterion("user_wechat <", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThanOrEqualTo(String value) {
            addCriterion("user_wechat <=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLike(String value) {
            addCriterion("user_wechat like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotLike(String value) {
            addCriterion("user_wechat not like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatIn(List<String> values) {
            addCriterion("user_wechat in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotIn(List<String> values) {
            addCriterion("user_wechat not in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatBetween(String value1, String value2) {
            addCriterion("user_wechat between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotBetween(String value1, String value2) {
            addCriterion("user_wechat not between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserAttrIsNull() {
            addCriterion("user_attr is null");
            return (Criteria) this;
        }

        public Criteria andUserAttrIsNotNull() {
            addCriterion("user_attr is not null");
            return (Criteria) this;
        }

        public Criteria andUserAttrEqualTo(String value) {
            addCriterion("user_attr =", value, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserAttrNotEqualTo(String value) {
            addCriterion("user_attr <>", value, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserAttrGreaterThan(String value) {
            addCriterion("user_attr >", value, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserAttrGreaterThanOrEqualTo(String value) {
            addCriterion("user_attr >=", value, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserAttrLessThan(String value) {
            addCriterion("user_attr <", value, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserAttrLessThanOrEqualTo(String value) {
            addCriterion("user_attr <=", value, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserAttrLike(String value) {
            addCriterion("user_attr like", value, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserAttrNotLike(String value) {
            addCriterion("user_attr not like", value, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserAttrIn(List<String> values) {
            addCriterion("user_attr in", values, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserAttrNotIn(List<String> values) {
            addCriterion("user_attr not in", values, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserAttrBetween(String value1, String value2) {
            addCriterion("user_attr between", value1, value2, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserAttrNotBetween(String value1, String value2) {
            addCriterion("user_attr not between", value1, value2, "userAttr");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgIsNull() {
            addCriterion("user_info_bg is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgIsNotNull() {
            addCriterion("user_info_bg is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgEqualTo(String value) {
            addCriterion("user_info_bg =", value, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgNotEqualTo(String value) {
            addCriterion("user_info_bg <>", value, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgGreaterThan(String value) {
            addCriterion("user_info_bg >", value, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgGreaterThanOrEqualTo(String value) {
            addCriterion("user_info_bg >=", value, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgLessThan(String value) {
            addCriterion("user_info_bg <", value, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgLessThanOrEqualTo(String value) {
            addCriterion("user_info_bg <=", value, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgLike(String value) {
            addCriterion("user_info_bg like", value, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgNotLike(String value) {
            addCriterion("user_info_bg not like", value, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgIn(List<String> values) {
            addCriterion("user_info_bg in", values, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgNotIn(List<String> values) {
            addCriterion("user_info_bg not in", values, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgBetween(String value1, String value2) {
            addCriterion("user_info_bg between", value1, value2, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserInfoBgNotBetween(String value1, String value2) {
            addCriterion("user_info_bg not between", value1, value2, "userInfoBg");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelIsNull() {
            addCriterion("user_vip_level is null");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelIsNotNull() {
            addCriterion("user_vip_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelEqualTo(Integer value) {
            addCriterion("user_vip_level =", value, "userVipLevel");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelNotEqualTo(Integer value) {
            addCriterion("user_vip_level <>", value, "userVipLevel");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelGreaterThan(Integer value) {
            addCriterion("user_vip_level >", value, "userVipLevel");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_vip_level >=", value, "userVipLevel");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelLessThan(Integer value) {
            addCriterion("user_vip_level <", value, "userVipLevel");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelLessThanOrEqualTo(Integer value) {
            addCriterion("user_vip_level <=", value, "userVipLevel");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelIn(List<Integer> values) {
            addCriterion("user_vip_level in", values, "userVipLevel");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelNotIn(List<Integer> values) {
            addCriterion("user_vip_level not in", values, "userVipLevel");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelBetween(Integer value1, Integer value2) {
            addCriterion("user_vip_level between", value1, value2, "userVipLevel");
            return (Criteria) this;
        }

        public Criteria andUserVipLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_vip_level not between", value1, value2, "userVipLevel");
            return (Criteria) this;
        }

        public Criteria andUserCreditIsNull() {
            addCriterion("user_credit is null");
            return (Criteria) this;
        }

        public Criteria andUserCreditIsNotNull() {
            addCriterion("user_credit is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreditEqualTo(Integer value) {
            addCriterion("user_credit =", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotEqualTo(Integer value) {
            addCriterion("user_credit <>", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditGreaterThan(Integer value) {
            addCriterion("user_credit >", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_credit >=", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditLessThan(Integer value) {
            addCriterion("user_credit <", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditLessThanOrEqualTo(Integer value) {
            addCriterion("user_credit <=", value, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditIn(List<Integer> values) {
            addCriterion("user_credit in", values, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotIn(List<Integer> values) {
            addCriterion("user_credit not in", values, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditBetween(Integer value1, Integer value2) {
            addCriterion("user_credit between", value1, value2, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("user_credit not between", value1, value2, "userCredit");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredIsNull() {
            addCriterion("user_vip_expired is null");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredIsNotNull() {
            addCriterion("user_vip_expired is not null");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredEqualTo(Boolean value) {
            addCriterion("user_vip_expired =", value, "userVipExpired");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredNotEqualTo(Boolean value) {
            addCriterion("user_vip_expired <>", value, "userVipExpired");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredGreaterThan(Boolean value) {
            addCriterion("user_vip_expired >", value, "userVipExpired");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_vip_expired >=", value, "userVipExpired");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredLessThan(Boolean value) {
            addCriterion("user_vip_expired <", value, "userVipExpired");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredLessThanOrEqualTo(Boolean value) {
            addCriterion("user_vip_expired <=", value, "userVipExpired");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredIn(List<Boolean> values) {
            addCriterion("user_vip_expired in", values, "userVipExpired");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredNotIn(List<Boolean> values) {
            addCriterion("user_vip_expired not in", values, "userVipExpired");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredBetween(Boolean value1, Boolean value2) {
            addCriterion("user_vip_expired between", value1, value2, "userVipExpired");
            return (Criteria) this;
        }

        public Criteria andUserVipExpiredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_vip_expired not between", value1, value2, "userVipExpired");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserSignIsNull() {
            addCriterion("user_sign is null");
            return (Criteria) this;
        }

        public Criteria andUserSignIsNotNull() {
            addCriterion("user_sign is not null");
            return (Criteria) this;
        }

        public Criteria andUserSignEqualTo(Integer value) {
            addCriterion("user_sign =", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignNotEqualTo(Integer value) {
            addCriterion("user_sign <>", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignGreaterThan(Integer value) {
            addCriterion("user_sign >", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_sign >=", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignLessThan(Integer value) {
            addCriterion("user_sign <", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignLessThanOrEqualTo(Integer value) {
            addCriterion("user_sign <=", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignIn(List<Integer> values) {
            addCriterion("user_sign in", values, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignNotIn(List<Integer> values) {
            addCriterion("user_sign not in", values, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignBetween(Integer value1, Integer value2) {
            addCriterion("user_sign between", value1, value2, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignNotBetween(Integer value1, Integer value2) {
            addCriterion("user_sign not between", value1, value2, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserIsSignIsNull() {
            addCriterion("user_is_sign is null");
            return (Criteria) this;
        }

        public Criteria andUserIsSignIsNotNull() {
            addCriterion("user_is_sign is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsSignEqualTo(Boolean value) {
            addCriterion("user_is_sign =", value, "userIsSign");
            return (Criteria) this;
        }

        public Criteria andUserIsSignNotEqualTo(Boolean value) {
            addCriterion("user_is_sign <>", value, "userIsSign");
            return (Criteria) this;
        }

        public Criteria andUserIsSignGreaterThan(Boolean value) {
            addCriterion("user_is_sign >", value, "userIsSign");
            return (Criteria) this;
        }

        public Criteria andUserIsSignGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_is_sign >=", value, "userIsSign");
            return (Criteria) this;
        }

        public Criteria andUserIsSignLessThan(Boolean value) {
            addCriterion("user_is_sign <", value, "userIsSign");
            return (Criteria) this;
        }

        public Criteria andUserIsSignLessThanOrEqualTo(Boolean value) {
            addCriterion("user_is_sign <=", value, "userIsSign");
            return (Criteria) this;
        }

        public Criteria andUserIsSignIn(List<Boolean> values) {
            addCriterion("user_is_sign in", values, "userIsSign");
            return (Criteria) this;
        }

        public Criteria andUserIsSignNotIn(List<Boolean> values) {
            addCriterion("user_is_sign not in", values, "userIsSign");
            return (Criteria) this;
        }

        public Criteria andUserIsSignBetween(Boolean value1, Boolean value2) {
            addCriterion("user_is_sign between", value1, value2, "userIsSign");
            return (Criteria) this;
        }

        public Criteria andUserIsSignNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_is_sign not between", value1, value2, "userIsSign");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveIsNull() {
            addCriterion("user_sign_receive is null");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveIsNotNull() {
            addCriterion("user_sign_receive is not null");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveEqualTo(Boolean value) {
            addCriterion("user_sign_receive =", value, "userSignReceive");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveNotEqualTo(Boolean value) {
            addCriterion("user_sign_receive <>", value, "userSignReceive");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveGreaterThan(Boolean value) {
            addCriterion("user_sign_receive >", value, "userSignReceive");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_sign_receive >=", value, "userSignReceive");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveLessThan(Boolean value) {
            addCriterion("user_sign_receive <", value, "userSignReceive");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveLessThanOrEqualTo(Boolean value) {
            addCriterion("user_sign_receive <=", value, "userSignReceive");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveIn(List<Boolean> values) {
            addCriterion("user_sign_receive in", values, "userSignReceive");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveNotIn(List<Boolean> values) {
            addCriterion("user_sign_receive not in", values, "userSignReceive");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveBetween(Boolean value1, Boolean value2) {
            addCriterion("user_sign_receive between", value1, value2, "userSignReceive");
            return (Criteria) this;
        }

        public Criteria andUserSignReceiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_sign_receive not between", value1, value2, "userSignReceive");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumIsNull() {
            addCriterion("user_max_ad_num is null");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumIsNotNull() {
            addCriterion("user_max_ad_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumEqualTo(Integer value) {
            addCriterion("user_max_ad_num =", value, "userMaxAdNum");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumNotEqualTo(Integer value) {
            addCriterion("user_max_ad_num <>", value, "userMaxAdNum");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumGreaterThan(Integer value) {
            addCriterion("user_max_ad_num >", value, "userMaxAdNum");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_max_ad_num >=", value, "userMaxAdNum");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumLessThan(Integer value) {
            addCriterion("user_max_ad_num <", value, "userMaxAdNum");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumLessThanOrEqualTo(Integer value) {
            addCriterion("user_max_ad_num <=", value, "userMaxAdNum");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumIn(List<Integer> values) {
            addCriterion("user_max_ad_num in", values, "userMaxAdNum");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumNotIn(List<Integer> values) {
            addCriterion("user_max_ad_num not in", values, "userMaxAdNum");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumBetween(Integer value1, Integer value2) {
            addCriterion("user_max_ad_num between", value1, value2, "userMaxAdNum");
            return (Criteria) this;
        }

        public Criteria andUserMaxAdNumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_max_ad_num not between", value1, value2, "userMaxAdNum");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumIsNull() {
            addCriterion("user_current_ad_num is null");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumIsNotNull() {
            addCriterion("user_current_ad_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumEqualTo(Integer value) {
            addCriterion("user_current_ad_num =", value, "userCurrentAdNum");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumNotEqualTo(Integer value) {
            addCriterion("user_current_ad_num <>", value, "userCurrentAdNum");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumGreaterThan(Integer value) {
            addCriterion("user_current_ad_num >", value, "userCurrentAdNum");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_current_ad_num >=", value, "userCurrentAdNum");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumLessThan(Integer value) {
            addCriterion("user_current_ad_num <", value, "userCurrentAdNum");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumLessThanOrEqualTo(Integer value) {
            addCriterion("user_current_ad_num <=", value, "userCurrentAdNum");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumIn(List<Integer> values) {
            addCriterion("user_current_ad_num in", values, "userCurrentAdNum");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumNotIn(List<Integer> values) {
            addCriterion("user_current_ad_num not in", values, "userCurrentAdNum");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumBetween(Integer value1, Integer value2) {
            addCriterion("user_current_ad_num between", value1, value2, "userCurrentAdNum");
            return (Criteria) this;
        }

        public Criteria andUserCurrentAdNumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_current_ad_num not between", value1, value2, "userCurrentAdNum");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveIsNull() {
            addCriterion("user_ad_receive is null");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveIsNotNull() {
            addCriterion("user_ad_receive is not null");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveEqualTo(Boolean value) {
            addCriterion("user_ad_receive =", value, "userAdReceive");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveNotEqualTo(Boolean value) {
            addCriterion("user_ad_receive <>", value, "userAdReceive");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveGreaterThan(Boolean value) {
            addCriterion("user_ad_receive >", value, "userAdReceive");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_ad_receive >=", value, "userAdReceive");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveLessThan(Boolean value) {
            addCriterion("user_ad_receive <", value, "userAdReceive");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveLessThanOrEqualTo(Boolean value) {
            addCriterion("user_ad_receive <=", value, "userAdReceive");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveIn(List<Boolean> values) {
            addCriterion("user_ad_receive in", values, "userAdReceive");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveNotIn(List<Boolean> values) {
            addCriterion("user_ad_receive not in", values, "userAdReceive");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveBetween(Boolean value1, Boolean value2) {
            addCriterion("user_ad_receive between", value1, value2, "userAdReceive");
            return (Criteria) this;
        }

        public Criteria andUserAdReceiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_ad_receive not between", value1, value2, "userAdReceive");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUserExtraIsNull() {
            addCriterion("user_extra is null");
            return (Criteria) this;
        }

        public Criteria andUserExtraIsNotNull() {
            addCriterion("user_extra is not null");
            return (Criteria) this;
        }

        public Criteria andUserExtraEqualTo(String value) {
            addCriterion("user_extra =", value, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserExtraNotEqualTo(String value) {
            addCriterion("user_extra <>", value, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserExtraGreaterThan(String value) {
            addCriterion("user_extra >", value, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserExtraGreaterThanOrEqualTo(String value) {
            addCriterion("user_extra >=", value, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserExtraLessThan(String value) {
            addCriterion("user_extra <", value, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserExtraLessThanOrEqualTo(String value) {
            addCriterion("user_extra <=", value, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserExtraLike(String value) {
            addCriterion("user_extra like", value, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserExtraNotLike(String value) {
            addCriterion("user_extra not like", value, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserExtraIn(List<String> values) {
            addCriterion("user_extra in", values, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserExtraNotIn(List<String> values) {
            addCriterion("user_extra not in", values, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserExtraBetween(String value1, String value2) {
            addCriterion("user_extra between", value1, value2, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserExtraNotBetween(String value1, String value2) {
            addCriterion("user_extra not between", value1, value2, "userExtra");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionIsNull() {
            addCriterion("user_app_version is null");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionIsNotNull() {
            addCriterion("user_app_version is not null");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionEqualTo(String value) {
            addCriterion("user_app_version =", value, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionNotEqualTo(String value) {
            addCriterion("user_app_version <>", value, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionGreaterThan(String value) {
            addCriterion("user_app_version >", value, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("user_app_version >=", value, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionLessThan(String value) {
            addCriterion("user_app_version <", value, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionLessThanOrEqualTo(String value) {
            addCriterion("user_app_version <=", value, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionLike(String value) {
            addCriterion("user_app_version like", value, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionNotLike(String value) {
            addCriterion("user_app_version not like", value, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionIn(List<String> values) {
            addCriterion("user_app_version in", values, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionNotIn(List<String> values) {
            addCriterion("user_app_version not in", values, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionBetween(String value1, String value2) {
            addCriterion("user_app_version between", value1, value2, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserAppVersionNotBetween(String value1, String value2) {
            addCriterion("user_app_version not between", value1, value2, "userAppVersion");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeIsNull() {
            addCriterion("user_last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeIsNotNull() {
            addCriterion("user_last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeEqualTo(Date value) {
            addCriterion("user_last_login_time =", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeNotEqualTo(Date value) {
            addCriterion("user_last_login_time <>", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeGreaterThan(Date value) {
            addCriterion("user_last_login_time >", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_last_login_time >=", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeLessThan(Date value) {
            addCriterion("user_last_login_time <", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_last_login_time <=", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeIn(List<Date> values) {
            addCriterion("user_last_login_time in", values, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeNotIn(List<Date> values) {
            addCriterion("user_last_login_time not in", values, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("user_last_login_time between", value1, value2, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_last_login_time not between", value1, value2, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteIsNull() {
            addCriterion("user_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteIsNotNull() {
            addCriterion("user_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteEqualTo(Boolean value) {
            addCriterion("user_is_delete =", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteNotEqualTo(Boolean value) {
            addCriterion("user_is_delete <>", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteGreaterThan(Boolean value) {
            addCriterion("user_is_delete >", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_is_delete >=", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteLessThan(Boolean value) {
            addCriterion("user_is_delete <", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("user_is_delete <=", value, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteIn(List<Boolean> values) {
            addCriterion("user_is_delete in", values, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteNotIn(List<Boolean> values) {
            addCriterion("user_is_delete not in", values, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("user_is_delete between", value1, value2, "userIsDelete");
            return (Criteria) this;
        }

        public Criteria andUserIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_is_delete not between", value1, value2, "userIsDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}