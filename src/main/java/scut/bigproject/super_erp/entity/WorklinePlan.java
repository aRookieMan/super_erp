package scut.bigproject.super_erp.entity;

import java.util.List;

public class WorklinePlan {
    private int id;
    private String worklineId;
    private String productType;
    private int productAmount;
    private int productionPlanId;
    private List<MaterialPlan> materialPlans;

    public List<MaterialPlan> getMaterialPlans() {
        return materialPlans;
    }

    public void setMaterialPlans(List<MaterialPlan> materialPlans) {
        this.materialPlans = materialPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
