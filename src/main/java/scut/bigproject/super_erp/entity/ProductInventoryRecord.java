package scut.bigproject.super_erp.entity;

public class ProductInventoryRecord {
    private int id;
    private String productType;
    private int productAmount;
    private int inOutCode;
    private String recordDate;
    private String target;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public int getInOutCode() {
        return inOutCode;
    }

    public void setInOutCode(int inOutCode) {
        this.inOutCode = inOutCode;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
