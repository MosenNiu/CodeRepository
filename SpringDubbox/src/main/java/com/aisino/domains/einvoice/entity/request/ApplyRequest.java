package com.aisino.domains.einvoice.entity.request;

import java.io.Serializable;

/**
 * Created by Mosen on 2017/11/6.
 */
public class ApplyRequest implements Serializable {
    private static final long serialVersionUID = -2221106895012353375L;

    private String nsrsbh;  //纳税人识别号
    private String fpdm;    //发票代码
    private String fphm;    //发票号码
    private String kprq;    //开票日期
    private String kpje;    //开票金额
    private String type;    //请求类型
    private String longUrl;    //长连接
    private String checkCode;    //校验码
    private String versionNo;    //版本号

    public ApplyRequest() {
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getLongUrl() {
        return longUrl;
    }
    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }
    public String getCheckCode() {
        return checkCode;
    }
    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }
    public String getVersionNo() {
        return versionNo;
    }
    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    @Override
    public String toString() {
        return "ApplyRequest{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", fpdm='" + fpdm + '\'' +
                ", fphm='" + fphm + '\'' +
                ", kprq='" + kprq + '\'' +
                ", kpje='" + kpje + '\'' +
                ", type='" + type + '\'' +
                ", longUrl='" + longUrl + '\'' +
                ", checkCode='" + checkCode + '\'' +
                ", versionNo='" + versionNo + '\'' +
                '}';
    }
}
