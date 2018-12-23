package scut.bigproject.super_erp.entity;

import java.util.ArrayList;

public class Order{
    private int id;
    private String customer_name;
    private String customer_phone;
    private String start_date;
    private int valid_code;
    private ArrayList<OrderDetail> orderDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customer_name;
    }

    public void setCustomerName(String customerName) {
        this.customer_name = customer_name;
    }

    public String getCustomerPhone() {
        return customer_phone;
    }

    public void setCustomerPhone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getStartDate() {
        return start_date;
    }

    public void setStartDate(String start_date) {
        this.start_date = start_date;
    }

    public int getValidCode() {
        return valid_code;
    }

    public void setValidCode(int valid_code) {
        this.valid_code = valid_code;
    }

    public ArrayList<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(ArrayList<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
