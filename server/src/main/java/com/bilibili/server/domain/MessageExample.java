package com.bilibili.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMessageIDIsNull() {
            addCriterion("messageID is null");
            return (Criteria) this;
        }

        public Criteria andMessageIDIsNotNull() {
            addCriterion("messageID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIDEqualTo(String value) {
            addCriterion("messageID =", value, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessageIDNotEqualTo(String value) {
            addCriterion("messageID <>", value, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessageIDGreaterThan(String value) {
            addCriterion("messageID >", value, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessageIDGreaterThanOrEqualTo(String value) {
            addCriterion("messageID >=", value, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessageIDLessThan(String value) {
            addCriterion("messageID <", value, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessageIDLessThanOrEqualTo(String value) {
            addCriterion("messageID <=", value, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessageIDLike(String value) {
            addCriterion("messageID like", value, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessageIDNotLike(String value) {
            addCriterion("messageID not like", value, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessageIDIn(List<String> values) {
            addCriterion("messageID in", values, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessageIDNotIn(List<String> values) {
            addCriterion("messageID not in", values, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessageIDBetween(String value1, String value2) {
            addCriterion("messageID between", value1, value2, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessageIDNotBetween(String value1, String value2) {
            addCriterion("messageID not between", value1, value2, "messageID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDIsNull() {
            addCriterion("messagevideoID is null");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDIsNotNull() {
            addCriterion("messagevideoID is not null");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDEqualTo(String value) {
            addCriterion("messagevideoID =", value, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDNotEqualTo(String value) {
            addCriterion("messagevideoID <>", value, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDGreaterThan(String value) {
            addCriterion("messagevideoID >", value, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDGreaterThanOrEqualTo(String value) {
            addCriterion("messagevideoID >=", value, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDLessThan(String value) {
            addCriterion("messagevideoID <", value, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDLessThanOrEqualTo(String value) {
            addCriterion("messagevideoID <=", value, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDLike(String value) {
            addCriterion("messagevideoID like", value, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDNotLike(String value) {
            addCriterion("messagevideoID not like", value, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDIn(List<String> values) {
            addCriterion("messagevideoID in", values, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDNotIn(List<String> values) {
            addCriterion("messagevideoID not in", values, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDBetween(String value1, String value2) {
            addCriterion("messagevideoID between", value1, value2, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessagevideoIDNotBetween(String value1, String value2) {
            addCriterion("messagevideoID not between", value1, value2, "messagevideoID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDIsNull() {
            addCriterion("messageuserID is null");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDIsNotNull() {
            addCriterion("messageuserID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDEqualTo(String value) {
            addCriterion("messageuserID =", value, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDNotEqualTo(String value) {
            addCriterion("messageuserID <>", value, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDGreaterThan(String value) {
            addCriterion("messageuserID >", value, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDGreaterThanOrEqualTo(String value) {
            addCriterion("messageuserID >=", value, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDLessThan(String value) {
            addCriterion("messageuserID <", value, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDLessThanOrEqualTo(String value) {
            addCriterion("messageuserID <=", value, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDLike(String value) {
            addCriterion("messageuserID like", value, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDNotLike(String value) {
            addCriterion("messageuserID not like", value, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDIn(List<String> values) {
            addCriterion("messageuserID in", values, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDNotIn(List<String> values) {
            addCriterion("messageuserID not in", values, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDBetween(String value1, String value2) {
            addCriterion("messageuserID between", value1, value2, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserIDNotBetween(String value1, String value2) {
            addCriterion("messageuserID not between", value1, value2, "messageuserID");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameIsNull() {
            addCriterion("messageuserName is null");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameIsNotNull() {
            addCriterion("messageuserName is not null");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameEqualTo(String value) {
            addCriterion("messageuserName =", value, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameNotEqualTo(String value) {
            addCriterion("messageuserName <>", value, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameGreaterThan(String value) {
            addCriterion("messageuserName >", value, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameGreaterThanOrEqualTo(String value) {
            addCriterion("messageuserName >=", value, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameLessThan(String value) {
            addCriterion("messageuserName <", value, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameLessThanOrEqualTo(String value) {
            addCriterion("messageuserName <=", value, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameLike(String value) {
            addCriterion("messageuserName like", value, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameNotLike(String value) {
            addCriterion("messageuserName not like", value, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameIn(List<String> values) {
            addCriterion("messageuserName in", values, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameNotIn(List<String> values) {
            addCriterion("messageuserName not in", values, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameBetween(String value1, String value2) {
            addCriterion("messageuserName between", value1, value2, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageuserNameNotBetween(String value1, String value2) {
            addCriterion("messageuserName not between", value1, value2, "messageuserName");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNull() {
            addCriterion("messageTime is null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNotNull() {
            addCriterion("messageTime is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeEqualTo(Date value) {
            addCriterion("messageTime =", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotEqualTo(Date value) {
            addCriterion("messageTime <>", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThan(Date value) {
            addCriterion("messageTime >", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("messageTime >=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThan(Date value) {
            addCriterion("messageTime <", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThanOrEqualTo(Date value) {
            addCriterion("messageTime <=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIn(List<Date> values) {
            addCriterion("messageTime in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotIn(List<Date> values) {
            addCriterion("messageTime not in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeBetween(Date value1, Date value2) {
            addCriterion("messageTime between", value1, value2, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotBetween(Date value1, Date value2) {
            addCriterion("messageTime not between", value1, value2, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageHandIsNull() {
            addCriterion("messageHand is null");
            return (Criteria) this;
        }

        public Criteria andMessageHandIsNotNull() {
            addCriterion("messageHand is not null");
            return (Criteria) this;
        }

        public Criteria andMessageHandEqualTo(String value) {
            addCriterion("messageHand =", value, "messageHand");
            return (Criteria) this;
        }

        public Criteria andMessageHandNotEqualTo(String value) {
            addCriterion("messageHand <>", value, "messageHand");
            return (Criteria) this;
        }

        public Criteria andMessageHandGreaterThan(String value) {
            addCriterion("messageHand >", value, "messageHand");
            return (Criteria) this;
        }

        public Criteria andMessageHandGreaterThanOrEqualTo(String value) {
            addCriterion("messageHand >=", value, "messageHand");
            return (Criteria) this;
        }

        public Criteria andMessageHandLessThan(String value) {
            addCriterion("messageHand <", value, "messageHand");
            return (Criteria) this;
        }

        public Criteria andMessageHandLessThanOrEqualTo(String value) {
            addCriterion("messageHand <=", value, "messageHand");
            return (Criteria) this;
        }

        public Criteria andMessageHandLike(String value) {
            addCriterion("messageHand like", value, "messageHand");
            return (Criteria) this;
        }

        public Criteria andMessageHandNotLike(String value) {
            addCriterion("messageHand not like", value, "messageHand");
            return (Criteria) this;
        }

        public Criteria andMessageHandIn(List<String> values) {
            addCriterion("messageHand in", values, "messageHand");
            return (Criteria) this;
        }

        public Criteria andMessageHandNotIn(List<String> values) {
            addCriterion("messageHand not in", values, "messageHand");
            return (Criteria) this;
        }

        public Criteria andMessageHandBetween(String value1, String value2) {
            addCriterion("messageHand between", value1, value2, "messageHand");
            return (Criteria) this;
        }

        public Criteria andMessageHandNotBetween(String value1, String value2) {
            addCriterion("messageHand not between", value1, value2, "messageHand");
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