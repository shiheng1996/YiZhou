package models.vip;

import annotation.TableBind;
import base.models.BaseVipLog;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@TableBind(tableName = "vip_log")
public class VipLog extends BaseVipLog<VipLog> {
    public static final VipLog dao = new VipLog();
}
