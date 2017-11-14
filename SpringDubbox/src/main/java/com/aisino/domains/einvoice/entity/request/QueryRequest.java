package com.aisino.domains.einvoice.entity.request;

import java.io.Serializable;

/**
 * Created by Mosen on 2017/11/9.
 */
public class QueryRequest implements Serializable {
    private static final long serialVersionUID = -647298644486423088L;

    private String nsrsbh;  //纳税人识别号
    private String fpdm;    //发票代码
    private String fphm;    //发票号码
    private String kprq;    //开票日期
    private String kpje;    //开票金额

    public QueryRequest() {
    }

    public String getNsrsbh() {
        return nsrsbh;
    }
    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }
    public String getFpdm() {
        return fpdm;
    }
    public void setFpdm(String fpdm) {
        this.fpdm = fpdm;
    }
    public String getFphm() {
        return fphm;
    }
    public void setFphm(String fphm) {
        this.fphm = fphm;
    }
    public String getKprq() {
        return kprq;
    }
    public void setKprq(String kprq) {
        this.kprq = kprq;
    }
    public String getKpje() {
        return kpje;
    }
    public void setKpje(String kpje) {
        this.kpje = kpje;
    }

    @Override
    public String toString() {
        return "QueryRequest{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", fpdm='" + fpdm + '\'' +
                ", fphm='" + fphm + '\'' +
                ", kprq='" + kprq + '\'' +
                ", kpje='" + kpje + '\'' +
                '}';
    }
}
