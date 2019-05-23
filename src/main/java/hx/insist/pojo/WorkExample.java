package hx.insist.pojo;

import java.util.ArrayList;
import java.util.List;

public class WorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkExample() {
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

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Integer value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Integer value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Integer value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Integer value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Integer value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Integer> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Integer> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Integer value1, Integer value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Integer value1, Integer value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWtitleIsNull() {
            addCriterion("wtitle is null");
            return (Criteria) this;
        }

        public Criteria andWtitleIsNotNull() {
            addCriterion("wtitle is not null");
            return (Criteria) this;
        }

        public Criteria andWtitleEqualTo(String value) {
            addCriterion("wtitle =", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotEqualTo(String value) {
            addCriterion("wtitle <>", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleGreaterThan(String value) {
            addCriterion("wtitle >", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleGreaterThanOrEqualTo(String value) {
            addCriterion("wtitle >=", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleLessThan(String value) {
            addCriterion("wtitle <", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleLessThanOrEqualTo(String value) {
            addCriterion("wtitle <=", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleLike(String value) {
            addCriterion("wtitle like", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotLike(String value) {
            addCriterion("wtitle not like", value, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleIn(List<String> values) {
            addCriterion("wtitle in", values, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotIn(List<String> values) {
            addCriterion("wtitle not in", values, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleBetween(String value1, String value2) {
            addCriterion("wtitle between", value1, value2, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWtitleNotBetween(String value1, String value2) {
            addCriterion("wtitle not between", value1, value2, "wtitle");
            return (Criteria) this;
        }

        public Criteria andWintroIsNull() {
            addCriterion("wintro is null");
            return (Criteria) this;
        }

        public Criteria andWintroIsNotNull() {
            addCriterion("wintro is not null");
            return (Criteria) this;
        }

        public Criteria andWintroEqualTo(String value) {
            addCriterion("wintro =", value, "wintro");
            return (Criteria) this;
        }

        public Criteria andWintroNotEqualTo(String value) {
            addCriterion("wintro <>", value, "wintro");
            return (Criteria) this;
        }

        public Criteria andWintroGreaterThan(String value) {
            addCriterion("wintro >", value, "wintro");
            return (Criteria) this;
        }

        public Criteria andWintroGreaterThanOrEqualTo(String value) {
            addCriterion("wintro >=", value, "wintro");
            return (Criteria) this;
        }

        public Criteria andWintroLessThan(String value) {
            addCriterion("wintro <", value, "wintro");
            return (Criteria) this;
        }

        public Criteria andWintroLessThanOrEqualTo(String value) {
            addCriterion("wintro <=", value, "wintro");
            return (Criteria) this;
        }

        public Criteria andWintroLike(String value) {
            addCriterion("wintro like", value, "wintro");
            return (Criteria) this;
        }

        public Criteria andWintroNotLike(String value) {
            addCriterion("wintro not like", value, "wintro");
            return (Criteria) this;
        }

        public Criteria andWintroIn(List<String> values) {
            addCriterion("wintro in", values, "wintro");
            return (Criteria) this;
        }

        public Criteria andWintroNotIn(List<String> values) {
            addCriterion("wintro not in", values, "wintro");
            return (Criteria) this;
        }

        public Criteria andWintroBetween(String value1, String value2) {
            addCriterion("wintro between", value1, value2, "wintro");
            return (Criteria) this;
        }

        public Criteria andWintroNotBetween(String value1, String value2) {
            addCriterion("wintro not between", value1, value2, "wintro");
            return (Criteria) this;
        }

        public Criteria andWimgIsNull() {
            addCriterion("wimg is null");
            return (Criteria) this;
        }

        public Criteria andWimgIsNotNull() {
            addCriterion("wimg is not null");
            return (Criteria) this;
        }

        public Criteria andWimgEqualTo(String value) {
            addCriterion("wimg =", value, "wimg");
            return (Criteria) this;
        }

        public Criteria andWimgNotEqualTo(String value) {
            addCriterion("wimg <>", value, "wimg");
            return (Criteria) this;
        }

        public Criteria andWimgGreaterThan(String value) {
            addCriterion("wimg >", value, "wimg");
            return (Criteria) this;
        }

        public Criteria andWimgGreaterThanOrEqualTo(String value) {
            addCriterion("wimg >=", value, "wimg");
            return (Criteria) this;
        }

        public Criteria andWimgLessThan(String value) {
            addCriterion("wimg <", value, "wimg");
            return (Criteria) this;
        }

        public Criteria andWimgLessThanOrEqualTo(String value) {
            addCriterion("wimg <=", value, "wimg");
            return (Criteria) this;
        }

        public Criteria andWimgLike(String value) {
            addCriterion("wimg like", value, "wimg");
            return (Criteria) this;
        }

        public Criteria andWimgNotLike(String value) {
            addCriterion("wimg not like", value, "wimg");
            return (Criteria) this;
        }

        public Criteria andWimgIn(List<String> values) {
            addCriterion("wimg in", values, "wimg");
            return (Criteria) this;
        }

        public Criteria andWimgNotIn(List<String> values) {
            addCriterion("wimg not in", values, "wimg");
            return (Criteria) this;
        }

        public Criteria andWimgBetween(String value1, String value2) {
            addCriterion("wimg between", value1, value2, "wimg");
            return (Criteria) this;
        }

        public Criteria andWimgNotBetween(String value1, String value2) {
            addCriterion("wimg not between", value1, value2, "wimg");
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