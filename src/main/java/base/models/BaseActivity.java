package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseActivity<M extends BaseActivity<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setName(String name) {
		set("name", name);
	}

	public String getName() {
		return get("name");
	}

	public void setLogo(String logo) {
		set("logo", logo);
	}

	public String getLogo() {
		return get("logo");
	}

	public void setEvent(Integer event) {
		set("event", event);
	}

	public Integer getEvent() {
		return get("event");
	}

	public void setStartTime(java.util.Date startTime) {
		set("start_time", startTime);
	}

	public java.util.Date getStartTime() {
		return get("start_time");
	}

	public void setEndTime(java.util.Date endTime) {
		set("end_time", endTime);
	}

	public java.util.Date getEndTime() {
		return get("end_time");
	}

	public void setType(Integer type) {
		set("type", type);
	}

	public Integer getType() {
		return get("type");
	}

	public void setRebate(java.math.BigDecimal rebate) {
		set("rebate", rebate);
	}

	public java.math.BigDecimal getRebate() {
		return get("rebate");
	}

	public void setCoupon(Long coupon) {
		set("coupon", coupon);
	}

	public Long getCoupon() {
		return get("coupon");
	}

	public void setDescription(String description) {
		set("description", description);
	}

	public String getDescription() {
		return get("description");
	}

	public void setStatus(Integer status) {
		set("status", status);
	}

	public Integer getStatus() {
		return get("status");
	}

	public void setCompany(Integer company) {
		set("company", company);
	}

	public Integer getCompany() {
		return get("company");
	}

	public void setOrderType(String orderType) {
		set("order_type", orderType);
	}

	public String getOrderType() {
		return get("order_type");
	}

	public void setPayType(String payType) {
		set("pay_type", payType);
	}

	public String getPayType() {
		return get("pay_type");
	}

	public void setServiceType(String serviceType) {
		set("service_type", serviceType);
	}

	public String getServiceType() {
		return get("service_type");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setMinOrderCount(Integer minOrderCount) {
		set("min_order_count", minOrderCount);
	}

	public Integer getMinOrderCount() {
		return get("min_order_count");
	}

	public void setJoinTimes(Integer joinTimes) {
		set("join_times", joinTimes);
	}

	public Integer getJoinTimes() {
		return get("join_times");
	}

	public void setNoticeType(String noticeType) {
		set("notice_type", noticeType);
	}

	public String getNoticeType() {
		return get("notice_type");
	}

}