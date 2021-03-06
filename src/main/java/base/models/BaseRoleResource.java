package base.models;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRoleResource<M extends BaseRoleResource<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setResource(Integer resource) {
		set("resource", resource);
	}

	public Integer getResource() {
		return get("resource");
	}

	public void setRoleId(Integer roleId) {
		set("role_id", roleId);
	}

	public Integer getRoleId() {
		return get("role_id");
	}

}
