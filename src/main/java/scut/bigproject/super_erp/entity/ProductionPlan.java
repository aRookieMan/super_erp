package scut.bigproject.super_erp.entity;

import java.util.List;

public class ProductionPlan {
    private int id;
    private String planDate;
    private List<WorklinePlan> worklinePlans;

    public List<WorklinePlan> getWorklinePlans() {
        return worklinePlans;
    }

    public void setWorklinePlans(List<WorklinePlan> worklinePlans) {
        this.worklinePlans = worklinePlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String planDate) {
        this.planDate = planDate;
    }
}
