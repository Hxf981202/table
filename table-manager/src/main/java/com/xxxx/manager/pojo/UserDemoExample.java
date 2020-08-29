package com.xxxx.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserDemoExample {
    /**
     * user_demo
     */
    protected String orderByClause;

    /**
     * user_demo
     */
    protected boolean distinct;

    /**
     * user_demo
     */
    protected List<Criteria> oredCriteria;

    public UserDemoExample() {
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

    /**
    /* 
     * @author
     * @since 1.0.0
     */
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("branch is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("branch is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("branch =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("branch <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("branch >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("branch >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("branch <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("branch <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("branch like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("branch not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("branch in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("branch not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("branch between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("branch not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("card like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("card not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoIsNull() {
            addCriterion("numberFrontPhoto is null");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoIsNotNull() {
            addCriterion("numberFrontPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoEqualTo(String value) {
            addCriterion("numberFrontPhoto =", value, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoNotEqualTo(String value) {
            addCriterion("numberFrontPhoto <>", value, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoGreaterThan(String value) {
            addCriterion("numberFrontPhoto >", value, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoGreaterThanOrEqualTo(String value) {
            addCriterion("numberFrontPhoto >=", value, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoLessThan(String value) {
            addCriterion("numberFrontPhoto <", value, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoLessThanOrEqualTo(String value) {
            addCriterion("numberFrontPhoto <=", value, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoLike(String value) {
            addCriterion("numberFrontPhoto like", value, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoNotLike(String value) {
            addCriterion("numberFrontPhoto not like", value, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoIn(List<String> values) {
            addCriterion("numberFrontPhoto in", values, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoNotIn(List<String> values) {
            addCriterion("numberFrontPhoto not in", values, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoBetween(String value1, String value2) {
            addCriterion("numberFrontPhoto between", value1, value2, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andNumberfrontphotoNotBetween(String value1, String value2) {
            addCriterion("numberFrontPhoto not between", value1, value2, "numberfrontphoto");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontIsNull() {
            addCriterion("idCardPhotoFront is null");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontIsNotNull() {
            addCriterion("idCardPhotoFront is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontEqualTo(String value) {
            addCriterion("idCardPhotoFront =", value, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontNotEqualTo(String value) {
            addCriterion("idCardPhotoFront <>", value, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontGreaterThan(String value) {
            addCriterion("idCardPhotoFront >", value, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontGreaterThanOrEqualTo(String value) {
            addCriterion("idCardPhotoFront >=", value, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontLessThan(String value) {
            addCriterion("idCardPhotoFront <", value, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontLessThanOrEqualTo(String value) {
            addCriterion("idCardPhotoFront <=", value, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontLike(String value) {
            addCriterion("idCardPhotoFront like", value, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontNotLike(String value) {
            addCriterion("idCardPhotoFront not like", value, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontIn(List<String> values) {
            addCriterion("idCardPhotoFront in", values, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontNotIn(List<String> values) {
            addCriterion("idCardPhotoFront not in", values, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontBetween(String value1, String value2) {
            addCriterion("idCardPhotoFront between", value1, value2, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotofrontNotBetween(String value1, String value2) {
            addCriterion("idCardPhotoFront not between", value1, value2, "idcardphotofront");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseIsNull() {
            addCriterion("idCardPhotoReverse is null");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseIsNotNull() {
            addCriterion("idCardPhotoReverse is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseEqualTo(String value) {
            addCriterion("idCardPhotoReverse =", value, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseNotEqualTo(String value) {
            addCriterion("idCardPhotoReverse <>", value, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseGreaterThan(String value) {
            addCriterion("idCardPhotoReverse >", value, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseGreaterThanOrEqualTo(String value) {
            addCriterion("idCardPhotoReverse >=", value, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseLessThan(String value) {
            addCriterion("idCardPhotoReverse <", value, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseLessThanOrEqualTo(String value) {
            addCriterion("idCardPhotoReverse <=", value, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseLike(String value) {
            addCriterion("idCardPhotoReverse like", value, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseNotLike(String value) {
            addCriterion("idCardPhotoReverse not like", value, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseIn(List<String> values) {
            addCriterion("idCardPhotoReverse in", values, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseNotIn(List<String> values) {
            addCriterion("idCardPhotoReverse not in", values, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseBetween(String value1, String value2) {
            addCriterion("idCardPhotoReverse between", value1, value2, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andIdcardphotoreverseNotBetween(String value1, String value2) {
            addCriterion("idCardPhotoReverse not between", value1, value2, "idcardphotoreverse");
            return (Criteria) this;
        }

        public Criteria andStorephotosIsNull() {
            addCriterion("storePhotos is null");
            return (Criteria) this;
        }

        public Criteria andStorephotosIsNotNull() {
            addCriterion("storePhotos is not null");
            return (Criteria) this;
        }

        public Criteria andStorephotosEqualTo(String value) {
            addCriterion("storePhotos =", value, "storephotos");
            return (Criteria) this;
        }

        public Criteria andStorephotosNotEqualTo(String value) {
            addCriterion("storePhotos <>", value, "storephotos");
            return (Criteria) this;
        }

        public Criteria andStorephotosGreaterThan(String value) {
            addCriterion("storePhotos >", value, "storephotos");
            return (Criteria) this;
        }

        public Criteria andStorephotosGreaterThanOrEqualTo(String value) {
            addCriterion("storePhotos >=", value, "storephotos");
            return (Criteria) this;
        }

        public Criteria andStorephotosLessThan(String value) {
            addCriterion("storePhotos <", value, "storephotos");
            return (Criteria) this;
        }

        public Criteria andStorephotosLessThanOrEqualTo(String value) {
            addCriterion("storePhotos <=", value, "storephotos");
            return (Criteria) this;
        }

        public Criteria andStorephotosLike(String value) {
            addCriterion("storePhotos like", value, "storephotos");
            return (Criteria) this;
        }

        public Criteria andStorephotosNotLike(String value) {
            addCriterion("storePhotos not like", value, "storephotos");
            return (Criteria) this;
        }

        public Criteria andStorephotosIn(List<String> values) {
            addCriterion("storePhotos in", values, "storephotos");
            return (Criteria) this;
        }

        public Criteria andStorephotosNotIn(List<String> values) {
            addCriterion("storePhotos not in", values, "storephotos");
            return (Criteria) this;
        }

        public Criteria andStorephotosBetween(String value1, String value2) {
            addCriterion("storePhotos between", value1, value2, "storephotos");
            return (Criteria) this;
        }

        public Criteria andStorephotosNotBetween(String value1, String value2) {
            addCriterion("storePhotos not between", value1, value2, "storephotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosIsNull() {
            addCriterion("indoorPhotos is null");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosIsNotNull() {
            addCriterion("indoorPhotos is not null");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosEqualTo(String value) {
            addCriterion("indoorPhotos =", value, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosNotEqualTo(String value) {
            addCriterion("indoorPhotos <>", value, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosGreaterThan(String value) {
            addCriterion("indoorPhotos >", value, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosGreaterThanOrEqualTo(String value) {
            addCriterion("indoorPhotos >=", value, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosLessThan(String value) {
            addCriterion("indoorPhotos <", value, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosLessThanOrEqualTo(String value) {
            addCriterion("indoorPhotos <=", value, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosLike(String value) {
            addCriterion("indoorPhotos like", value, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosNotLike(String value) {
            addCriterion("indoorPhotos not like", value, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosIn(List<String> values) {
            addCriterion("indoorPhotos in", values, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosNotIn(List<String> values) {
            addCriterion("indoorPhotos not in", values, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosBetween(String value1, String value2) {
            addCriterion("indoorPhotos between", value1, value2, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andIndoorphotosNotBetween(String value1, String value2) {
            addCriterion("indoorPhotos not between", value1, value2, "indoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosIsNull() {
            addCriterion("outdoorPhotos is null");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosIsNotNull() {
            addCriterion("outdoorPhotos is not null");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosEqualTo(String value) {
            addCriterion("outdoorPhotos =", value, "outdoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosNotEqualTo(String value) {
            addCriterion("outdoorPhotos <>", value, "outdoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosGreaterThan(String value) {
            addCriterion("outdoorPhotos >", value, "outdoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosGreaterThanOrEqualTo(String value) {
            addCriterion("outdoorPhotos >=", value, "outdoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosLessThan(String value) {
            addCriterion("outdoorPhotos <", value, "outdoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosLessThanOrEqualTo(String value) {
            addCriterion("outdoorPhotos <=", value, "outdoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosLike(String value) {
            addCriterion("outdoorPhotos like", value, "outdoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosNotLike(String value) {
            addCriterion("outdoorPhotos not like", value, "outdoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosIn(List<String> values) {
            addCriterion("outdoorPhotos in", values, "outdoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosNotIn(List<String> values) {
            addCriterion("outdoorPhotos not in", values, "outdoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosBetween(String value1, String value2) {
            addCriterion("outdoorPhotos between", value1, value2, "outdoorphotos");
            return (Criteria) this;
        }

        public Criteria andOutdoorphotosNotBetween(String value1, String value2) {
            addCriterion("outdoorPhotos not between", value1, value2, "outdoorphotos");
            return (Criteria) this;
        }
    }

    /**
    /* 
     * @author zhoubin 
     * @since 1.0.0
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
    /* 
     * @author
     * @since 1.0.0
     */
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