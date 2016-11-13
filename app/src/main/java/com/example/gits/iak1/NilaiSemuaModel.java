package com.example.gits.iak1;

import com.orm.SugarRecord;

/**
 * Created by gits on 11/13/16.
 */

public class NilaiSemuaModel extends SugarRecord {
    private String hasil1;
    private String hasil2;
    private String hasil3;
    private String hasil;

    public NilaiSemuaModel(){

    }
    public NilaiSemuaModel(String hasil1, String hasil2, String hasil3, String hasil){
        this.hasil1 = hasil1;
        this.hasil2 = hasil2;
        this.hasil3 = hasil3;
        this.hasil = hasil;
    }

    public String getHasil1() {
        return hasil1;
    }

    public void setHasil1(String hasil1) {
        this.hasil1 = hasil1;
    }

    public String getHasil2() {
        return hasil2;
    }

    public void setHasil2(String hasil2) {
        this.hasil2 = hasil2;
    }

    public String getHasil3() {
        return hasil3;
    }

    public void setHasil3(String hasil3) {
        this.hasil3 = hasil3;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }
}
