package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCallBack<M extends BaseCallBack<M>> extends Model<M> implements IBean {

    public void setId(Integer id) {
        set("id", id);
    }

    public Integer getId() {
        return get("id");
    }

    public void setContent(String content) {
        set("content", content);
    }

    public String getContent() {
        return get("content");
    }

    public void setCreateTime(java.util.Date createTime) {
        set("create_time", createTime);
    }

    public java.util.Date getCreateTime() {
        return get("create_time");
    }

    public void setLoginId(Integer loginId) {
        set("login_id", loginId);
    }

    public Integer getLoginId() {
        return get("login_id");
    }

    public void setReplyContent(java.lang.String replyContent) {
        set("reply_content", replyContent);
    }

    public java.lang.String getReplyContent() {
        return get("reply_content");
    }

    public void setUserId(java.lang.Integer userId) {
        set("user_id", userId);
    }

    public java.lang.Integer getUserId() {
        return get("user_id");
    }

    public void setAppType(Integer appType) {
        set("app_type", appType);
    }

    public Integer getAppType() {
        return get("app_type");
    }

}
