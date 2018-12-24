package scut.bigproject.super_erp.entity;

import java.util.ArrayList;

public class WorklineRecord {
    private int id;
    private int worklineId;
    private String productType;
    private int productAmount;
    private int productionRecordId;
    private ArrayList<MaterialRecord> materialRecords;


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

    public int getProductionRecordId() {
        return productionRecordId;
    }

    public void setProductionRecordId(int productionRecordId) {
        this.productionRecordId = productionRecordId;
    }

    public ArrayList<MaterialRecord> getMaterialRecords() {
        return materialRecords;
    }

    public void setMaterialRecords(ArrayList<MaterialRecord> materialRecords) {
        this.materialRecords = materialRecords;
    }

    @Override
    public String toString() {
        return "WorklineRecord{" +
                "id=" + id +
                ", worklineId=" + worklineId +
                ", productType='" + productType + '\'' +
                ", productAmount=" + productAmount +
                ", productionRecordId=" + productionRecordId +
                ", materialRecords=" + materialRecords +
                '}';
    }
}
