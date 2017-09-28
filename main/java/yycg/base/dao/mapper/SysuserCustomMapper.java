package yycg.base.dao.mapper;

import java.util.List;

import yycg.base.pojo.po.Sysuser;
import yycg.base.pojo.vo.QueryVo;

public interface SysuserCustomMapper {
	// 查询单条数据信息
	public Sysuser findSysuserById(String tzbh) throws Exception;
	
	// 查询列表
	public List<Sysuser> findUserList(String jftz) throws Exception;
	
	// 多条件查询列表
	public List<Sysuser> findUserListByVo(QueryVo queryVo) throws Exception;
	
	// 返回查询列表总数
	public int getUserListCount(QueryVo queryVo) throws Exception;
	
}
