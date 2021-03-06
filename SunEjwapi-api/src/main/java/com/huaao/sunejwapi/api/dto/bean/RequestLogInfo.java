package com.huaao.sunejwapi.api.dto.bean;

import java.util.Date;

public class RequestLogInfo {
	 
    private String reqId;

     
    private String api;

    
    private Integer returnCode;

     
    private String ip;

     
    private Integer runTime;

    
    private String createTime;
    
    private Integer requestLen;

    private Integer responseLen;
    
    private static final long serialVersionUID = 1L;

     
    public String getReqId() {
        return reqId;
    }

    
    public void setReqId(String reqId) {
        this.reqId = reqId == null ? null : reqId.trim();
    }

    
    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api == null ? null : api.trim();
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getRunTime() {
        return runTime;
    }

    
    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    
    public String getCreateTime() {
        return createTime;
    }

    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


	public Integer getRequestLen() {
		return requestLen;
	}


	public void setRequestLen(Integer requestLen) {
		this.requestLen = requestLen;
	}


	public Integer getResponseLen() {
		return responseLen;
	}


	public void setResponseLen(Integer responseLen) {
		this.responseLen = responseLen;
	}
    
    public String getAllLen(){
    	return this.requestLen + " | " + this.responseLen; 
    }
}
