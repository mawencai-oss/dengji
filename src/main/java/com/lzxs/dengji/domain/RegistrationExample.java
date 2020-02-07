package com.lzxs.dengji.domain;

import java.util.ArrayList;
import java.util.List;

public class RegistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistrationExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andTranspartationIsNull() {
            addCriterion("transpartation is null");
            return (Criteria) this;
        }

        public Criteria andTranspartationIsNotNull() {
            addCriterion("transpartation is not null");
            return (Criteria) this;
        }

        public Criteria andTranspartationEqualTo(String value) {
            addCriterion("transpartation =", value, "transpartation");
            return (Criteria) this;
        }

        public Criteria andTranspartationNotEqualTo(String value) {
            addCriterion("transpartation <>", value, "transpartation");
            return (Criteria) this;
        }

        public Criteria andTranspartationGreaterThan(String value) {
            addCriterion("transpartation >", value, "transpartation");
            return (Criteria) this;
        }

        public Criteria andTranspartationGreaterThanOrEqualTo(String value) {
            addCriterion("transpartation >=", value, "transpartation");
            return (Criteria) this;
        }

        public Criteria andTranspartationLessThan(String value) {
            addCriterion("transpartation <", value, "transpartation");
            return (Criteria) this;
        }

        public Criteria andTranspartationLessThanOrEqualTo(String value) {
            addCriterion("transpartation <=", value, "transpartation");
            return (Criteria) this;
        }

        public Criteria andTranspartationLike(String value) {
            addCriterion("transpartation like", value, "transpartation");
            return (Criteria) this;
        }

        public Criteria andTranspartationNotLike(String value) {
            addCriterion("transpartation not like", value, "transpartation");
            return (Criteria) this;
        }

        public Criteria andTranspartationIn(List<String> values) {
            addCriterion("transpartation in", values, "transpartation");
            return (Criteria) this;
        }

        public Criteria andTranspartationNotIn(List<String> values) {
            addCriterion("transpartation not in", values, "transpartation");
            return (Criteria) this;
        }

        public Criteria andTranspartationBetween(String value1, String value2) {
            addCriterion("transpartation between", value1, value2, "transpartation");
            return (Criteria) this;
        }

        public Criteria andTranspartationNotBetween(String value1, String value2) {
            addCriterion("transpartation not between", value1, value2, "transpartation");
            return (Criteria) this;
        }

        public Criteria andRigisterdataIsNull() {
            addCriterion("rigisterdata is null");
            return (Criteria) this;
        }

        public Criteria andRigisterdataIsNotNull() {
            addCriterion("rigisterdata is not null");
            return (Criteria) this;
        }

        public Criteria andRigisterdataEqualTo(String value) {
            addCriterion("rigisterdata =", value, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andRigisterdataNotEqualTo(String value) {
            addCriterion("rigisterdata <>", value, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andRigisterdataGreaterThan(String value) {
            addCriterion("rigisterdata >", value, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andRigisterdataGreaterThanOrEqualTo(String value) {
            addCriterion("rigisterdata >=", value, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andRigisterdataLessThan(String value) {
            addCriterion("rigisterdata <", value, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andRigisterdataLessThanOrEqualTo(String value) {
            addCriterion("rigisterdata <=", value, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andRigisterdataLike(String value) {
            addCriterion("rigisterdata like", value, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andRigisterdataNotLike(String value) {
            addCriterion("rigisterdata not like", value, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andRigisterdataIn(List<String> values) {
            addCriterion("rigisterdata in", values, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andRigisterdataNotIn(List<String> values) {
            addCriterion("rigisterdata not in", values, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andRigisterdataBetween(String value1, String value2) {
            addCriterion("rigisterdata between", value1, value2, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andRigisterdataNotBetween(String value1, String value2) {
            addCriterion("rigisterdata not between", value1, value2, "rigisterdata");
            return (Criteria) this;
        }

        public Criteria andOfficerIsNull() {
            addCriterion("officer is null");
            return (Criteria) this;
        }

        public Criteria andOfficerIsNotNull() {
            addCriterion("officer is not null");
            return (Criteria) this;
        }

        public Criteria andOfficerEqualTo(String value) {
            addCriterion("officer =", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerNotEqualTo(String value) {
            addCriterion("officer <>", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerGreaterThan(String value) {
            addCriterion("officer >", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerGreaterThanOrEqualTo(String value) {
            addCriterion("officer >=", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerLessThan(String value) {
            addCriterion("officer <", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerLessThanOrEqualTo(String value) {
            addCriterion("officer <=", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerLike(String value) {
            addCriterion("officer like", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerNotLike(String value) {
            addCriterion("officer not like", value, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerIn(List<String> values) {
            addCriterion("officer in", values, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerNotIn(List<String> values) {
            addCriterion("officer not in", values, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerBetween(String value1, String value2) {
            addCriterion("officer between", value1, value2, "officer");
            return (Criteria) this;
        }

        public Criteria andOfficerNotBetween(String value1, String value2) {
            addCriterion("officer not between", value1, value2, "officer");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNull() {
            addCriterion("car_number is null");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNotNull() {
            addCriterion("car_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumberEqualTo(String value) {
            addCriterion("car_number =", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotEqualTo(String value) {
            addCriterion("car_number <>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThan(String value) {
            addCriterion("car_number >", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("car_number >=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThan(String value) {
            addCriterion("car_number <", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThanOrEqualTo(String value) {
            addCriterion("car_number <=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLike(String value) {
            addCriterion("car_number like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotLike(String value) {
            addCriterion("car_number not like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIn(List<String> values) {
            addCriterion("car_number in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotIn(List<String> values) {
            addCriterion("car_number not in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberBetween(String value1, String value2) {
            addCriterion("car_number between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotBetween(String value1, String value2) {
            addCriterion("car_number not between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andVisitorIsNull() {
            addCriterion("visitor is null");
            return (Criteria) this;
        }

        public Criteria andVisitorIsNotNull() {
            addCriterion("visitor is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorEqualTo(String value) {
            addCriterion("visitor =", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorNotEqualTo(String value) {
            addCriterion("visitor <>", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorGreaterThan(String value) {
            addCriterion("visitor >", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorGreaterThanOrEqualTo(String value) {
            addCriterion("visitor >=", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorLessThan(String value) {
            addCriterion("visitor <", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorLessThanOrEqualTo(String value) {
            addCriterion("visitor <=", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorLike(String value) {
            addCriterion("visitor like", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorNotLike(String value) {
            addCriterion("visitor not like", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorIn(List<String> values) {
            addCriterion("visitor in", values, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorNotIn(List<String> values) {
            addCriterion("visitor not in", values, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorBetween(String value1, String value2) {
            addCriterion("visitor between", value1, value2, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorNotBetween(String value1, String value2) {
            addCriterion("visitor not between", value1, value2, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneIsNull() {
            addCriterion("visitor_phone is null");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneIsNotNull() {
            addCriterion("visitor_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneEqualTo(String value) {
            addCriterion("visitor_phone =", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotEqualTo(String value) {
            addCriterion("visitor_phone <>", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneGreaterThan(String value) {
            addCriterion("visitor_phone >", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("visitor_phone >=", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneLessThan(String value) {
            addCriterion("visitor_phone <", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneLessThanOrEqualTo(String value) {
            addCriterion("visitor_phone <=", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneLike(String value) {
            addCriterion("visitor_phone like", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotLike(String value) {
            addCriterion("visitor_phone not like", value, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneIn(List<String> values) {
            addCriterion("visitor_phone in", values, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotIn(List<String> values) {
            addCriterion("visitor_phone not in", values, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneBetween(String value1, String value2) {
            addCriterion("visitor_phone between", value1, value2, "visitorPhone");
            return (Criteria) this;
        }

        public Criteria andVisitorPhoneNotBetween(String value1, String value2) {
            addCriterion("visitor_phone not between", value1, value2, "visitorPhone");
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