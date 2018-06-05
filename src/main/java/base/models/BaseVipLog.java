package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseVipLog<M extends BaseVipLog<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setVipId(Integer vipId) {
		set("vip_id", vipId);
	}

	public Integer getVipId() {
		return get("vip_id");
	}

	public void setLoginId(Integer loginId) {
		set("login_id", loginId);
	}

	public Integer getLoginId() {
		return get("login_id");
	}

	public void setLogContent(String logContent) {
		set("log_content", logContent);
	}

	public String getLogContent() {
		return get("log_content");
	}

	public void setUseAmount(java.math.BigDecimal useAmount) {
		set("use_amount", useAmount);
	}

	public java.math.BigDecimal getUseAmount() {
		return get("use_amount");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}