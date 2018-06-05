package models.portModels;


import utils.DateUtil;
import annotation.TableBind;
import base.Constant;
import base.portModels.BaseA22;
import models.driver.DriverInfo;

import java.util.Date;
import java.util.List;

/**
 * Generated by JFinal.
 */
@TableBind(tableName = "A22")
public class A22 extends BaseA22<A22> {
	public static final A22 dao = new A22();
	public List<A22> findCompany(){
		return  find("SELECT * FROM a22 WHERE LicenseId IS NOT NULL");
	}


	public List<A22> findDriverInfo(){
		return  find("SELECT a.LicenseId,b.VehicleNo,a.DriverPhone,a.DriverName,b.Model,c.OrderId,c.BookDepTime FROM  `a22` a LEFT JOIN `a16`  b ON (a.DriverName=b.OwnerName) LEFT JOIN a46 c ON (a.DriverName=c.DriverName) WHERE  b.VehicleNo IS NOT NULL ");
	}

	public A22 DriverInfo(String LicenseId){
		return  findFirst("SELECT * FROM  `a22` where LicenseId='"+LicenseId+"' ");
	}



	public void SetInfos(){
		List<DriverInfo> list = DriverInfo.dao.driverInfos();
		for (int i = 0;i<list.size();i++){
			DriverInfo driverInfo = list.get(i);
			try {
				A22 A22 = new A22();
				A22.setDriverName((String) driverInfo.get("DriverName"));
				A22.setDriverPhone((String) driverInfo.get("DriverPhone"));
				int g = driverInfo.get("DriverGender");
				switch (g){
					case 1 : A22.setDriverGender("1");
					break;

					case 2 : A22.setDriverGender("9");
					break;

					case 0 : A22.setDriverGender("2");
					break;

					default: A22.setDriverGender("9");
					break;
				}
				A22.setDriverBirthday(DateUtil.dateToLongYMD((Date) driverInfo.get("DriverBirthday")));
				A22.setDriverNationality((String) driverInfo.get("DriverNationality"));
				A22.setDriverNation((String) driverInfo.get("DriverNation"));
				A22.setDriverMaritalStatus((String) driverInfo.get("DriverMaritalStatus"));
//				A22.setDriverLanguageLevel((String) driverInfo.get("DriverLanguageLevel"));
				A22.setDriverLanguageLevel("51");
				A22.setDriverEducation((String) driverInfo.get("DriverEducation"));
				A22.setDriverAddress((String) driverInfo.get("DriverAddress"));
				A22.setDriverContactAddress((String) driverInfo.get("DriverContactAddress"));
//				A22.setPhotoId((String) driverInfo.get("PhotoId"));
				A22.setLicenseId((String) driverInfo.get("LicenseId"));
//				A22.setLicensePhotoId((String) driverInfo.get("LicensePhotoId"));
				A22.setDriverType((String) driverInfo.get("DriverType"));
				A22.setGetDriverLicenseDate(DateUtil.dateToLongYMD((Date) driverInfo.get("GetDriverLicenseDate")));
				A22.setDriverLicenseOn(DateUtil.dateToLongYMD((Date) driverInfo.get("DriverLicenseOn")));
				A22.setDriverLicenseOff(DateUtil.dateToLongYMD((Date) driverInfo.get("DriverLicenseOff")));
				A22.setTaxiDriver((Integer) driverInfo.get("TaxiDriver"));
				A22.setCertificateNo((String) driverInfo.get("CertificateNo"));
				A22.setNetworkCarIssueOrganization((String) driverInfo.get("NetworkCarIssueOrganization"));
				A22.setNetworkCarIssueDate(DateUtil.dateToLongYMD((Date) driverInfo.get("NetworkCarIssueDate")));
				A22.setGetNetworkCarProofDate(DateUtil.dateToLongYMD((Date) driverInfo.get("NetworkCarProofOn")));
				A22.setNetworkCarProofOff(DateUtil.dateToLongYMD((Date) driverInfo.get("NetworkCarProofOff")));
				A22.setRegisterDate(DateUtil.dateToLongYMD((Date) driverInfo.get("RegisterDate")));
				A22.setFullTimeDriver(1);
				A22.setDriverCensus((String) driverInfo.get("DriverCensus","合肥市瑶海区公安局"));
//				A22.setFullTimeDriver((Integer) driverInfo.get("FullTimeDriver"));
				A22.setInDriverBlacklist((Integer) driverInfo.get("InDriverBlacklist"));
				A22.setCommercialType((Integer) driverInfo.get("CommercialType"));
				A22.setContractCompany((String) driverInfo.get("ContractCompany"));
				A22.setContractOn(DateUtil.dateToLongYMD((Date) driverInfo.get("ContractOn")));
				A22.setContractOff(DateUtil.dateToLongYMD((Date) driverInfo.get("ContractOff")));
				A22.setEmergencyContact((String) driverInfo.get("EmergencyContact"));
				A22.setEmergencyContactAddress((String) driverInfo.get("EmergencyContactAddress"));
				A22.setEmergencyContactPhone((String) driverInfo.get("EmergencyContactPhone"));
				A22.setState(0);
//				A22.setState((Integer) driverInfo.get("State"));
				A22.setFlag(Constant.Flag.ADD);
				A22.setUpdateTime(DateUtil.UpdateTime());
				A22.save();
			}catch (NullPointerException e){
				System.out.println("手机号码："+driverInfo.get("DriverPhone")+"插入A22错误");
				continue;
			}
		}
	}

}