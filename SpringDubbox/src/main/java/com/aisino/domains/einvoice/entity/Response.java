package com.aisino.domains.einvoice.entity;

import java.io.Serializable;

/**
 * Created by Mosen on 2017/11/9.
 */
public class Response implements  Serializable {
    private static final long serialVersionUID = 221096876101990760L;

    private String returnCode;  //返回编码  0000-成功
    private String returnMsg;   //返回信息
    private String data;    //数据

    public Response() {
    }

    public String getReturnCode() {
        return returnCode;
    }
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }
    public String getReturnMsg() {
        return returnMsg;
    }
    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "returnCode='" + returnCode + '\'' +
                ", returnMsg='" + returnMsg + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
