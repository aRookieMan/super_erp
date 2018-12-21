package scut.bigproject.super_erp.entity;

public class MaterialInventoryRecord {
    private int id;
    private int materialId;
    private int materialAmount;
    private int inOutCode;
    private String recordDate;
    private String target;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getMaterialAmount() {
        return materialAmount;
    }

    public void setMaterialAmount(int materialAmount) {
        this.materialAmount = materialAmount;
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
