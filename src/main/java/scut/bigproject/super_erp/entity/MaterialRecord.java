package scut.bigproject.super_erp.entity;

public class MaterialRecord {
    private int id;
    private int materialId;
    private int materialAmount;
    private int worklineRecordId;

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

    public int getWorklineRecordId() {
        return worklineRecordId;
    }

    public void setWorklineRecordId(int worklineRecordId) {
        this.worklineRecordId = worklineRecordId;
    }
}
