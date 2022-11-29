package com.yang.module.main.dao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WallDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WallDetailExample() {
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

        public Criteria andTabIdIsNull() {
            addCriterion("tab_id is null");
            return (Criteria) this;
        }

        public Criteria andTabIdIsNotNull() {
            addCriterion("tab_id is not null");
            return (Criteria) this;
        }

        public Criteria andTabIdEqualTo(String value) {
            addCriterion("tab_id =", value, "tabId");
            return (Criteria) this;
        }

        public Criteria andTabIdNotEqualTo(String value) {
            addCriterion("tab_id <>", value, "tabId");
            return (Criteria) this;
        }

        public Criteria andTabIdGreaterThan(String value) {
            addCriterion("tab_id >", value, "tabId");
            return (Criteria) this;
        }

        public Criteria andTabIdGreaterThanOrEqualTo(String value) {
            addCriterion("tab_id >=", value, "tabId");
            return (Criteria) this;
        }

        public Criteria andTabIdLessThan(String value) {
            addCriterion("tab_id <", value, "tabId");
            return (Criteria) this;
        }

        public Criteria andTabIdLessThanOrEqualTo(String value) {
            addCriterion("tab_id <=", value, "tabId");
            return (Criteria) this;
        }

        public Criteria andTabIdLike(String value) {
            addCriterion("tab_id like", value, "tabId");
            return (Criteria) this;
        }

        public Criteria andTabIdNotLike(String value) {
            addCriterion("tab_id not like", value, "tabId");
            return (Criteria) this;
        }

        public Criteria andTabIdIn(List<String> values) {
            addCriterion("tab_id in", values, "tabId");
            return (Criteria) this;
        }

        public Criteria andTabIdNotIn(List<String> values) {
            addCriterion("tab_id not in", values, "tabId");
            return (Criteria) this;
        }

        public Criteria andTabIdBetween(String value1, String value2) {
            addCriterion("tab_id between", value1, value2, "tabId");
            return (Criteria) this;
        }

        public Criteria andTabIdNotBetween(String value1, String value2) {
            addCriterion("tab_id not between", value1, value2, "tabId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andWallUrlIsNull() {
            addCriterion("wall_url is null");
            return (Criteria) this;
        }

        public Criteria andWallUrlIsNotNull() {
            addCriterion("wall_url is not null");
            return (Criteria) this;
        }

        public Criteria andWallUrlEqualTo(String value) {
            addCriterion("wall_url =", value, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallUrlNotEqualTo(String value) {
            addCriterion("wall_url <>", value, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallUrlGreaterThan(String value) {
            addCriterion("wall_url >", value, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallUrlGreaterThanOrEqualTo(String value) {
            addCriterion("wall_url >=", value, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallUrlLessThan(String value) {
            addCriterion("wall_url <", value, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallUrlLessThanOrEqualTo(String value) {
            addCriterion("wall_url <=", value, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallUrlLike(String value) {
            addCriterion("wall_url like", value, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallUrlNotLike(String value) {
            addCriterion("wall_url not like", value, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallUrlIn(List<String> values) {
            addCriterion("wall_url in", values, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallUrlNotIn(List<String> values) {
            addCriterion("wall_url not in", values, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallUrlBetween(String value1, String value2) {
            addCriterion("wall_url between", value1, value2, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallUrlNotBetween(String value1, String value2) {
            addCriterion("wall_url not between", value1, value2, "wallUrl");
            return (Criteria) this;
        }

        public Criteria andWallNameIsNull() {
            addCriterion("wall_name is null");
            return (Criteria) this;
        }

        public Criteria andWallNameIsNotNull() {
            addCriterion("wall_name is not null");
            return (Criteria) this;
        }

        public Criteria andWallNameEqualTo(String value) {
            addCriterion("wall_name =", value, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallNameNotEqualTo(String value) {
            addCriterion("wall_name <>", value, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallNameGreaterThan(String value) {
            addCriterion("wall_name >", value, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallNameGreaterThanOrEqualTo(String value) {
            addCriterion("wall_name >=", value, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallNameLessThan(String value) {
            addCriterion("wall_name <", value, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallNameLessThanOrEqualTo(String value) {
            addCriterion("wall_name <=", value, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallNameLike(String value) {
            addCriterion("wall_name like", value, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallNameNotLike(String value) {
            addCriterion("wall_name not like", value, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallNameIn(List<String> values) {
            addCriterion("wall_name in", values, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallNameNotIn(List<String> values) {
            addCriterion("wall_name not in", values, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallNameBetween(String value1, String value2) {
            addCriterion("wall_name between", value1, value2, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallNameNotBetween(String value1, String value2) {
            addCriterion("wall_name not between", value1, value2, "wallName");
            return (Criteria) this;
        }

        public Criteria andWallTypeIsNull() {
            addCriterion("wall_type is null");
            return (Criteria) this;
        }

        public Criteria andWallTypeIsNotNull() {
            addCriterion("wall_type is not null");
            return (Criteria) this;
        }

        public Criteria andWallTypeEqualTo(Integer value) {
            addCriterion("wall_type =", value, "wallType");
            return (Criteria) this;
        }

        public Criteria andWallTypeNotEqualTo(Integer value) {
            addCriterion("wall_type <>", value, "wallType");
            return (Criteria) this;
        }

        public Criteria andWallTypeGreaterThan(Integer value) {
            addCriterion("wall_type >", value, "wallType");
            return (Criteria) this;
        }

        public Criteria andWallTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wall_type >=", value, "wallType");
            return (Criteria) this;
        }

        public Criteria andWallTypeLessThan(Integer value) {
            addCriterion("wall_type <", value, "wallType");
            return (Criteria) this;
        }

        public Criteria andWallTypeLessThanOrEqualTo(Integer value) {
            addCriterion("wall_type <=", value, "wallType");
            return (Criteria) this;
        }

        public Criteria andWallTypeIn(List<Integer> values) {
            addCriterion("wall_type in", values, "wallType");
            return (Criteria) this;
        }

        public Criteria andWallTypeNotIn(List<Integer> values) {
            addCriterion("wall_type not in", values, "wallType");
            return (Criteria) this;
        }

        public Criteria andWallTypeBetween(Integer value1, Integer value2) {
            addCriterion("wall_type between", value1, value2, "wallType");
            return (Criteria) this;
        }

        public Criteria andWallTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("wall_type not between", value1, value2, "wallType");
            return (Criteria) this;
        }

        public Criteria andWallDownNumIsNull() {
            addCriterion("wall_down_num is null");
            return (Criteria) this;
        }

        public Criteria andWallDownNumIsNotNull() {
            addCriterion("wall_down_num is not null");
            return (Criteria) this;
        }

        public Criteria andWallDownNumEqualTo(Integer value) {
            addCriterion("wall_down_num =", value, "wallDownNum");
            return (Criteria) this;
        }

        public Criteria andWallDownNumNotEqualTo(Integer value) {
            addCriterion("wall_down_num <>", value, "wallDownNum");
            return (Criteria) this;
        }

        public Criteria andWallDownNumGreaterThan(Integer value) {
            addCriterion("wall_down_num >", value, "wallDownNum");
            return (Criteria) this;
        }

        public Criteria andWallDownNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("wall_down_num >=", value, "wallDownNum");
            return (Criteria) this;
        }

        public Criteria andWallDownNumLessThan(Integer value) {
            addCriterion("wall_down_num <", value, "wallDownNum");
            return (Criteria) this;
        }

        public Criteria andWallDownNumLessThanOrEqualTo(Integer value) {
            addCriterion("wall_down_num <=", value, "wallDownNum");
            return (Criteria) this;
        }

        public Criteria andWallDownNumIn(List<Integer> values) {
            addCriterion("wall_down_num in", values, "wallDownNum");
            return (Criteria) this;
        }

        public Criteria andWallDownNumNotIn(List<Integer> values) {
            addCriterion("wall_down_num not in", values, "wallDownNum");
            return (Criteria) this;
        }

        public Criteria andWallDownNumBetween(Integer value1, Integer value2) {
            addCriterion("wall_down_num between", value1, value2, "wallDownNum");
            return (Criteria) this;
        }

        public Criteria andWallDownNumNotBetween(Integer value1, Integer value2) {
            addCriterion("wall_down_num not between", value1, value2, "wallDownNum");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNull() {
            addCriterion("is_vip is null");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNotNull() {
            addCriterion("is_vip is not null");
            return (Criteria) this;
        }

        public Criteria andIsVipEqualTo(Boolean value) {
            addCriterion("is_vip =", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotEqualTo(Boolean value) {
            addCriterion("is_vip <>", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThan(Boolean value) {
            addCriterion("is_vip >", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_vip >=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThan(Boolean value) {
            addCriterion("is_vip <", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThanOrEqualTo(Boolean value) {
            addCriterion("is_vip <=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipIn(List<Boolean> values) {
            addCriterion("is_vip in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotIn(List<Boolean> values) {
            addCriterion("is_vip not in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipBetween(Boolean value1, Boolean value2) {
            addCriterion("is_vip between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_vip not between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andLikeNumIsNull() {
            addCriterion("like_num is null");
            return (Criteria) this;
        }

        public Criteria andLikeNumIsNotNull() {
            addCriterion("like_num is not null");
            return (Criteria) this;
        }

        public Criteria andLikeNumEqualTo(Integer value) {
            addCriterion("like_num =", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotEqualTo(Integer value) {
            addCriterion("like_num <>", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThan(Integer value) {
            addCriterion("like_num >", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_num >=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThan(Integer value) {
            addCriterion("like_num <", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("like_num <=", value, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumIn(List<Integer> values) {
            addCriterion("like_num in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotIn(List<Integer> values) {
            addCriterion("like_num not in", values, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumBetween(Integer value1, Integer value2) {
            addCriterion("like_num between", value1, value2, "likeNum");
            return (Criteria) this;
        }

        public Criteria andLikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("like_num not between", value1, value2, "likeNum");
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

        public Criteria andExtraIsNull() {
            addCriterion("extra is null");
            return (Criteria) this;
        }

        public Criteria andExtraIsNotNull() {
            addCriterion("extra is not null");
            return (Criteria) this;
        }

        public Criteria andExtraEqualTo(String value) {
            addCriterion("extra =", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotEqualTo(String value) {
            addCriterion("extra <>", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThan(String value) {
            addCriterion("extra >", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThanOrEqualTo(String value) {
            addCriterion("extra >=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThan(String value) {
            addCriterion("extra <", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThanOrEqualTo(String value) {
            addCriterion("extra <=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLike(String value) {
            addCriterion("extra like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotLike(String value) {
            addCriterion("extra not like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraIn(List<String> values) {
            addCriterion("extra in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotIn(List<String> values) {
            addCriterion("extra not in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraBetween(String value1, String value2) {
            addCriterion("extra between", value1, value2, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotBetween(String value1, String value2) {
            addCriterion("extra not between", value1, value2, "extra");
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