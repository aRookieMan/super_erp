package scut.bigproject.super_erp.entity;

public class WorklineCapacity {
    private int worklineId;
    private String productType;
    private int ableAmount;

    public int getWorklineId() {
        return worklineId;
    }

    public void setWorklineId(int worklineId) {
        this.worklineId = worklineId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getAbleAmount() {
        return ableAmount;
    }

    public void setAbleAmount(int ableAmount) {
        this.ableAmount = ableAmount;
    }
}
