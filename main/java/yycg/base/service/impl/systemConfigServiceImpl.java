package yycg.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import yycg.base.dao.mapper.SysuserCustomMapper;
import yycg.base.pojo.po.Sysuser;
import yycg.base.service.systemConfigService;

public class systemConfigServiceImpl implements systemConfigService{
	@Autowired
	SysuserCustomMapper sysuserCustomerMapper;
	
	@Override
	public List<Sysuser> findDropDownList(String tdh)
		throws Exception {
		return sysuserCustomerMapper.findUserList(tdh);
	}

}
