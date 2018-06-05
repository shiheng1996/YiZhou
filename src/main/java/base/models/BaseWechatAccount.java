package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWechatAccount<M extends BaseWechatAccount<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setAppId(String appId) {
		set("app_id", appId);
	}

	public String getAppId() {
		return get("app_id");
	}

	public void setAppSecret(String appSecret) {
		set("app_secret", appSecret);
	}

	public String getAppSecret() {
		return get("app_secret");
	}

	public void setToken(String token) {
		set("token", token);
	}

	public String getToken() {
		return get("token");
	}

	public void setAccount(String account) {
		set("account", account);
	}

	public String getAccount() {
		return get("account");
	}

	public void setLastUpdateTime(java.util.Date lastUpdateTime) {
		set("last_update_time", lastUpdateTime);
	}

	public java.util.Date getLastUpdateTime() {
		return get("last_update_time");
	}

}