package com.bilibili.server.domain;

import java.util.ArrayList;
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

        public Criteria andUserMingziIsNull() {
            addCriterion("userMingzi is null");
            return (Criteria) this;
        }

        public Criteria andUserMingziIsNotNull() {
            addCriterion("userMingzi is not null");
            return (Criteria) this;
        }

        public Criteria andUserMingziEqualTo(String value) {
            addCriterion("userMingzi =", value, "userMingzi");
            return (Criteria) this;
        }

        public Criteria andUserMingziNotEqualTo(String value) {
            addCriterion("userMingzi <>", value, "userMingzi");
            return (Criteria) this;
        }

        public Criteria andUserMingziGreaterThan(String value) {
            addCriterion("userMingzi >", value, "userMingzi");
            return (Criteria) this;
        }

        public Criteria andUserMingziGreaterThanOrEqualTo(String value) {
            addCriterion("userMingzi >=", value, "userMingzi");
            return (Criteria) this;
        }

        public Criteria andUserMingziLessThan(String value) {
            addCriterion("userMingzi <", value, "userMingzi");
            return (Criteria) this;
        }

        public Criteria andUserMingziLessThanOrEqualTo(String value) {
            addCriterion("userMingzi <=", value, "userMingzi");
            return (Criteria) this;
        }

        public Criteria andUserMingziLike(String value) {
            addCriterion("userMingzi like", value, "userMingzi");
            return (Criteria) this;
        }

        public Criteria andUserMingziNotLike(String value) {
            addCriterion("userMingzi not like", value, "userMingzi");
            return (Criteria) this;
        }

        public Criteria andUserMingziIn(List<String> values) {
            addCriterion("userMingzi in", values, "userMingzi");
            return (Criteria) this;
        }

        public Criteria andUserMingziNotIn(List<String> values) {
            addCriterion("userMingzi not in", values, "userMingzi");
            return (Criteria) this;
        }

        public Criteria andUserMingziBetween(String value1, String value2) {
            addCriterion("userMingzi between", value1, value2, "userMingzi");
            return (Criteria) this;
        }

        public Criteria andUserMingziNotBetween(String value1, String value2) {
            addCriterion("userMingzi not between", value1, value2, "userMingzi");
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

        public Criteria andUsersexIsNull() {
            addCriterion("usersex is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("usersex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("usersex =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("usersex <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("usersex >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("usersex >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("usersex <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("usersex <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("usersex like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("usersex not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("usersex in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("usersex not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("usersex between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("usersex not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("`passWord` is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("`passWord` is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("`passWord` =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("`passWord` <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("`passWord` >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("`passWord` >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("`passWord` <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("`passWord` <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("`passWord` like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("`passWord` not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("`passWord` in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("`passWord` not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("`passWord` between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("`passWord` not between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andUserHandIsNull() {
            addCriterion("userHand is null");
            return (Criteria) this;
        }

        public Criteria andUserHandIsNotNull() {
            addCriterion("userHand is not null");
            return (Criteria) this;
        }

        public Criteria andUserHandEqualTo(String value) {
            addCriterion("userHand =", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandNotEqualTo(String value) {
            addCriterion("userHand <>", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandGreaterThan(String value) {
            addCriterion("userHand >", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandGreaterThanOrEqualTo(String value) {
            addCriterion("userHand >=", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandLessThan(String value) {
            addCriterion("userHand <", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandLessThanOrEqualTo(String value) {
            addCriterion("userHand <=", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandLike(String value) {
            addCriterion("userHand like", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandNotLike(String value) {
            addCriterion("userHand not like", value, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandIn(List<String> values) {
            addCriterion("userHand in", values, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandNotIn(List<String> values) {
            addCriterion("userHand not in", values, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandBetween(String value1, String value2) {
            addCriterion("userHand between", value1, value2, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserHandNotBetween(String value1, String value2) {
            addCriterion("userHand not between", value1, value2, "userHand");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("userAddress is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("userAddress is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("userAddress =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("userAddress <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("userAddress >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("userAddress >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("userAddress <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("userAddress <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("userAddress like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("userAddress not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("userAddress in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("userAddress not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("userAddress between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("userAddress not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("userPhone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("userPhone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserQQIsNull() {
            addCriterion("userQQ is null");
            return (Criteria) this;
        }

        public Criteria andUserQQIsNotNull() {
            addCriterion("userQQ is not null");
            return (Criteria) this;
        }

        public Criteria andUserQQEqualTo(String value) {
            addCriterion("userQQ =", value, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserQQNotEqualTo(String value) {
            addCriterion("userQQ <>", value, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserQQGreaterThan(String value) {
            addCriterion("userQQ >", value, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserQQGreaterThanOrEqualTo(String value) {
            addCriterion("userQQ >=", value, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserQQLessThan(String value) {
            addCriterion("userQQ <", value, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserQQLessThanOrEqualTo(String value) {
            addCriterion("userQQ <=", value, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserQQLike(String value) {
            addCriterion("userQQ like", value, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserQQNotLike(String value) {
            addCriterion("userQQ not like", value, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserQQIn(List<String> values) {
            addCriterion("userQQ in", values, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserQQNotIn(List<String> values) {
            addCriterion("userQQ not in", values, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserQQBetween(String value1, String value2) {
            addCriterion("userQQ between", value1, value2, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserQQNotBetween(String value1, String value2) {
            addCriterion("userQQ not between", value1, value2, "userQQ");
            return (Criteria) this;
        }

        public Criteria andUserEmialIsNull() {
            addCriterion("userEmial is null");
            return (Criteria) this;
        }

        public Criteria andUserEmialIsNotNull() {
            addCriterion("userEmial is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmialEqualTo(String value) {
            addCriterion("userEmial =", value, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserEmialNotEqualTo(String value) {
            addCriterion("userEmial <>", value, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserEmialGreaterThan(String value) {
            addCriterion("userEmial >", value, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserEmialGreaterThanOrEqualTo(String value) {
            addCriterion("userEmial >=", value, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserEmialLessThan(String value) {
            addCriterion("userEmial <", value, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserEmialLessThanOrEqualTo(String value) {
            addCriterion("userEmial <=", value, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserEmialLike(String value) {
            addCriterion("userEmial like", value, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserEmialNotLike(String value) {
            addCriterion("userEmial not like", value, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserEmialIn(List<String> values) {
            addCriterion("userEmial in", values, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserEmialNotIn(List<String> values) {
            addCriterion("userEmial not in", values, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserEmialBetween(String value1, String value2) {
            addCriterion("userEmial between", value1, value2, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserEmialNotBetween(String value1, String value2) {
            addCriterion("userEmial not between", value1, value2, "userEmial");
            return (Criteria) this;
        }

        public Criteria andUserCollectionIsNull() {
            addCriterion("userCollection is null");
            return (Criteria) this;
        }

        public Criteria andUserCollectionIsNotNull() {
            addCriterion("userCollection is not null");
            return (Criteria) this;
        }

        public Criteria andUserCollectionEqualTo(String value) {
            addCriterion("userCollection =", value, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUserCollectionNotEqualTo(String value) {
            addCriterion("userCollection <>", value, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUserCollectionGreaterThan(String value) {
            addCriterion("userCollection >", value, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUserCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("userCollection >=", value, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUserCollectionLessThan(String value) {
            addCriterion("userCollection <", value, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUserCollectionLessThanOrEqualTo(String value) {
            addCriterion("userCollection <=", value, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUserCollectionLike(String value) {
            addCriterion("userCollection like", value, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUserCollectionNotLike(String value) {
            addCriterion("userCollection not like", value, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUserCollectionIn(List<String> values) {
            addCriterion("userCollection in", values, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUserCollectionNotIn(List<String> values) {
            addCriterion("userCollection not in", values, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUserCollectionBetween(String value1, String value2) {
            addCriterion("userCollection between", value1, value2, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUserCollectionNotBetween(String value1, String value2) {
            addCriterion("userCollection not between", value1, value2, "userCollection");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaIsNull() {
            addCriterion("useryinghangka is null");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaIsNotNull() {
            addCriterion("useryinghangka is not null");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaEqualTo(String value) {
            addCriterion("useryinghangka =", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaNotEqualTo(String value) {
            addCriterion("useryinghangka <>", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaGreaterThan(String value) {
            addCriterion("useryinghangka >", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaGreaterThanOrEqualTo(String value) {
            addCriterion("useryinghangka >=", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaLessThan(String value) {
            addCriterion("useryinghangka <", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaLessThanOrEqualTo(String value) {
            addCriterion("useryinghangka <=", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaLike(String value) {
            addCriterion("useryinghangka like", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaNotLike(String value) {
            addCriterion("useryinghangka not like", value, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaIn(List<String> values) {
            addCriterion("useryinghangka in", values, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaNotIn(List<String> values) {
            addCriterion("useryinghangka not in", values, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaBetween(String value1, String value2) {
            addCriterion("useryinghangka between", value1, value2, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUseryinghangkaNotBetween(String value1, String value2) {
            addCriterion("useryinghangka not between", value1, value2, "useryinghangka");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("userState is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("userState is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(String value) {
            addCriterion("userState =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(String value) {
            addCriterion("userState <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(String value) {
            addCriterion("userState >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(String value) {
            addCriterion("userState >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(String value) {
            addCriterion("userState <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(String value) {
            addCriterion("userState <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLike(String value) {
            addCriterion("userState like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotLike(String value) {
            addCriterion("userState not like", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<String> values) {
            addCriterion("userState in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<String> values) {
            addCriterion("userState not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(String value1, String value2) {
            addCriterion("userState between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(String value1, String value2) {
            addCriterion("userState not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNull() {
            addCriterion("userLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNotNull() {
            addCriterion("userLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeEqualTo(String value) {
            addCriterion("userLoginTime =", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotEqualTo(String value) {
            addCriterion("userLoginTime <>", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThan(String value) {
            addCriterion("userLoginTime >", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("userLoginTime >=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThan(String value) {
            addCriterion("userLoginTime <", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThanOrEqualTo(String value) {
            addCriterion("userLoginTime <=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLike(String value) {
            addCriterion("userLoginTime like", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotLike(String value) {
            addCriterion("userLoginTime not like", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIn(List<String> values) {
            addCriterion("userLoginTime in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotIn(List<String> values) {
            addCriterion("userLoginTime not in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeBetween(String value1, String value2) {
            addCriterion("userLoginTime between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotBetween(String value1, String value2) {
            addCriterion("userLoginTime not between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserIPIsNull() {
            addCriterion("userIP is null");
            return (Criteria) this;
        }

        public Criteria andUserIPIsNotNull() {
            addCriterion("userIP is not null");
            return (Criteria) this;
        }

        public Criteria andUserIPEqualTo(String value) {
            addCriterion("userIP =", value, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserIPNotEqualTo(String value) {
            addCriterion("userIP <>", value, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserIPGreaterThan(String value) {
            addCriterion("userIP >", value, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserIPGreaterThanOrEqualTo(String value) {
            addCriterion("userIP >=", value, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserIPLessThan(String value) {
            addCriterion("userIP <", value, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserIPLessThanOrEqualTo(String value) {
            addCriterion("userIP <=", value, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserIPLike(String value) {
            addCriterion("userIP like", value, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserIPNotLike(String value) {
            addCriterion("userIP not like", value, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserIPIn(List<String> values) {
            addCriterion("userIP in", values, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserIPNotIn(List<String> values) {
            addCriterion("userIP not in", values, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserIPBetween(String value1, String value2) {
            addCriterion("userIP between", value1, value2, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserIPNotBetween(String value1, String value2) {
            addCriterion("userIP not between", value1, value2, "userIP");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordIsNull() {
            addCriterion("userPaypassword is null");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordIsNotNull() {
            addCriterion("userPaypassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordEqualTo(String value) {
            addCriterion("userPaypassword =", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordNotEqualTo(String value) {
            addCriterion("userPaypassword <>", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordGreaterThan(String value) {
            addCriterion("userPaypassword >", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userPaypassword >=", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordLessThan(String value) {
            addCriterion("userPaypassword <", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordLessThanOrEqualTo(String value) {
            addCriterion("userPaypassword <=", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordLike(String value) {
            addCriterion("userPaypassword like", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordNotLike(String value) {
            addCriterion("userPaypassword not like", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordIn(List<String> values) {
            addCriterion("userPaypassword in", values, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordNotIn(List<String> values) {
            addCriterion("userPaypassword not in", values, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordBetween(String value1, String value2) {
            addCriterion("userPaypassword between", value1, value2, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordNotBetween(String value1, String value2) {
            addCriterion("userPaypassword not between", value1, value2, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserRMBIsNull() {
            addCriterion("userRMB is null");
            return (Criteria) this;
        }

        public Criteria andUserRMBIsNotNull() {
            addCriterion("userRMB is not null");
            return (Criteria) this;
        }

        public Criteria andUserRMBEqualTo(String value) {
            addCriterion("userRMB =", value, "userRMB");
            return (Criteria) this;
        }

        public Criteria andUserRMBNotEqualTo(String value) {
            addCriterion("userRMB <>", value, "userRMB");
            return (Criteria) this;
        }

        public Criteria andUserRMBGreaterThan(String value) {
            addCriterion("userRMB >", value, "userRMB");
            return (Criteria) this;
        }

        public Criteria andUserRMBGreaterThanOrEqualTo(String value) {
            addCriterion("userRMB >=", value, "userRMB");
            return (Criteria) this;
        }

        public Criteria andUserRMBLessThan(String value) {
            addCriterion("userRMB <", value, "userRMB");
            return (Criteria) this;
        }

        public Criteria andUserRMBLessThanOrEqualTo(String value) {
            addCriterion("userRMB <=", value, "userRMB");
            return (Criteria) this;
        }

        public Criteria andUserRMBLike(String value) {
            addCriterion("userRMB like", value, "userRMB");
            return (Criteria) this;
        }

        public Criteria andUserRMBNotLike(String value) {
            addCriterion("userRMB not like", value, "userRMB");
            return (Criteria) this;
        }

        public Criteria andUserRMBIn(List<String> values) {
            addCriterion("userRMB in", values, "userRMB");
            return (Criteria) this;
        }

        public Criteria andUserRMBNotIn(List<String> values) {
            addCriterion("userRMB not in", values, "userRMB");
            return (Criteria) this;
        }

        public Criteria andUserRMBBetween(String value1, String value2) {
            addCriterion("userRMB between", value1, value2, "userRMB");
            return (Criteria) this;
        }

        public Criteria andUserRMBNotBetween(String value1, String value2) {
            addCriterion("userRMB not between", value1, value2, "userRMB");
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