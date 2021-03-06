package base.portModels;

import com.alibaba.fastjson.annotation.JSONField;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;
import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseA8<M extends BaseA8<M>> extends Model<M> implements IBean {

/*	@Ignore
	public void setId(Long id) {
		set("id", id);
	}
	@Ignore
	public Long getId() {
		return get("id");
	}*/
	@JSONField(name = "CompanyId")
	public void setCompanyId(String CompanyId) {
		set("CompanyId", CompanyId);
	}
	@JSONField(name = "CompanyId")
	public String getCompanyId() {
		return get("CompanyId");
	}
	@JSONField(name = "PayName")
	public void setPayName(String PayName) {
		set("PayName", PayName);
	}
	@JSONField(name = "PayName")
	public String getPayName() {
		return get("PayName");
	}
	@JSONField(name = "PayId")
	public void setPayId(String PayId) {
		set("PayId", PayId);
	}
	@JSONField(name = "PayId")
	public String getPayId() {
		return get("PayId");
	}
	@JSONField(name = "PayType")
	public void setPayType(String PayType) {
		set("PayType", PayType);
	}
	@JSONField(name = "PayType")
	public String getPayType() {
		return get("PayType");
	}
	@JSONField(name = "PayScope")
	public void setPayScope(String PayScope) {
		set("PayScope", PayScope);
	}
	@JSONField(name = "PayScope")
	public String getPayScope() {
		return get("PayScope");
	}
	@JSONField(name = "PrepareBank")
	public void setPrepareBank(String PrepareBank) {
		set("PrepareBank", PrepareBank);
	}
	@JSONField(name = "PrepareBank")
	public String getPrepareBank() {
		return get("PrepareBank");
	}
	@JSONField(name = "CountDate")
	public void setCountDate(Integer CountDate) {
		set("CountDate", CountDate);
	}
	@JSONField(name = "CountDate")
	public Integer getCountDate() {
		return get("CountDate");
	}
	@JSONField(name = "State")
	public void setState(Integer State) {
		set("State", State);
	}
	@JSONField(name = "State")
	public Integer getState() {
		return get("State");
	}
	@JSONField(name = "Flag")
	public void setFlag(Integer Flag) {
		set("Flag", Flag);
	}
	@JSONField(name = "Flag")
	public Integer getFlag() {
		return get("Flag");
	}
	@JSONField(name = "UpdateTime")
	public void setUpdateTime(Long UpdateTime) {
		set("UpdateTime", UpdateTime);
	}
	@JSONField(name = "UpdateTime")
	public Long getUpdateTime() {
		return get("UpdateTime");
	}

}
