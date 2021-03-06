package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
public abstract class BaseApplog<M extends BaseApplog<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setAppType(java.lang.Integer appType) {
		set("app_type", appType);
	}

	public java.lang.Integer getAppType() {
		return get("app_type");
	}

	public void setDeviceType(java.lang.Integer deviceType) {
		set("device_type", deviceType);
	}

	public java.lang.Integer getDeviceType() {
		return get("device_type");
	}

	public void setLogPath(java.lang.String logPath) {
		set("log_path", logPath);
	}

	public java.lang.String getLogPath() {
		return get("log_path");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}


	public void setVersionCode(Integer versionCode){set("version_code",versionCode);}

	public Integer getVersionCode(){return get("version_code");}
}
