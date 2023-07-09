package com.bilibili.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FavouriteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FavouriteExample() {
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

        public Criteria andFavouriteIDIsNull() {
            addCriterion("favouriteID is null");
            return (Criteria) this;
        }

        public Criteria andFavouriteIDIsNotNull() {
            addCriterion("favouriteID is not null");
            return (Criteria) this;
        }

        public Criteria andFavouriteIDEqualTo(Integer value) {
            addCriterion("favouriteID =", value, "favouriteID");
            return (Criteria) this;
        }

        public Criteria andFavouriteIDNotEqualTo(Integer value) {
            addCriterion("favouriteID <>", value, "favouriteID");
            return (Criteria) this;
        }

        public Criteria andFavouriteIDGreaterThan(Integer value) {
            addCriterion("favouriteID >", value, "favouriteID");
            return (Criteria) this;
        }

        public Criteria andFavouriteIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("favouriteID >=", value, "favouriteID");
            return (Criteria) this;
        }

        public Criteria andFavouriteIDLessThan(Integer value) {
            addCriterion("favouriteID <", value, "favouriteID");
            return (Criteria) this;
        }

        public Criteria andFavouriteIDLessThanOrEqualTo(Integer value) {
            addCriterion("favouriteID <=", value, "favouriteID");
            return (Criteria) this;
        }

        public Criteria andFavouriteIDIn(List<Integer> values) {
            addCriterion("favouriteID in", values, "favouriteID");
            return (Criteria) this;
        }

        public Criteria andFavouriteIDNotIn(List<Integer> values) {
            addCriterion("favouriteID not in", values, "favouriteID");
            return (Criteria) this;
        }

        public Criteria andFavouriteIDBetween(Integer value1, Integer value2) {
            addCriterion("favouriteID between", value1, value2, "favouriteID");
            return (Criteria) this;
        }

        public Criteria andFavouriteIDNotBetween(Integer value1, Integer value2) {
            addCriterion("favouriteID not between", value1, value2, "favouriteID");
            return (Criteria) this;
        }

        public Criteria andVideoIDIsNull() {
            addCriterion("videoID is null");
            return (Criteria) this;
        }

        public Criteria andVideoIDIsNotNull() {
            addCriterion("videoID is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIDEqualTo(String value) {
            addCriterion("videoID =", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDNotEqualTo(String value) {
            addCriterion("videoID <>", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDGreaterThan(String value) {
            addCriterion("videoID >", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDGreaterThanOrEqualTo(String value) {
            addCriterion("videoID >=", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDLessThan(String value) {
            addCriterion("videoID <", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDLessThanOrEqualTo(String value) {
            addCriterion("videoID <=", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDLike(String value) {
            addCriterion("videoID like", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDNotLike(String value) {
            addCriterion("videoID not like", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDIn(List<String> values) {
            addCriterion("videoID in", values, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDNotIn(List<String> values) {
            addCriterion("videoID not in", values, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDBetween(String value1, String value2) {
            addCriterion("videoID between", value1, value2, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDNotBetween(String value1, String value2) {
            addCriterion("videoID not between", value1, value2, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNull() {
            addCriterion("videoName is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("videoName is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("videoName =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("videoName <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("videoName >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("videoName >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("videoName <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("videoName <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("videoName like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("videoName not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("videoName in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("videoName not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("videoName between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("videoName not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoImageIsNull() {
            addCriterion("videoImage is null");
            return (Criteria) this;
        }

        public Criteria andVideoImageIsNotNull() {
            addCriterion("videoImage is not null");
            return (Criteria) this;
        }

        public Criteria andVideoImageEqualTo(String value) {
            addCriterion("videoImage =", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageNotEqualTo(String value) {
            addCriterion("videoImage <>", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageGreaterThan(String value) {
            addCriterion("videoImage >", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageGreaterThanOrEqualTo(String value) {
            addCriterion("videoImage >=", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageLessThan(String value) {
            addCriterion("videoImage <", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageLessThanOrEqualTo(String value) {
            addCriterion("videoImage <=", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageLike(String value) {
            addCriterion("videoImage like", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageNotLike(String value) {
            addCriterion("videoImage not like", value, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageIn(List<String> values) {
            addCriterion("videoImage in", values, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageNotIn(List<String> values) {
            addCriterion("videoImage not in", values, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageBetween(String value1, String value2) {
            addCriterion("videoImage between", value1, value2, "videoImage");
            return (Criteria) this;
        }

        public Criteria andVideoImageNotBetween(String value1, String value2) {
            addCriterion("videoImage not between", value1, value2, "videoImage");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDEqualTo(String value) {
            addCriterion("userID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(String value) {
            addCriterion("userID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(String value) {
            addCriterion("userID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(String value) {
            addCriterion("userID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(String value) {
            addCriterion("userID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(String value) {
            addCriterion("userID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLike(String value) {
            addCriterion("userID like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotLike(String value) {
            addCriterion("userID not like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<String> values) {
            addCriterion("userID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<String> values) {
            addCriterion("userID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(String value1, String value2) {
            addCriterion("userID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(String value1, String value2) {
            addCriterion("userID not between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeIsNull() {
            addCriterion("favouriteTime is null");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeIsNotNull() {
            addCriterion("favouriteTime is not null");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeEqualTo(Date value) {
            addCriterion("favouriteTime =", value, "favouriteTime");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeNotEqualTo(Date value) {
            addCriterion("favouriteTime <>", value, "favouriteTime");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeGreaterThan(Date value) {
            addCriterion("favouriteTime >", value, "favouriteTime");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("favouriteTime >=", value, "favouriteTime");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeLessThan(Date value) {
            addCriterion("favouriteTime <", value, "favouriteTime");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeLessThanOrEqualTo(Date value) {
            addCriterion("favouriteTime <=", value, "favouriteTime");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeIn(List<Date> values) {
            addCriterion("favouriteTime in", values, "favouriteTime");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeNotIn(List<Date> values) {
            addCriterion("favouriteTime not in", values, "favouriteTime");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeBetween(Date value1, Date value2) {
            addCriterion("favouriteTime between", value1, value2, "favouriteTime");
            return (Criteria) this;
        }

        public Criteria andFavouriteTimeNotBetween(Date value1, Date value2) {
            addCriterion("favouriteTime not between", value1, value2, "favouriteTime");
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