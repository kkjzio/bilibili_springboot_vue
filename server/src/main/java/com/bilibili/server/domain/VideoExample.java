package com.bilibili.server.domain;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideoIDIsNull() {
            addCriterion("videoID is null");
            return (Criteria) this;
        }

        public Criteria andVideoIDIsNotNull() {
            addCriterion("videoID is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIDEqualTo(Integer value) {
            addCriterion("videoID =", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDNotEqualTo(Integer value) {
            addCriterion("videoID <>", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDGreaterThan(Integer value) {
            addCriterion("videoID >", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoID >=", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDLessThan(Integer value) {
            addCriterion("videoID <", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDLessThanOrEqualTo(Integer value) {
            addCriterion("videoID <=", value, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDIn(List<Integer> values) {
            addCriterion("videoID in", values, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDNotIn(List<Integer> values) {
            addCriterion("videoID not in", values, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDBetween(Integer value1, Integer value2) {
            addCriterion("videoID between", value1, value2, "videoID");
            return (Criteria) this;
        }

        public Criteria andVideoIDNotBetween(Integer value1, Integer value2) {
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

        public Criteria andVideolookTimeIsNull() {
            addCriterion("videolookTime is null");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeIsNotNull() {
            addCriterion("videolookTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeEqualTo(String value) {
            addCriterion("videolookTime =", value, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeNotEqualTo(String value) {
            addCriterion("videolookTime <>", value, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeGreaterThan(String value) {
            addCriterion("videolookTime >", value, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeGreaterThanOrEqualTo(String value) {
            addCriterion("videolookTime >=", value, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeLessThan(String value) {
            addCriterion("videolookTime <", value, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeLessThanOrEqualTo(String value) {
            addCriterion("videolookTime <=", value, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeLike(String value) {
            addCriterion("videolookTime like", value, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeNotLike(String value) {
            addCriterion("videolookTime not like", value, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeIn(List<String> values) {
            addCriterion("videolookTime in", values, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeNotIn(List<String> values) {
            addCriterion("videolookTime not in", values, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeBetween(String value1, String value2) {
            addCriterion("videolookTime between", value1, value2, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideolookTimeNotBetween(String value1, String value2) {
            addCriterion("videolookTime not between", value1, value2, "videolookTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNull() {
            addCriterion("videoTime is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNotNull() {
            addCriterion("videoTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeEqualTo(String value) {
            addCriterion("videoTime =", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotEqualTo(String value) {
            addCriterion("videoTime <>", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThan(String value) {
            addCriterion("videoTime >", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("videoTime >=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThan(String value) {
            addCriterion("videoTime <", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThanOrEqualTo(String value) {
            addCriterion("videoTime <=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLike(String value) {
            addCriterion("videoTime like", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotLike(String value) {
            addCriterion("videoTime not like", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIn(List<String> values) {
            addCriterion("videoTime in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotIn(List<String> values) {
            addCriterion("videoTime not in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeBetween(String value1, String value2) {
            addCriterion("videoTime between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotBetween(String value1, String value2) {
            addCriterion("videoTime not between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoStateIsNull() {
            addCriterion("videoState is null");
            return (Criteria) this;
        }

        public Criteria andVideoStateIsNotNull() {
            addCriterion("videoState is not null");
            return (Criteria) this;
        }

        public Criteria andVideoStateEqualTo(String value) {
            addCriterion("videoState =", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateNotEqualTo(String value) {
            addCriterion("videoState <>", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateGreaterThan(String value) {
            addCriterion("videoState >", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateGreaterThanOrEqualTo(String value) {
            addCriterion("videoState >=", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateLessThan(String value) {
            addCriterion("videoState <", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateLessThanOrEqualTo(String value) {
            addCriterion("videoState <=", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateLike(String value) {
            addCriterion("videoState like", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateNotLike(String value) {
            addCriterion("videoState not like", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateIn(List<String> values) {
            addCriterion("videoState in", values, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateNotIn(List<String> values) {
            addCriterion("videoState not in", values, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateBetween(String value1, String value2) {
            addCriterion("videoState between", value1, value2, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateNotBetween(String value1, String value2) {
            addCriterion("videoState not between", value1, value2, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryIsNull() {
            addCriterion("videocAtegory is null");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryIsNotNull() {
            addCriterion("videocAtegory is not null");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryEqualTo(String value) {
            addCriterion("videocAtegory =", value, "videocAtegory");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryNotEqualTo(String value) {
            addCriterion("videocAtegory <>", value, "videocAtegory");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryGreaterThan(String value) {
            addCriterion("videocAtegory >", value, "videocAtegory");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryGreaterThanOrEqualTo(String value) {
            addCriterion("videocAtegory >=", value, "videocAtegory");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryLessThan(String value) {
            addCriterion("videocAtegory <", value, "videocAtegory");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryLessThanOrEqualTo(String value) {
            addCriterion("videocAtegory <=", value, "videocAtegory");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryLike(String value) {
            addCriterion("videocAtegory like", value, "videocAtegory");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryNotLike(String value) {
            addCriterion("videocAtegory not like", value, "videocAtegory");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryIn(List<String> values) {
            addCriterion("videocAtegory in", values, "videocAtegory");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryNotIn(List<String> values) {
            addCriterion("videocAtegory not in", values, "videocAtegory");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryBetween(String value1, String value2) {
            addCriterion("videocAtegory between", value1, value2, "videocAtegory");
            return (Criteria) this;
        }

        public Criteria andVideocAtegoryNotBetween(String value1, String value2) {
            addCriterion("videocAtegory not between", value1, value2, "videocAtegory");
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

        public Criteria andVideoAddressIsNull() {
            addCriterion("videoAddress is null");
            return (Criteria) this;
        }

        public Criteria andVideoAddressIsNotNull() {
            addCriterion("videoAddress is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAddressEqualTo(String value) {
            addCriterion("videoAddress =", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotEqualTo(String value) {
            addCriterion("videoAddress <>", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressGreaterThan(String value) {
            addCriterion("videoAddress >", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("videoAddress >=", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressLessThan(String value) {
            addCriterion("videoAddress <", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressLessThanOrEqualTo(String value) {
            addCriterion("videoAddress <=", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressLike(String value) {
            addCriterion("videoAddress like", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotLike(String value) {
            addCriterion("videoAddress not like", value, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressIn(List<String> values) {
            addCriterion("videoAddress in", values, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotIn(List<String> values) {
            addCriterion("videoAddress not in", values, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressBetween(String value1, String value2) {
            addCriterion("videoAddress between", value1, value2, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoAddressNotBetween(String value1, String value2) {
            addCriterion("videoAddress not between", value1, value2, "videoAddress");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionIsNull() {
            addCriterion("videoCollection is null");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionIsNotNull() {
            addCriterion("videoCollection is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionEqualTo(String value) {
            addCriterion("videoCollection =", value, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionNotEqualTo(String value) {
            addCriterion("videoCollection <>", value, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionGreaterThan(String value) {
            addCriterion("videoCollection >", value, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("videoCollection >=", value, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionLessThan(String value) {
            addCriterion("videoCollection <", value, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionLessThanOrEqualTo(String value) {
            addCriterion("videoCollection <=", value, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionLike(String value) {
            addCriterion("videoCollection like", value, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionNotLike(String value) {
            addCriterion("videoCollection not like", value, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionIn(List<String> values) {
            addCriterion("videoCollection in", values, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionNotIn(List<String> values) {
            addCriterion("videoCollection not in", values, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionBetween(String value1, String value2) {
            addCriterion("videoCollection between", value1, value2, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoCollectionNotBetween(String value1, String value2) {
            addCriterion("videoCollection not between", value1, value2, "videoCollection");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingIsNull() {
            addCriterion("videoLeaving is null");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingIsNotNull() {
            addCriterion("videoLeaving is not null");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingEqualTo(String value) {
            addCriterion("videoLeaving =", value, "videoLeaving");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingNotEqualTo(String value) {
            addCriterion("videoLeaving <>", value, "videoLeaving");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingGreaterThan(String value) {
            addCriterion("videoLeaving >", value, "videoLeaving");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingGreaterThanOrEqualTo(String value) {
            addCriterion("videoLeaving >=", value, "videoLeaving");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingLessThan(String value) {
            addCriterion("videoLeaving <", value, "videoLeaving");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingLessThanOrEqualTo(String value) {
            addCriterion("videoLeaving <=", value, "videoLeaving");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingLike(String value) {
            addCriterion("videoLeaving like", value, "videoLeaving");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingNotLike(String value) {
            addCriterion("videoLeaving not like", value, "videoLeaving");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingIn(List<String> values) {
            addCriterion("videoLeaving in", values, "videoLeaving");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingNotIn(List<String> values) {
            addCriterion("videoLeaving not in", values, "videoLeaving");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingBetween(String value1, String value2) {
            addCriterion("videoLeaving between", value1, value2, "videoLeaving");
            return (Criteria) this;
        }

        public Criteria andVideoLeavingNotBetween(String value1, String value2) {
            addCriterion("videoLeaving not between", value1, value2, "videoLeaving");
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

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
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