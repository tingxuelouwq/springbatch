package com.kevin.springbatch.ch02;

/**
 * @类名: CreditBill
 * @包名：com.kevin.springbatch.ch02
 * @作者：kevin[wangqi2017@xinhua.org]
 * @时间：2018/6/17 10:41
 * @版本：1.0
 * @描述：信用卡对账单实体类
 */
public class CreditBill {
    /** 银行卡账户ID **/
    private String accountID;
    /** 持卡人姓名 **/
    private String name;
    /** 消费金额 **/
    private double amount;
    /** 消费日期 **/
    private String date;
    /** 消费场所 **/
    private String address;

    public CreditBill() {
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CreditBill{" +
                "accountID='" + accountID + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
