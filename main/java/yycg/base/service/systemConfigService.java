package yycg.base.service;
 
import java.util.List;

import yycg.base.pojo.po.Sysuser;

public interface systemConfigService {
	public List<Sysuser> findDropDownList(String tdh) throws Exception;
}