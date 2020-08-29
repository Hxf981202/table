package com.xxxx.manager.pojo;

import java.io.Serializable;

/**
 * @author HXF
 * @since 1.0.0
 */
public class UserDemo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 账户类型
     */
    private String type;

    /**
     * 银行开户名
     */
    private String name;

    /**
     * 银行卡号
     */
    private String number;

    /**
     * 开户银行
     */
    private String bank;

    /**
     * 开户支行
     */
    private String branch;

    /**
     * 开户人身份证
     */
    private String card;

    /**
     * 开户人手机号
     */
    private String phone;

    /**
     * 银行卡照片
     */
    private String numberfrontphoto;

    /**
     * 身份证照片正面
     */
    private String idcardphotofront;

    /**
     * 身份证照片反面
     */
    private String idcardphotoreverse;

    /**
     * 门头照片
     */
    private String storephotos;

    /**
     * 室内照片
     */
    private String indoorphotos;

    /**
     * 室外照片
     */
    private String outdoorphotos;

    /**
     * user_demo
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getNumberfrontphoto() {
        return numberfrontphoto;
    }

    public void setNumberfrontphoto(String numberfrontphoto) {
        this.numberfrontphoto = numberfrontphoto == null ? null : numberfrontphoto.trim();
    }

    public String getIdcardphotofront() {
        return idcardphotofront;
    }

    public void setIdcardphotofront(String idcardphotofront) {
        this.idcardphotofront = idcardphotofront == null ? null : idcardphotofront.trim();
    }

    public String getIdcardphotoreverse() {
        return idcardphotoreverse;
    }

    public void setIdcardphotoreverse(String idcardphotoreverse) {
        this.idcardphotoreverse = idcardphotoreverse == null ? null : idcardphotoreverse.trim();
    }

    public String getStorephotos() {
        return storephotos;
    }

    public void setStorephotos(String storephotos) {
        this.storephotos = storephotos == null ? null : storephotos.trim();
    }

    public String getIndoorphotos() {
        return indoorphotos;
    }

    public void setIndoorphotos(String indoorphotos) {
        this.indoorphotos = indoorphotos == null ? null : indoorphotos.trim();
    }

    public String getOutdoorphotos() {
        return outdoorphotos;
    }

    public void setOutdoorphotos(String outdoorphotos) {
        this.outdoorphotos = outdoorphotos == null ? null : outdoorphotos.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", number=").append(number);
        sb.append(", bank=").append(bank);
        sb.append(", branch=").append(branch);
        sb.append(", card=").append(card);
        sb.append(", phone=").append(phone);
        sb.append(", numberfrontphoto=").append(numberfrontphoto);
        sb.append(", idcardphotofront=").append(idcardphotofront);
        sb.append(", idcardphotoreverse=").append(idcardphotoreverse);
        sb.append(", storephotos=").append(storephotos);
        sb.append(", indoorphotos=").append(indoorphotos);
        sb.append(", outdoorphotos=").append(outdoorphotos);
        sb.append("]");
        return sb.toString();
    }
}