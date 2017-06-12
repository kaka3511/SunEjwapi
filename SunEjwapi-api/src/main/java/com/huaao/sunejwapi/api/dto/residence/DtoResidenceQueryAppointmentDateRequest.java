package com.huaao.sunejwapi.api.dto.residence;

import javax.validation.constraints.NotNull;

import com.huaao.sunejwapi.api.dto.pub.DtoPublicRequest;
import com.huaao.sunejwapi.common.web.ApiDemoData;
import com.huaao.sunejwapi.common.web.ApiDescription;

public class DtoResidenceQueryAppointmentDateRequest extends DtoPublicRequest{

	@ApiDescription("见上面描述，办理地点 ,同stationCode")
	@ApiDemoData("0")
	@NotNull
	private Integer addressType ;
	
	public Integer getAddressType() {
		return addressType;
	}

	public void setAddressType(Integer addressType) {
		this.addressType = addressType;
	}

	public void setStationCode(Integer stationCode) {
		this.addressType = stationCode;
	} 
	
}
