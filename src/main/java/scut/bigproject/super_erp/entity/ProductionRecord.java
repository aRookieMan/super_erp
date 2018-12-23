package scut.bigproject.super_erp.entity;

import java.util.ArrayList;

public class ProductionRecord {
    private int id;
    private String recordDate;
    private ArrayList<WorklineRecord> worklineRecords;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public ArrayList<WorklineRecord> getWorklineRecords() {
        return worklineRecords;
    }

    public void setWorklineRecords(ArrayList<WorklineRecord> worklineRecords) {
        this.worklineRecords = worklineRecords;
    }
}
