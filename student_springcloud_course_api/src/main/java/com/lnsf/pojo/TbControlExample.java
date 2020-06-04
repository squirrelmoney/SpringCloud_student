package com.lnsf.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbControlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbControlExample() {
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

        public Criteria andIftakecourseIsNull() {
            addCriterion("IfTakeCourse is null");
            return (Criteria) this;
        }

        public Criteria andIftakecourseIsNotNull() {
            addCriterion("IfTakeCourse is not null");
            return (Criteria) this;
        }

        public Criteria andIftakecourseEqualTo(Integer value) {
            addCriterion("IfTakeCourse =", value, "iftakecourse");
            return (Criteria) this;
        }

        public Criteria andIftakecourseNotEqualTo(Integer value) {
            addCriterion("IfTakeCourse <>", value, "iftakecourse");
            return (Criteria) this;
        }

        public Criteria andIftakecourseGreaterThan(Integer value) {
            addCriterion("IfTakeCourse >", value, "iftakecourse");
            return (Criteria) this;
        }

        public Criteria andIftakecourseGreaterThanOrEqualTo(Integer value) {
            addCriterion("IfTakeCourse >=", value, "iftakecourse");
            return (Criteria) this;
        }

        public Criteria andIftakecourseLessThan(Integer value) {
            addCriterion("IfTakeCourse <", value, "iftakecourse");
            return (Criteria) this;
        }

        public Criteria andIftakecourseLessThanOrEqualTo(Integer value) {
            addCriterion("IfTakeCourse <=", value, "iftakecourse");
            return (Criteria) this;
        }

        public Criteria andIftakecourseIn(List<Integer> values) {
            addCriterion("IfTakeCourse in", values, "iftakecourse");
            return (Criteria) this;
        }

        public Criteria andIftakecourseNotIn(List<Integer> values) {
            addCriterion("IfTakeCourse not in", values, "iftakecourse");
            return (Criteria) this;
        }

        public Criteria andIftakecourseBetween(Integer value1, Integer value2) {
            addCriterion("IfTakeCourse between", value1, value2, "iftakecourse");
            return (Criteria) this;
        }

        public Criteria andIftakecourseNotBetween(Integer value1, Integer value2) {
            addCriterion("IfTakeCourse not between", value1, value2, "iftakecourse");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeIsNull() {
            addCriterion("IfInputGrade is null");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeIsNotNull() {
            addCriterion("IfInputGrade is not null");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeEqualTo(Integer value) {
            addCriterion("IfInputGrade =", value, "ifinputgrade");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeNotEqualTo(Integer value) {
            addCriterion("IfInputGrade <>", value, "ifinputgrade");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeGreaterThan(Integer value) {
            addCriterion("IfInputGrade >", value, "ifinputgrade");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IfInputGrade >=", value, "ifinputgrade");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeLessThan(Integer value) {
            addCriterion("IfInputGrade <", value, "ifinputgrade");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeLessThanOrEqualTo(Integer value) {
            addCriterion("IfInputGrade <=", value, "ifinputgrade");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeIn(List<Integer> values) {
            addCriterion("IfInputGrade in", values, "ifinputgrade");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeNotIn(List<Integer> values) {
            addCriterion("IfInputGrade not in", values, "ifinputgrade");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeBetween(Integer value1, Integer value2) {
            addCriterion("IfInputGrade between", value1, value2, "ifinputgrade");
            return (Criteria) this;
        }

        public Criteria andIfinputgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("IfInputGrade not between", value1, value2, "ifinputgrade");
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