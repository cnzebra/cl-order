package com.cl.order.model.book;

import java.math.BigDecimal;
import java.util.Date;

public class OrderForm {
    private String formCode;

    private String mainFormCode;

    private Integer memberId;

    private Integer consigneeId;

    private BigDecimal totalPrice;

    private BigDecimal goodsPrice;

    private BigDecimal deliverPrice;

    private BigDecimal paidPrice;

    private Integer warehouseId;

    private String warehouseName;

    private Integer deliverTypeId;

    private String deliverTypeName;

    private Integer expressId;

    private String expressName;

    private Integer paymentTypeId;

    private String paymentTypeName;

    private Integer quality;

    private Double weight;

    private Integer status;

    private Integer paymentStatus;

    private String createPerson;

    private Date createDate;

    private String updatePerson;

    private Date updateDate;

    public String getFormCode() {
        return formCode;
    }

    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    public String getMainFormCode() {
        return mainFormCode;
    }

    public void setMainFormCode(String mainFormCode) {
        this.mainFormCode = mainFormCode;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getConsigneeId() {
        return consigneeId;
    }

    public void setConsigneeId(Integer consigneeId) {
        this.consigneeId = consigneeId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getDeliverPrice() {
        return deliverPrice;
    }

    public void setDeliverPrice(BigDecimal deliverPrice) {
        this.deliverPrice = deliverPrice;
    }

    public BigDecimal getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(BigDecimal paidPrice) {
        this.paidPrice = paidPrice;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Integer getDeliverTypeId() {
        return deliverTypeId;
    }

    public void setDeliverTypeId(Integer deliverTypeId) {
        this.deliverTypeId = deliverTypeId;
    }

    public String getDeliverTypeName() {
        return deliverTypeName;
    }

    public void setDeliverTypeName(String deliverTypeName) {
        this.deliverTypeName = deliverTypeName;
    }

    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public Integer getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(Integer paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}