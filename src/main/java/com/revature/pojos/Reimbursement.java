package com.revature.pojos;

import java.util.Objects;

public class Reimbursement {
    private Integer reimbursementId;
    private String title;
    private Float amount;
    private String message;
    private Integer userId;
    private Boolean status;

    public Reimbursement() {
    }

    public Reimbursement(Integer reimbursementId, String title, Float amount, String message, Integer userId, Boolean status) {
        this.reimbursementId = reimbursementId;
        this.title = title;
        this.amount = amount;
        this.message = message;
        this.userId = userId;
        this.status = status;
    }

    public Reimbursement(String title, Float amount, String message, Integer userId, Boolean status) {
        this.title = title;
        this.amount = amount;
        this.message = message;
        this.userId = userId;
        this.status = status;
    }

    public Reimbursement(String title, Float amount, String message, Integer userId) {
        this.title = title;
        this.amount = amount;
        this.message = message;
        this.userId = userId;
    }

    public Reimbursement(Integer reimbursementId, String title, Float amount, String message) {
        this.reimbursementId = reimbursementId;
        this.title = title;
        this.amount = amount;
        this.message = message;
    }

    public Integer getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(Integer reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reimbursement request = (Reimbursement) o;
        return Objects.equals(reimbursementId, request.reimbursementId)
                && Objects.equals(title, request.title)
                && Objects.equals(amount, request.amount)
                && Objects.equals(message, request.message)
                && Objects.equals(userId, request.userId)
                && Objects.equals(status, request.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reimbursementId, title, amount, message, userId, status);
    }

    @Override
    public String toString() {
        return "Request{" +
                "reimbursementId=" + reimbursementId +
                ", title='" + title + '\'' +
                ", amount='" + amount + '\'' +
                ", message='" + message + '\'' +
                ", userId=" + userId +
                ", status=" + status +
                '}';
    }
}
