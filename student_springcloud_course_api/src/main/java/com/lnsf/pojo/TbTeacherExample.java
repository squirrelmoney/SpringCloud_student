package com.lnsf.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTeacherExample() {
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

        public Criteria andTeachernumIsNull() {
            addCriterion("TeacherNum is null");
            return (Criteria) this;
        }

        public Criteria andTeachernumIsNotNull() {
            addCriterion("TeacherNum is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernumEqualTo(String value) {
            addCriterion("TeacherNum =", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotEqualTo(String value) {
            addCriterion("TeacherNum <>", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThan(String value) {
            addCriterion("TeacherNum >", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherNum >=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThan(String value) {
            addCriterion("TeacherNum <", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThanOrEqualTo(String value) {
            addCriterion("TeacherNum <=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLike(String value) {
            addCriterion("TeacherNum like", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotLike(String value) {
            addCriterion("TeacherNum not like", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumIn(List<String> values) {
            addCriterion("TeacherNum in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotIn(List<String> values) {
            addCriterion("TeacherNum not in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumBetween(String value1, String value2) {
            addCriterion("TeacherNum between", value1, value2, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotBetween(String value1, String value2) {
            addCriterion("TeacherNum not between", value1, value2, "teachernum");
            return (Criteria) this;
        }

        public Criteria andDeptnumIsNull() {
            addCriterion("DeptNum is null");
            return (Criteria) this;
        }

        public Criteria andDeptnumIsNotNull() {
            addCriterion("DeptNum is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnumEqualTo(Integer value) {
            addCriterion("DeptNum =", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotEqualTo(Integer value) {
            addCriterion("DeptNum <>", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumGreaterThan(Integer value) {
            addCriterion("DeptNum >", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeptNum >=", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLessThan(Integer value) {
            addCriterion("DeptNum <", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLessThanOrEqualTo(Integer value) {
            addCriterion("DeptNum <=", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumIn(List<Integer> values) {
            addCriterion("DeptNum in", values, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotIn(List<Integer> values) {
            addCriterion("DeptNum not in", values, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumBetween(Integer value1, Integer value2) {
            addCriterion("DeptNum between", value1, value2, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotBetween(Integer value1, Integer value2) {
            addCriterion("DeptNum not between", value1, value2, "deptnum");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("TeacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("TeacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("TeacherName =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("TeacherName <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("TeacherName >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherName >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("TeacherName <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("TeacherName <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("TeacherName like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("TeacherName not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("TeacherName in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("TeacherName not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("TeacherName between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("TeacherName not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachersexIsNull() {
            addCriterion("TeacherSex is null");
            return (Criteria) this;
        }

        public Criteria andTeachersexIsNotNull() {
            addCriterion("TeacherSex is not null");
            return (Criteria) this;
        }

        public Criteria andTeachersexEqualTo(String value) {
            addCriterion("TeacherSex =", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotEqualTo(String value) {
            addCriterion("TeacherSex <>", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexGreaterThan(String value) {
            addCriterion("TeacherSex >", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherSex >=", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLessThan(String value) {
            addCriterion("TeacherSex <", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLessThanOrEqualTo(String value) {
            addCriterion("TeacherSex <=", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLike(String value) {
            addCriterion("TeacherSex like", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotLike(String value) {
            addCriterion("TeacherSex not like", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexIn(List<String> values) {
            addCriterion("TeacherSex in", values, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotIn(List<String> values) {
            addCriterion("TeacherSex not in", values, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexBetween(String value1, String value2) {
            addCriterion("TeacherSex between", value1, value2, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotBetween(String value1, String value2) {
            addCriterion("TeacherSex not between", value1, value2, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateIsNull() {
            addCriterion("TeacherEntrydate is null");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateIsNotNull() {
            addCriterion("TeacherEntrydate is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateEqualTo(String value) {
            addCriterion("TeacherEntrydate =", value, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateNotEqualTo(String value) {
            addCriterion("TeacherEntrydate <>", value, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateGreaterThan(String value) {
            addCriterion("TeacherEntrydate >", value, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherEntrydate >=", value, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateLessThan(String value) {
            addCriterion("TeacherEntrydate <", value, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateLessThanOrEqualTo(String value) {
            addCriterion("TeacherEntrydate <=", value, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateLike(String value) {
            addCriterion("TeacherEntrydate like", value, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateNotLike(String value) {
            addCriterion("TeacherEntrydate not like", value, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateIn(List<String> values) {
            addCriterion("TeacherEntrydate in", values, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateNotIn(List<String> values) {
            addCriterion("TeacherEntrydate not in", values, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateBetween(String value1, String value2) {
            addCriterion("TeacherEntrydate between", value1, value2, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherentrydateNotBetween(String value1, String value2) {
            addCriterion("TeacherEntrydate not between", value1, value2, "teacherentrydate");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIsNull() {
            addCriterion("TeacherPassword is null");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIsNotNull() {
            addCriterion("TeacherPassword is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordEqualTo(String value) {
            addCriterion("TeacherPassword =", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotEqualTo(String value) {
            addCriterion("TeacherPassword <>", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordGreaterThan(String value) {
            addCriterion("TeacherPassword >", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherPassword >=", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLessThan(String value) {
            addCriterion("TeacherPassword <", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLessThanOrEqualTo(String value) {
            addCriterion("TeacherPassword <=", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLike(String value) {
            addCriterion("TeacherPassword like", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotLike(String value) {
            addCriterion("TeacherPassword not like", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIn(List<String> values) {
            addCriterion("TeacherPassword in", values, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotIn(List<String> values) {
            addCriterion("TeacherPassword not in", values, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordBetween(String value1, String value2) {
            addCriterion("TeacherPassword between", value1, value2, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotBetween(String value1, String value2) {
            addCriterion("TeacherPassword not between", value1, value2, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeachertitleIsNull() {
            addCriterion("TeacherTitle is null");
            return (Criteria) this;
        }

        public Criteria andTeachertitleIsNotNull() {
            addCriterion("TeacherTitle is not null");
            return (Criteria) this;
        }

        public Criteria andTeachertitleEqualTo(String value) {
            addCriterion("TeacherTitle =", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotEqualTo(String value) {
            addCriterion("TeacherTitle <>", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleGreaterThan(String value) {
            addCriterion("TeacherTitle >", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherTitle >=", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleLessThan(String value) {
            addCriterion("TeacherTitle <", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleLessThanOrEqualTo(String value) {
            addCriterion("TeacherTitle <=", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleLike(String value) {
            addCriterion("TeacherTitle like", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotLike(String value) {
            addCriterion("TeacherTitle not like", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleIn(List<String> values) {
            addCriterion("TeacherTitle in", values, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotIn(List<String> values) {
            addCriterion("TeacherTitle not in", values, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleBetween(String value1, String value2) {
            addCriterion("TeacherTitle between", value1, value2, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotBetween(String value1, String value2) {
            addCriterion("TeacherTitle not between", value1, value2, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsIsNull() {
            addCriterion("TeacherRights is null");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsIsNotNull() {
            addCriterion("TeacherRights is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsEqualTo(Integer value) {
            addCriterion("TeacherRights =", value, "teacherrights");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsNotEqualTo(Integer value) {
            addCriterion("TeacherRights <>", value, "teacherrights");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsGreaterThan(Integer value) {
            addCriterion("TeacherRights >", value, "teacherrights");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsGreaterThanOrEqualTo(Integer value) {
            addCriterion("TeacherRights >=", value, "teacherrights");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsLessThan(Integer value) {
            addCriterion("TeacherRights <", value, "teacherrights");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsLessThanOrEqualTo(Integer value) {
            addCriterion("TeacherRights <=", value, "teacherrights");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsIn(List<Integer> values) {
            addCriterion("TeacherRights in", values, "teacherrights");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsNotIn(List<Integer> values) {
            addCriterion("TeacherRights not in", values, "teacherrights");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsBetween(Integer value1, Integer value2) {
            addCriterion("TeacherRights between", value1, value2, "teacherrights");
            return (Criteria) this;
        }

        public Criteria andTeacherrightsNotBetween(Integer value1, Integer value2) {
            addCriterion("TeacherRights not between", value1, value2, "teacherrights");
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