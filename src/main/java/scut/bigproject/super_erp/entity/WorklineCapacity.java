package scut.bigproject.super_erp.entity;

public class WorklineCapacity {
    private String worklineId;
    private String productType;
    private int ableAmount;

    public String getWorklineId() {
        return worklineId;
    }

    public void setWorklineId(String worklineId) {
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
