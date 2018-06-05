package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDriverOnlineDetail<M extends BaseDriverOnlineDetail<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setDriver(Integer driver) {
		set("driver", driver);
	}

	public Integer getDriver() {
		return get("driver");
	}

	public void setDate(java.util.Date date) {
		set("date", date);
	}

	public java.util.Date getDate() {
		return get("date");
	}

	public void setOperatType(Integer operatType) {
		set("operat_type", operatType);
	}

	public Integer getOperatType() {
		return get("operat_type");
	}

	public void setOperatTime(java.util.Date operatTime) {
		set("operat_time", operatTime);
	}

	public java.util.Date getOperatTime() {
		return get("operat_time");
	}

	public void setAutoFlag(Boolean autoFlag) {
		set("auto_flag", autoFlag);
	}

	public Boolean getAutoFlag() {
		return get("auto_flag");
	}

	public void setTime(Integer time) {
		set("time", time);
	}

	public Integer getTime() {
		return get("time");
	}

}