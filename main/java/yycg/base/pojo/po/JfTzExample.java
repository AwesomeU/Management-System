package yycg.base.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JfTzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JfTzExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTzbhIsNull() {
            addCriterion("TZBH is null");
            return (Criteria) this;
        }

        public Criteria andTzbhIsNotNull() {
            addCriterion("TZBH is not null");
            return (Criteria) this;
        }

        public Criteria andTzbhEqualTo(String value) {
            addCriterion("TZBH =", value, "tzbh");
            return (Criteria) this;
        }

        public Criteria andTzbhNotEqualTo(String value) {
            addCriterion("TZBH <>", value, "tzbh");
            return (Criteria) this;
        }

        public Criteria andTzbhGreaterThan(String value) {
            addCriterion("TZBH >", value, "tzbh");
            return (Criteria) this;
        }

        public Criteria andTzbhGreaterThanOrEqualTo(String value) {
            addCriterion("TZBH >=", value, "tzbh");
            return (Criteria) this;
        }

        public Criteria andTzbhLessThan(String value) {
            addCriterion("TZBH <", value, "tzbh");
            return (Criteria) this;
        }

        public Criteria andTzbhLessThanOrEqualTo(String value) {
            addCriterion("TZBH <=", value, "tzbh");
            return (Criteria) this;
        }

        public Criteria andTzbhLike(String value) {
            addCriterion("TZBH like", value, "tzbh");
            return (Criteria) this;
        }

        public Criteria andTzbhNotLike(String value) {
            addCriterion("TZBH not like", value, "tzbh");
            return (Criteria) this;
        }

        public Criteria andTzbhIn(List<String> values) {
            addCriterion("TZBH in", values, "tzbh");
            return (Criteria) this;
        }

        public Criteria andTzbhNotIn(List<String> values) {
            addCriterion("TZBH not in", values, "tzbh");
            return (Criteria) this;
        }

        public Criteria andTzbhBetween(String value1, String value2) {
            addCriterion("TZBH between", value1, value2, "tzbh");
            return (Criteria) this;
        }

        public Criteria andTzbhNotBetween(String value1, String value2) {
            addCriterion("TZBH not between", value1, value2, "tzbh");
            return (Criteria) this;
        }

        public Criteria andKhbhIsNull() {
            addCriterion("KHBH is null");
            return (Criteria) this;
        }

        public Criteria andKhbhIsNotNull() {
            addCriterion("KHBH is not null");
            return (Criteria) this;
        }

        public Criteria andKhbhEqualTo(String value) {
            addCriterion("KHBH =", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotEqualTo(String value) {
            addCriterion("KHBH <>", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhGreaterThan(String value) {
            addCriterion("KHBH >", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhGreaterThanOrEqualTo(String value) {
            addCriterion("KHBH >=", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhLessThan(String value) {
            addCriterion("KHBH <", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhLessThanOrEqualTo(String value) {
            addCriterion("KHBH <=", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhLike(String value) {
            addCriterion("KHBH like", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotLike(String value) {
            addCriterion("KHBH not like", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhIn(List<String> values) {
            addCriterion("KHBH in", values, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotIn(List<String> values) {
            addCriterion("KHBH not in", values, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhBetween(String value1, String value2) {
            addCriterion("KHBH between", value1, value2, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotBetween(String value1, String value2) {
            addCriterion("KHBH not between", value1, value2, "khbh");
            return (Criteria) this;
        }

        public Criteria andCmdmIsNull() {
            addCriterion("CMDM is null");
            return (Criteria) this;
        }

        public Criteria andCmdmIsNotNull() {
            addCriterion("CMDM is not null");
            return (Criteria) this;
        }

        public Criteria andCmdmEqualTo(String value) {
            addCriterion("CMDM =", value, "cmdm");
            return (Criteria) this;
        }

        public Criteria andCmdmNotEqualTo(String value) {
            addCriterion("CMDM <>", value, "cmdm");
            return (Criteria) this;
        }

        public Criteria andCmdmGreaterThan(String value) {
            addCriterion("CMDM >", value, "cmdm");
            return (Criteria) this;
        }

        public Criteria andCmdmGreaterThanOrEqualTo(String value) {
            addCriterion("CMDM >=", value, "cmdm");
            return (Criteria) this;
        }

        public Criteria andCmdmLessThan(String value) {
            addCriterion("CMDM <", value, "cmdm");
            return (Criteria) this;
        }

        public Criteria andCmdmLessThanOrEqualTo(String value) {
            addCriterion("CMDM <=", value, "cmdm");
            return (Criteria) this;
        }

        public Criteria andCmdmLike(String value) {
            addCriterion("CMDM like", value, "cmdm");
            return (Criteria) this;
        }

        public Criteria andCmdmNotLike(String value) {
            addCriterion("CMDM not like", value, "cmdm");
            return (Criteria) this;
        }

        public Criteria andCmdmIn(List<String> values) {
            addCriterion("CMDM in", values, "cmdm");
            return (Criteria) this;
        }

        public Criteria andCmdmNotIn(List<String> values) {
            addCriterion("CMDM not in", values, "cmdm");
            return (Criteria) this;
        }

        public Criteria andCmdmBetween(String value1, String value2) {
            addCriterion("CMDM between", value1, value2, "cmdm");
            return (Criteria) this;
        }

        public Criteria andCmdmNotBetween(String value1, String value2) {
            addCriterion("CMDM not between", value1, value2, "cmdm");
            return (Criteria) this;
        }

        public Criteria andHchcIsNull() {
            addCriterion("HCHC is null");
            return (Criteria) this;
        }

        public Criteria andHchcIsNotNull() {
            addCriterion("HCHC is not null");
            return (Criteria) this;
        }

        public Criteria andHchcEqualTo(String value) {
            addCriterion("HCHC =", value, "hchc");
            return (Criteria) this;
        }

        public Criteria andHchcNotEqualTo(String value) {
            addCriterion("HCHC <>", value, "hchc");
            return (Criteria) this;
        }

        public Criteria andHchcGreaterThan(String value) {
            addCriterion("HCHC >", value, "hchc");
            return (Criteria) this;
        }

        public Criteria andHchcGreaterThanOrEqualTo(String value) {
            addCriterion("HCHC >=", value, "hchc");
            return (Criteria) this;
        }

        public Criteria andHchcLessThan(String value) {
            addCriterion("HCHC <", value, "hchc");
            return (Criteria) this;
        }

        public Criteria andHchcLessThanOrEqualTo(String value) {
            addCriterion("HCHC <=", value, "hchc");
            return (Criteria) this;
        }

        public Criteria andHchcLike(String value) {
            addCriterion("HCHC like", value, "hchc");
            return (Criteria) this;
        }

        public Criteria andHchcNotLike(String value) {
            addCriterion("HCHC not like", value, "hchc");
            return (Criteria) this;
        }

        public Criteria andHchcIn(List<String> values) {
            addCriterion("HCHC in", values, "hchc");
            return (Criteria) this;
        }

        public Criteria andHchcNotIn(List<String> values) {
            addCriterion("HCHC not in", values, "hchc");
            return (Criteria) this;
        }

        public Criteria andHchcBetween(String value1, String value2) {
            addCriterion("HCHC between", value1, value2, "hchc");
            return (Criteria) this;
        }

        public Criteria andHchcNotBetween(String value1, String value2) {
            addCriterion("HCHC not between", value1, value2, "hchc");
            return (Criteria) this;
        }

        public Criteria andJsfsIsNull() {
            addCriterion("JSFS is null");
            return (Criteria) this;
        }

        public Criteria andJsfsIsNotNull() {
            addCriterion("JSFS is not null");
            return (Criteria) this;
        }

        public Criteria andJsfsEqualTo(String value) {
            addCriterion("JSFS =", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotEqualTo(String value) {
            addCriterion("JSFS <>", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsGreaterThan(String value) {
            addCriterion("JSFS >", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsGreaterThanOrEqualTo(String value) {
            addCriterion("JSFS >=", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsLessThan(String value) {
            addCriterion("JSFS <", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsLessThanOrEqualTo(String value) {
            addCriterion("JSFS <=", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsLike(String value) {
            addCriterion("JSFS like", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotLike(String value) {
            addCriterion("JSFS not like", value, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsIn(List<String> values) {
            addCriterion("JSFS in", values, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotIn(List<String> values) {
            addCriterion("JSFS not in", values, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsBetween(String value1, String value2) {
            addCriterion("JSFS between", value1, value2, "jsfs");
            return (Criteria) this;
        }

        public Criteria andJsfsNotBetween(String value1, String value2) {
            addCriterion("JSFS not between", value1, value2, "jsfs");
            return (Criteria) this;
        }

        public Criteria andFmdmIsNull() {
            addCriterion("FMDM is null");
            return (Criteria) this;
        }

        public Criteria andFmdmIsNotNull() {
            addCriterion("FMDM is not null");
            return (Criteria) this;
        }

        public Criteria andFmdmEqualTo(String value) {
            addCriterion("FMDM =", value, "fmdm");
            return (Criteria) this;
        }

        public Criteria andFmdmNotEqualTo(String value) {
            addCriterion("FMDM <>", value, "fmdm");
            return (Criteria) this;
        }

        public Criteria andFmdmGreaterThan(String value) {
            addCriterion("FMDM >", value, "fmdm");
            return (Criteria) this;
        }

        public Criteria andFmdmGreaterThanOrEqualTo(String value) {
            addCriterion("FMDM >=", value, "fmdm");
            return (Criteria) this;
        }

        public Criteria andFmdmLessThan(String value) {
            addCriterion("FMDM <", value, "fmdm");
            return (Criteria) this;
        }

        public Criteria andFmdmLessThanOrEqualTo(String value) {
            addCriterion("FMDM <=", value, "fmdm");
            return (Criteria) this;
        }

        public Criteria andFmdmLike(String value) {
            addCriterion("FMDM like", value, "fmdm");
            return (Criteria) this;
        }

        public Criteria andFmdmNotLike(String value) {
            addCriterion("FMDM not like", value, "fmdm");
            return (Criteria) this;
        }

        public Criteria andFmdmIn(List<String> values) {
            addCriterion("FMDM in", values, "fmdm");
            return (Criteria) this;
        }

        public Criteria andFmdmNotIn(List<String> values) {
            addCriterion("FMDM not in", values, "fmdm");
            return (Criteria) this;
        }

        public Criteria andFmdmBetween(String value1, String value2) {
            addCriterion("FMDM between", value1, value2, "fmdm");
            return (Criteria) this;
        }

        public Criteria andFmdmNotBetween(String value1, String value2) {
            addCriterion("FMDM not between", value1, value2, "fmdm");
            return (Criteria) this;
        }

        public Criteria andCcIsNull() {
            addCriterion("CC is null");
            return (Criteria) this;
        }

        public Criteria andCcIsNotNull() {
            addCriterion("CC is not null");
            return (Criteria) this;
        }

        public Criteria andCcEqualTo(String value) {
            addCriterion("CC =", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotEqualTo(String value) {
            addCriterion("CC <>", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThan(String value) {
            addCriterion("CC >", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThanOrEqualTo(String value) {
            addCriterion("CC >=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThan(String value) {
            addCriterion("CC <", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThanOrEqualTo(String value) {
            addCriterion("CC <=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLike(String value) {
            addCriterion("CC like", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotLike(String value) {
            addCriterion("CC not like", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcIn(List<String> values) {
            addCriterion("CC in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotIn(List<String> values) {
            addCriterion("CC not in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcBetween(String value1, String value2) {
            addCriterion("CC between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotBetween(String value1, String value2) {
            addCriterion("CC not between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andKzIsNull() {
            addCriterion("KZ is null");
            return (Criteria) this;
        }

        public Criteria andKzIsNotNull() {
            addCriterion("KZ is not null");
            return (Criteria) this;
        }

        public Criteria andKzEqualTo(String value) {
            addCriterion("KZ =", value, "kz");
            return (Criteria) this;
        }

        public Criteria andKzNotEqualTo(String value) {
            addCriterion("KZ <>", value, "kz");
            return (Criteria) this;
        }

        public Criteria andKzGreaterThan(String value) {
            addCriterion("KZ >", value, "kz");
            return (Criteria) this;
        }

        public Criteria andKzGreaterThanOrEqualTo(String value) {
            addCriterion("KZ >=", value, "kz");
            return (Criteria) this;
        }

        public Criteria andKzLessThan(String value) {
            addCriterion("KZ <", value, "kz");
            return (Criteria) this;
        }

        public Criteria andKzLessThanOrEqualTo(String value) {
            addCriterion("KZ <=", value, "kz");
            return (Criteria) this;
        }

        public Criteria andKzLike(String value) {
            addCriterion("KZ like", value, "kz");
            return (Criteria) this;
        }

        public Criteria andKzNotLike(String value) {
            addCriterion("KZ not like", value, "kz");
            return (Criteria) this;
        }

        public Criteria andKzIn(List<String> values) {
            addCriterion("KZ in", values, "kz");
            return (Criteria) this;
        }

        public Criteria andKzNotIn(List<String> values) {
            addCriterion("KZ not in", values, "kz");
            return (Criteria) this;
        }

        public Criteria andKzBetween(String value1, String value2) {
            addCriterion("KZ between", value1, value2, "kz");
            return (Criteria) this;
        }

        public Criteria andKzNotBetween(String value1, String value2) {
            addCriterion("KZ not between", value1, value2, "kz");
            return (Criteria) this;
        }

        public Criteria andWlbzIsNull() {
            addCriterion("WLBZ is null");
            return (Criteria) this;
        }

        public Criteria andWlbzIsNotNull() {
            addCriterion("WLBZ is not null");
            return (Criteria) this;
        }

        public Criteria andWlbzEqualTo(String value) {
            addCriterion("WLBZ =", value, "wlbz");
            return (Criteria) this;
        }

        public Criteria andWlbzNotEqualTo(String value) {
            addCriterion("WLBZ <>", value, "wlbz");
            return (Criteria) this;
        }

        public Criteria andWlbzGreaterThan(String value) {
            addCriterion("WLBZ >", value, "wlbz");
            return (Criteria) this;
        }

        public Criteria andWlbzGreaterThanOrEqualTo(String value) {
            addCriterion("WLBZ >=", value, "wlbz");
            return (Criteria) this;
        }

        public Criteria andWlbzLessThan(String value) {
            addCriterion("WLBZ <", value, "wlbz");
            return (Criteria) this;
        }

        public Criteria andWlbzLessThanOrEqualTo(String value) {
            addCriterion("WLBZ <=", value, "wlbz");
            return (Criteria) this;
        }

        public Criteria andWlbzLike(String value) {
            addCriterion("WLBZ like", value, "wlbz");
            return (Criteria) this;
        }

        public Criteria andWlbzNotLike(String value) {
            addCriterion("WLBZ not like", value, "wlbz");
            return (Criteria) this;
        }

        public Criteria andWlbzIn(List<String> values) {
            addCriterion("WLBZ in", values, "wlbz");
            return (Criteria) this;
        }

        public Criteria andWlbzNotIn(List<String> values) {
            addCriterion("WLBZ not in", values, "wlbz");
            return (Criteria) this;
        }

        public Criteria andWlbzBetween(String value1, String value2) {
            addCriterion("WLBZ between", value1, value2, "wlbz");
            return (Criteria) this;
        }

        public Criteria andWlbzNotBetween(String value1, String value2) {
            addCriterion("WLBZ not between", value1, value2, "wlbz");
            return (Criteria) this;
        }

        public Criteria andNwmIsNull() {
            addCriterion("NWM is null");
            return (Criteria) this;
        }

        public Criteria andNwmIsNotNull() {
            addCriterion("NWM is not null");
            return (Criteria) this;
        }

        public Criteria andNwmEqualTo(String value) {
            addCriterion("NWM =", value, "nwm");
            return (Criteria) this;
        }

        public Criteria andNwmNotEqualTo(String value) {
            addCriterion("NWM <>", value, "nwm");
            return (Criteria) this;
        }

        public Criteria andNwmGreaterThan(String value) {
            addCriterion("NWM >", value, "nwm");
            return (Criteria) this;
        }

        public Criteria andNwmGreaterThanOrEqualTo(String value) {
            addCriterion("NWM >=", value, "nwm");
            return (Criteria) this;
        }

        public Criteria andNwmLessThan(String value) {
            addCriterion("NWM <", value, "nwm");
            return (Criteria) this;
        }

        public Criteria andNwmLessThanOrEqualTo(String value) {
            addCriterion("NWM <=", value, "nwm");
            return (Criteria) this;
        }

        public Criteria andNwmLike(String value) {
            addCriterion("NWM like", value, "nwm");
            return (Criteria) this;
        }

        public Criteria andNwmNotLike(String value) {
            addCriterion("NWM not like", value, "nwm");
            return (Criteria) this;
        }

        public Criteria andNwmIn(List<String> values) {
            addCriterion("NWM in", values, "nwm");
            return (Criteria) this;
        }

        public Criteria andNwmNotIn(List<String> values) {
            addCriterion("NWM not in", values, "nwm");
            return (Criteria) this;
        }

        public Criteria andNwmBetween(String value1, String value2) {
            addCriterion("NWM between", value1, value2, "nwm");
            return (Criteria) this;
        }

        public Criteria andNwmNotBetween(String value1, String value2) {
            addCriterion("NWM not between", value1, value2, "nwm");
            return (Criteria) this;
        }

        public Criteria andYjybsIsNull() {
            addCriterion("YJYBS is null");
            return (Criteria) this;
        }

        public Criteria andYjybsIsNotNull() {
            addCriterion("YJYBS is not null");
            return (Criteria) this;
        }

        public Criteria andYjybsEqualTo(String value) {
            addCriterion("YJYBS =", value, "yjybs");
            return (Criteria) this;
        }

        public Criteria andYjybsNotEqualTo(String value) {
            addCriterion("YJYBS <>", value, "yjybs");
            return (Criteria) this;
        }

        public Criteria andYjybsGreaterThan(String value) {
            addCriterion("YJYBS >", value, "yjybs");
            return (Criteria) this;
        }

        public Criteria andYjybsGreaterThanOrEqualTo(String value) {
            addCriterion("YJYBS >=", value, "yjybs");
            return (Criteria) this;
        }

        public Criteria andYjybsLessThan(String value) {
            addCriterion("YJYBS <", value, "yjybs");
            return (Criteria) this;
        }

        public Criteria andYjybsLessThanOrEqualTo(String value) {
            addCriterion("YJYBS <=", value, "yjybs");
            return (Criteria) this;
        }

        public Criteria andYjybsLike(String value) {
            addCriterion("YJYBS like", value, "yjybs");
            return (Criteria) this;
        }

        public Criteria andYjybsNotLike(String value) {
            addCriterion("YJYBS not like", value, "yjybs");
            return (Criteria) this;
        }

        public Criteria andYjybsIn(List<String> values) {
            addCriterion("YJYBS in", values, "yjybs");
            return (Criteria) this;
        }

        public Criteria andYjybsNotIn(List<String> values) {
            addCriterion("YJYBS not in", values, "yjybs");
            return (Criteria) this;
        }

        public Criteria andYjybsBetween(String value1, String value2) {
            addCriterion("YJYBS between", value1, value2, "yjybs");
            return (Criteria) this;
        }

        public Criteria andYjybsNotBetween(String value1, String value2) {
            addCriterion("YJYBS not between", value1, value2, "yjybs");
            return (Criteria) this;
        }

        public Criteria andZxcbzIsNull() {
            addCriterion("ZXCBZ is null");
            return (Criteria) this;
        }

        public Criteria andZxcbzIsNotNull() {
            addCriterion("ZXCBZ is not null");
            return (Criteria) this;
        }

        public Criteria andZxcbzEqualTo(String value) {
            addCriterion("ZXCBZ =", value, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andZxcbzNotEqualTo(String value) {
            addCriterion("ZXCBZ <>", value, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andZxcbzGreaterThan(String value) {
            addCriterion("ZXCBZ >", value, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andZxcbzGreaterThanOrEqualTo(String value) {
            addCriterion("ZXCBZ >=", value, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andZxcbzLessThan(String value) {
            addCriterion("ZXCBZ <", value, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andZxcbzLessThanOrEqualTo(String value) {
            addCriterion("ZXCBZ <=", value, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andZxcbzLike(String value) {
            addCriterion("ZXCBZ like", value, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andZxcbzNotLike(String value) {
            addCriterion("ZXCBZ not like", value, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andZxcbzIn(List<String> values) {
            addCriterion("ZXCBZ in", values, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andZxcbzNotIn(List<String> values) {
            addCriterion("ZXCBZ not in", values, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andZxcbzBetween(String value1, String value2) {
            addCriterion("ZXCBZ between", value1, value2, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andZxcbzNotBetween(String value1, String value2) {
            addCriterion("ZXCBZ not between", value1, value2, "zxcbz");
            return (Criteria) this;
        }

        public Criteria andTsbzIsNull() {
            addCriterion("TSBZ is null");
            return (Criteria) this;
        }

        public Criteria andTsbzIsNotNull() {
            addCriterion("TSBZ is not null");
            return (Criteria) this;
        }

        public Criteria andTsbzEqualTo(String value) {
            addCriterion("TSBZ =", value, "tsbz");
            return (Criteria) this;
        }

        public Criteria andTsbzNotEqualTo(String value) {
            addCriterion("TSBZ <>", value, "tsbz");
            return (Criteria) this;
        }

        public Criteria andTsbzGreaterThan(String value) {
            addCriterion("TSBZ >", value, "tsbz");
            return (Criteria) this;
        }

        public Criteria andTsbzGreaterThanOrEqualTo(String value) {
            addCriterion("TSBZ >=", value, "tsbz");
            return (Criteria) this;
        }

        public Criteria andTsbzLessThan(String value) {
            addCriterion("TSBZ <", value, "tsbz");
            return (Criteria) this;
        }

        public Criteria andTsbzLessThanOrEqualTo(String value) {
            addCriterion("TSBZ <=", value, "tsbz");
            return (Criteria) this;
        }

        public Criteria andTsbzLike(String value) {
            addCriterion("TSBZ like", value, "tsbz");
            return (Criteria) this;
        }

        public Criteria andTsbzNotLike(String value) {
            addCriterion("TSBZ not like", value, "tsbz");
            return (Criteria) this;
        }

        public Criteria andTsbzIn(List<String> values) {
            addCriterion("TSBZ in", values, "tsbz");
            return (Criteria) this;
        }

        public Criteria andTsbzNotIn(List<String> values) {
            addCriterion("TSBZ not in", values, "tsbz");
            return (Criteria) this;
        }

        public Criteria andTsbzBetween(String value1, String value2) {
            addCriterion("TSBZ between", value1, value2, "tsbz");
            return (Criteria) this;
        }

        public Criteria andTsbzNotBetween(String value1, String value2) {
            addCriterion("TSBZ not between", value1, value2, "tsbz");
            return (Criteria) this;
        }

        public Criteria andSlslIsNull() {
            addCriterion("SLSL is null");
            return (Criteria) this;
        }

        public Criteria andSlslIsNotNull() {
            addCriterion("SLSL is not null");
            return (Criteria) this;
        }

        public Criteria andSlslEqualTo(BigDecimal value) {
            addCriterion("SLSL =", value, "slsl");
            return (Criteria) this;
        }

        public Criteria andSlslNotEqualTo(BigDecimal value) {
            addCriterion("SLSL <>", value, "slsl");
            return (Criteria) this;
        }

        public Criteria andSlslGreaterThan(BigDecimal value) {
            addCriterion("SLSL >", value, "slsl");
            return (Criteria) this;
        }

        public Criteria andSlslGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SLSL >=", value, "slsl");
            return (Criteria) this;
        }

        public Criteria andSlslLessThan(BigDecimal value) {
            addCriterion("SLSL <", value, "slsl");
            return (Criteria) this;
        }

        public Criteria andSlslLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SLSL <=", value, "slsl");
            return (Criteria) this;
        }

        public Criteria andSlslIn(List<BigDecimal> values) {
            addCriterion("SLSL in", values, "slsl");
            return (Criteria) this;
        }

        public Criteria andSlslNotIn(List<BigDecimal> values) {
            addCriterion("SLSL not in", values, "slsl");
            return (Criteria) this;
        }

        public Criteria andSlslBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SLSL between", value1, value2, "slsl");
            return (Criteria) this;
        }

        public Criteria andSlslNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SLSL not between", value1, value2, "slsl");
            return (Criteria) this;
        }

        public Criteria andJjjsIsNull() {
            addCriterion("JJJS is null");
            return (Criteria) this;
        }

        public Criteria andJjjsIsNotNull() {
            addCriterion("JJJS is not null");
            return (Criteria) this;
        }

        public Criteria andJjjsEqualTo(BigDecimal value) {
            addCriterion("JJJS =", value, "jjjs");
            return (Criteria) this;
        }

        public Criteria andJjjsNotEqualTo(BigDecimal value) {
            addCriterion("JJJS <>", value, "jjjs");
            return (Criteria) this;
        }

        public Criteria andJjjsGreaterThan(BigDecimal value) {
            addCriterion("JJJS >", value, "jjjs");
            return (Criteria) this;
        }

        public Criteria andJjjsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JJJS >=", value, "jjjs");
            return (Criteria) this;
        }

        public Criteria andJjjsLessThan(BigDecimal value) {
            addCriterion("JJJS <", value, "jjjs");
            return (Criteria) this;
        }

        public Criteria andJjjsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JJJS <=", value, "jjjs");
            return (Criteria) this;
        }

        public Criteria andJjjsIn(List<BigDecimal> values) {
            addCriterion("JJJS in", values, "jjjs");
            return (Criteria) this;
        }

        public Criteria andJjjsNotIn(List<BigDecimal> values) {
            addCriterion("JJJS not in", values, "jjjs");
            return (Criteria) this;
        }

        public Criteria andJjjsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JJJS between", value1, value2, "jjjs");
            return (Criteria) this;
        }

        public Criteria andJjjsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JJJS not between", value1, value2, "jjjs");
            return (Criteria) this;
        }

        public Criteria andYbjsIsNull() {
            addCriterion("YBJS is null");
            return (Criteria) this;
        }

        public Criteria andYbjsIsNotNull() {
            addCriterion("YBJS is not null");
            return (Criteria) this;
        }

        public Criteria andYbjsEqualTo(BigDecimal value) {
            addCriterion("YBJS =", value, "ybjs");
            return (Criteria) this;
        }

        public Criteria andYbjsNotEqualTo(BigDecimal value) {
            addCriterion("YBJS <>", value, "ybjs");
            return (Criteria) this;
        }

        public Criteria andYbjsGreaterThan(BigDecimal value) {
            addCriterion("YBJS >", value, "ybjs");
            return (Criteria) this;
        }

        public Criteria andYbjsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YBJS >=", value, "ybjs");
            return (Criteria) this;
        }

        public Criteria andYbjsLessThan(BigDecimal value) {
            addCriterion("YBJS <", value, "ybjs");
            return (Criteria) this;
        }

        public Criteria andYbjsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YBJS <=", value, "ybjs");
            return (Criteria) this;
        }

        public Criteria andYbjsIn(List<BigDecimal> values) {
            addCriterion("YBJS in", values, "ybjs");
            return (Criteria) this;
        }

        public Criteria andYbjsNotIn(List<BigDecimal> values) {
            addCriterion("YBJS not in", values, "ybjs");
            return (Criteria) this;
        }

        public Criteria andYbjsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YBJS between", value1, value2, "ybjs");
            return (Criteria) this;
        }

        public Criteria andYbjsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YBJS not between", value1, value2, "ybjs");
            return (Criteria) this;
        }

        public Criteria andZbjsIsNull() {
            addCriterion("ZBJS is null");
            return (Criteria) this;
        }

        public Criteria andZbjsIsNotNull() {
            addCriterion("ZBJS is not null");
            return (Criteria) this;
        }

        public Criteria andZbjsEqualTo(BigDecimal value) {
            addCriterion("ZBJS =", value, "zbjs");
            return (Criteria) this;
        }

        public Criteria andZbjsNotEqualTo(BigDecimal value) {
            addCriterion("ZBJS <>", value, "zbjs");
            return (Criteria) this;
        }

        public Criteria andZbjsGreaterThan(BigDecimal value) {
            addCriterion("ZBJS >", value, "zbjs");
            return (Criteria) this;
        }

        public Criteria andZbjsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZBJS >=", value, "zbjs");
            return (Criteria) this;
        }

        public Criteria andZbjsLessThan(BigDecimal value) {
            addCriterion("ZBJS <", value, "zbjs");
            return (Criteria) this;
        }

        public Criteria andZbjsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZBJS <=", value, "zbjs");
            return (Criteria) this;
        }

        public Criteria andZbjsIn(List<BigDecimal> values) {
            addCriterion("ZBJS in", values, "zbjs");
            return (Criteria) this;
        }

        public Criteria andZbjsNotIn(List<BigDecimal> values) {
            addCriterion("ZBJS not in", values, "zbjs");
            return (Criteria) this;
        }

        public Criteria andZbjsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZBJS between", value1, value2, "zbjs");
            return (Criteria) this;
        }

        public Criteria andZbjsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZBJS not between", value1, value2, "zbjs");
            return (Criteria) this;
        }

        public Criteria andFlzIsNull() {
            addCriterion("FLZ is null");
            return (Criteria) this;
        }

        public Criteria andFlzIsNotNull() {
            addCriterion("FLZ is not null");
            return (Criteria) this;
        }

        public Criteria andFlzEqualTo(BigDecimal value) {
            addCriterion("FLZ =", value, "flz");
            return (Criteria) this;
        }

        public Criteria andFlzNotEqualTo(BigDecimal value) {
            addCriterion("FLZ <>", value, "flz");
            return (Criteria) this;
        }

        public Criteria andFlzGreaterThan(BigDecimal value) {
            addCriterion("FLZ >", value, "flz");
            return (Criteria) this;
        }

        public Criteria andFlzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLZ >=", value, "flz");
            return (Criteria) this;
        }

        public Criteria andFlzLessThan(BigDecimal value) {
            addCriterion("FLZ <", value, "flz");
            return (Criteria) this;
        }

        public Criteria andFlzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLZ <=", value, "flz");
            return (Criteria) this;
        }

        public Criteria andFlzIn(List<BigDecimal> values) {
            addCriterion("FLZ in", values, "flz");
            return (Criteria) this;
        }

        public Criteria andFlzNotIn(List<BigDecimal> values) {
            addCriterion("FLZ not in", values, "flz");
            return (Criteria) this;
        }

        public Criteria andFlzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLZ between", value1, value2, "flz");
            return (Criteria) this;
        }

        public Criteria andFlzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLZ not between", value1, value2, "flz");
            return (Criteria) this;
        }

        public Criteria andFlzyhllIsNull() {
            addCriterion("FLZYHLL is null");
            return (Criteria) this;
        }

        public Criteria andFlzyhllIsNotNull() {
            addCriterion("FLZYHLL is not null");
            return (Criteria) this;
        }

        public Criteria andFlzyhllEqualTo(BigDecimal value) {
            addCriterion("FLZYHLL =", value, "flzyhll");
            return (Criteria) this;
        }

        public Criteria andFlzyhllNotEqualTo(BigDecimal value) {
            addCriterion("FLZYHLL <>", value, "flzyhll");
            return (Criteria) this;
        }

        public Criteria andFlzyhllGreaterThan(BigDecimal value) {
            addCriterion("FLZYHLL >", value, "flzyhll");
            return (Criteria) this;
        }

        public Criteria andFlzyhllGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLZYHLL >=", value, "flzyhll");
            return (Criteria) this;
        }

        public Criteria andFlzyhllLessThan(BigDecimal value) {
            addCriterion("FLZYHLL <", value, "flzyhll");
            return (Criteria) this;
        }

        public Criteria andFlzyhllLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLZYHLL <=", value, "flzyhll");
            return (Criteria) this;
        }

        public Criteria andFlzyhllIn(List<BigDecimal> values) {
            addCriterion("FLZYHLL in", values, "flzyhll");
            return (Criteria) this;
        }

        public Criteria andFlzyhllNotIn(List<BigDecimal> values) {
            addCriterion("FLZYHLL not in", values, "flzyhll");
            return (Criteria) this;
        }

        public Criteria andFlzyhllBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLZYHLL between", value1, value2, "flzyhll");
            return (Criteria) this;
        }

        public Criteria andFlzyhllNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLZYHLL not between", value1, value2, "flzyhll");
            return (Criteria) this;
        }

        public Criteria andYsjeIsNull() {
            addCriterion("YSJE is null");
            return (Criteria) this;
        }

        public Criteria andYsjeIsNotNull() {
            addCriterion("YSJE is not null");
            return (Criteria) this;
        }

        public Criteria andYsjeEqualTo(BigDecimal value) {
            addCriterion("YSJE =", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeNotEqualTo(BigDecimal value) {
            addCriterion("YSJE <>", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeGreaterThan(BigDecimal value) {
            addCriterion("YSJE >", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YSJE >=", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeLessThan(BigDecimal value) {
            addCriterion("YSJE <", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YSJE <=", value, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeIn(List<BigDecimal> values) {
            addCriterion("YSJE in", values, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeNotIn(List<BigDecimal> values) {
            addCriterion("YSJE not in", values, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YSJE between", value1, value2, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YSJE not between", value1, value2, "ysje");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllIsNull() {
            addCriterion("YSJEYHLL is null");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllIsNotNull() {
            addCriterion("YSJEYHLL is not null");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllEqualTo(BigDecimal value) {
            addCriterion("YSJEYHLL =", value, "ysjeyhll");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllNotEqualTo(BigDecimal value) {
            addCriterion("YSJEYHLL <>", value, "ysjeyhll");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllGreaterThan(BigDecimal value) {
            addCriterion("YSJEYHLL >", value, "ysjeyhll");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YSJEYHLL >=", value, "ysjeyhll");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllLessThan(BigDecimal value) {
            addCriterion("YSJEYHLL <", value, "ysjeyhll");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YSJEYHLL <=", value, "ysjeyhll");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllIn(List<BigDecimal> values) {
            addCriterion("YSJEYHLL in", values, "ysjeyhll");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllNotIn(List<BigDecimal> values) {
            addCriterion("YSJEYHLL not in", values, "ysjeyhll");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YSJEYHLL between", value1, value2, "ysjeyhll");
            return (Criteria) this;
        }

        public Criteria andYsjeyhllNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YSJEYHLL not between", value1, value2, "ysjeyhll");
            return (Criteria) this;
        }

        public Criteria andJfrqIsNull() {
            addCriterion("JFRQ is null");
            return (Criteria) this;
        }

        public Criteria andJfrqIsNotNull() {
            addCriterion("JFRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJfrqEqualTo(Date value) {
            addCriterionForJDBCDate("JFRQ =", value, "jfrq");
            return (Criteria) this;
        }

        public Criteria andJfrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("JFRQ <>", value, "jfrq");
            return (Criteria) this;
        }

        public Criteria andJfrqGreaterThan(Date value) {
            addCriterionForJDBCDate("JFRQ >", value, "jfrq");
            return (Criteria) this;
        }

        public Criteria andJfrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JFRQ >=", value, "jfrq");
            return (Criteria) this;
        }

        public Criteria andJfrqLessThan(Date value) {
            addCriterionForJDBCDate("JFRQ <", value, "jfrq");
            return (Criteria) this;
        }

        public Criteria andJfrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JFRQ <=", value, "jfrq");
            return (Criteria) this;
        }

        public Criteria andJfrqIn(List<Date> values) {
            addCriterionForJDBCDate("JFRQ in", values, "jfrq");
            return (Criteria) this;
        }

        public Criteria andJfrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("JFRQ not in", values, "jfrq");
            return (Criteria) this;
        }

        public Criteria andJfrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JFRQ between", value1, value2, "jfrq");
            return (Criteria) this;
        }

        public Criteria andJfrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JFRQ not between", value1, value2, "jfrq");
            return (Criteria) this;
        }

        public Criteria andFpbhIsNull() {
            addCriterion("FPBH is null");
            return (Criteria) this;
        }

        public Criteria andFpbhIsNotNull() {
            addCriterion("FPBH is not null");
            return (Criteria) this;
        }

        public Criteria andFpbhEqualTo(String value) {
            addCriterion("FPBH =", value, "fpbh");
            return (Criteria) this;
        }

        public Criteria andFpbhNotEqualTo(String value) {
            addCriterion("FPBH <>", value, "fpbh");
            return (Criteria) this;
        }

        public Criteria andFpbhGreaterThan(String value) {
            addCriterion("FPBH >", value, "fpbh");
            return (Criteria) this;
        }

        public Criteria andFpbhGreaterThanOrEqualTo(String value) {
            addCriterion("FPBH >=", value, "fpbh");
            return (Criteria) this;
        }

        public Criteria andFpbhLessThan(String value) {
            addCriterion("FPBH <", value, "fpbh");
            return (Criteria) this;
        }

        public Criteria andFpbhLessThanOrEqualTo(String value) {
            addCriterion("FPBH <=", value, "fpbh");
            return (Criteria) this;
        }

        public Criteria andFpbhLike(String value) {
            addCriterion("FPBH like", value, "fpbh");
            return (Criteria) this;
        }

        public Criteria andFpbhNotLike(String value) {
            addCriterion("FPBH not like", value, "fpbh");
            return (Criteria) this;
        }

        public Criteria andFpbhIn(List<String> values) {
            addCriterion("FPBH in", values, "fpbh");
            return (Criteria) this;
        }

        public Criteria andFpbhNotIn(List<String> values) {
            addCriterion("FPBH not in", values, "fpbh");
            return (Criteria) this;
        }

        public Criteria andFpbhBetween(String value1, String value2) {
            addCriterion("FPBH between", value1, value2, "fpbh");
            return (Criteria) this;
        }

        public Criteria andFpbhNotBetween(String value1, String value2) {
            addCriterion("FPBH not between", value1, value2, "fpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhIsNull() {
            addCriterion("ZPBH is null");
            return (Criteria) this;
        }

        public Criteria andZpbhIsNotNull() {
            addCriterion("ZPBH is not null");
            return (Criteria) this;
        }

        public Criteria andZpbhEqualTo(String value) {
            addCriterion("ZPBH =", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhNotEqualTo(String value) {
            addCriterion("ZPBH <>", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhGreaterThan(String value) {
            addCriterion("ZPBH >", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhGreaterThanOrEqualTo(String value) {
            addCriterion("ZPBH >=", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhLessThan(String value) {
            addCriterion("ZPBH <", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhLessThanOrEqualTo(String value) {
            addCriterion("ZPBH <=", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhLike(String value) {
            addCriterion("ZPBH like", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhNotLike(String value) {
            addCriterion("ZPBH not like", value, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhIn(List<String> values) {
            addCriterion("ZPBH in", values, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhNotIn(List<String> values) {
            addCriterion("ZPBH not in", values, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhBetween(String value1, String value2) {
            addCriterion("ZPBH between", value1, value2, "zpbh");
            return (Criteria) this;
        }

        public Criteria andZpbhNotBetween(String value1, String value2) {
            addCriterion("ZPBH not between", value1, value2, "zpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhIsNull() {
            addCriterion("SWFPBH is null");
            return (Criteria) this;
        }

        public Criteria andSwfpbhIsNotNull() {
            addCriterion("SWFPBH is not null");
            return (Criteria) this;
        }

        public Criteria andSwfpbhEqualTo(String value) {
            addCriterion("SWFPBH =", value, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhNotEqualTo(String value) {
            addCriterion("SWFPBH <>", value, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhGreaterThan(String value) {
            addCriterion("SWFPBH >", value, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhGreaterThanOrEqualTo(String value) {
            addCriterion("SWFPBH >=", value, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhLessThan(String value) {
            addCriterion("SWFPBH <", value, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhLessThanOrEqualTo(String value) {
            addCriterion("SWFPBH <=", value, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhLike(String value) {
            addCriterion("SWFPBH like", value, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhNotLike(String value) {
            addCriterion("SWFPBH not like", value, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhIn(List<String> values) {
            addCriterion("SWFPBH in", values, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhNotIn(List<String> values) {
            addCriterion("SWFPBH not in", values, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhBetween(String value1, String value2) {
            addCriterion("SWFPBH between", value1, value2, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andSwfpbhNotBetween(String value1, String value2) {
            addCriterion("SWFPBH not between", value1, value2, "swfpbh");
            return (Criteria) this;
        }

        public Criteria andJsrIsNull() {
            addCriterion("JSR is null");
            return (Criteria) this;
        }

        public Criteria andJsrIsNotNull() {
            addCriterion("JSR is not null");
            return (Criteria) this;
        }

        public Criteria andJsrEqualTo(String value) {
            addCriterion("JSR =", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrNotEqualTo(String value) {
            addCriterion("JSR <>", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrGreaterThan(String value) {
            addCriterion("JSR >", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrGreaterThanOrEqualTo(String value) {
            addCriterion("JSR >=", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrLessThan(String value) {
            addCriterion("JSR <", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrLessThanOrEqualTo(String value) {
            addCriterion("JSR <=", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrLike(String value) {
            addCriterion("JSR like", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrNotLike(String value) {
            addCriterion("JSR not like", value, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrIn(List<String> values) {
            addCriterion("JSR in", values, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrNotIn(List<String> values) {
            addCriterion("JSR not in", values, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrBetween(String value1, String value2) {
            addCriterion("JSR between", value1, value2, "jsr");
            return (Criteria) this;
        }

        public Criteria andJsrNotBetween(String value1, String value2) {
            addCriterion("JSR not between", value1, value2, "jsr");
            return (Criteria) this;
        }

        public Criteria andBprIsNull() {
            addCriterion("BPR is null");
            return (Criteria) this;
        }

        public Criteria andBprIsNotNull() {
            addCriterion("BPR is not null");
            return (Criteria) this;
        }

        public Criteria andBprEqualTo(String value) {
            addCriterion("BPR =", value, "bpr");
            return (Criteria) this;
        }

        public Criteria andBprNotEqualTo(String value) {
            addCriterion("BPR <>", value, "bpr");
            return (Criteria) this;
        }

        public Criteria andBprGreaterThan(String value) {
            addCriterion("BPR >", value, "bpr");
            return (Criteria) this;
        }

        public Criteria andBprGreaterThanOrEqualTo(String value) {
            addCriterion("BPR >=", value, "bpr");
            return (Criteria) this;
        }

        public Criteria andBprLessThan(String value) {
            addCriterion("BPR <", value, "bpr");
            return (Criteria) this;
        }

        public Criteria andBprLessThanOrEqualTo(String value) {
            addCriterion("BPR <=", value, "bpr");
            return (Criteria) this;
        }

        public Criteria andBprLike(String value) {
            addCriterion("BPR like", value, "bpr");
            return (Criteria) this;
        }

        public Criteria andBprNotLike(String value) {
            addCriterion("BPR not like", value, "bpr");
            return (Criteria) this;
        }

        public Criteria andBprIn(List<String> values) {
            addCriterion("BPR in", values, "bpr");
            return (Criteria) this;
        }

        public Criteria andBprNotIn(List<String> values) {
            addCriterion("BPR not in", values, "bpr");
            return (Criteria) this;
        }

        public Criteria andBprBetween(String value1, String value2) {
            addCriterion("BPR between", value1, value2, "bpr");
            return (Criteria) this;
        }

        public Criteria andBprNotBetween(String value1, String value2) {
            addCriterion("BPR not between", value1, value2, "bpr");
            return (Criteria) this;
        }

        public Criteria andFhrIsNull() {
            addCriterion("FHR is null");
            return (Criteria) this;
        }

        public Criteria andFhrIsNotNull() {
            addCriterion("FHR is not null");
            return (Criteria) this;
        }

        public Criteria andFhrEqualTo(String value) {
            addCriterion("FHR =", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrNotEqualTo(String value) {
            addCriterion("FHR <>", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrGreaterThan(String value) {
            addCriterion("FHR >", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrGreaterThanOrEqualTo(String value) {
            addCriterion("FHR >=", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrLessThan(String value) {
            addCriterion("FHR <", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrLessThanOrEqualTo(String value) {
            addCriterion("FHR <=", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrLike(String value) {
            addCriterion("FHR like", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrNotLike(String value) {
            addCriterion("FHR not like", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrIn(List<String> values) {
            addCriterion("FHR in", values, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrNotIn(List<String> values) {
            addCriterion("FHR not in", values, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrBetween(String value1, String value2) {
            addCriterion("FHR between", value1, value2, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrNotBetween(String value1, String value2) {
            addCriterion("FHR not between", value1, value2, "fhr");
            return (Criteria) this;
        }

        public Criteria andZxfsIsNull() {
            addCriterion("ZXFS is null");
            return (Criteria) this;
        }

        public Criteria andZxfsIsNotNull() {
            addCriterion("ZXFS is not null");
            return (Criteria) this;
        }

        public Criteria andZxfsEqualTo(String value) {
            addCriterion("ZXFS =", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsNotEqualTo(String value) {
            addCriterion("ZXFS <>", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsGreaterThan(String value) {
            addCriterion("ZXFS >", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsGreaterThanOrEqualTo(String value) {
            addCriterion("ZXFS >=", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsLessThan(String value) {
            addCriterion("ZXFS <", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsLessThanOrEqualTo(String value) {
            addCriterion("ZXFS <=", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsLike(String value) {
            addCriterion("ZXFS like", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsNotLike(String value) {
            addCriterion("ZXFS not like", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsIn(List<String> values) {
            addCriterion("ZXFS in", values, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsNotIn(List<String> values) {
            addCriterion("ZXFS not in", values, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsBetween(String value1, String value2) {
            addCriterion("ZXFS between", value1, value2, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsNotBetween(String value1, String value2) {
            addCriterion("ZXFS not between", value1, value2, "zxfs");
            return (Criteria) this;
        }

        public Criteria andTdhIsNull() {
            addCriterion("TDH is null");
            return (Criteria) this;
        }

        public Criteria andTdhIsNotNull() {
            addCriterion("TDH is not null");
            return (Criteria) this;
        }

        public Criteria andTdhEqualTo(String value) {
            addCriterion("TDH =", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhNotEqualTo(String value) {
            addCriterion("TDH <>", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhGreaterThan(String value) {
            addCriterion("TDH >", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhGreaterThanOrEqualTo(String value) {
            addCriterion("TDH >=", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhLessThan(String value) {
            addCriterion("TDH <", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhLessThanOrEqualTo(String value) {
            addCriterion("TDH <=", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhLike(String value) {
            addCriterion("TDH like", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhNotLike(String value) {
            addCriterion("TDH not like", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhIn(List<String> values) {
            addCriterion("TDH in", values, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhNotIn(List<String> values) {
            addCriterion("TDH not in", values, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhBetween(String value1, String value2) {
            addCriterion("TDH between", value1, value2, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhNotBetween(String value1, String value2) {
            addCriterion("TDH not between", value1, value2, "tdh");
            return (Criteria) this;
        }

        public Criteria andHblbIsNull() {
            addCriterion("HBLB is null");
            return (Criteria) this;
        }

        public Criteria andHblbIsNotNull() {
            addCriterion("HBLB is not null");
            return (Criteria) this;
        }

        public Criteria andHblbEqualTo(String value) {
            addCriterion("HBLB =", value, "hblb");
            return (Criteria) this;
        }

        public Criteria andHblbNotEqualTo(String value) {
            addCriterion("HBLB <>", value, "hblb");
            return (Criteria) this;
        }

        public Criteria andHblbGreaterThan(String value) {
            addCriterion("HBLB >", value, "hblb");
            return (Criteria) this;
        }

        public Criteria andHblbGreaterThanOrEqualTo(String value) {
            addCriterion("HBLB >=", value, "hblb");
            return (Criteria) this;
        }

        public Criteria andHblbLessThan(String value) {
            addCriterion("HBLB <", value, "hblb");
            return (Criteria) this;
        }

        public Criteria andHblbLessThanOrEqualTo(String value) {
            addCriterion("HBLB <=", value, "hblb");
            return (Criteria) this;
        }

        public Criteria andHblbLike(String value) {
            addCriterion("HBLB like", value, "hblb");
            return (Criteria) this;
        }

        public Criteria andHblbNotLike(String value) {
            addCriterion("HBLB not like", value, "hblb");
            return (Criteria) this;
        }

        public Criteria andHblbIn(List<String> values) {
            addCriterion("HBLB in", values, "hblb");
            return (Criteria) this;
        }

        public Criteria andHblbNotIn(List<String> values) {
            addCriterion("HBLB not in", values, "hblb");
            return (Criteria) this;
        }

        public Criteria andHblbBetween(String value1, String value2) {
            addCriterion("HBLB between", value1, value2, "hblb");
            return (Criteria) this;
        }

        public Criteria andHblbNotBetween(String value1, String value2) {
            addCriterion("HBLB not between", value1, value2, "hblb");
            return (Criteria) this;
        }

        public Criteria andSbbzIsNull() {
            addCriterion("SBBZ is null");
            return (Criteria) this;
        }

        public Criteria andSbbzIsNotNull() {
            addCriterion("SBBZ is not null");
            return (Criteria) this;
        }

        public Criteria andSbbzEqualTo(String value) {
            addCriterion("SBBZ =", value, "sbbz");
            return (Criteria) this;
        }

        public Criteria andSbbzNotEqualTo(String value) {
            addCriterion("SBBZ <>", value, "sbbz");
            return (Criteria) this;
        }

        public Criteria andSbbzGreaterThan(String value) {
            addCriterion("SBBZ >", value, "sbbz");
            return (Criteria) this;
        }

        public Criteria andSbbzGreaterThanOrEqualTo(String value) {
            addCriterion("SBBZ >=", value, "sbbz");
            return (Criteria) this;
        }

        public Criteria andSbbzLessThan(String value) {
            addCriterion("SBBZ <", value, "sbbz");
            return (Criteria) this;
        }

        public Criteria andSbbzLessThanOrEqualTo(String value) {
            addCriterion("SBBZ <=", value, "sbbz");
            return (Criteria) this;
        }

        public Criteria andSbbzLike(String value) {
            addCriterion("SBBZ like", value, "sbbz");
            return (Criteria) this;
        }

        public Criteria andSbbzNotLike(String value) {
            addCriterion("SBBZ not like", value, "sbbz");
            return (Criteria) this;
        }

        public Criteria andSbbzIn(List<String> values) {
            addCriterion("SBBZ in", values, "sbbz");
            return (Criteria) this;
        }

        public Criteria andSbbzNotIn(List<String> values) {
            addCriterion("SBBZ not in", values, "sbbz");
            return (Criteria) this;
        }

        public Criteria andSbbzBetween(String value1, String value2) {
            addCriterion("SBBZ between", value1, value2, "sbbz");
            return (Criteria) this;
        }

        public Criteria andSbbzNotBetween(String value1, String value2) {
            addCriterion("SBBZ not between", value1, value2, "sbbz");
            return (Criteria) this;
        }

        public Criteria andBpbzIsNull() {
            addCriterion("BPBZ is null");
            return (Criteria) this;
        }

        public Criteria andBpbzIsNotNull() {
            addCriterion("BPBZ is not null");
            return (Criteria) this;
        }

        public Criteria andBpbzEqualTo(String value) {
            addCriterion("BPBZ =", value, "bpbz");
            return (Criteria) this;
        }

        public Criteria andBpbzNotEqualTo(String value) {
            addCriterion("BPBZ <>", value, "bpbz");
            return (Criteria) this;
        }

        public Criteria andBpbzGreaterThan(String value) {
            addCriterion("BPBZ >", value, "bpbz");
            return (Criteria) this;
        }

        public Criteria andBpbzGreaterThanOrEqualTo(String value) {
            addCriterion("BPBZ >=", value, "bpbz");
            return (Criteria) this;
        }

        public Criteria andBpbzLessThan(String value) {
            addCriterion("BPBZ <", value, "bpbz");
            return (Criteria) this;
        }

        public Criteria andBpbzLessThanOrEqualTo(String value) {
            addCriterion("BPBZ <=", value, "bpbz");
            return (Criteria) this;
        }

        public Criteria andBpbzLike(String value) {
            addCriterion("BPBZ like", value, "bpbz");
            return (Criteria) this;
        }

        public Criteria andBpbzNotLike(String value) {
            addCriterion("BPBZ not like", value, "bpbz");
            return (Criteria) this;
        }

        public Criteria andBpbzIn(List<String> values) {
            addCriterion("BPBZ in", values, "bpbz");
            return (Criteria) this;
        }

        public Criteria andBpbzNotIn(List<String> values) {
            addCriterion("BPBZ not in", values, "bpbz");
            return (Criteria) this;
        }

        public Criteria andBpbzBetween(String value1, String value2) {
            addCriterion("BPBZ between", value1, value2, "bpbz");
            return (Criteria) this;
        }

        public Criteria andBpbzNotBetween(String value1, String value2) {
            addCriterion("BPBZ not between", value1, value2, "bpbz");
            return (Criteria) this;
        }

        public Criteria andSjlgsjIsNull() {
            addCriterion("SJLGSJ is null");
            return (Criteria) this;
        }

        public Criteria andSjlgsjIsNotNull() {
            addCriterion("SJLGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSjlgsjEqualTo(Date value) {
            addCriterionForJDBCDate("SJLGSJ =", value, "sjlgsj");
            return (Criteria) this;
        }

        public Criteria andSjlgsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SJLGSJ <>", value, "sjlgsj");
            return (Criteria) this;
        }

        public Criteria andSjlgsjGreaterThan(Date value) {
            addCriterionForJDBCDate("SJLGSJ >", value, "sjlgsj");
            return (Criteria) this;
        }

        public Criteria andSjlgsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SJLGSJ >=", value, "sjlgsj");
            return (Criteria) this;
        }

        public Criteria andSjlgsjLessThan(Date value) {
            addCriterionForJDBCDate("SJLGSJ <", value, "sjlgsj");
            return (Criteria) this;
        }

        public Criteria andSjlgsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SJLGSJ <=", value, "sjlgsj");
            return (Criteria) this;
        }

        public Criteria andSjlgsjIn(List<Date> values) {
            addCriterionForJDBCDate("SJLGSJ in", values, "sjlgsj");
            return (Criteria) this;
        }

        public Criteria andSjlgsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SJLGSJ not in", values, "sjlgsj");
            return (Criteria) this;
        }

        public Criteria andSjlgsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SJLGSJ between", value1, value2, "sjlgsj");
            return (Criteria) this;
        }

        public Criteria andSjlgsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SJLGSJ not between", value1, value2, "sjlgsj");
            return (Criteria) this;
        }

        public Criteria andXsgsmIsNull() {
            addCriterion("XSGSM is null");
            return (Criteria) this;
        }

        public Criteria andXsgsmIsNotNull() {
            addCriterion("XSGSM is not null");
            return (Criteria) this;
        }

        public Criteria andXsgsmEqualTo(String value) {
            addCriterion("XSGSM =", value, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andXsgsmNotEqualTo(String value) {
            addCriterion("XSGSM <>", value, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andXsgsmGreaterThan(String value) {
            addCriterion("XSGSM >", value, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andXsgsmGreaterThanOrEqualTo(String value) {
            addCriterion("XSGSM >=", value, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andXsgsmLessThan(String value) {
            addCriterion("XSGSM <", value, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andXsgsmLessThanOrEqualTo(String value) {
            addCriterion("XSGSM <=", value, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andXsgsmLike(String value) {
            addCriterion("XSGSM like", value, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andXsgsmNotLike(String value) {
            addCriterion("XSGSM not like", value, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andXsgsmIn(List<String> values) {
            addCriterion("XSGSM in", values, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andXsgsmNotIn(List<String> values) {
            addCriterion("XSGSM not in", values, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andXsgsmBetween(String value1, String value2) {
            addCriterion("XSGSM between", value1, value2, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andXsgsmNotBetween(String value1, String value2) {
            addCriterion("XSGSM not between", value1, value2, "xsgsm");
            return (Criteria) this;
        }

        public Criteria andWtdhIsNull() {
            addCriterion("WTDH is null");
            return (Criteria) this;
        }

        public Criteria andWtdhIsNotNull() {
            addCriterion("WTDH is not null");
            return (Criteria) this;
        }

        public Criteria andWtdhEqualTo(String value) {
            addCriterion("WTDH =", value, "wtdh");
            return (Criteria) this;
        }

        public Criteria andWtdhNotEqualTo(String value) {
            addCriterion("WTDH <>", value, "wtdh");
            return (Criteria) this;
        }

        public Criteria andWtdhGreaterThan(String value) {
            addCriterion("WTDH >", value, "wtdh");
            return (Criteria) this;
        }

        public Criteria andWtdhGreaterThanOrEqualTo(String value) {
            addCriterion("WTDH >=", value, "wtdh");
            return (Criteria) this;
        }

        public Criteria andWtdhLessThan(String value) {
            addCriterion("WTDH <", value, "wtdh");
            return (Criteria) this;
        }

        public Criteria andWtdhLessThanOrEqualTo(String value) {
            addCriterion("WTDH <=", value, "wtdh");
            return (Criteria) this;
        }

        public Criteria andWtdhLike(String value) {
            addCriterion("WTDH like", value, "wtdh");
            return (Criteria) this;
        }

        public Criteria andWtdhNotLike(String value) {
            addCriterion("WTDH not like", value, "wtdh");
            return (Criteria) this;
        }

        public Criteria andWtdhIn(List<String> values) {
            addCriterion("WTDH in", values, "wtdh");
            return (Criteria) this;
        }

        public Criteria andWtdhNotIn(List<String> values) {
            addCriterion("WTDH not in", values, "wtdh");
            return (Criteria) this;
        }

        public Criteria andWtdhBetween(String value1, String value2) {
            addCriterion("WTDH between", value1, value2, "wtdh");
            return (Criteria) this;
        }

        public Criteria andWtdhNotBetween(String value1, String value2) {
            addCriterion("WTDH not between", value1, value2, "wtdh");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsIsNull() {
            addCriterion("CYTGJKFS is null");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsIsNotNull() {
            addCriterion("CYTGJKFS is not null");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsEqualTo(String value) {
            addCriterion("CYTGJKFS =", value, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsNotEqualTo(String value) {
            addCriterion("CYTGJKFS <>", value, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsGreaterThan(String value) {
            addCriterion("CYTGJKFS >", value, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsGreaterThanOrEqualTo(String value) {
            addCriterion("CYTGJKFS >=", value, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsLessThan(String value) {
            addCriterion("CYTGJKFS <", value, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsLessThanOrEqualTo(String value) {
            addCriterion("CYTGJKFS <=", value, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsLike(String value) {
            addCriterion("CYTGJKFS like", value, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsNotLike(String value) {
            addCriterion("CYTGJKFS not like", value, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsIn(List<String> values) {
            addCriterion("CYTGJKFS in", values, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsNotIn(List<String> values) {
            addCriterion("CYTGJKFS not in", values, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsBetween(String value1, String value2) {
            addCriterion("CYTGJKFS between", value1, value2, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andCytgjkfsNotBetween(String value1, String value2) {
            addCriterion("CYTGJKFS not between", value1, value2, "cytgjkfs");
            return (Criteria) this;
        }

        public Criteria andTzbhbzIsNull() {
            addCriterion("TZBHBZ is null");
            return (Criteria) this;
        }

        public Criteria andTzbhbzIsNotNull() {
            addCriterion("TZBHBZ is not null");
            return (Criteria) this;
        }

        public Criteria andTzbhbzEqualTo(String value) {
            addCriterion("TZBHBZ =", value, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andTzbhbzNotEqualTo(String value) {
            addCriterion("TZBHBZ <>", value, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andTzbhbzGreaterThan(String value) {
            addCriterion("TZBHBZ >", value, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andTzbhbzGreaterThanOrEqualTo(String value) {
            addCriterion("TZBHBZ >=", value, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andTzbhbzLessThan(String value) {
            addCriterion("TZBHBZ <", value, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andTzbhbzLessThanOrEqualTo(String value) {
            addCriterion("TZBHBZ <=", value, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andTzbhbzLike(String value) {
            addCriterion("TZBHBZ like", value, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andTzbhbzNotLike(String value) {
            addCriterion("TZBHBZ not like", value, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andTzbhbzIn(List<String> values) {
            addCriterion("TZBHBZ in", values, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andTzbhbzNotIn(List<String> values) {
            addCriterion("TZBHBZ not in", values, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andTzbhbzBetween(String value1, String value2) {
            addCriterion("TZBHBZ between", value1, value2, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andTzbhbzNotBetween(String value1, String value2) {
            addCriterion("TZBHBZ not between", value1, value2, "tzbhbz");
            return (Criteria) this;
        }

        public Criteria andZffpbhIsNull() {
            addCriterion("ZFFPBH is null");
            return (Criteria) this;
        }

        public Criteria andZffpbhIsNotNull() {
            addCriterion("ZFFPBH is not null");
            return (Criteria) this;
        }

        public Criteria andZffpbhEqualTo(String value) {
            addCriterion("ZFFPBH =", value, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andZffpbhNotEqualTo(String value) {
            addCriterion("ZFFPBH <>", value, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andZffpbhGreaterThan(String value) {
            addCriterion("ZFFPBH >", value, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andZffpbhGreaterThanOrEqualTo(String value) {
            addCriterion("ZFFPBH >=", value, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andZffpbhLessThan(String value) {
            addCriterion("ZFFPBH <", value, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andZffpbhLessThanOrEqualTo(String value) {
            addCriterion("ZFFPBH <=", value, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andZffpbhLike(String value) {
            addCriterion("ZFFPBH like", value, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andZffpbhNotLike(String value) {
            addCriterion("ZFFPBH not like", value, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andZffpbhIn(List<String> values) {
            addCriterion("ZFFPBH in", values, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andZffpbhNotIn(List<String> values) {
            addCriterion("ZFFPBH not in", values, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andZffpbhBetween(String value1, String value2) {
            addCriterion("ZFFPBH between", value1, value2, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andZffpbhNotBetween(String value1, String value2) {
            addCriterion("ZFFPBH not between", value1, value2, "zffpbh");
            return (Criteria) this;
        }

        public Criteria andFplbIsNull() {
            addCriterion("FPLB is null");
            return (Criteria) this;
        }

        public Criteria andFplbIsNotNull() {
            addCriterion("FPLB is not null");
            return (Criteria) this;
        }

        public Criteria andFplbEqualTo(String value) {
            addCriterion("FPLB =", value, "fplb");
            return (Criteria) this;
        }

        public Criteria andFplbNotEqualTo(String value) {
            addCriterion("FPLB <>", value, "fplb");
            return (Criteria) this;
        }

        public Criteria andFplbGreaterThan(String value) {
            addCriterion("FPLB >", value, "fplb");
            return (Criteria) this;
        }

        public Criteria andFplbGreaterThanOrEqualTo(String value) {
            addCriterion("FPLB >=", value, "fplb");
            return (Criteria) this;
        }

        public Criteria andFplbLessThan(String value) {
            addCriterion("FPLB <", value, "fplb");
            return (Criteria) this;
        }

        public Criteria andFplbLessThanOrEqualTo(String value) {
            addCriterion("FPLB <=", value, "fplb");
            return (Criteria) this;
        }

        public Criteria andFplbLike(String value) {
            addCriterion("FPLB like", value, "fplb");
            return (Criteria) this;
        }

        public Criteria andFplbNotLike(String value) {
            addCriterion("FPLB not like", value, "fplb");
            return (Criteria) this;
        }

        public Criteria andFplbIn(List<String> values) {
            addCriterion("FPLB in", values, "fplb");
            return (Criteria) this;
        }

        public Criteria andFplbNotIn(List<String> values) {
            addCriterion("FPLB not in", values, "fplb");
            return (Criteria) this;
        }

        public Criteria andFplbBetween(String value1, String value2) {
            addCriterion("FPLB between", value1, value2, "fplb");
            return (Criteria) this;
        }

        public Criteria andFplbNotBetween(String value1, String value2) {
            addCriterion("FPLB not between", value1, value2, "fplb");
            return (Criteria) this;
        }

        public Criteria andBczdIsNull() {
            addCriterion("BCZD is null");
            return (Criteria) this;
        }

        public Criteria andBczdIsNotNull() {
            addCriterion("BCZD is not null");
            return (Criteria) this;
        }

        public Criteria andBczdEqualTo(String value) {
            addCriterion("BCZD =", value, "bczd");
            return (Criteria) this;
        }

        public Criteria andBczdNotEqualTo(String value) {
            addCriterion("BCZD <>", value, "bczd");
            return (Criteria) this;
        }

        public Criteria andBczdGreaterThan(String value) {
            addCriterion("BCZD >", value, "bczd");
            return (Criteria) this;
        }

        public Criteria andBczdGreaterThanOrEqualTo(String value) {
            addCriterion("BCZD >=", value, "bczd");
            return (Criteria) this;
        }

        public Criteria andBczdLessThan(String value) {
            addCriterion("BCZD <", value, "bczd");
            return (Criteria) this;
        }

        public Criteria andBczdLessThanOrEqualTo(String value) {
            addCriterion("BCZD <=", value, "bczd");
            return (Criteria) this;
        }

        public Criteria andBczdLike(String value) {
            addCriterion("BCZD like", value, "bczd");
            return (Criteria) this;
        }

        public Criteria andBczdNotLike(String value) {
            addCriterion("BCZD not like", value, "bczd");
            return (Criteria) this;
        }

        public Criteria andBczdIn(List<String> values) {
            addCriterion("BCZD in", values, "bczd");
            return (Criteria) this;
        }

        public Criteria andBczdNotIn(List<String> values) {
            addCriterion("BCZD not in", values, "bczd");
            return (Criteria) this;
        }

        public Criteria andBczdBetween(String value1, String value2) {
            addCriterion("BCZD between", value1, value2, "bczd");
            return (Criteria) this;
        }

        public Criteria andBczdNotBetween(String value1, String value2) {
            addCriterion("BCZD not between", value1, value2, "bczd");
            return (Criteria) this;
        }

        public Criteria andBzbzIsNull() {
            addCriterion("BZBZ is null");
            return (Criteria) this;
        }

        public Criteria andBzbzIsNotNull() {
            addCriterion("BZBZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzbzEqualTo(String value) {
            addCriterion("BZBZ =", value, "bzbz");
            return (Criteria) this;
        }

        public Criteria andBzbzNotEqualTo(String value) {
            addCriterion("BZBZ <>", value, "bzbz");
            return (Criteria) this;
        }

        public Criteria andBzbzGreaterThan(String value) {
            addCriterion("BZBZ >", value, "bzbz");
            return (Criteria) this;
        }

        public Criteria andBzbzGreaterThanOrEqualTo(String value) {
            addCriterion("BZBZ >=", value, "bzbz");
            return (Criteria) this;
        }

        public Criteria andBzbzLessThan(String value) {
            addCriterion("BZBZ <", value, "bzbz");
            return (Criteria) this;
        }

        public Criteria andBzbzLessThanOrEqualTo(String value) {
            addCriterion("BZBZ <=", value, "bzbz");
            return (Criteria) this;
        }

        public Criteria andBzbzLike(String value) {
            addCriterion("BZBZ like", value, "bzbz");
            return (Criteria) this;
        }

        public Criteria andBzbzNotLike(String value) {
            addCriterion("BZBZ not like", value, "bzbz");
            return (Criteria) this;
        }

        public Criteria andBzbzIn(List<String> values) {
            addCriterion("BZBZ in", values, "bzbz");
            return (Criteria) this;
        }

        public Criteria andBzbzNotIn(List<String> values) {
            addCriterion("BZBZ not in", values, "bzbz");
            return (Criteria) this;
        }

        public Criteria andBzbzBetween(String value1, String value2) {
            addCriterion("BZBZ between", value1, value2, "bzbz");
            return (Criteria) this;
        }

        public Criteria andBzbzNotBetween(String value1, String value2) {
            addCriterion("BZBZ not between", value1, value2, "bzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzIsNull() {
            addCriterion("SZHTZBZ is null");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzIsNotNull() {
            addCriterion("SZHTZBZ is not null");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzEqualTo(String value) {
            addCriterion("SZHTZBZ =", value, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzNotEqualTo(String value) {
            addCriterion("SZHTZBZ <>", value, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzGreaterThan(String value) {
            addCriterion("SZHTZBZ >", value, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzGreaterThanOrEqualTo(String value) {
            addCriterion("SZHTZBZ >=", value, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzLessThan(String value) {
            addCriterion("SZHTZBZ <", value, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzLessThanOrEqualTo(String value) {
            addCriterion("SZHTZBZ <=", value, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzLike(String value) {
            addCriterion("SZHTZBZ like", value, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzNotLike(String value) {
            addCriterion("SZHTZBZ not like", value, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzIn(List<String> values) {
            addCriterion("SZHTZBZ in", values, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzNotIn(List<String> values) {
            addCriterion("SZHTZBZ not in", values, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzBetween(String value1, String value2) {
            addCriterion("SZHTZBZ between", value1, value2, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andSzhtzbzNotBetween(String value1, String value2) {
            addCriterion("SZHTZBZ not between", value1, value2, "szhtzbz");
            return (Criteria) this;
        }

        public Criteria andTjsjIsNull() {
            addCriterion("TJSJ is null");
            return (Criteria) this;
        }

        public Criteria andTjsjIsNotNull() {
            addCriterion("TJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andTjsjEqualTo(Date value) {
            addCriterionForJDBCDate("TJSJ =", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("TJSJ <>", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjGreaterThan(Date value) {
            addCriterionForJDBCDate("TJSJ >", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TJSJ >=", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjLessThan(Date value) {
            addCriterionForJDBCDate("TJSJ <", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TJSJ <=", value, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjIn(List<Date> values) {
            addCriterionForJDBCDate("TJSJ in", values, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("TJSJ not in", values, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TJSJ between", value1, value2, "tjsj");
            return (Criteria) this;
        }

        public Criteria andTjsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TJSJ not between", value1, value2, "tjsj");
            return (Criteria) this;
        }

        public Criteria andConnoIsNull() {
            addCriterion("CONNO is null");
            return (Criteria) this;
        }

        public Criteria andConnoIsNotNull() {
            addCriterion("CONNO is not null");
            return (Criteria) this;
        }

        public Criteria andConnoEqualTo(String value) {
            addCriterion("CONNO =", value, "conno");
            return (Criteria) this;
        }

        public Criteria andConnoNotEqualTo(String value) {
            addCriterion("CONNO <>", value, "conno");
            return (Criteria) this;
        }

        public Criteria andConnoGreaterThan(String value) {
            addCriterion("CONNO >", value, "conno");
            return (Criteria) this;
        }

        public Criteria andConnoGreaterThanOrEqualTo(String value) {
            addCriterion("CONNO >=", value, "conno");
            return (Criteria) this;
        }

        public Criteria andConnoLessThan(String value) {
            addCriterion("CONNO <", value, "conno");
            return (Criteria) this;
        }

        public Criteria andConnoLessThanOrEqualTo(String value) {
            addCriterion("CONNO <=", value, "conno");
            return (Criteria) this;
        }

        public Criteria andConnoLike(String value) {
            addCriterion("CONNO like", value, "conno");
            return (Criteria) this;
        }

        public Criteria andConnoNotLike(String value) {
            addCriterion("CONNO not like", value, "conno");
            return (Criteria) this;
        }

        public Criteria andConnoIn(List<String> values) {
            addCriterion("CONNO in", values, "conno");
            return (Criteria) this;
        }

        public Criteria andConnoNotIn(List<String> values) {
            addCriterion("CONNO not in", values, "conno");
            return (Criteria) this;
        }

        public Criteria andConnoBetween(String value1, String value2) {
            addCriterion("CONNO between", value1, value2, "conno");
            return (Criteria) this;
        }

        public Criteria andConnoNotBetween(String value1, String value2) {
            addCriterion("CONNO not between", value1, value2, "conno");
            return (Criteria) this;
        }

        public Criteria andMtdmIsNull() {
            addCriterion("MTDM is null");
            return (Criteria) this;
        }

        public Criteria andMtdmIsNotNull() {
            addCriterion("MTDM is not null");
            return (Criteria) this;
        }

        public Criteria andMtdmEqualTo(String value) {
            addCriterion("MTDM =", value, "mtdm");
            return (Criteria) this;
        }

        public Criteria andMtdmNotEqualTo(String value) {
            addCriterion("MTDM <>", value, "mtdm");
            return (Criteria) this;
        }

        public Criteria andMtdmGreaterThan(String value) {
            addCriterion("MTDM >", value, "mtdm");
            return (Criteria) this;
        }

        public Criteria andMtdmGreaterThanOrEqualTo(String value) {
            addCriterion("MTDM >=", value, "mtdm");
            return (Criteria) this;
        }

        public Criteria andMtdmLessThan(String value) {
            addCriterion("MTDM <", value, "mtdm");
            return (Criteria) this;
        }

        public Criteria andMtdmLessThanOrEqualTo(String value) {
            addCriterion("MTDM <=", value, "mtdm");
            return (Criteria) this;
        }

        public Criteria andMtdmLike(String value) {
            addCriterion("MTDM like", value, "mtdm");
            return (Criteria) this;
        }

        public Criteria andMtdmNotLike(String value) {
            addCriterion("MTDM not like", value, "mtdm");
            return (Criteria) this;
        }

        public Criteria andMtdmIn(List<String> values) {
            addCriterion("MTDM in", values, "mtdm");
            return (Criteria) this;
        }

        public Criteria andMtdmNotIn(List<String> values) {
            addCriterion("MTDM not in", values, "mtdm");
            return (Criteria) this;
        }

        public Criteria andMtdmBetween(String value1, String value2) {
            addCriterion("MTDM between", value1, value2, "mtdm");
            return (Criteria) this;
        }

        public Criteria andMtdmNotBetween(String value1, String value2) {
            addCriterion("MTDM not between", value1, value2, "mtdm");
            return (Criteria) this;
        }

        public Criteria andInsertsjIsNull() {
            addCriterion("INSERTSJ is null");
            return (Criteria) this;
        }

        public Criteria andInsertsjIsNotNull() {
            addCriterion("INSERTSJ is not null");
            return (Criteria) this;
        }

        public Criteria andInsertsjEqualTo(Date value) {
            addCriterionForJDBCDate("INSERTSJ =", value, "insertsj");
            return (Criteria) this;
        }

        public Criteria andInsertsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("INSERTSJ <>", value, "insertsj");
            return (Criteria) this;
        }

        public Criteria andInsertsjGreaterThan(Date value) {
            addCriterionForJDBCDate("INSERTSJ >", value, "insertsj");
            return (Criteria) this;
        }

        public Criteria andInsertsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INSERTSJ >=", value, "insertsj");
            return (Criteria) this;
        }

        public Criteria andInsertsjLessThan(Date value) {
            addCriterionForJDBCDate("INSERTSJ <", value, "insertsj");
            return (Criteria) this;
        }

        public Criteria andInsertsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INSERTSJ <=", value, "insertsj");
            return (Criteria) this;
        }

        public Criteria andInsertsjIn(List<Date> values) {
            addCriterionForJDBCDate("INSERTSJ in", values, "insertsj");
            return (Criteria) this;
        }

        public Criteria andInsertsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("INSERTSJ not in", values, "insertsj");
            return (Criteria) this;
        }

        public Criteria andInsertsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INSERTSJ between", value1, value2, "insertsj");
            return (Criteria) this;
        }

        public Criteria andInsertsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INSERTSJ not between", value1, value2, "insertsj");
            return (Criteria) this;
        }

        public Criteria andUpdatesjIsNull() {
            addCriterion("UPDATESJ is null");
            return (Criteria) this;
        }

        public Criteria andUpdatesjIsNotNull() {
            addCriterion("UPDATESJ is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatesjEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATESJ =", value, "updatesj");
            return (Criteria) this;
        }

        public Criteria andUpdatesjNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATESJ <>", value, "updatesj");
            return (Criteria) this;
        }

        public Criteria andUpdatesjGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATESJ >", value, "updatesj");
            return (Criteria) this;
        }

        public Criteria andUpdatesjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATESJ >=", value, "updatesj");
            return (Criteria) this;
        }

        public Criteria andUpdatesjLessThan(Date value) {
            addCriterionForJDBCDate("UPDATESJ <", value, "updatesj");
            return (Criteria) this;
        }

        public Criteria andUpdatesjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATESJ <=", value, "updatesj");
            return (Criteria) this;
        }

        public Criteria andUpdatesjIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATESJ in", values, "updatesj");
            return (Criteria) this;
        }

        public Criteria andUpdatesjNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATESJ not in", values, "updatesj");
            return (Criteria) this;
        }

        public Criteria andUpdatesjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATESJ between", value1, value2, "updatesj");
            return (Criteria) this;
        }

        public Criteria andUpdatesjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATESJ not between", value1, value2, "updatesj");
            return (Criteria) this;
        }

        public Criteria andZzcmdmIsNull() {
            addCriterion("ZZCMDM is null");
            return (Criteria) this;
        }

        public Criteria andZzcmdmIsNotNull() {
            addCriterion("ZZCMDM is not null");
            return (Criteria) this;
        }

        public Criteria andZzcmdmEqualTo(String value) {
            addCriterion("ZZCMDM =", value, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzcmdmNotEqualTo(String value) {
            addCriterion("ZZCMDM <>", value, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzcmdmGreaterThan(String value) {
            addCriterion("ZZCMDM >", value, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzcmdmGreaterThanOrEqualTo(String value) {
            addCriterion("ZZCMDM >=", value, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzcmdmLessThan(String value) {
            addCriterion("ZZCMDM <", value, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzcmdmLessThanOrEqualTo(String value) {
            addCriterion("ZZCMDM <=", value, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzcmdmLike(String value) {
            addCriterion("ZZCMDM like", value, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzcmdmNotLike(String value) {
            addCriterion("ZZCMDM not like", value, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzcmdmIn(List<String> values) {
            addCriterion("ZZCMDM in", values, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzcmdmNotIn(List<String> values) {
            addCriterion("ZZCMDM not in", values, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzcmdmBetween(String value1, String value2) {
            addCriterion("ZZCMDM between", value1, value2, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzcmdmNotBetween(String value1, String value2) {
            addCriterion("ZZCMDM not between", value1, value2, "zzcmdm");
            return (Criteria) this;
        }

        public Criteria andZzhchcIsNull() {
            addCriterion("ZZHCHC is null");
            return (Criteria) this;
        }

        public Criteria andZzhchcIsNotNull() {
            addCriterion("ZZHCHC is not null");
            return (Criteria) this;
        }

        public Criteria andZzhchcEqualTo(String value) {
            addCriterion("ZZHCHC =", value, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andZzhchcNotEqualTo(String value) {
            addCriterion("ZZHCHC <>", value, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andZzhchcGreaterThan(String value) {
            addCriterion("ZZHCHC >", value, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andZzhchcGreaterThanOrEqualTo(String value) {
            addCriterion("ZZHCHC >=", value, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andZzhchcLessThan(String value) {
            addCriterion("ZZHCHC <", value, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andZzhchcLessThanOrEqualTo(String value) {
            addCriterion("ZZHCHC <=", value, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andZzhchcLike(String value) {
            addCriterion("ZZHCHC like", value, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andZzhchcNotLike(String value) {
            addCriterion("ZZHCHC not like", value, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andZzhchcIn(List<String> values) {
            addCriterion("ZZHCHC in", values, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andZzhchcNotIn(List<String> values) {
            addCriterion("ZZHCHC not in", values, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andZzhchcBetween(String value1, String value2) {
            addCriterion("ZZHCHC between", value1, value2, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andZzhchcNotBetween(String value1, String value2) {
            addCriterion("ZZHCHC not between", value1, value2, "zzhchc");
            return (Criteria) this;
        }

        public Criteria andBzbz2IsNull() {
            addCriterion("BZBZ2 is null");
            return (Criteria) this;
        }

        public Criteria andBzbz2IsNotNull() {
            addCriterion("BZBZ2 is not null");
            return (Criteria) this;
        }

        public Criteria andBzbz2EqualTo(String value) {
            addCriterion("BZBZ2 =", value, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz2NotEqualTo(String value) {
            addCriterion("BZBZ2 <>", value, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz2GreaterThan(String value) {
            addCriterion("BZBZ2 >", value, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz2GreaterThanOrEqualTo(String value) {
            addCriterion("BZBZ2 >=", value, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz2LessThan(String value) {
            addCriterion("BZBZ2 <", value, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz2LessThanOrEqualTo(String value) {
            addCriterion("BZBZ2 <=", value, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz2Like(String value) {
            addCriterion("BZBZ2 like", value, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz2NotLike(String value) {
            addCriterion("BZBZ2 not like", value, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz2In(List<String> values) {
            addCriterion("BZBZ2 in", values, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz2NotIn(List<String> values) {
            addCriterion("BZBZ2 not in", values, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz2Between(String value1, String value2) {
            addCriterion("BZBZ2 between", value1, value2, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz2NotBetween(String value1, String value2) {
            addCriterion("BZBZ2 not between", value1, value2, "bzbz2");
            return (Criteria) this;
        }

        public Criteria andBzbz3IsNull() {
            addCriterion("BZBZ3 is null");
            return (Criteria) this;
        }

        public Criteria andBzbz3IsNotNull() {
            addCriterion("BZBZ3 is not null");
            return (Criteria) this;
        }

        public Criteria andBzbz3EqualTo(String value) {
            addCriterion("BZBZ3 =", value, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz3NotEqualTo(String value) {
            addCriterion("BZBZ3 <>", value, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz3GreaterThan(String value) {
            addCriterion("BZBZ3 >", value, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz3GreaterThanOrEqualTo(String value) {
            addCriterion("BZBZ3 >=", value, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz3LessThan(String value) {
            addCriterion("BZBZ3 <", value, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz3LessThanOrEqualTo(String value) {
            addCriterion("BZBZ3 <=", value, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz3Like(String value) {
            addCriterion("BZBZ3 like", value, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz3NotLike(String value) {
            addCriterion("BZBZ3 not like", value, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz3In(List<String> values) {
            addCriterion("BZBZ3 in", values, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz3NotIn(List<String> values) {
            addCriterion("BZBZ3 not in", values, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz3Between(String value1, String value2) {
            addCriterion("BZBZ3 between", value1, value2, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz3NotBetween(String value1, String value2) {
            addCriterion("BZBZ3 not between", value1, value2, "bzbz3");
            return (Criteria) this;
        }

        public Criteria andBzbz4IsNull() {
            addCriterion("BZBZ4 is null");
            return (Criteria) this;
        }

        public Criteria andBzbz4IsNotNull() {
            addCriterion("BZBZ4 is not null");
            return (Criteria) this;
        }

        public Criteria andBzbz4EqualTo(String value) {
            addCriterion("BZBZ4 =", value, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andBzbz4NotEqualTo(String value) {
            addCriterion("BZBZ4 <>", value, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andBzbz4GreaterThan(String value) {
            addCriterion("BZBZ4 >", value, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andBzbz4GreaterThanOrEqualTo(String value) {
            addCriterion("BZBZ4 >=", value, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andBzbz4LessThan(String value) {
            addCriterion("BZBZ4 <", value, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andBzbz4LessThanOrEqualTo(String value) {
            addCriterion("BZBZ4 <=", value, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andBzbz4Like(String value) {
            addCriterion("BZBZ4 like", value, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andBzbz4NotLike(String value) {
            addCriterion("BZBZ4 not like", value, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andBzbz4In(List<String> values) {
            addCriterion("BZBZ4 in", values, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andBzbz4NotIn(List<String> values) {
            addCriterion("BZBZ4 not in", values, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andBzbz4Between(String value1, String value2) {
            addCriterion("BZBZ4 between", value1, value2, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andBzbz4NotBetween(String value1, String value2) {
            addCriterion("BZBZ4 not between", value1, value2, "bzbz4");
            return (Criteria) this;
        }

        public Criteria andDwlbIsNull() {
            addCriterion("DWLB is null");
            return (Criteria) this;
        }

        public Criteria andDwlbIsNotNull() {
            addCriterion("DWLB is not null");
            return (Criteria) this;
        }

        public Criteria andDwlbEqualTo(String value) {
            addCriterion("DWLB =", value, "dwlb");
            return (Criteria) this;
        }

        public Criteria andDwlbNotEqualTo(String value) {
            addCriterion("DWLB <>", value, "dwlb");
            return (Criteria) this;
        }

        public Criteria andDwlbGreaterThan(String value) {
            addCriterion("DWLB >", value, "dwlb");
            return (Criteria) this;
        }

        public Criteria andDwlbGreaterThanOrEqualTo(String value) {
            addCriterion("DWLB >=", value, "dwlb");
            return (Criteria) this;
        }

        public Criteria andDwlbLessThan(String value) {
            addCriterion("DWLB <", value, "dwlb");
            return (Criteria) this;
        }

        public Criteria andDwlbLessThanOrEqualTo(String value) {
            addCriterion("DWLB <=", value, "dwlb");
            return (Criteria) this;
        }

        public Criteria andDwlbLike(String value) {
            addCriterion("DWLB like", value, "dwlb");
            return (Criteria) this;
        }

        public Criteria andDwlbNotLike(String value) {
            addCriterion("DWLB not like", value, "dwlb");
            return (Criteria) this;
        }

        public Criteria andDwlbIn(List<String> values) {
            addCriterion("DWLB in", values, "dwlb");
            return (Criteria) this;
        }

        public Criteria andDwlbNotIn(List<String> values) {
            addCriterion("DWLB not in", values, "dwlb");
            return (Criteria) this;
        }

        public Criteria andDwlbBetween(String value1, String value2) {
            addCriterion("DWLB between", value1, value2, "dwlb");
            return (Criteria) this;
        }

        public Criteria andDwlbNotBetween(String value1, String value2) {
            addCriterion("DWLB not between", value1, value2, "dwlb");
            return (Criteria) this;
        }

        public Criteria andYhfhsjIsNull() {
            addCriterion("YHFHSJ is null");
            return (Criteria) this;
        }

        public Criteria andYhfhsjIsNotNull() {
            addCriterion("YHFHSJ is not null");
            return (Criteria) this;
        }

        public Criteria andYhfhsjEqualTo(Date value) {
            addCriterionForJDBCDate("YHFHSJ =", value, "yhfhsj");
            return (Criteria) this;
        }

        public Criteria andYhfhsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("YHFHSJ <>", value, "yhfhsj");
            return (Criteria) this;
        }

        public Criteria andYhfhsjGreaterThan(Date value) {
            addCriterionForJDBCDate("YHFHSJ >", value, "yhfhsj");
            return (Criteria) this;
        }

        public Criteria andYhfhsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YHFHSJ >=", value, "yhfhsj");
            return (Criteria) this;
        }

        public Criteria andYhfhsjLessThan(Date value) {
            addCriterionForJDBCDate("YHFHSJ <", value, "yhfhsj");
            return (Criteria) this;
        }

        public Criteria andYhfhsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YHFHSJ <=", value, "yhfhsj");
            return (Criteria) this;
        }

        public Criteria andYhfhsjIn(List<Date> values) {
            addCriterionForJDBCDate("YHFHSJ in", values, "yhfhsj");
            return (Criteria) this;
        }

        public Criteria andYhfhsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("YHFHSJ not in", values, "yhfhsj");
            return (Criteria) this;
        }

        public Criteria andYhfhsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YHFHSJ between", value1, value2, "yhfhsj");
            return (Criteria) this;
        }

        public Criteria andYhfhsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YHFHSJ not between", value1, value2, "yhfhsj");
            return (Criteria) this;
        }

        public Criteria andYwlshIsNull() {
            addCriterion("YWLSH is null");
            return (Criteria) this;
        }

        public Criteria andYwlshIsNotNull() {
            addCriterion("YWLSH is not null");
            return (Criteria) this;
        }

        public Criteria andYwlshEqualTo(String value) {
            addCriterion("YWLSH =", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshNotEqualTo(String value) {
            addCriterion("YWLSH <>", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshGreaterThan(String value) {
            addCriterion("YWLSH >", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshGreaterThanOrEqualTo(String value) {
            addCriterion("YWLSH >=", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshLessThan(String value) {
            addCriterion("YWLSH <", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshLessThanOrEqualTo(String value) {
            addCriterion("YWLSH <=", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshLike(String value) {
            addCriterion("YWLSH like", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshNotLike(String value) {
            addCriterion("YWLSH not like", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshIn(List<String> values) {
            addCriterion("YWLSH in", values, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshNotIn(List<String> values) {
            addCriterion("YWLSH not in", values, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshBetween(String value1, String value2) {
            addCriterion("YWLSH between", value1, value2, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshNotBetween(String value1, String value2) {
            addCriterion("YWLSH not between", value1, value2, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYcpbzIsNull() {
            addCriterion("YCPBZ is null");
            return (Criteria) this;
        }

        public Criteria andYcpbzIsNotNull() {
            addCriterion("YCPBZ is not null");
            return (Criteria) this;
        }

        public Criteria andYcpbzEqualTo(String value) {
            addCriterion("YCPBZ =", value, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andYcpbzNotEqualTo(String value) {
            addCriterion("YCPBZ <>", value, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andYcpbzGreaterThan(String value) {
            addCriterion("YCPBZ >", value, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andYcpbzGreaterThanOrEqualTo(String value) {
            addCriterion("YCPBZ >=", value, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andYcpbzLessThan(String value) {
            addCriterion("YCPBZ <", value, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andYcpbzLessThanOrEqualTo(String value) {
            addCriterion("YCPBZ <=", value, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andYcpbzLike(String value) {
            addCriterion("YCPBZ like", value, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andYcpbzNotLike(String value) {
            addCriterion("YCPBZ not like", value, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andYcpbzIn(List<String> values) {
            addCriterion("YCPBZ in", values, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andYcpbzNotIn(List<String> values) {
            addCriterion("YCPBZ not in", values, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andYcpbzBetween(String value1, String value2) {
            addCriterion("YCPBZ between", value1, value2, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andYcpbzNotBetween(String value1, String value2) {
            addCriterion("YCPBZ not between", value1, value2, "ycpbz");
            return (Criteria) this;
        }

        public Criteria andFphtIsNull() {
            addCriterion("FPHT is null");
            return (Criteria) this;
        }

        public Criteria andFphtIsNotNull() {
            addCriterion("FPHT is not null");
            return (Criteria) this;
        }

        public Criteria andFphtEqualTo(String value) {
            addCriterion("FPHT =", value, "fpht");
            return (Criteria) this;
        }

        public Criteria andFphtNotEqualTo(String value) {
            addCriterion("FPHT <>", value, "fpht");
            return (Criteria) this;
        }

        public Criteria andFphtGreaterThan(String value) {
            addCriterion("FPHT >", value, "fpht");
            return (Criteria) this;
        }

        public Criteria andFphtGreaterThanOrEqualTo(String value) {
            addCriterion("FPHT >=", value, "fpht");
            return (Criteria) this;
        }

        public Criteria andFphtLessThan(String value) {
            addCriterion("FPHT <", value, "fpht");
            return (Criteria) this;
        }

        public Criteria andFphtLessThanOrEqualTo(String value) {
            addCriterion("FPHT <=", value, "fpht");
            return (Criteria) this;
        }

        public Criteria andFphtLike(String value) {
            addCriterion("FPHT like", value, "fpht");
            return (Criteria) this;
        }

        public Criteria andFphtNotLike(String value) {
            addCriterion("FPHT not like", value, "fpht");
            return (Criteria) this;
        }

        public Criteria andFphtIn(List<String> values) {
            addCriterion("FPHT in", values, "fpht");
            return (Criteria) this;
        }

        public Criteria andFphtNotIn(List<String> values) {
            addCriterion("FPHT not in", values, "fpht");
            return (Criteria) this;
        }

        public Criteria andFphtBetween(String value1, String value2) {
            addCriterion("FPHT between", value1, value2, "fpht");
            return (Criteria) this;
        }

        public Criteria andFphtNotBetween(String value1, String value2) {
            addCriterion("FPHT not between", value1, value2, "fpht");
            return (Criteria) this;
        }

        public Criteria andGthIsNull() {
            addCriterion("GTH is null");
            return (Criteria) this;
        }

        public Criteria andGthIsNotNull() {
            addCriterion("GTH is not null");
            return (Criteria) this;
        }

        public Criteria andGthEqualTo(String value) {
            addCriterion("GTH =", value, "gth");
            return (Criteria) this;
        }

        public Criteria andGthNotEqualTo(String value) {
            addCriterion("GTH <>", value, "gth");
            return (Criteria) this;
        }

        public Criteria andGthGreaterThan(String value) {
            addCriterion("GTH >", value, "gth");
            return (Criteria) this;
        }

        public Criteria andGthGreaterThanOrEqualTo(String value) {
            addCriterion("GTH >=", value, "gth");
            return (Criteria) this;
        }

        public Criteria andGthLessThan(String value) {
            addCriterion("GTH <", value, "gth");
            return (Criteria) this;
        }

        public Criteria andGthLessThanOrEqualTo(String value) {
            addCriterion("GTH <=", value, "gth");
            return (Criteria) this;
        }

        public Criteria andGthLike(String value) {
            addCriterion("GTH like", value, "gth");
            return (Criteria) this;
        }

        public Criteria andGthNotLike(String value) {
            addCriterion("GTH not like", value, "gth");
            return (Criteria) this;
        }

        public Criteria andGthIn(List<String> values) {
            addCriterion("GTH in", values, "gth");
            return (Criteria) this;
        }

        public Criteria andGthNotIn(List<String> values) {
            addCriterion("GTH not in", values, "gth");
            return (Criteria) this;
        }

        public Criteria andGthBetween(String value1, String value2) {
            addCriterion("GTH between", value1, value2, "gth");
            return (Criteria) this;
        }

        public Criteria andGthNotBetween(String value1, String value2) {
            addCriterion("GTH not between", value1, value2, "gth");
            return (Criteria) this;
        }

        public Criteria andYhblIsNull() {
            addCriterion("YHBL is null");
            return (Criteria) this;
        }

        public Criteria andYhblIsNotNull() {
            addCriterion("YHBL is not null");
            return (Criteria) this;
        }

        public Criteria andYhblEqualTo(BigDecimal value) {
            addCriterion("YHBL =", value, "yhbl");
            return (Criteria) this;
        }

        public Criteria andYhblNotEqualTo(BigDecimal value) {
            addCriterion("YHBL <>", value, "yhbl");
            return (Criteria) this;
        }

        public Criteria andYhblGreaterThan(BigDecimal value) {
            addCriterion("YHBL >", value, "yhbl");
            return (Criteria) this;
        }

        public Criteria andYhblGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YHBL >=", value, "yhbl");
            return (Criteria) this;
        }

        public Criteria andYhblLessThan(BigDecimal value) {
            addCriterion("YHBL <", value, "yhbl");
            return (Criteria) this;
        }

        public Criteria andYhblLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YHBL <=", value, "yhbl");
            return (Criteria) this;
        }

        public Criteria andYhblIn(List<BigDecimal> values) {
            addCriterion("YHBL in", values, "yhbl");
            return (Criteria) this;
        }

        public Criteria andYhblNotIn(List<BigDecimal> values) {
            addCriterion("YHBL not in", values, "yhbl");
            return (Criteria) this;
        }

        public Criteria andYhblBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YHBL between", value1, value2, "yhbl");
            return (Criteria) this;
        }

        public Criteria andYhblNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YHBL not between", value1, value2, "yhbl");
            return (Criteria) this;
        }

        public Criteria andYhjeIsNull() {
            addCriterion("YHJE is null");
            return (Criteria) this;
        }

        public Criteria andYhjeIsNotNull() {
            addCriterion("YHJE is not null");
            return (Criteria) this;
        }

        public Criteria andYhjeEqualTo(BigDecimal value) {
            addCriterion("YHJE =", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeNotEqualTo(BigDecimal value) {
            addCriterion("YHJE <>", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeGreaterThan(BigDecimal value) {
            addCriterion("YHJE >", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YHJE >=", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeLessThan(BigDecimal value) {
            addCriterion("YHJE <", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YHJE <=", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeIn(List<BigDecimal> values) {
            addCriterion("YHJE in", values, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeNotIn(List<BigDecimal> values) {
            addCriterion("YHJE not in", values, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YHJE between", value1, value2, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YHJE not between", value1, value2, "yhje");
            return (Criteria) this;
        }

        public Criteria andNsjeIsNull() {
            addCriterion("NSJE is null");
            return (Criteria) this;
        }

        public Criteria andNsjeIsNotNull() {
            addCriterion("NSJE is not null");
            return (Criteria) this;
        }

        public Criteria andNsjeEqualTo(BigDecimal value) {
            addCriterion("NSJE =", value, "nsje");
            return (Criteria) this;
        }

        public Criteria andNsjeNotEqualTo(BigDecimal value) {
            addCriterion("NSJE <>", value, "nsje");
            return (Criteria) this;
        }

        public Criteria andNsjeGreaterThan(BigDecimal value) {
            addCriterion("NSJE >", value, "nsje");
            return (Criteria) this;
        }

        public Criteria andNsjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NSJE >=", value, "nsje");
            return (Criteria) this;
        }

        public Criteria andNsjeLessThan(BigDecimal value) {
            addCriterion("NSJE <", value, "nsje");
            return (Criteria) this;
        }

        public Criteria andNsjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NSJE <=", value, "nsje");
            return (Criteria) this;
        }

        public Criteria andNsjeIn(List<BigDecimal> values) {
            addCriterion("NSJE in", values, "nsje");
            return (Criteria) this;
        }

        public Criteria andNsjeNotIn(List<BigDecimal> values) {
            addCriterion("NSJE not in", values, "nsje");
            return (Criteria) this;
        }

        public Criteria andNsjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NSJE between", value1, value2, "nsje");
            return (Criteria) this;
        }

        public Criteria andNsjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NSJE not between", value1, value2, "nsje");
            return (Criteria) this;
        }

        public Criteria andYhnsjeIsNull() {
            addCriterion("YHNSJE is null");
            return (Criteria) this;
        }

        public Criteria andYhnsjeIsNotNull() {
            addCriterion("YHNSJE is not null");
            return (Criteria) this;
        }

        public Criteria andYhnsjeEqualTo(BigDecimal value) {
            addCriterion("YHNSJE =", value, "yhnsje");
            return (Criteria) this;
        }

        public Criteria andYhnsjeNotEqualTo(BigDecimal value) {
            addCriterion("YHNSJE <>", value, "yhnsje");
            return (Criteria) this;
        }

        public Criteria andYhnsjeGreaterThan(BigDecimal value) {
            addCriterion("YHNSJE >", value, "yhnsje");
            return (Criteria) this;
        }

        public Criteria andYhnsjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YHNSJE >=", value, "yhnsje");
            return (Criteria) this;
        }

        public Criteria andYhnsjeLessThan(BigDecimal value) {
            addCriterion("YHNSJE <", value, "yhnsje");
            return (Criteria) this;
        }

        public Criteria andYhnsjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YHNSJE <=", value, "yhnsje");
            return (Criteria) this;
        }

        public Criteria andYhnsjeIn(List<BigDecimal> values) {
            addCriterion("YHNSJE in", values, "yhnsje");
            return (Criteria) this;
        }

        public Criteria andYhnsjeNotIn(List<BigDecimal> values) {
            addCriterion("YHNSJE not in", values, "yhnsje");
            return (Criteria) this;
        }

        public Criteria andYhnsjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YHNSJE between", value1, value2, "yhnsje");
            return (Criteria) this;
        }

        public Criteria andYhnsjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YHNSJE not between", value1, value2, "yhnsje");
            return (Criteria) this;
        }

        public Criteria andFpdmIsNull() {
            addCriterion("FPDM is null");
            return (Criteria) this;
        }

        public Criteria andFpdmIsNotNull() {
            addCriterion("FPDM is not null");
            return (Criteria) this;
        }

        public Criteria andFpdmEqualTo(String value) {
            addCriterion("FPDM =", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotEqualTo(String value) {
            addCriterion("FPDM <>", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmGreaterThan(String value) {
            addCriterion("FPDM >", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmGreaterThanOrEqualTo(String value) {
            addCriterion("FPDM >=", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmLessThan(String value) {
            addCriterion("FPDM <", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmLessThanOrEqualTo(String value) {
            addCriterion("FPDM <=", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmLike(String value) {
            addCriterion("FPDM like", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotLike(String value) {
            addCriterion("FPDM not like", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmIn(List<String> values) {
            addCriterion("FPDM in", values, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotIn(List<String> values) {
            addCriterion("FPDM not in", values, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmBetween(String value1, String value2) {
            addCriterion("FPDM between", value1, value2, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotBetween(String value1, String value2) {
            addCriterion("FPDM not between", value1, value2, "fpdm");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("TAXRATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("TAXRATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(BigDecimal value) {
            addCriterion("TAXRATE =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(BigDecimal value) {
            addCriterion("TAXRATE <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(BigDecimal value) {
            addCriterion("TAXRATE >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXRATE >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(BigDecimal value) {
            addCriterion("TAXRATE <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXRATE <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<BigDecimal> values) {
            addCriterion("TAXRATE in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<BigDecimal> values) {
            addCriterion("TAXRATE not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXRATE between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXRATE not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andFkzhIsNull() {
            addCriterion("FKZH is null");
            return (Criteria) this;
        }

        public Criteria andFkzhIsNotNull() {
            addCriterion("FKZH is not null");
            return (Criteria) this;
        }

        public Criteria andFkzhEqualTo(String value) {
            addCriterion("FKZH =", value, "fkzh");
            return (Criteria) this;
        }

        public Criteria andFkzhNotEqualTo(String value) {
            addCriterion("FKZH <>", value, "fkzh");
            return (Criteria) this;
        }

        public Criteria andFkzhGreaterThan(String value) {
            addCriterion("FKZH >", value, "fkzh");
            return (Criteria) this;
        }

        public Criteria andFkzhGreaterThanOrEqualTo(String value) {
            addCriterion("FKZH >=", value, "fkzh");
            return (Criteria) this;
        }

        public Criteria andFkzhLessThan(String value) {
            addCriterion("FKZH <", value, "fkzh");
            return (Criteria) this;
        }

        public Criteria andFkzhLessThanOrEqualTo(String value) {
            addCriterion("FKZH <=", value, "fkzh");
            return (Criteria) this;
        }

        public Criteria andFkzhLike(String value) {
            addCriterion("FKZH like", value, "fkzh");
            return (Criteria) this;
        }

        public Criteria andFkzhNotLike(String value) {
            addCriterion("FKZH not like", value, "fkzh");
            return (Criteria) this;
        }

        public Criteria andFkzhIn(List<String> values) {
            addCriterion("FKZH in", values, "fkzh");
            return (Criteria) this;
        }

        public Criteria andFkzhNotIn(List<String> values) {
            addCriterion("FKZH not in", values, "fkzh");
            return (Criteria) this;
        }

        public Criteria andFkzhBetween(String value1, String value2) {
            addCriterion("FKZH between", value1, value2, "fkzh");
            return (Criteria) this;
        }

        public Criteria andFkzhNotBetween(String value1, String value2) {
            addCriterion("FKZH not between", value1, value2, "fkzh");
            return (Criteria) this;
        }

        public Criteria andSkzhIsNull() {
            addCriterion("SKZH is null");
            return (Criteria) this;
        }

        public Criteria andSkzhIsNotNull() {
            addCriterion("SKZH is not null");
            return (Criteria) this;
        }

        public Criteria andSkzhEqualTo(String value) {
            addCriterion("SKZH =", value, "skzh");
            return (Criteria) this;
        }

        public Criteria andSkzhNotEqualTo(String value) {
            addCriterion("SKZH <>", value, "skzh");
            return (Criteria) this;
        }

        public Criteria andSkzhGreaterThan(String value) {
            addCriterion("SKZH >", value, "skzh");
            return (Criteria) this;
        }

        public Criteria andSkzhGreaterThanOrEqualTo(String value) {
            addCriterion("SKZH >=", value, "skzh");
            return (Criteria) this;
        }

        public Criteria andSkzhLessThan(String value) {
            addCriterion("SKZH <", value, "skzh");
            return (Criteria) this;
        }

        public Criteria andSkzhLessThanOrEqualTo(String value) {
            addCriterion("SKZH <=", value, "skzh");
            return (Criteria) this;
        }

        public Criteria andSkzhLike(String value) {
            addCriterion("SKZH like", value, "skzh");
            return (Criteria) this;
        }

        public Criteria andSkzhNotLike(String value) {
            addCriterion("SKZH not like", value, "skzh");
            return (Criteria) this;
        }

        public Criteria andSkzhIn(List<String> values) {
            addCriterion("SKZH in", values, "skzh");
            return (Criteria) this;
        }

        public Criteria andSkzhNotIn(List<String> values) {
            addCriterion("SKZH not in", values, "skzh");
            return (Criteria) this;
        }

        public Criteria andSkzhBetween(String value1, String value2) {
            addCriterion("SKZH between", value1, value2, "skzh");
            return (Criteria) this;
        }

        public Criteria andSkzhNotBetween(String value1, String value2) {
            addCriterion("SKZH not between", value1, value2, "skzh");
            return (Criteria) this;
        }

        public Criteria andZdbhIsNull() {
            addCriterion("ZDBH is null");
            return (Criteria) this;
        }

        public Criteria andZdbhIsNotNull() {
            addCriterion("ZDBH is not null");
            return (Criteria) this;
        }

        public Criteria andZdbhEqualTo(String value) {
            addCriterion("ZDBH =", value, "zdbh");
            return (Criteria) this;
        }

        public Criteria andZdbhNotEqualTo(String value) {
            addCriterion("ZDBH <>", value, "zdbh");
            return (Criteria) this;
        }

        public Criteria andZdbhGreaterThan(String value) {
            addCriterion("ZDBH >", value, "zdbh");
            return (Criteria) this;
        }

        public Criteria andZdbhGreaterThanOrEqualTo(String value) {
            addCriterion("ZDBH >=", value, "zdbh");
            return (Criteria) this;
        }

        public Criteria andZdbhLessThan(String value) {
            addCriterion("ZDBH <", value, "zdbh");
            return (Criteria) this;
        }

        public Criteria andZdbhLessThanOrEqualTo(String value) {
            addCriterion("ZDBH <=", value, "zdbh");
            return (Criteria) this;
        }

        public Criteria andZdbhLike(String value) {
            addCriterion("ZDBH like", value, "zdbh");
            return (Criteria) this;
        }

        public Criteria andZdbhNotLike(String value) {
            addCriterion("ZDBH not like", value, "zdbh");
            return (Criteria) this;
        }

        public Criteria andZdbhIn(List<String> values) {
            addCriterion("ZDBH in", values, "zdbh");
            return (Criteria) this;
        }

        public Criteria andZdbhNotIn(List<String> values) {
            addCriterion("ZDBH not in", values, "zdbh");
            return (Criteria) this;
        }

        public Criteria andZdbhBetween(String value1, String value2) {
            addCriterion("ZDBH between", value1, value2, "zdbh");
            return (Criteria) this;
        }

        public Criteria andZdbhNotBetween(String value1, String value2) {
            addCriterion("ZDBH not between", value1, value2, "zdbh");
            return (Criteria) this;
        }

        public Criteria andFpyyhIsNull() {
            addCriterion("FPYYH is null");
            return (Criteria) this;
        }

        public Criteria andFpyyhIsNotNull() {
            addCriterion("FPYYH is not null");
            return (Criteria) this;
        }

        public Criteria andFpyyhEqualTo(String value) {
            addCriterion("FPYYH =", value, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyyhNotEqualTo(String value) {
            addCriterion("FPYYH <>", value, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyyhGreaterThan(String value) {
            addCriterion("FPYYH >", value, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyyhGreaterThanOrEqualTo(String value) {
            addCriterion("FPYYH >=", value, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyyhLessThan(String value) {
            addCriterion("FPYYH <", value, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyyhLessThanOrEqualTo(String value) {
            addCriterion("FPYYH <=", value, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyyhLike(String value) {
            addCriterion("FPYYH like", value, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyyhNotLike(String value) {
            addCriterion("FPYYH not like", value, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyyhIn(List<String> values) {
            addCriterion("FPYYH in", values, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyyhNotIn(List<String> values) {
            addCriterion("FPYYH not in", values, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyyhBetween(String value1, String value2) {
            addCriterion("FPYYH between", value1, value2, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyyhNotBetween(String value1, String value2) {
            addCriterion("FPYYH not between", value1, value2, "fpyyh");
            return (Criteria) this;
        }

        public Criteria andFpyysjIsNull() {
            addCriterion("FPYYSJ is null");
            return (Criteria) this;
        }

        public Criteria andFpyysjIsNotNull() {
            addCriterion("FPYYSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFpyysjEqualTo(Date value) {
            addCriterionForJDBCDate("FPYYSJ =", value, "fpyysj");
            return (Criteria) this;
        }

        public Criteria andFpyysjNotEqualTo(Date value) {
            addCriterionForJDBCDate("FPYYSJ <>", value, "fpyysj");
            return (Criteria) this;
        }

        public Criteria andFpyysjGreaterThan(Date value) {
            addCriterionForJDBCDate("FPYYSJ >", value, "fpyysj");
            return (Criteria) this;
        }

        public Criteria andFpyysjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FPYYSJ >=", value, "fpyysj");
            return (Criteria) this;
        }

        public Criteria andFpyysjLessThan(Date value) {
            addCriterionForJDBCDate("FPYYSJ <", value, "fpyysj");
            return (Criteria) this;
        }

        public Criteria andFpyysjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FPYYSJ <=", value, "fpyysj");
            return (Criteria) this;
        }

        public Criteria andFpyysjIn(List<Date> values) {
            addCriterionForJDBCDate("FPYYSJ in", values, "fpyysj");
            return (Criteria) this;
        }

        public Criteria andFpyysjNotIn(List<Date> values) {
            addCriterionForJDBCDate("FPYYSJ not in", values, "fpyysj");
            return (Criteria) this;
        }

        public Criteria andFpyysjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FPYYSJ between", value1, value2, "fpyysj");
            return (Criteria) this;
        }

        public Criteria andFpyysjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FPYYSJ not between", value1, value2, "fpyysj");
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