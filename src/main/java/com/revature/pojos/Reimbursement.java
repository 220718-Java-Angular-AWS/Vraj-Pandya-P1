package com.revature.pojos;

import java.util.Objects;

public class Reimbursement {
    private int userId;
    private int amount;
    private User employee;
    private User financeManager;
    private String submitted;
    private String resolved;
    private String description;
    private String receipt;
    private String status;
    private String type;

    public Reimbursement(){
    }

    public Reimbursement(int userId, int amount, User employee, User financeManager, String submitted, String resolved, String description, String receipt, String status, String type) {
        this.userId = userId;
        this.amount = amount;
        this.employee = employee;
        this.financeManager = financeManager;
        this.submitted = submitted;
        this.resolved = resolved;
        this.description = description;
        this.receipt = receipt;
        this.status = status;
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public User getEmployee() {
        return employee;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }

    public User getFinanceManager() {
        return financeManager;
    }

    public void setFinanceManager(User financeManager) {
        this.financeManager = financeManager;
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    public String getResolved() {
        return resolved;
    }

    public void setResolved(String resolved) {
        this.resolved = resolved;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reimbursement that = (Reimbursement) o;
        return userId == that.userId
                && amount == that.amount
                && Objects.equals(employee, that.employee)
                && Objects.equals(financeManager, that.financeManager)
                && Objects.equals(submitted, that.submitted)
                && Objects.equals(resolved, that.resolved)
                && Objects.equals(description, that.description)
                && Objects.equals(receipt, that.receipt)
                && Objects.equals(status, that.status)
                && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, amount, employee, financeManager, submitted, resolved, description, receipt, status, type);
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "userId=" + userId +
                ", amount=" + amount +
                ", employee=" + employee +
                ", financeManager=" + financeManager +
                ", submitted='" + submitted + '\'' +
                ", resolved='" + resolved + '\'' +
                ", description='" + description + '\'' +
                ", receipt='" + receipt + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
