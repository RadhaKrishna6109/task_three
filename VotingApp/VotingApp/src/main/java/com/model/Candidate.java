package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Candidates")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Radha;
    private String Krishna;
    private String Kasyap;
    private String Siddhu;

    public Candidate() {

    }

    public Candidate(int id, String Radha, String Krishna, String Kasyap, String Siddhu) {
        super();
        this.id = id;
        this.Radha = Radha;
        this.Krishna = Krishna;
        this.Kasyap = Kasyap;
        this.Siddhu = Siddhu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRadha() {
        return Radha;
    }

    public void setRadha(String Radha) {
        this.Radha = Radha;
    }

    public String getKrishna() {
        return Krishna;
    }

    public void setKrishna(String Krishna) {
        this.Krishna = Krishna;
    }

    public String getKasyap() {
        return Kasyap;
    }

    public void setKasyap(String Kasyap) {
        this.Kasyap = Kasyap;
    }

    public String getSiddhu() {
        return Siddhu;
    }

    public void setSiddhu(String Siddhu) {
        this.Siddhu = Siddhu;
    }

    @Override
    public String toString() {
        return "Candidate [id=" + id + ", Radha=" + Radha + ", Krishna=" + Krishna + ", Kasyap="
                + Kasyap + ", Siddhu=" + Siddhu + "]";
    }

}