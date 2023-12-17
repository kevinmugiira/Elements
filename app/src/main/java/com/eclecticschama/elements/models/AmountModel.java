package com.eclecticschama.elements.models;

public class AmountModel {

    String title;
    String defaulted;
    String dueDate;
    String penaltyAmount;
    String amountDue;
    String buttonName;
    int amount;

    public AmountModel(String title,
                       String defaulted,
                       String dueDate,
                       String penaltyAmount,
                       String amountDue,
                       String buttonName,
                       int amount) {
        this.title = title;
        this.defaulted = defaulted;
        this.dueDate = dueDate;
        this.penaltyAmount = penaltyAmount;
        this.amountDue = amountDue;
        this.buttonName = buttonName;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public String getDefaulted() {
        return defaulted;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getPenaltyAmount() {
        return penaltyAmount;
    }

    public String getAmountDue() {
        return amountDue;
    }

    public String getButtonName() {
        return buttonName;
    }

    public int getAmount() {
        return amount;
    }
}
