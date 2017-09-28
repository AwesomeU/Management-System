package yycg.base.service;
 
import java.util.List;

import yycg.base.pojo.po.JfTz;
import yycg.base.pojo.po.Sysuser;
import yycg.base.pojo.vo.QueryVo;;
public interface jftzService {
	// 根据id查询信息
	public Sysuser findInfoByJfTz(String jftz) throws Exception;
	
	// 查询用户列表
	public List<Sysuser> findUserList(String tdh) throws Exception;
	
	// 查询用户列表
	public List<Sysuser> findUserListByVo(QueryVo queryVo) throws Exception;

	//传列表总数
	public int getUserListCount(QueryVo queryVo) throws Exception;
	
	// 添加用户
	public void insertSysuser(JfTz jfTz)throws Exception;
	
	// 判断当前id是否重复-根据账号来查询用户信息
	public JfTz findUserById(String jftz)throws Exception;
	
	// 删除用户
	public void deleteSysuser(String id)throws Exception;
	
	// 修改用户
	/**
	 * @param id 修改用户的主键值
	 * @param jfTz 用户的信息
	 * @throws Exception
	 */
	public void updateSysuser(String id, JfTz jfTz)throws Exception;
	
}

