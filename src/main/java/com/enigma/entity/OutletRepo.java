package com.enigma.entity;
import java.util.ArrayList;
import java.util.List;

public class OutletRepo {
    private String outlet;
    private String period;
    private Integer omset;
    private Integer total;

    public OutletRepo() {
    }


    public OutletRepo(String outlet, String period, Integer omset, Integer total) {
        this.outlet = outlet;
        this.period = period;
        this.omset = omset;
        this.total = total;
    }

    public List<OutletRepo> add(OutletRepo outletRepo){
        List<OutletRepo> outlet = (List<OutletRepo>) outletRepo;
        return outlet;
    }

    public String getOutlet() {
        return outlet;
    }

    public void setOutlet(String outlet) {
        this.outlet = outlet;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getOmset() {
        return omset;
    }

    public void setOmset(Integer omset) {
        this.omset = omset;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OutletRepo{" +
                "outlet='" + outlet + '\'' +
                ", period=" + period +
                ", omset=" + omset +
                ", total=" + total +
                '}';
    }
}