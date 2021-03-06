package base.models;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDriverTrain<M extends BaseDriverTrain<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setCoursename(String coursename) {
		set("coursename", coursename);
	}

	public String getCoursename() {
		return get("coursename");
	}

	public void setCoursedate(java.util.Date coursedate) {
		set("coursedate", coursedate);
	}

	public java.util.Date getCoursedate() {
		return get("coursedate");
	}

	public void setStarttime(java.util.Date starttime) {
		set("starttime", starttime);
	}

	public java.util.Date getStarttime() {
		return get("starttime");
	}

	public void setStoptime(java.util.Date stoptime) {
		set("stoptime", stoptime);
	}

	public java.util.Date getStoptime() {
		return get("stoptime");
	}

	public void setDuration(java.math.BigDecimal duration) {
		set("duration", duration);
	}

	public java.math.BigDecimal getDuration() {
		return get("duration");
	}

	public void setFlag(Integer flag) {
		set("flag", flag);
	}

	public Integer getFlag() {
		return get("flag");
	}

	public void setUpdatetime(java.util.Date updatetime) {
		set("updatetime", updatetime);
	}

	public java.util.Date getUpdatetime() {
		return get("updatetime");
	}

	public void setDriverId(Integer driverId) {
		set("driver_id", driverId);
	}

	public Integer getDriverId() {
		return get("driver_id");
	}

}
