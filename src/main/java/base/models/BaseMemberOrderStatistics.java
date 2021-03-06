package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMemberOrderStatistics<M extends BaseMemberOrderStatistics<M>> extends Model<M> implements IBean {
    
    public void setId(Integer id) {
        set("id", id);
    }
    
    public Integer getId() {
        return get("id");
    }
    
    @Deprecated
    public void setLoginId(Integer loginId) {
        set("login_id", loginId);
    }
    
    @Deprecated
    public Integer getLoginId() {
        return get("login_id");
    }
    
    public void setMemberId(Integer memberId) {
        set("member_id", memberId);
    }
    
    public Integer getMemberId() {
        return get("member_id");
    }
    
    public void setOrderNum(Integer orderNum) {
        set("order_num", orderNum);
    }
    
    public Integer getOrderNum() {
        return get("order_num");
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
