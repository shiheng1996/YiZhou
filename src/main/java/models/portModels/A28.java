package models.portModels;


import annotation.TableBind;
import base.portModels.BaseA28;

import java.util.List;

/**
 * Generated by JFinal.
 */
@TableBind(tableName = "A28")
public class A28 extends BaseA28<A28> {
	public static final A28 dao = new A28();
	public List<A28> findCompany(){
		return  find("Select * from A28");
	}
}
