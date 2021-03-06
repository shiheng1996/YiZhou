package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAlarm<M extends BaseAlarm<M>> extends Model<M> implements IBean {

    public void setId(Integer id) {
        set("id", id);
    }

    public Integer getId() {
        return get("id");
    }

    public void setAlarmLoginId(Integer alarmLoginId) {
        set("alarm_login_id", alarmLoginId);
    }

    public Integer getAlarmLoginId() {
        return get("alarm_login_id");
    }

    public void setCompanyId(Integer companyId) {
        set("company_id", companyId);
    }

    public void setBackPhone(java.lang.String backPhone) {
        set("back_phone", backPhone);
    }

    public java.lang.String getBackPhone() {
        return get("back_phone");
    }

    public Integer getCompanyId() {
        return get("company_id");
    }

    public void setAlarmName(String alarmName) {
        set("alarm_name", alarmName);
    }

    public String getAlarmName() {
        return get("alarm_name");
    }

    public void setAlarmMessage(String alarmMessage) {
        set("alarm_message", alarmMessage);
    }

    public String getAlarmMessage() {
        return get("alarm_message");
    }

    public void setDisposeMessage(String disposeMessage) {
        set("dispose_message", disposeMessage);
    }

    public String getDisposeMessage() {
        return get("dispose_message");
    }

    public void setUserId(Integer userId) {
        set("user_id", userId);
    }

    public Integer getUserId() {
        return get("user_id");
    }

    public void setStatus(Integer status) {
        set("status", status);
    }

    public Integer getStatus() {
        return get("status");
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
