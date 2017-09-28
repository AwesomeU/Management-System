package yycg.base.pojo.po;

import java.util.Date;

public class Sysuser {
    private String TZBH;

    private String KHBH;

    private String CMDM;

    private String HCHC;

    private String TDH;

    private String FMDM;

    private String CC;

    private String 	SLSL;

    private String YSJE;

    private String NSJE;


    public String getTZBH() {
        return TZBH;
    }

    public void setTZBH(String id) {
        this.TZBH = id == null ? null : id.trim();
    }

    public String getKHBH() {
        return KHBH;
    }

    public void setKHBH(String khbh) {
        this.KHBH = khbh == null ? null : khbh.trim();
    }

    public String getCMDM() {
        return CMDM;
    }

    public void setCMDM(String cmdm) {
        this.CMDM = cmdm == null ? null : cmdm.trim();
    }

    public String getHCHC() {
        return HCHC;
    }

    public void setHCHC(String hchc) {
        this.HCHC = hchc == null ? null : hchc.trim();
    }

    public String getTDH() {
        return TDH;
    }

    public void setTDH(String tdh) {
        this.TDH = tdh == null ? null : tdh.trim();
    }

    public String getFMDM() {
        return FMDM;
    }

    public void setFMDM(String fmdm) {
        this.FMDM = fmdm == null ? null : fmdm.trim();
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String cc) {
        this.CC = cc == null ? null : cc.trim();
    }

    public String getSLSL() {
        return SLSL;
    }

    public void setSLSL(String slsl) {
        this.SLSL = slsl == null ? null : slsl.trim();
    }

    public String getYSJE() {
        return YSJE;
    }

    public void setYSJE(String ysje) {
        this.YSJE = ysje == null ? null : ysje.trim();
    }

    public String getNSJE() {
        return NSJE;
    }

    public void setNSJE(String nsje) {
        this.NSJE = nsje == null ? null : nsje.trim();
    }
    
}