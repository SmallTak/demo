package com.mzb.dmxxk.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblPlaceAttrinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblPlaceAttrinfoExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeIsNull() {
            addCriterion("place_code is null");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeIsNotNull() {
            addCriterion("place_code is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeEqualTo(String value) {
            addCriterion("place_code =", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeNotEqualTo(String value) {
            addCriterion("place_code <>", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeGreaterThan(String value) {
            addCriterion("place_code >", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("place_code >=", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeLessThan(String value) {
            addCriterion("place_code <", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeLessThanOrEqualTo(String value) {
            addCriterion("place_code <=", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeLike(String value) {
            addCriterion("place_code like", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeNotLike(String value) {
            addCriterion("place_code not like", value, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeIn(List<String> values) {
            addCriterion("place_code in", values, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeNotIn(List<String> values) {
            addCriterion("place_code not in", values, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeBetween(String value1, String value2) {
            addCriterion("place_code between", value1, value2, "placeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceCodeNotBetween(String value1, String value2) {
            addCriterion("place_code not between", value1, value2, "placeCode");
            return (Criteria) this;
        }

        public Criteria andStandardNameIsNull() {
            addCriterion("standard_name is null");
            return (Criteria) this;
        }

        public Criteria andStandardNameIsNotNull() {
            addCriterion("standard_name is not null");
            return (Criteria) this;
        }

        public Criteria andStandardNameEqualTo(String value) {
            addCriterion("standard_name =", value, "standardName");
            return (Criteria) this;
        }

        public Criteria andStandardNameNotEqualTo(String value) {
            addCriterion("standard_name <>", value, "standardName");
            return (Criteria) this;
        }

        public Criteria andStandardNameGreaterThan(String value) {
            addCriterion("standard_name >", value, "standardName");
            return (Criteria) this;
        }

        public Criteria andStandardNameGreaterThanOrEqualTo(String value) {
            addCriterion("standard_name >=", value, "standardName");
            return (Criteria) this;
        }

        public Criteria andStandardNameLessThan(String value) {
            addCriterion("standard_name <", value, "standardName");
            return (Criteria) this;
        }

        public Criteria andStandardNameLessThanOrEqualTo(String value) {
            addCriterion("standard_name <=", value, "standardName");
            return (Criteria) this;
        }

        public Criteria andStandardNameLike(String value) {
            addCriterion("standard_name like", value, "standardName");
            return (Criteria) this;
        }

        public Criteria andStandardNameNotLike(String value) {
            addCriterion("standard_name not like", value, "standardName");
            return (Criteria) this;
        }

        public Criteria andStandardNameIn(List<String> values) {
            addCriterion("standard_name in", values, "standardName");
            return (Criteria) this;
        }

        public Criteria andStandardNameNotIn(List<String> values) {
            addCriterion("standard_name not in", values, "standardName");
            return (Criteria) this;
        }

        public Criteria andStandardNameBetween(String value1, String value2) {
            addCriterion("standard_name between", value1, value2, "standardName");
            return (Criteria) this;
        }

        public Criteria andStandardNameNotBetween(String value1, String value2) {
            addCriterion("standard_name not between", value1, value2, "standardName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIsNull() {
            addCriterion("original_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIsNotNull() {
            addCriterion("original_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalNameEqualTo(String value) {
            addCriterion("original_name =", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotEqualTo(String value) {
            addCriterion("original_name <>", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameGreaterThan(String value) {
            addCriterion("original_name >", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameGreaterThanOrEqualTo(String value) {
            addCriterion("original_name >=", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLessThan(String value) {
            addCriterion("original_name <", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLessThanOrEqualTo(String value) {
            addCriterion("original_name <=", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLike(String value) {
            addCriterion("original_name like", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotLike(String value) {
            addCriterion("original_name not like", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIn(List<String> values) {
            addCriterion("original_name in", values, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotIn(List<String> values) {
            addCriterion("original_name not in", values, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameBetween(String value1, String value2) {
            addCriterion("original_name between", value1, value2, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotBetween(String value1, String value2) {
            addCriterion("original_name not between", value1, value2, "originalName");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNull() {
            addCriterion("use_time is null");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNotNull() {
            addCriterion("use_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseTimeEqualTo(String value) {
            addCriterion("use_time =", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotEqualTo(String value) {
            addCriterion("use_time <>", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThan(String value) {
            addCriterion("use_time >", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("use_time >=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThan(String value) {
            addCriterion("use_time <", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThanOrEqualTo(String value) {
            addCriterion("use_time <=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLike(String value) {
            addCriterion("use_time like", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotLike(String value) {
            addCriterion("use_time not like", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeIn(List<String> values) {
            addCriterion("use_time in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotIn(List<String> values) {
            addCriterion("use_time not in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeBetween(String value1, String value2) {
            addCriterion("use_time between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotBetween(String value1, String value2) {
            addCriterion("use_time not between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andEbBsmIsNull() {
            addCriterion("EB_BSM is null");
            return (Criteria) this;
        }

        public Criteria andEbBsmIsNotNull() {
            addCriterion("EB_BSM is not null");
            return (Criteria) this;
        }

        public Criteria andEbBsmEqualTo(String value) {
            addCriterion("EB_BSM =", value, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbBsmNotEqualTo(String value) {
            addCriterion("EB_BSM <>", value, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbBsmGreaterThan(String value) {
            addCriterion("EB_BSM >", value, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbBsmGreaterThanOrEqualTo(String value) {
            addCriterion("EB_BSM >=", value, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbBsmLessThan(String value) {
            addCriterion("EB_BSM <", value, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbBsmLessThanOrEqualTo(String value) {
            addCriterion("EB_BSM <=", value, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbBsmLike(String value) {
            addCriterion("EB_BSM like", value, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbBsmNotLike(String value) {
            addCriterion("EB_BSM not like", value, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbBsmIn(List<String> values) {
            addCriterion("EB_BSM in", values, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbBsmNotIn(List<String> values) {
            addCriterion("EB_BSM not in", values, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbBsmBetween(String value1, String value2) {
            addCriterion("EB_BSM between", value1, value2, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbBsmNotBetween(String value1, String value2) {
            addCriterion("EB_BSM not between", value1, value2, "ebBsm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmIsNull() {
            addCriterion("EB_XZQHDM is null");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmIsNotNull() {
            addCriterion("EB_XZQHDM is not null");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmEqualTo(String value) {
            addCriterion("EB_XZQHDM =", value, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmNotEqualTo(String value) {
            addCriterion("EB_XZQHDM <>", value, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmGreaterThan(String value) {
            addCriterion("EB_XZQHDM >", value, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmGreaterThanOrEqualTo(String value) {
            addCriterion("EB_XZQHDM >=", value, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmLessThan(String value) {
            addCriterion("EB_XZQHDM <", value, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmLessThanOrEqualTo(String value) {
            addCriterion("EB_XZQHDM <=", value, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmLike(String value) {
            addCriterion("EB_XZQHDM like", value, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmNotLike(String value) {
            addCriterion("EB_XZQHDM not like", value, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmIn(List<String> values) {
            addCriterion("EB_XZQHDM in", values, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmNotIn(List<String> values) {
            addCriterion("EB_XZQHDM not in", values, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmBetween(String value1, String value2) {
            addCriterion("EB_XZQHDM between", value1, value2, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbXzqhdmNotBetween(String value1, String value2) {
            addCriterion("EB_XZQHDM not between", value1, value2, "ebXzqhdm");
            return (Criteria) this;
        }

        public Criteria andEbPcqIsNull() {
            addCriterion("EB_PCQ is null");
            return (Criteria) this;
        }

        public Criteria andEbPcqIsNotNull() {
            addCriterion("EB_PCQ is not null");
            return (Criteria) this;
        }

        public Criteria andEbPcqEqualTo(Integer value) {
            addCriterion("EB_PCQ =", value, "ebPcq");
            return (Criteria) this;
        }

        public Criteria andEbPcqNotEqualTo(Integer value) {
            addCriterion("EB_PCQ <>", value, "ebPcq");
            return (Criteria) this;
        }

        public Criteria andEbPcqGreaterThan(Integer value) {
            addCriterion("EB_PCQ >", value, "ebPcq");
            return (Criteria) this;
        }

        public Criteria andEbPcqGreaterThanOrEqualTo(Integer value) {
            addCriterion("EB_PCQ >=", value, "ebPcq");
            return (Criteria) this;
        }

        public Criteria andEbPcqLessThan(Integer value) {
            addCriterion("EB_PCQ <", value, "ebPcq");
            return (Criteria) this;
        }

        public Criteria andEbPcqLessThanOrEqualTo(Integer value) {
            addCriterion("EB_PCQ <=", value, "ebPcq");
            return (Criteria) this;
        }

        public Criteria andEbPcqIn(List<Integer> values) {
            addCriterion("EB_PCQ in", values, "ebPcq");
            return (Criteria) this;
        }

        public Criteria andEbPcqNotIn(List<Integer> values) {
            addCriterion("EB_PCQ not in", values, "ebPcq");
            return (Criteria) this;
        }

        public Criteria andEbPcqBetween(Integer value1, Integer value2) {
            addCriterion("EB_PCQ between", value1, value2, "ebPcq");
            return (Criteria) this;
        }

        public Criteria andEbPcqNotBetween(Integer value1, Integer value2) {
            addCriterion("EB_PCQ not between", value1, value2, "ebPcq");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingIsNull() {
            addCriterion("roman_alphabet_spelling is null");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingIsNotNull() {
            addCriterion("roman_alphabet_spelling is not null");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingEqualTo(String value) {
            addCriterion("roman_alphabet_spelling =", value, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingNotEqualTo(String value) {
            addCriterion("roman_alphabet_spelling <>", value, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingGreaterThan(String value) {
            addCriterion("roman_alphabet_spelling >", value, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingGreaterThanOrEqualTo(String value) {
            addCriterion("roman_alphabet_spelling >=", value, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingLessThan(String value) {
            addCriterion("roman_alphabet_spelling <", value, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingLessThanOrEqualTo(String value) {
            addCriterion("roman_alphabet_spelling <=", value, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingLike(String value) {
            addCriterion("roman_alphabet_spelling like", value, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingNotLike(String value) {
            addCriterion("roman_alphabet_spelling not like", value, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingIn(List<String> values) {
            addCriterion("roman_alphabet_spelling in", values, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingNotIn(List<String> values) {
            addCriterion("roman_alphabet_spelling not in", values, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingBetween(String value1, String value2) {
            addCriterion("roman_alphabet_spelling between", value1, value2, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andRomanAlphabetSpellingNotBetween(String value1, String value2) {
            addCriterion("roman_alphabet_spelling not between", value1, value2, "romanAlphabetSpelling");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingIsNull() {
            addCriterion("ethnic_minorities_writing is null");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingIsNotNull() {
            addCriterion("ethnic_minorities_writing is not null");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingEqualTo(String value) {
            addCriterion("ethnic_minorities_writing =", value, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingNotEqualTo(String value) {
            addCriterion("ethnic_minorities_writing <>", value, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingGreaterThan(String value) {
            addCriterion("ethnic_minorities_writing >", value, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingGreaterThanOrEqualTo(String value) {
            addCriterion("ethnic_minorities_writing >=", value, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingLessThan(String value) {
            addCriterion("ethnic_minorities_writing <", value, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingLessThanOrEqualTo(String value) {
            addCriterion("ethnic_minorities_writing <=", value, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingLike(String value) {
            addCriterion("ethnic_minorities_writing like", value, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingNotLike(String value) {
            addCriterion("ethnic_minorities_writing not like", value, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingIn(List<String> values) {
            addCriterion("ethnic_minorities_writing in", values, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingNotIn(List<String> values) {
            addCriterion("ethnic_minorities_writing not in", values, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingBetween(String value1, String value2) {
            addCriterion("ethnic_minorities_writing between", value1, value2, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andEthnicMinoritiesWritingNotBetween(String value1, String value2) {
            addCriterion("ethnic_minorities_writing not between", value1, value2, "ethnicMinoritiesWriting");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsIsNull() {
            addCriterion("abbreviations is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsIsNotNull() {
            addCriterion("abbreviations is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsEqualTo(String value) {
            addCriterion("abbreviations =", value, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsNotEqualTo(String value) {
            addCriterion("abbreviations <>", value, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsGreaterThan(String value) {
            addCriterion("abbreviations >", value, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsGreaterThanOrEqualTo(String value) {
            addCriterion("abbreviations >=", value, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsLessThan(String value) {
            addCriterion("abbreviations <", value, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsLessThanOrEqualTo(String value) {
            addCriterion("abbreviations <=", value, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsLike(String value) {
            addCriterion("abbreviations like", value, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsNotLike(String value) {
            addCriterion("abbreviations not like", value, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsIn(List<String> values) {
            addCriterion("abbreviations in", values, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsNotIn(List<String> values) {
            addCriterion("abbreviations not in", values, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsBetween(String value1, String value2) {
            addCriterion("abbreviations between", value1, value2, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andAbbreviationsNotBetween(String value1, String value2) {
            addCriterion("abbreviations not between", value1, value2, "abbreviations");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeIsNull() {
            addCriterion("east_longitude is null");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeIsNotNull() {
            addCriterion("east_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeEqualTo(String value) {
            addCriterion("east_longitude =", value, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeNotEqualTo(String value) {
            addCriterion("east_longitude <>", value, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeGreaterThan(String value) {
            addCriterion("east_longitude >", value, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("east_longitude >=", value, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeLessThan(String value) {
            addCriterion("east_longitude <", value, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeLessThanOrEqualTo(String value) {
            addCriterion("east_longitude <=", value, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeLike(String value) {
            addCriterion("east_longitude like", value, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeNotLike(String value) {
            addCriterion("east_longitude not like", value, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeIn(List<String> values) {
            addCriterion("east_longitude in", values, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeNotIn(List<String> values) {
            addCriterion("east_longitude not in", values, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeBetween(String value1, String value2) {
            addCriterion("east_longitude between", value1, value2, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andEastLongitudeNotBetween(String value1, String value2) {
            addCriterion("east_longitude not between", value1, value2, "eastLongitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeIsNull() {
            addCriterion("north_latitude is null");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeIsNotNull() {
            addCriterion("north_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeEqualTo(String value) {
            addCriterion("north_latitude =", value, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeNotEqualTo(String value) {
            addCriterion("north_latitude <>", value, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeGreaterThan(String value) {
            addCriterion("north_latitude >", value, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("north_latitude >=", value, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeLessThan(String value) {
            addCriterion("north_latitude <", value, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeLessThanOrEqualTo(String value) {
            addCriterion("north_latitude <=", value, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeLike(String value) {
            addCriterion("north_latitude like", value, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeNotLike(String value) {
            addCriterion("north_latitude not like", value, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeIn(List<String> values) {
            addCriterion("north_latitude in", values, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeNotIn(List<String> values) {
            addCriterion("north_latitude not in", values, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeBetween(String value1, String value2) {
            addCriterion("north_latitude between", value1, value2, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andNorthLatitudeNotBetween(String value1, String value2) {
            addCriterion("north_latitude not between", value1, value2, "northLatitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeIsNull() {
            addCriterion("to_east_longitude is null");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeIsNotNull() {
            addCriterion("to_east_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeEqualTo(String value) {
            addCriterion("to_east_longitude =", value, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeNotEqualTo(String value) {
            addCriterion("to_east_longitude <>", value, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeGreaterThan(String value) {
            addCriterion("to_east_longitude >", value, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("to_east_longitude >=", value, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeLessThan(String value) {
            addCriterion("to_east_longitude <", value, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeLessThanOrEqualTo(String value) {
            addCriterion("to_east_longitude <=", value, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeLike(String value) {
            addCriterion("to_east_longitude like", value, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeNotLike(String value) {
            addCriterion("to_east_longitude not like", value, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeIn(List<String> values) {
            addCriterion("to_east_longitude in", values, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeNotIn(List<String> values) {
            addCriterion("to_east_longitude not in", values, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeBetween(String value1, String value2) {
            addCriterion("to_east_longitude between", value1, value2, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToEastLongitudeNotBetween(String value1, String value2) {
            addCriterion("to_east_longitude not between", value1, value2, "toEastLongitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeIsNull() {
            addCriterion("to_north_latitude is null");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeIsNotNull() {
            addCriterion("to_north_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeEqualTo(String value) {
            addCriterion("to_north_latitude =", value, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeNotEqualTo(String value) {
            addCriterion("to_north_latitude <>", value, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeGreaterThan(String value) {
            addCriterion("to_north_latitude >", value, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("to_north_latitude >=", value, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeLessThan(String value) {
            addCriterion("to_north_latitude <", value, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeLessThanOrEqualTo(String value) {
            addCriterion("to_north_latitude <=", value, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeLike(String value) {
            addCriterion("to_north_latitude like", value, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeNotLike(String value) {
            addCriterion("to_north_latitude not like", value, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeIn(List<String> values) {
            addCriterion("to_north_latitude in", values, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeNotIn(List<String> values) {
            addCriterion("to_north_latitude not in", values, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeBetween(String value1, String value2) {
            addCriterion("to_north_latitude between", value1, value2, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andToNorthLatitudeNotBetween(String value1, String value2) {
            addCriterion("to_north_latitude not between", value1, value2, "toNorthLatitude");
            return (Criteria) this;
        }

        public Criteria andScaleIsNull() {
            addCriterion("scale is null");
            return (Criteria) this;
        }

        public Criteria andScaleIsNotNull() {
            addCriterion("scale is not null");
            return (Criteria) this;
        }

        public Criteria andScaleEqualTo(String value) {
            addCriterion("scale =", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotEqualTo(String value) {
            addCriterion("scale <>", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThan(String value) {
            addCriterion("scale >", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThanOrEqualTo(String value) {
            addCriterion("scale >=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThan(String value) {
            addCriterion("scale <", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThanOrEqualTo(String value) {
            addCriterion("scale <=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLike(String value) {
            addCriterion("scale like", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotLike(String value) {
            addCriterion("scale not like", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleIn(List<String> values) {
            addCriterion("scale in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotIn(List<String> values) {
            addCriterion("scale not in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleBetween(String value1, String value2) {
            addCriterion("scale between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotBetween(String value1, String value2) {
            addCriterion("scale not between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andCoordinatesIsNull() {
            addCriterion("coordinates is null");
            return (Criteria) this;
        }

        public Criteria andCoordinatesIsNotNull() {
            addCriterion("coordinates is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinatesEqualTo(String value) {
            addCriterion("coordinates =", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesNotEqualTo(String value) {
            addCriterion("coordinates <>", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesGreaterThan(String value) {
            addCriterion("coordinates >", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesGreaterThanOrEqualTo(String value) {
            addCriterion("coordinates >=", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesLessThan(String value) {
            addCriterion("coordinates <", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesLessThanOrEqualTo(String value) {
            addCriterion("coordinates <=", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesLike(String value) {
            addCriterion("coordinates like", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesNotLike(String value) {
            addCriterion("coordinates not like", value, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesIn(List<String> values) {
            addCriterion("coordinates in", values, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesNotIn(List<String> values) {
            addCriterion("coordinates not in", values, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesBetween(String value1, String value2) {
            addCriterion("coordinates between", value1, value2, "coordinates");
            return (Criteria) this;
        }

        public Criteria andCoordinatesNotBetween(String value1, String value2) {
            addCriterion("coordinates not between", value1, value2, "coordinates");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodIsNull() {
            addCriterion("measuring_method is null");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodIsNotNull() {
            addCriterion("measuring_method is not null");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodEqualTo(String value) {
            addCriterion("measuring_method =", value, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodNotEqualTo(String value) {
            addCriterion("measuring_method <>", value, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodGreaterThan(String value) {
            addCriterion("measuring_method >", value, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodGreaterThanOrEqualTo(String value) {
            addCriterion("measuring_method >=", value, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodLessThan(String value) {
            addCriterion("measuring_method <", value, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodLessThanOrEqualTo(String value) {
            addCriterion("measuring_method <=", value, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodLike(String value) {
            addCriterion("measuring_method like", value, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodNotLike(String value) {
            addCriterion("measuring_method not like", value, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodIn(List<String> values) {
            addCriterion("measuring_method in", values, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodNotIn(List<String> values) {
            addCriterion("measuring_method not in", values, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodBetween(String value1, String value2) {
            addCriterion("measuring_method between", value1, value2, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andMeasuringMethodNotBetween(String value1, String value2) {
            addCriterion("measuring_method not between", value1, value2, "measuringMethod");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIsNull() {
            addCriterion("secret_level is null");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIsNotNull() {
            addCriterion("secret_level is not null");
            return (Criteria) this;
        }

        public Criteria andSecretLevelEqualTo(String value) {
            addCriterion("secret_level =", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotEqualTo(String value) {
            addCriterion("secret_level <>", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelGreaterThan(String value) {
            addCriterion("secret_level >", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelGreaterThanOrEqualTo(String value) {
            addCriterion("secret_level >=", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLessThan(String value) {
            addCriterion("secret_level <", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLessThanOrEqualTo(String value) {
            addCriterion("secret_level <=", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLike(String value) {
            addCriterion("secret_level like", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotLike(String value) {
            addCriterion("secret_level not like", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIn(List<String> values) {
            addCriterion("secret_level in", values, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotIn(List<String> values) {
            addCriterion("secret_level not in", values, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelBetween(String value1, String value2) {
            addCriterion("secret_level between", value1, value2, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotBetween(String value1, String value2) {
            addCriterion("secret_level not between", value1, value2, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeIsNull() {
            addCriterion("place_type is null");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeIsNotNull() {
            addCriterion("place_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeEqualTo(String value) {
            addCriterion("place_type =", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeNotEqualTo(String value) {
            addCriterion("place_type <>", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeGreaterThan(String value) {
            addCriterion("place_type >", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("place_type >=", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeLessThan(String value) {
            addCriterion("place_type <", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeLessThanOrEqualTo(String value) {
            addCriterion("place_type <=", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeLike(String value) {
            addCriterion("place_type like", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeNotLike(String value) {
            addCriterion("place_type not like", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeIn(List<String> values) {
            addCriterion("place_type in", values, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeNotIn(List<String> values) {
            addCriterion("place_type not in", values, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeBetween(String value1, String value2) {
            addCriterion("place_type between", value1, value2, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeNotBetween(String value1, String value2) {
            addCriterion("place_type not between", value1, value2, "placeType");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNull() {
            addCriterion("registration_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIsNotNull() {
            addCriterion("registration_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeEqualTo(Date value) {
            addCriterion("registration_time =", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotEqualTo(Date value) {
            addCriterion("registration_time <>", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThan(Date value) {
            addCriterion("registration_time >", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registration_time >=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThan(Date value) {
            addCriterion("registration_time <", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeLessThanOrEqualTo(Date value) {
            addCriterion("registration_time <=", value, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeIn(List<Date> values) {
            addCriterion("registration_time in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotIn(List<Date> values) {
            addCriterion("registration_time not in", values, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeBetween(Date value1, Date value2) {
            addCriterion("registration_time between", value1, value2, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrationTimeNotBetween(Date value1, Date value2) {
            addCriterion("registration_time not between", value1, value2, "registrationTime");
            return (Criteria) this;
        }

        public Criteria andRegistrantIsNull() {
            addCriterion("registrant is null");
            return (Criteria) this;
        }

        public Criteria andRegistrantIsNotNull() {
            addCriterion("registrant is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrantEqualTo(String value) {
            addCriterion("registrant =", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotEqualTo(String value) {
            addCriterion("registrant <>", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantGreaterThan(String value) {
            addCriterion("registrant >", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantGreaterThanOrEqualTo(String value) {
            addCriterion("registrant >=", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantLessThan(String value) {
            addCriterion("registrant <", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantLessThanOrEqualTo(String value) {
            addCriterion("registrant <=", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantLike(String value) {
            addCriterion("registrant like", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotLike(String value) {
            addCriterion("registrant not like", value, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantIn(List<String> values) {
            addCriterion("registrant in", values, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotIn(List<String> values) {
            addCriterion("registrant not in", values, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantBetween(String value1, String value2) {
            addCriterion("registrant between", value1, value2, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantNotBetween(String value1, String value2) {
            addCriterion("registrant not between", value1, value2, "registrant");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitIsNull() {
            addCriterion("registrant_unit is null");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitIsNotNull() {
            addCriterion("registrant_unit is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitEqualTo(String value) {
            addCriterion("registrant_unit =", value, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitNotEqualTo(String value) {
            addCriterion("registrant_unit <>", value, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitGreaterThan(String value) {
            addCriterion("registrant_unit >", value, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitGreaterThanOrEqualTo(String value) {
            addCriterion("registrant_unit >=", value, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitLessThan(String value) {
            addCriterion("registrant_unit <", value, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitLessThanOrEqualTo(String value) {
            addCriterion("registrant_unit <=", value, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitLike(String value) {
            addCriterion("registrant_unit like", value, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitNotLike(String value) {
            addCriterion("registrant_unit not like", value, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitIn(List<String> values) {
            addCriterion("registrant_unit in", values, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitNotIn(List<String> values) {
            addCriterion("registrant_unit not in", values, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitBetween(String value1, String value2) {
            addCriterion("registrant_unit between", value1, value2, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andRegistrantUnitNotBetween(String value1, String value2) {
            addCriterion("registrant_unit not between", value1, value2, "registrantUnit");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundIsNull() {
            addCriterion("place_original_sound is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundIsNotNull() {
            addCriterion("place_original_sound is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundEqualTo(String value) {
            addCriterion("place_original_sound =", value, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundNotEqualTo(String value) {
            addCriterion("place_original_sound <>", value, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundGreaterThan(String value) {
            addCriterion("place_original_sound >", value, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundGreaterThanOrEqualTo(String value) {
            addCriterion("place_original_sound >=", value, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundLessThan(String value) {
            addCriterion("place_original_sound <", value, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundLessThanOrEqualTo(String value) {
            addCriterion("place_original_sound <=", value, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundLike(String value) {
            addCriterion("place_original_sound like", value, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundNotLike(String value) {
            addCriterion("place_original_sound not like", value, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundIn(List<String> values) {
            addCriterion("place_original_sound in", values, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundNotIn(List<String> values) {
            addCriterion("place_original_sound not in", values, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundBetween(String value1, String value2) {
            addCriterion("place_original_sound between", value1, value2, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginalSoundNotBetween(String value1, String value2) {
            addCriterion("place_original_sound not between", value1, value2, "placeOriginalSound");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageIsNull() {
            addCriterion("place_language is null");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageIsNotNull() {
            addCriterion("place_language is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageEqualTo(String value) {
            addCriterion("place_language =", value, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageNotEqualTo(String value) {
            addCriterion("place_language <>", value, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageGreaterThan(String value) {
            addCriterion("place_language >", value, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("place_language >=", value, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageLessThan(String value) {
            addCriterion("place_language <", value, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageLessThanOrEqualTo(String value) {
            addCriterion("place_language <=", value, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageLike(String value) {
            addCriterion("place_language like", value, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageNotLike(String value) {
            addCriterion("place_language not like", value, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageIn(List<String> values) {
            addCriterion("place_language in", values, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageNotIn(List<String> values) {
            addCriterion("place_language not in", values, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageBetween(String value1, String value2) {
            addCriterion("place_language between", value1, value2, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andPlaceLanguageNotBetween(String value1, String value2) {
            addCriterion("place_language not between", value1, value2, "placeLanguage");
            return (Criteria) this;
        }

        public Criteria andFigureNoIsNull() {
            addCriterion("figure_no is null");
            return (Criteria) this;
        }

        public Criteria andFigureNoIsNotNull() {
            addCriterion("figure_no is not null");
            return (Criteria) this;
        }

        public Criteria andFigureNoEqualTo(String value) {
            addCriterion("figure_no =", value, "figureNo");
            return (Criteria) this;
        }

        public Criteria andFigureNoNotEqualTo(String value) {
            addCriterion("figure_no <>", value, "figureNo");
            return (Criteria) this;
        }

        public Criteria andFigureNoGreaterThan(String value) {
            addCriterion("figure_no >", value, "figureNo");
            return (Criteria) this;
        }

        public Criteria andFigureNoGreaterThanOrEqualTo(String value) {
            addCriterion("figure_no >=", value, "figureNo");
            return (Criteria) this;
        }

        public Criteria andFigureNoLessThan(String value) {
            addCriterion("figure_no <", value, "figureNo");
            return (Criteria) this;
        }

        public Criteria andFigureNoLessThanOrEqualTo(String value) {
            addCriterion("figure_no <=", value, "figureNo");
            return (Criteria) this;
        }

        public Criteria andFigureNoLike(String value) {
            addCriterion("figure_no like", value, "figureNo");
            return (Criteria) this;
        }

        public Criteria andFigureNoNotLike(String value) {
            addCriterion("figure_no not like", value, "figureNo");
            return (Criteria) this;
        }

        public Criteria andFigureNoIn(List<String> values) {
            addCriterion("figure_no in", values, "figureNo");
            return (Criteria) this;
        }

        public Criteria andFigureNoNotIn(List<String> values) {
            addCriterion("figure_no not in", values, "figureNo");
            return (Criteria) this;
        }

        public Criteria andFigureNoBetween(String value1, String value2) {
            addCriterion("figure_no between", value1, value2, "figureNo");
            return (Criteria) this;
        }

        public Criteria andFigureNoNotBetween(String value1, String value2) {
            addCriterion("figure_no not between", value1, value2, "figureNo");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearIsNull() {
            addCriterion("establishment_year is null");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearIsNotNull() {
            addCriterion("establishment_year is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearEqualTo(String value) {
            addCriterion("establishment_year =", value, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearNotEqualTo(String value) {
            addCriterion("establishment_year <>", value, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearGreaterThan(String value) {
            addCriterion("establishment_year >", value, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearGreaterThanOrEqualTo(String value) {
            addCriterion("establishment_year >=", value, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearLessThan(String value) {
            addCriterion("establishment_year <", value, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearLessThanOrEqualTo(String value) {
            addCriterion("establishment_year <=", value, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearLike(String value) {
            addCriterion("establishment_year like", value, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearNotLike(String value) {
            addCriterion("establishment_year not like", value, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearIn(List<String> values) {
            addCriterion("establishment_year in", values, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearNotIn(List<String> values) {
            addCriterion("establishment_year not in", values, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearBetween(String value1, String value2) {
            addCriterion("establishment_year between", value1, value2, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andEstablishmentYearNotBetween(String value1, String value2) {
            addCriterion("establishment_year not between", value1, value2, "establishmentYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearIsNull() {
            addCriterion("abolish_year is null");
            return (Criteria) this;
        }

        public Criteria andAbolishYearIsNotNull() {
            addCriterion("abolish_year is not null");
            return (Criteria) this;
        }

        public Criteria andAbolishYearEqualTo(String value) {
            addCriterion("abolish_year =", value, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearNotEqualTo(String value) {
            addCriterion("abolish_year <>", value, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearGreaterThan(String value) {
            addCriterion("abolish_year >", value, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearGreaterThanOrEqualTo(String value) {
            addCriterion("abolish_year >=", value, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearLessThan(String value) {
            addCriterion("abolish_year <", value, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearLessThanOrEqualTo(String value) {
            addCriterion("abolish_year <=", value, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearLike(String value) {
            addCriterion("abolish_year like", value, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearNotLike(String value) {
            addCriterion("abolish_year not like", value, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearIn(List<String> values) {
            addCriterion("abolish_year in", values, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearNotIn(List<String> values) {
            addCriterion("abolish_year not in", values, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearBetween(String value1, String value2) {
            addCriterion("abolish_year between", value1, value2, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andAbolishYearNotBetween(String value1, String value2) {
            addCriterion("abolish_year not between", value1, value2, "abolishYear");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingIsNull() {
            addCriterion("rome_spelling is null");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingIsNotNull() {
            addCriterion("rome_spelling is not null");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingEqualTo(String value) {
            addCriterion("rome_spelling =", value, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingNotEqualTo(String value) {
            addCriterion("rome_spelling <>", value, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingGreaterThan(String value) {
            addCriterion("rome_spelling >", value, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingGreaterThanOrEqualTo(String value) {
            addCriterion("rome_spelling >=", value, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingLessThan(String value) {
            addCriterion("rome_spelling <", value, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingLessThanOrEqualTo(String value) {
            addCriterion("rome_spelling <=", value, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingLike(String value) {
            addCriterion("rome_spelling like", value, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingNotLike(String value) {
            addCriterion("rome_spelling not like", value, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingIn(List<String> values) {
            addCriterion("rome_spelling in", values, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingNotIn(List<String> values) {
            addCriterion("rome_spelling not in", values, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingBetween(String value1, String value2) {
            addCriterion("rome_spelling between", value1, value2, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andRomeSpellingNotBetween(String value1, String value2) {
            addCriterion("rome_spelling not between", value1, value2, "romeSpelling");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusIsNull() {
            addCriterion("placement_census_status is null");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusIsNotNull() {
            addCriterion("placement_census_status is not null");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusEqualTo(String value) {
            addCriterion("placement_census_status =", value, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusNotEqualTo(String value) {
            addCriterion("placement_census_status <>", value, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusGreaterThan(String value) {
            addCriterion("placement_census_status >", value, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusGreaterThanOrEqualTo(String value) {
            addCriterion("placement_census_status >=", value, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusLessThan(String value) {
            addCriterion("placement_census_status <", value, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusLessThanOrEqualTo(String value) {
            addCriterion("placement_census_status <=", value, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusLike(String value) {
            addCriterion("placement_census_status like", value, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusNotLike(String value) {
            addCriterion("placement_census_status not like", value, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusIn(List<String> values) {
            addCriterion("placement_census_status in", values, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusNotIn(List<String> values) {
            addCriterion("placement_census_status not in", values, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusBetween(String value1, String value2) {
            addCriterion("placement_census_status between", value1, value2, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andPlacementCensusStatusNotBetween(String value1, String value2) {
            addCriterion("placement_census_status not between", value1, value2, "placementCensusStatus");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingIsNull() {
            addCriterion("chinese_character_writing is null");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingIsNotNull() {
            addCriterion("chinese_character_writing is not null");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingEqualTo(String value) {
            addCriterion("chinese_character_writing =", value, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingNotEqualTo(String value) {
            addCriterion("chinese_character_writing <>", value, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingGreaterThan(String value) {
            addCriterion("chinese_character_writing >", value, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingGreaterThanOrEqualTo(String value) {
            addCriterion("chinese_character_writing >=", value, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingLessThan(String value) {
            addCriterion("chinese_character_writing <", value, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingLessThanOrEqualTo(String value) {
            addCriterion("chinese_character_writing <=", value, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingLike(String value) {
            addCriterion("chinese_character_writing like", value, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingNotLike(String value) {
            addCriterion("chinese_character_writing not like", value, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingIn(List<String> values) {
            addCriterion("chinese_character_writing in", values, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingNotIn(List<String> values) {
            addCriterion("chinese_character_writing not in", values, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingBetween(String value1, String value2) {
            addCriterion("chinese_character_writing between", value1, value2, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andChineseCharacterWritingNotBetween(String value1, String value2) {
            addCriterion("chinese_character_writing not between", value1, value2, "chineseCharacterWriting");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationIsNull() {
            addCriterion("mandarin_chinese_pronunciation is null");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationIsNotNull() {
            addCriterion("mandarin_chinese_pronunciation is not null");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationEqualTo(String value) {
            addCriterion("mandarin_chinese_pronunciation =", value, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationNotEqualTo(String value) {
            addCriterion("mandarin_chinese_pronunciation <>", value, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationGreaterThan(String value) {
            addCriterion("mandarin_chinese_pronunciation >", value, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationGreaterThanOrEqualTo(String value) {
            addCriterion("mandarin_chinese_pronunciation >=", value, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationLessThan(String value) {
            addCriterion("mandarin_chinese_pronunciation <", value, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationLessThanOrEqualTo(String value) {
            addCriterion("mandarin_chinese_pronunciation <=", value, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationLike(String value) {
            addCriterion("mandarin_chinese_pronunciation like", value, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationNotLike(String value) {
            addCriterion("mandarin_chinese_pronunciation not like", value, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationIn(List<String> values) {
            addCriterion("mandarin_chinese_pronunciation in", values, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationNotIn(List<String> values) {
            addCriterion("mandarin_chinese_pronunciation not in", values, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationBetween(String value1, String value2) {
            addCriterion("mandarin_chinese_pronunciation between", value1, value2, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andMandarinChinesePronunciationNotBetween(String value1, String value2) {
            addCriterion("mandarin_chinese_pronunciation not between", value1, value2, "mandarinChinesePronunciation");
            return (Criteria) this;
        }

        public Criteria andDataSourcesIsNull() {
            addCriterion("data_sources is null");
            return (Criteria) this;
        }

        public Criteria andDataSourcesIsNotNull() {
            addCriterion("data_sources is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourcesEqualTo(String value) {
            addCriterion("data_sources =", value, "dataSources");
            return (Criteria) this;
        }

        public Criteria andDataSourcesNotEqualTo(String value) {
            addCriterion("data_sources <>", value, "dataSources");
            return (Criteria) this;
        }

        public Criteria andDataSourcesGreaterThan(String value) {
            addCriterion("data_sources >", value, "dataSources");
            return (Criteria) this;
        }

        public Criteria andDataSourcesGreaterThanOrEqualTo(String value) {
            addCriterion("data_sources >=", value, "dataSources");
            return (Criteria) this;
        }

        public Criteria andDataSourcesLessThan(String value) {
            addCriterion("data_sources <", value, "dataSources");
            return (Criteria) this;
        }

        public Criteria andDataSourcesLessThanOrEqualTo(String value) {
            addCriterion("data_sources <=", value, "dataSources");
            return (Criteria) this;
        }

        public Criteria andDataSourcesLike(String value) {
            addCriterion("data_sources like", value, "dataSources");
            return (Criteria) this;
        }

        public Criteria andDataSourcesNotLike(String value) {
            addCriterion("data_sources not like", value, "dataSources");
            return (Criteria) this;
        }

        public Criteria andDataSourcesIn(List<String> values) {
            addCriterion("data_sources in", values, "dataSources");
            return (Criteria) this;
        }

        public Criteria andDataSourcesNotIn(List<String> values) {
            addCriterion("data_sources not in", values, "dataSources");
            return (Criteria) this;
        }

        public Criteria andDataSourcesBetween(String value1, String value2) {
            addCriterion("data_sources between", value1, value2, "dataSources");
            return (Criteria) this;
        }

        public Criteria andDataSourcesNotBetween(String value1, String value2) {
            addCriterion("data_sources not between", value1, value2, "dataSources");
            return (Criteria) this;
        }

        public Criteria andFormerNameIsNull() {
            addCriterion("former_name is null");
            return (Criteria) this;
        }

        public Criteria andFormerNameIsNotNull() {
            addCriterion("former_name is not null");
            return (Criteria) this;
        }

        public Criteria andFormerNameEqualTo(String value) {
            addCriterion("former_name =", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotEqualTo(String value) {
            addCriterion("former_name <>", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameGreaterThan(String value) {
            addCriterion("former_name >", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameGreaterThanOrEqualTo(String value) {
            addCriterion("former_name >=", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLessThan(String value) {
            addCriterion("former_name <", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLessThanOrEqualTo(String value) {
            addCriterion("former_name <=", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLike(String value) {
            addCriterion("former_name like", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotLike(String value) {
            addCriterion("former_name not like", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameIn(List<String> values) {
            addCriterion("former_name in", values, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotIn(List<String> values) {
            addCriterion("former_name not in", values, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameBetween(String value1, String value2) {
            addCriterion("former_name between", value1, value2, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotBetween(String value1, String value2) {
            addCriterion("former_name not between", value1, value2, "formerName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdIsNull() {
            addCriterion("cn_administrative_area_id is null");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdIsNotNull() {
            addCriterion("cn_administrative_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdEqualTo(String value) {
            addCriterion("cn_administrative_area_id =", value, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdNotEqualTo(String value) {
            addCriterion("cn_administrative_area_id <>", value, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdGreaterThan(String value) {
            addCriterion("cn_administrative_area_id >", value, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_administrative_area_id >=", value, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdLessThan(String value) {
            addCriterion("cn_administrative_area_id <", value, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdLessThanOrEqualTo(String value) {
            addCriterion("cn_administrative_area_id <=", value, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdLike(String value) {
            addCriterion("cn_administrative_area_id like", value, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdNotLike(String value) {
            addCriterion("cn_administrative_area_id not like", value, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdIn(List<String> values) {
            addCriterion("cn_administrative_area_id in", values, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdNotIn(List<String> values) {
            addCriterion("cn_administrative_area_id not in", values, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdBetween(String value1, String value2) {
            addCriterion("cn_administrative_area_id between", value1, value2, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andCnAdministrativeAreaIdNotBetween(String value1, String value2) {
            addCriterion("cn_administrative_area_id not between", value1, value2, "cnAdministrativeAreaId");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeIsNull() {
            addCriterion("declare_time is null");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeIsNotNull() {
            addCriterion("declare_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeEqualTo(Date value) {
            addCriterion("declare_time =", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeNotEqualTo(Date value) {
            addCriterion("declare_time <>", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeGreaterThan(Date value) {
            addCriterion("declare_time >", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("declare_time >=", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeLessThan(Date value) {
            addCriterion("declare_time <", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeLessThanOrEqualTo(Date value) {
            addCriterion("declare_time <=", value, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeIn(List<Date> values) {
            addCriterion("declare_time in", values, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeNotIn(List<Date> values) {
            addCriterion("declare_time not in", values, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeBetween(Date value1, Date value2) {
            addCriterion("declare_time between", value1, value2, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareTimeNotBetween(Date value1, Date value2) {
            addCriterion("declare_time not between", value1, value2, "declareTime");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitIsNull() {
            addCriterion("declare_unit is null");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitIsNotNull() {
            addCriterion("declare_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitEqualTo(String value) {
            addCriterion("declare_unit =", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitNotEqualTo(String value) {
            addCriterion("declare_unit <>", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitGreaterThan(String value) {
            addCriterion("declare_unit >", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitGreaterThanOrEqualTo(String value) {
            addCriterion("declare_unit >=", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitLessThan(String value) {
            addCriterion("declare_unit <", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitLessThanOrEqualTo(String value) {
            addCriterion("declare_unit <=", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitLike(String value) {
            addCriterion("declare_unit like", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitNotLike(String value) {
            addCriterion("declare_unit not like", value, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitIn(List<String> values) {
            addCriterion("declare_unit in", values, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitNotIn(List<String> values) {
            addCriterion("declare_unit not in", values, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitBetween(String value1, String value2) {
            addCriterion("declare_unit between", value1, value2, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitNotBetween(String value1, String value2) {
            addCriterion("declare_unit not between", value1, value2, "declareUnit");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressIsNull() {
            addCriterion("declare_unit_address is null");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressIsNotNull() {
            addCriterion("declare_unit_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressEqualTo(String value) {
            addCriterion("declare_unit_address =", value, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressNotEqualTo(String value) {
            addCriterion("declare_unit_address <>", value, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressGreaterThan(String value) {
            addCriterion("declare_unit_address >", value, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressGreaterThanOrEqualTo(String value) {
            addCriterion("declare_unit_address >=", value, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressLessThan(String value) {
            addCriterion("declare_unit_address <", value, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressLessThanOrEqualTo(String value) {
            addCriterion("declare_unit_address <=", value, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressLike(String value) {
            addCriterion("declare_unit_address like", value, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressNotLike(String value) {
            addCriterion("declare_unit_address not like", value, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressIn(List<String> values) {
            addCriterion("declare_unit_address in", values, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressNotIn(List<String> values) {
            addCriterion("declare_unit_address not in", values, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressBetween(String value1, String value2) {
            addCriterion("declare_unit_address between", value1, value2, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareUnitAddressNotBetween(String value1, String value2) {
            addCriterion("declare_unit_address not between", value1, value2, "declareUnitAddress");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusIsNull() {
            addCriterion("declare_status is null");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusIsNotNull() {
            addCriterion("declare_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusEqualTo(String value) {
            addCriterion("declare_status =", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusNotEqualTo(String value) {
            addCriterion("declare_status <>", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusGreaterThan(String value) {
            addCriterion("declare_status >", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusGreaterThanOrEqualTo(String value) {
            addCriterion("declare_status >=", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusLessThan(String value) {
            addCriterion("declare_status <", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusLessThanOrEqualTo(String value) {
            addCriterion("declare_status <=", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusLike(String value) {
            addCriterion("declare_status like", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusNotLike(String value) {
            addCriterion("declare_status not like", value, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusIn(List<String> values) {
            addCriterion("declare_status in", values, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusNotIn(List<String> values) {
            addCriterion("declare_status not in", values, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusBetween(String value1, String value2) {
            addCriterion("declare_status between", value1, value2, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclareStatusNotBetween(String value1, String value2) {
            addCriterion("declare_status not between", value1, value2, "declareStatus");
            return (Criteria) this;
        }

        public Criteria andDeclarerIsNull() {
            addCriterion("declarer is null");
            return (Criteria) this;
        }

        public Criteria andDeclarerIsNotNull() {
            addCriterion("declarer is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarerEqualTo(String value) {
            addCriterion("declarer =", value, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclarerNotEqualTo(String value) {
            addCriterion("declarer <>", value, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclarerGreaterThan(String value) {
            addCriterion("declarer >", value, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclarerGreaterThanOrEqualTo(String value) {
            addCriterion("declarer >=", value, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclarerLessThan(String value) {
            addCriterion("declarer <", value, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclarerLessThanOrEqualTo(String value) {
            addCriterion("declarer <=", value, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclarerLike(String value) {
            addCriterion("declarer like", value, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclarerNotLike(String value) {
            addCriterion("declarer not like", value, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclarerIn(List<String> values) {
            addCriterion("declarer in", values, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclarerNotIn(List<String> values) {
            addCriterion("declarer not in", values, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclarerBetween(String value1, String value2) {
            addCriterion("declarer between", value1, value2, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclarerNotBetween(String value1, String value2) {
            addCriterion("declarer not between", value1, value2, "declarer");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeIsNull() {
            addCriterion("declare_type is null");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeIsNotNull() {
            addCriterion("declare_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeEqualTo(String value) {
            addCriterion("declare_type =", value, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeNotEqualTo(String value) {
            addCriterion("declare_type <>", value, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeGreaterThan(String value) {
            addCriterion("declare_type >", value, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeGreaterThanOrEqualTo(String value) {
            addCriterion("declare_type >=", value, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeLessThan(String value) {
            addCriterion("declare_type <", value, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeLessThanOrEqualTo(String value) {
            addCriterion("declare_type <=", value, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeLike(String value) {
            addCriterion("declare_type like", value, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeNotLike(String value) {
            addCriterion("declare_type not like", value, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeIn(List<String> values) {
            addCriterion("declare_type in", values, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeNotIn(List<String> values) {
            addCriterion("declare_type not in", values, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeBetween(String value1, String value2) {
            addCriterion("declare_type between", value1, value2, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclareTypeNotBetween(String value1, String value2) {
            addCriterion("declare_type not between", value1, value2, "declareType");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneIsNull() {
            addCriterion("declarer_phone is null");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneIsNotNull() {
            addCriterion("declarer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneEqualTo(String value) {
            addCriterion("declarer_phone =", value, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneNotEqualTo(String value) {
            addCriterion("declarer_phone <>", value, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneGreaterThan(String value) {
            addCriterion("declarer_phone >", value, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("declarer_phone >=", value, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneLessThan(String value) {
            addCriterion("declarer_phone <", value, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneLessThanOrEqualTo(String value) {
            addCriterion("declarer_phone <=", value, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneLike(String value) {
            addCriterion("declarer_phone like", value, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneNotLike(String value) {
            addCriterion("declarer_phone not like", value, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneIn(List<String> values) {
            addCriterion("declarer_phone in", values, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneNotIn(List<String> values) {
            addCriterion("declarer_phone not in", values, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneBetween(String value1, String value2) {
            addCriterion("declarer_phone between", value1, value2, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarerPhoneNotBetween(String value1, String value2) {
            addCriterion("declarer_phone not between", value1, value2, "declarerPhone");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeIsNull() {
            addCriterion("declare_postcode is null");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeIsNotNull() {
            addCriterion("declare_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeEqualTo(String value) {
            addCriterion("declare_postcode =", value, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeNotEqualTo(String value) {
            addCriterion("declare_postcode <>", value, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeGreaterThan(String value) {
            addCriterion("declare_postcode >", value, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("declare_postcode >=", value, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeLessThan(String value) {
            addCriterion("declare_postcode <", value, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeLessThanOrEqualTo(String value) {
            addCriterion("declare_postcode <=", value, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeLike(String value) {
            addCriterion("declare_postcode like", value, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeNotLike(String value) {
            addCriterion("declare_postcode not like", value, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeIn(List<String> values) {
            addCriterion("declare_postcode in", values, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeNotIn(List<String> values) {
            addCriterion("declare_postcode not in", values, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeBetween(String value1, String value2) {
            addCriterion("declare_postcode between", value1, value2, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andDeclarePostcodeNotBetween(String value1, String value2) {
            addCriterion("declare_postcode not between", value1, value2, "declarePostcode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("process_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("process_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdEqualTo(Integer value) {
            addCriterion("process_instance_id =", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotEqualTo(Integer value) {
            addCriterion("process_instance_id <>", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThan(Integer value) {
            addCriterion("process_instance_id >", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_instance_id >=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThan(Integer value) {
            addCriterion("process_instance_id <", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("process_instance_id <=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIn(List<Integer> values) {
            addCriterion("process_instance_id in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotIn(List<Integer> values) {
            addCriterion("process_instance_id not in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdBetween(Integer value1, Integer value2) {
            addCriterion("process_instance_id between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("process_instance_id not between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andGeometryIsNull() {
            addCriterion("geometry is null");
            return (Criteria) this;
        }

        public Criteria andGeometryIsNotNull() {
            addCriterion("geometry is not null");
            return (Criteria) this;
        }

        public Criteria andGeometryEqualTo(String value) {
            addCriterion("geometry =", value, "geometry");
            return (Criteria) this;
        }

        public Criteria andGeometryNotEqualTo(String value) {
            addCriterion("geometry <>", value, "geometry");
            return (Criteria) this;
        }

        public Criteria andGeometryGreaterThan(String value) {
            addCriterion("geometry >", value, "geometry");
            return (Criteria) this;
        }

        public Criteria andGeometryGreaterThanOrEqualTo(String value) {
            addCriterion("geometry >=", value, "geometry");
            return (Criteria) this;
        }

        public Criteria andGeometryLessThan(String value) {
            addCriterion("geometry <", value, "geometry");
            return (Criteria) this;
        }

        public Criteria andGeometryLessThanOrEqualTo(String value) {
            addCriterion("geometry <=", value, "geometry");
            return (Criteria) this;
        }

        public Criteria andGeometryLike(String value) {
            addCriterion("geometry like", value, "geometry");
            return (Criteria) this;
        }

        public Criteria andGeometryNotLike(String value) {
            addCriterion("geometry not like", value, "geometry");
            return (Criteria) this;
        }

        public Criteria andGeometryIn(List<String> values) {
            addCriterion("geometry in", values, "geometry");
            return (Criteria) this;
        }

        public Criteria andGeometryNotIn(List<String> values) {
            addCriterion("geometry not in", values, "geometry");
            return (Criteria) this;
        }

        public Criteria andGeometryBetween(String value1, String value2) {
            addCriterion("geometry between", value1, value2, "geometry");
            return (Criteria) this;
        }

        public Criteria andGeometryNotBetween(String value1, String value2) {
            addCriterion("geometry not between", value1, value2, "geometry");
            return (Criteria) this;
        }

        public Criteria andRegistranterIsNull() {
            addCriterion("registranter is null");
            return (Criteria) this;
        }

        public Criteria andRegistranterIsNotNull() {
            addCriterion("registranter is not null");
            return (Criteria) this;
        }

        public Criteria andRegistranterEqualTo(String value) {
            addCriterion("registranter =", value, "registranter");
            return (Criteria) this;
        }

        public Criteria andRegistranterNotEqualTo(String value) {
            addCriterion("registranter <>", value, "registranter");
            return (Criteria) this;
        }

        public Criteria andRegistranterGreaterThan(String value) {
            addCriterion("registranter >", value, "registranter");
            return (Criteria) this;
        }

        public Criteria andRegistranterGreaterThanOrEqualTo(String value) {
            addCriterion("registranter >=", value, "registranter");
            return (Criteria) this;
        }

        public Criteria andRegistranterLessThan(String value) {
            addCriterion("registranter <", value, "registranter");
            return (Criteria) this;
        }

        public Criteria andRegistranterLessThanOrEqualTo(String value) {
            addCriterion("registranter <=", value, "registranter");
            return (Criteria) this;
        }

        public Criteria andRegistranterLike(String value) {
            addCriterion("registranter like", value, "registranter");
            return (Criteria) this;
        }

        public Criteria andRegistranterNotLike(String value) {
            addCriterion("registranter not like", value, "registranter");
            return (Criteria) this;
        }

        public Criteria andRegistranterIn(List<String> values) {
            addCriterion("registranter in", values, "registranter");
            return (Criteria) this;
        }

        public Criteria andRegistranterNotIn(List<String> values) {
            addCriterion("registranter not in", values, "registranter");
            return (Criteria) this;
        }

        public Criteria andRegistranterBetween(String value1, String value2) {
            addCriterion("registranter between", value1, value2, "registranter");
            return (Criteria) this;
        }

        public Criteria andRegistranterNotBetween(String value1, String value2) {
            addCriterion("registranter not between", value1, value2, "registranter");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameIsNull() {
            addCriterion("administrative_area_name is null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameIsNotNull() {
            addCriterion("administrative_area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameEqualTo(String value) {
            addCriterion("administrative_area_name =", value, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameNotEqualTo(String value) {
            addCriterion("administrative_area_name <>", value, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameGreaterThan(String value) {
            addCriterion("administrative_area_name >", value, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("administrative_area_name >=", value, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameLessThan(String value) {
            addCriterion("administrative_area_name <", value, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameLessThanOrEqualTo(String value) {
            addCriterion("administrative_area_name <=", value, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameLike(String value) {
            addCriterion("administrative_area_name like", value, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameNotLike(String value) {
            addCriterion("administrative_area_name not like", value, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameIn(List<String> values) {
            addCriterion("administrative_area_name in", values, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameNotIn(List<String> values) {
            addCriterion("administrative_area_name not in", values, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameBetween(String value1, String value2) {
            addCriterion("administrative_area_name between", value1, value2, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andAdministrativeAreaNameNotBetween(String value1, String value2) {
            addCriterion("administrative_area_name not between", value1, value2, "administrativeAreaName");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(Integer value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(Integer value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(Integer value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(Integer value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(Integer value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<Integer> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<Integer> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(Integer value1, Integer value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeIsNull() {
            addCriterion("place_type_code is null");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeIsNotNull() {
            addCriterion("place_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeEqualTo(String value) {
            addCriterion("place_type_code =", value, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeNotEqualTo(String value) {
            addCriterion("place_type_code <>", value, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeGreaterThan(String value) {
            addCriterion("place_type_code >", value, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("place_type_code >=", value, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeLessThan(String value) {
            addCriterion("place_type_code <", value, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("place_type_code <=", value, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeLike(String value) {
            addCriterion("place_type_code like", value, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeNotLike(String value) {
            addCriterion("place_type_code not like", value, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeIn(List<String> values) {
            addCriterion("place_type_code in", values, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeNotIn(List<String> values) {
            addCriterion("place_type_code not in", values, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeBetween(String value1, String value2) {
            addCriterion("place_type_code between", value1, value2, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeCodeNotBetween(String value1, String value2) {
            addCriterion("place_type_code not between", value1, value2, "placeTypeCode");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNull() {
            addCriterion("pinyin is null");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNotNull() {
            addCriterion("pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinEqualTo(String value) {
            addCriterion("pinyin =", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotEqualTo(String value) {
            addCriterion("pinyin <>", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThan(String value) {
            addCriterion("pinyin >", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("pinyin >=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThan(String value) {
            addCriterion("pinyin <", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThanOrEqualTo(String value) {
            addCriterion("pinyin <=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLike(String value) {
            addCriterion("pinyin like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotLike(String value) {
            addCriterion("pinyin not like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinIn(List<String> values) {
            addCriterion("pinyin in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotIn(List<String> values) {
            addCriterion("pinyin not in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinBetween(String value1, String value2) {
            addCriterion("pinyin between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotBetween(String value1, String value2) {
            addCriterion("pinyin not between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationIsNull() {
            addCriterion("attachment_information is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationIsNotNull() {
            addCriterion("attachment_information is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationEqualTo(String value) {
            addCriterion("attachment_information =", value, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationNotEqualTo(String value) {
            addCriterion("attachment_information <>", value, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationGreaterThan(String value) {
            addCriterion("attachment_information >", value, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_information >=", value, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationLessThan(String value) {
            addCriterion("attachment_information <", value, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationLessThanOrEqualTo(String value) {
            addCriterion("attachment_information <=", value, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationLike(String value) {
            addCriterion("attachment_information like", value, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationNotLike(String value) {
            addCriterion("attachment_information not like", value, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationIn(List<String> values) {
            addCriterion("attachment_information in", values, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationNotIn(List<String> values) {
            addCriterion("attachment_information not in", values, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationBetween(String value1, String value2) {
            addCriterion("attachment_information between", value1, value2, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andAttachmentInformationNotBetween(String value1, String value2) {
            addCriterion("attachment_information not between", value1, value2, "attachmentInformation");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("file_url is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("file_url is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("file_url =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("file_url <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("file_url >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("file_url >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("file_url <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("file_url <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("file_url like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("file_url not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("file_url in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("file_url not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("file_url between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("file_url not between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andLonIsNull() {
            addCriterion("lon is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("lon is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(String value) {
            addCriterion("lon =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(String value) {
            addCriterion("lon <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(String value) {
            addCriterion("lon >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(String value) {
            addCriterion("lon >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(String value) {
            addCriterion("lon <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(String value) {
            addCriterion("lon <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLike(String value) {
            addCriterion("lon like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotLike(String value) {
            addCriterion("lon not like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<String> values) {
            addCriterion("lon in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<String> values) {
            addCriterion("lon not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(String value1, String value2) {
            addCriterion("lon between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(String value1, String value2) {
            addCriterion("lon not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andToLonIsNull() {
            addCriterion("to_lon is null");
            return (Criteria) this;
        }

        public Criteria andToLonIsNotNull() {
            addCriterion("to_lon is not null");
            return (Criteria) this;
        }

        public Criteria andToLonEqualTo(String value) {
            addCriterion("to_lon =", value, "toLon");
            return (Criteria) this;
        }

        public Criteria andToLonNotEqualTo(String value) {
            addCriterion("to_lon <>", value, "toLon");
            return (Criteria) this;
        }

        public Criteria andToLonGreaterThan(String value) {
            addCriterion("to_lon >", value, "toLon");
            return (Criteria) this;
        }

        public Criteria andToLonGreaterThanOrEqualTo(String value) {
            addCriterion("to_lon >=", value, "toLon");
            return (Criteria) this;
        }

        public Criteria andToLonLessThan(String value) {
            addCriterion("to_lon <", value, "toLon");
            return (Criteria) this;
        }

        public Criteria andToLonLessThanOrEqualTo(String value) {
            addCriterion("to_lon <=", value, "toLon");
            return (Criteria) this;
        }

        public Criteria andToLonLike(String value) {
            addCriterion("to_lon like", value, "toLon");
            return (Criteria) this;
        }

        public Criteria andToLonNotLike(String value) {
            addCriterion("to_lon not like", value, "toLon");
            return (Criteria) this;
        }

        public Criteria andToLonIn(List<String> values) {
            addCriterion("to_lon in", values, "toLon");
            return (Criteria) this;
        }

        public Criteria andToLonNotIn(List<String> values) {
            addCriterion("to_lon not in", values, "toLon");
            return (Criteria) this;
        }

        public Criteria andToLonBetween(String value1, String value2) {
            addCriterion("to_lon between", value1, value2, "toLon");
            return (Criteria) this;
        }

        public Criteria andToLonNotBetween(String value1, String value2) {
            addCriterion("to_lon not between", value1, value2, "toLon");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andToLatIsNull() {
            addCriterion("to_lat is null");
            return (Criteria) this;
        }

        public Criteria andToLatIsNotNull() {
            addCriterion("to_lat is not null");
            return (Criteria) this;
        }

        public Criteria andToLatEqualTo(String value) {
            addCriterion("to_lat =", value, "toLat");
            return (Criteria) this;
        }

        public Criteria andToLatNotEqualTo(String value) {
            addCriterion("to_lat <>", value, "toLat");
            return (Criteria) this;
        }

        public Criteria andToLatGreaterThan(String value) {
            addCriterion("to_lat >", value, "toLat");
            return (Criteria) this;
        }

        public Criteria andToLatGreaterThanOrEqualTo(String value) {
            addCriterion("to_lat >=", value, "toLat");
            return (Criteria) this;
        }

        public Criteria andToLatLessThan(String value) {
            addCriterion("to_lat <", value, "toLat");
            return (Criteria) this;
        }

        public Criteria andToLatLessThanOrEqualTo(String value) {
            addCriterion("to_lat <=", value, "toLat");
            return (Criteria) this;
        }

        public Criteria andToLatLike(String value) {
            addCriterion("to_lat like", value, "toLat");
            return (Criteria) this;
        }

        public Criteria andToLatNotLike(String value) {
            addCriterion("to_lat not like", value, "toLat");
            return (Criteria) this;
        }

        public Criteria andToLatIn(List<String> values) {
            addCriterion("to_lat in", values, "toLat");
            return (Criteria) this;
        }

        public Criteria andToLatNotIn(List<String> values) {
            addCriterion("to_lat not in", values, "toLat");
            return (Criteria) this;
        }

        public Criteria andToLatBetween(String value1, String value2) {
            addCriterion("to_lat between", value1, value2, "toLat");
            return (Criteria) this;
        }

        public Criteria andToLatNotBetween(String value1, String value2) {
            addCriterion("to_lat not between", value1, value2, "toLat");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andOldTimeIsNull() {
            addCriterion("old_time is null");
            return (Criteria) this;
        }

        public Criteria andOldTimeIsNotNull() {
            addCriterion("old_time is not null");
            return (Criteria) this;
        }

        public Criteria andOldTimeEqualTo(Date value) {
            addCriterion("old_time =", value, "oldTime");
            return (Criteria) this;
        }

        public Criteria andOldTimeNotEqualTo(Date value) {
            addCriterion("old_time <>", value, "oldTime");
            return (Criteria) this;
        }

        public Criteria andOldTimeGreaterThan(Date value) {
            addCriterion("old_time >", value, "oldTime");
            return (Criteria) this;
        }

        public Criteria andOldTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("old_time >=", value, "oldTime");
            return (Criteria) this;
        }

        public Criteria andOldTimeLessThan(Date value) {
            addCriterion("old_time <", value, "oldTime");
            return (Criteria) this;
        }

        public Criteria andOldTimeLessThanOrEqualTo(Date value) {
            addCriterion("old_time <=", value, "oldTime");
            return (Criteria) this;
        }

        public Criteria andOldTimeIn(List<Date> values) {
            addCriterion("old_time in", values, "oldTime");
            return (Criteria) this;
        }

        public Criteria andOldTimeNotIn(List<Date> values) {
            addCriterion("old_time not in", values, "oldTime");
            return (Criteria) this;
        }

        public Criteria andOldTimeBetween(Date value1, Date value2) {
            addCriterion("old_time between", value1, value2, "oldTime");
            return (Criteria) this;
        }

        public Criteria andOldTimeNotBetween(Date value1, Date value2) {
            addCriterion("old_time not between", value1, value2, "oldTime");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameIsNull() {
            addCriterion("multimedia_name is null");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameIsNotNull() {
            addCriterion("multimedia_name is not null");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameEqualTo(String value) {
            addCriterion("multimedia_name =", value, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameNotEqualTo(String value) {
            addCriterion("multimedia_name <>", value, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameGreaterThan(String value) {
            addCriterion("multimedia_name >", value, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameGreaterThanOrEqualTo(String value) {
            addCriterion("multimedia_name >=", value, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameLessThan(String value) {
            addCriterion("multimedia_name <", value, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameLessThanOrEqualTo(String value) {
            addCriterion("multimedia_name <=", value, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameLike(String value) {
            addCriterion("multimedia_name like", value, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameNotLike(String value) {
            addCriterion("multimedia_name not like", value, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameIn(List<String> values) {
            addCriterion("multimedia_name in", values, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameNotIn(List<String> values) {
            addCriterion("multimedia_name not in", values, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameBetween(String value1, String value2) {
            addCriterion("multimedia_name between", value1, value2, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andMultimediaNameNotBetween(String value1, String value2) {
            addCriterion("multimedia_name not between", value1, value2, "multimediaName");
            return (Criteria) this;
        }

        public Criteria andSoundNameIsNull() {
            addCriterion("sound_name is null");
            return (Criteria) this;
        }

        public Criteria andSoundNameIsNotNull() {
            addCriterion("sound_name is not null");
            return (Criteria) this;
        }

        public Criteria andSoundNameEqualTo(String value) {
            addCriterion("sound_name =", value, "soundName");
            return (Criteria) this;
        }

        public Criteria andSoundNameNotEqualTo(String value) {
            addCriterion("sound_name <>", value, "soundName");
            return (Criteria) this;
        }

        public Criteria andSoundNameGreaterThan(String value) {
            addCriterion("sound_name >", value, "soundName");
            return (Criteria) this;
        }

        public Criteria andSoundNameGreaterThanOrEqualTo(String value) {
            addCriterion("sound_name >=", value, "soundName");
            return (Criteria) this;
        }

        public Criteria andSoundNameLessThan(String value) {
            addCriterion("sound_name <", value, "soundName");
            return (Criteria) this;
        }

        public Criteria andSoundNameLessThanOrEqualTo(String value) {
            addCriterion("sound_name <=", value, "soundName");
            return (Criteria) this;
        }

        public Criteria andSoundNameLike(String value) {
            addCriterion("sound_name like", value, "soundName");
            return (Criteria) this;
        }

        public Criteria andSoundNameNotLike(String value) {
            addCriterion("sound_name not like", value, "soundName");
            return (Criteria) this;
        }

        public Criteria andSoundNameIn(List<String> values) {
            addCriterion("sound_name in", values, "soundName");
            return (Criteria) this;
        }

        public Criteria andSoundNameNotIn(List<String> values) {
            addCriterion("sound_name not in", values, "soundName");
            return (Criteria) this;
        }

        public Criteria andSoundNameBetween(String value1, String value2) {
            addCriterion("sound_name between", value1, value2, "soundName");
            return (Criteria) this;
        }

        public Criteria andSoundNameNotBetween(String value1, String value2) {
            addCriterion("sound_name not between", value1, value2, "soundName");
            return (Criteria) this;
        }
    }

    /**
     */
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