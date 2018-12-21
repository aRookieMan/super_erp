package scut.bigproject.super_erp.entity;

public class Order {
    private int id;
    private String customerName;
    private String customerPhone;
    private String startDate;
    private int validCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getValidCode() {
        return validCode;
    }

    public void setValidCode(int validCode) {
        this.validCode = validCode;
    }
}
