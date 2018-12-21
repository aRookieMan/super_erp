package scut.bigproject.super_erp.entity;

public class WorklinePlan {
    private int id;
    private int worklineId;
    private String productType;
    private int productAmount;
    private int productionPlanId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public int getProductionPlanId() {
        return productionPlanId;
    }

    public void setProductionPlanId(int productionPlanId) {
        this.productionPlanId = productionPlanId;
    }
}
