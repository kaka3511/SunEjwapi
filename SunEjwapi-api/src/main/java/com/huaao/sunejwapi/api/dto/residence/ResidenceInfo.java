package com.huaao.sunejwapi.api.dto.residence;

import java.util.Date;

import com.huaao.sunejwapi.common.DemoData;
import com.huaao.sunejwapi.common.web.ApiDemoData;
import com.huaao.sunejwapi.common.web.ApiDescription;

public class ResidenceInfo {
	
	@ApiDescription("ID")
	@ApiDemoData("12101")
    private Integer id;

	@ApiDescription("")
	@ApiDemoData("12101")
    private Integer creatorId;

	@ApiDescription("")
	@ApiDemoData("12101")
    private Integer updaterId;

	@ApiDescription("")
	@ApiDemoData(DemoData.STMAP)
    private Long createTime;

	@ApiDescription("")
	@ApiDemoData(DemoData.STMAP)
    private Long updateTime;

	@ApiDescription("申请人姓名")
	@ApiDemoData("")
    private String name;

	@ApiDescription("申请人身份证")
	@ApiDemoData("")
    private String idcard;

	@ApiDescription("申请人电话")
	@ApiDemoData("")
    private String cellphone;

	@ApiDescription("申请类型")
	@ApiDemoData("1")
    private Integer catelog;

	@ApiDescription("申请类型名称")
	@ApiDemoData("类型名称")
    private String catelogName;
	
	@ApiDescription("登记表照片")
	@ApiDemoData("")
    private String imgsRegister;

	@ApiDescription("身份证照片")
	@ApiDemoData("")
    private String imgsIdcard;

	@ApiDescription("户口薄照片")
	@ApiDemoData("")
    private String imgsResidence;

	@ApiDescription("房权证照片")
	@ApiDemoData("")
    private String imgsHouse;

	@ApiDescription("劳动合同照片")
	@ApiDemoData("")
    private String imgsJob;

	@ApiDescription("社会保险照片")
	@ApiDemoData("")
    private String imgsInsurance;

	@ApiDescription("营业执照照片")
	@ApiDemoData("")
    private String imgsLicence;

	@ApiDescription("随迁人员照片")
	@ApiDemoData("")
    private String imgsFamily;

	@ApiDescription("状态：0 保存，1 已提交， 2已 驳回 ， 3 审核通过 ，4 已 预约，5 已办理，6 已评价, 7 已过期")
	@ApiDemoData("")
    private Integer status;

	@ApiDescription("预约日期")
	@ApiDemoData("2017-05-26")
    private String appointmentDate;

	@ApiDescription("预约时段 示例 08:00-09:00")
	@ApiDemoData("08:00-09:00")
    private String appointmentTime;

	@ApiDescription("处理人员警号")
	@ApiDemoData("J12345")
    private String policeCard;

	@ApiDescription("办理人员")
	@ApiDemoData("")
    private Integer doUserid;

	@ApiDescription("评价_服务态度")
	@ApiDemoData("5")
    private Integer apprasieAttitude;

	@ApiDescription("评价_按期办理")
	@ApiDemoData("5")
    private Integer apprasieDate;

	@ApiDescription("评价_着装规范")
	@ApiDemoData("5")
    private Integer apprasieDressing;

	@ApiDescription("评价_整体：0 非常满意, 1 满意 , 2 不满意")
	@ApiDemoData("1")
    private Integer apprasieTotal;

	@ApiDescription("建议")
	@ApiDemoData("")
    private String advice;

	@ApiDescription("")
	@ApiDemoData("")
    private Integer communityid;

	@ApiDescription("驳回类型: 0 材料不全， 1 不符合政策， 2 其他")
	@ApiDemoData("0")
    private Integer rejectType;
	
	@ApiDescription("驳回原因")
	@ApiDemoData("驳回原因")
    private String rejectReason;
 
	@ApiDescription("预约派出所 sps_s_dictionnary中residenceStation的子节点. 0 表示 江岸区公安分局户政服务中心")
	@ApiDemoData("0")
    private Integer stationCode;
    
	@ApiDescription("预约派出所名称")
	@ApiDemoData("二七街派出所")
    private String stationName;
	
	@ApiDescription("评价原因")
	@ApiDemoData("")
    private String appraiseReason;
	
	
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Integer getCreatorId() {
        return creatorId;
    }

    
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    
    public Integer getUpdaterId() {
        return updaterId;
    }

    
    public void setUpdaterId(Integer updaterId) {
        this.updaterId = updaterId;
    }

    
    public Long getCreateTime() {
        return createTime;
    }

    
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    
    public Long getUpdateTime() {
        return updateTime;
    }

    
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    

    
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIdcard() {
        return idcard;
    }

    
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    
    public String getCellphone() {
        return cellphone;
    }

    
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    
    public Integer getCatelog() {
        return catelog;
    }

    
    public void setCatelog(Integer catelog) {
        this.catelog = catelog;
    }

    
    public String getImgsRegister() {
        return imgsRegister;
    }

    
    public void setImgsRegister(String imgsRegister) {
        this.imgsRegister = imgsRegister == null ? null : imgsRegister.trim();
    }

    
    public String getImgsIdcard() {
        return imgsIdcard;
    }

    
    public void setImgsIdcard(String imgsIdcard) {
        this.imgsIdcard = imgsIdcard == null ? null : imgsIdcard.trim();
    }

    
    public String getImgsResidence() {
        return imgsResidence;
    }

    
    public void setImgsResidence(String imgsResidence) {
        this.imgsResidence = imgsResidence == null ? null : imgsResidence.trim();
    }

    
    public String getImgsHouse() {
        return imgsHouse;
    }

    
    public void setImgsHouse(String imgsHouse) {
        this.imgsHouse = imgsHouse == null ? null : imgsHouse.trim();
    }

    
    public String getImgsJob() {
        return imgsJob;
    }

    
    public void setImgsJob(String imgsJob) {
        this.imgsJob = imgsJob == null ? null : imgsJob.trim();
    }

    
    public String getImgsInsurance() {
        return imgsInsurance;
    }

    
    public void setImgsInsurance(String imgsInsurance) {
        this.imgsInsurance = imgsInsurance == null ? null : imgsInsurance.trim();
    }

    
    public String getImgsLicence() {
        return imgsLicence;
    }

    
    public void setImgsLicence(String imgsLicence) {
        this.imgsLicence = imgsLicence == null ? null : imgsLicence.trim();
    }

    
    public String getImgsFamily() {
        return imgsFamily;
    }

    
    public void setImgsFamily(String imgsFamily) {
        this.imgsFamily = imgsFamily == null ? null : imgsFamily.trim();
    }

    
    public Integer getStatus() {
        return status;
    }

    
    public void setStatus(Integer status) {
        this.status = status;
    }

    
    public String getAppointmentDate() {
    	if(appointmentDate !=null && appointmentDate.length() > 10 ){
    		return appointmentDate.substring(0, 10).trim();
    	}
        return appointmentDate;
    }

    
    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    
    public String getAppointmentTime() {
        return appointmentTime;
    }

    
    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    
    public String getPoliceCard() {
        return policeCard;
    }

    
    public void setPoliceCard(String policeCard) {
        this.policeCard = policeCard;
    }

    
    public Integer getDoUserid() {
        return doUserid;
    }

    
    public void setDoUserid(Integer doUserid) {
        this.doUserid = doUserid;
    }

    
    public Integer getApprasieAttitude() {
        return apprasieAttitude;
    }

    
    public void setApprasieAttitude(Integer apprasieAttitude) {
        this.apprasieAttitude = apprasieAttitude;
    }

    
    public Integer getApprasieDate() {
        return apprasieDate;
    }

    
    public void setApprasieDate(Integer apprasieDate) {
        this.apprasieDate = apprasieDate;
    }

    
    public Integer getApprasieDressing() {
        return apprasieDressing;
    }

    
    public void setApprasieDressing(Integer apprasieDressing) {
        this.apprasieDressing = apprasieDressing;
    }

    
    public Integer getApprasieTotal() {
        return apprasieTotal;
    }

    
    public void setApprasieTotal(Integer apprasieTotal) {
        this.apprasieTotal = apprasieTotal;
    }

    
    public String getAdvice() {
        return advice;
    }

    
    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    
    public Integer getCommunityid() {
        return communityid;
    }

    
    public void setCommunityid(Integer communityid) {
        this.communityid = communityid;
    }


	public String getRejectReason() {
		return rejectReason;
	}


	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}


	public Integer getStationCode() {
		return stationCode;
	}


	public void setStationCode(Integer stationCode) {
		this.stationCode = stationCode;
	}


	public String getCatelogName() {
		return catelogName;
	}


	public void setCatelogName(String catelogName) {
		this.catelogName = catelogName;
	}


	public String getStationName() {
		return stationName;
	}


	public void setStationName(String stationName) {
		this.stationName = stationName;
	}


	public String getAppraiseReason() {
		return appraiseReason;
	}


	public void setAppraiseReason(String appraiseReason) {
		this.appraiseReason = appraiseReason;
	}


	public Integer getRejectType() {
		return rejectType;
	}


	public void setRejectType(Integer rejectType) {
		this.rejectType = rejectType;
	}
    
	
}
