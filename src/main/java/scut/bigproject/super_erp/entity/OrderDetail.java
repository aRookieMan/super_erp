package scut.bigproject.super_erp.entity;

public class OrderDetail {
    private int id;
    private String product_type;
    private int amount;
    private String end_date;
    private int order_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductType() {
        return product_type;
    }

    public void setProductType(String product_type) {
        this.product_type = product_type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getEndDate() {
        return end_date;
    }

    public void setEndDate(String end_date) {
        this.end_date = end_date;
    }

    public int getOrderId() {
        return order_id;
    }

    public void setOrderId(int order_id) {
        this.order_id = order_id;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", product_type='" + product_type + '\'' +
                ", amount=" + amount +
                ", end_date='" + end_date + '\'' +
                ", order_id=" + order_id +
                '}';
    }
}
