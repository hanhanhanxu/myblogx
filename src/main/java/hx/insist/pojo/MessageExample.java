package hx.insist.pojo;

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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("mid like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("mid not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMesspicIsNull() {
            addCriterion("messpic is null");
            return (Criteria) this;
        }

        public Criteria andMesspicIsNotNull() {
            addCriterion("messpic is not null");
            return (Criteria) this;
        }

        public Criteria andMesspicEqualTo(String value) {
            addCriterion("messpic =", value, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesspicNotEqualTo(String value) {
            addCriterion("messpic <>", value, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesspicGreaterThan(String value) {
            addCriterion("messpic >", value, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesspicGreaterThanOrEqualTo(String value) {
            addCriterion("messpic >=", value, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesspicLessThan(String value) {
            addCriterion("messpic <", value, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesspicLessThanOrEqualTo(String value) {
            addCriterion("messpic <=", value, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesspicLike(String value) {
            addCriterion("messpic like", value, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesspicNotLike(String value) {
            addCriterion("messpic not like", value, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesspicIn(List<String> values) {
            addCriterion("messpic in", values, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesspicNotIn(List<String> values) {
            addCriterion("messpic not in", values, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesspicBetween(String value1, String value2) {
            addCriterion("messpic between", value1, value2, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesspicNotBetween(String value1, String value2) {
            addCriterion("messpic not between", value1, value2, "messpic");
            return (Criteria) this;
        }

        public Criteria andMesscontentIsNull() {
            addCriterion("messcontent is null");
            return (Criteria) this;
        }

        public Criteria andMesscontentIsNotNull() {
            addCriterion("messcontent is not null");
            return (Criteria) this;
        }

        public Criteria andMesscontentEqualTo(String value) {
            addCriterion("messcontent =", value, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMesscontentNotEqualTo(String value) {
            addCriterion("messcontent <>", value, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMesscontentGreaterThan(String value) {
            addCriterion("messcontent >", value, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMesscontentGreaterThanOrEqualTo(String value) {
            addCriterion("messcontent >=", value, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMesscontentLessThan(String value) {
            addCriterion("messcontent <", value, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMesscontentLessThanOrEqualTo(String value) {
            addCriterion("messcontent <=", value, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMesscontentLike(String value) {
            addCriterion("messcontent like", value, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMesscontentNotLike(String value) {
            addCriterion("messcontent not like", value, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMesscontentIn(List<String> values) {
            addCriterion("messcontent in", values, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMesscontentNotIn(List<String> values) {
            addCriterion("messcontent not in", values, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMesscontentBetween(String value1, String value2) {
            addCriterion("messcontent between", value1, value2, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMesscontentNotBetween(String value1, String value2) {
            addCriterion("messcontent not between", value1, value2, "messcontent");
            return (Criteria) this;
        }

        public Criteria andMessdateIsNull() {
            addCriterion("messdate is null");
            return (Criteria) this;
        }

        public Criteria andMessdateIsNotNull() {
            addCriterion("messdate is not null");
            return (Criteria) this;
        }

        public Criteria andMessdateEqualTo(Date value) {
            addCriterion("messdate =", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateNotEqualTo(Date value) {
            addCriterion("messdate <>", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateGreaterThan(Date value) {
            addCriterion("messdate >", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateGreaterThanOrEqualTo(Date value) {
            addCriterion("messdate >=", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateLessThan(Date value) {
            addCriterion("messdate <", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateLessThanOrEqualTo(Date value) {
            addCriterion("messdate <=", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateIn(List<Date> values) {
            addCriterion("messdate in", values, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateNotIn(List<Date> values) {
            addCriterion("messdate not in", values, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateBetween(Date value1, Date value2) {
            addCriterion("messdate between", value1, value2, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateNotBetween(Date value1, Date value2) {
            addCriterion("messdate not between", value1, value2, "messdate");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andPraiseIsNull() {
            addCriterion("praise is null");
            return (Criteria) this;
        }

        public Criteria andPraiseIsNotNull() {
            addCriterion("praise is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseEqualTo(Integer value) {
            addCriterion("praise =", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotEqualTo(Integer value) {
            addCriterion("praise <>", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseGreaterThan(Integer value) {
            addCriterion("praise >", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("praise >=", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseLessThan(Integer value) {
            addCriterion("praise <", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("praise <=", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseIn(List<Integer> values) {
            addCriterion("praise in", values, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotIn(List<Integer> values) {
            addCriterion("praise not in", values, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseBetween(Integer value1, Integer value2) {
            addCriterion("praise between", value1, value2, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("praise not between", value1, value2, "praise");
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