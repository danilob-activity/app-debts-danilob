package com.example.danilo.appdebts.classes;

/**
 * Created by danilo on 24/06/19.
 */

public class Debts {
    private long mId;
    private Category mCategory;
    private float mValue;
    private String mDescription;
    private String mPaymentDate; //data do vencimento
    private String mPayDate;     //data do pagamento

    public Debts() {
    }

    public Debts(Category category, float value, String description, String paymentDate, String payDate) {
        mCategory = category;
        mValue = value;
        mDescription = description;
        mPaymentDate = paymentDate;
        mPayDate = payDate;
    }

    public Debts(Category category, float value, String paymentDate) {
        mCategory = category;
        mValue = value;
        mPaymentDate = paymentDate;
    }

    public Debts(Category category, float value, String paymentDate, String payDate) {
        mCategory = category;
        mValue = value;
        mPaymentDate = paymentDate;
        mPayDate = payDate;
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public Category getCategory() {
        return mCategory;
    }

    public void setCategory(Category category) {
        mCategory = category;
    }

    public float getValue() {
        return mValue;
    }

    public void setValue(float value) {
        mValue = value;
    }

    public String getPaymentDate() {
        return mPaymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        mPaymentDate = paymentDate;
    }

    public String getPayDate() {
        return mPayDate;
    }

    public void setPayDate(String payDate) {
        mPayDate = payDate;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
