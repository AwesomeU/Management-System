package yycg.base.service.impl;

import yycg.base.service.jftzService;
import yycg.utils.ResourcesUtil;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import yycg.base.dao.mapper.JfTzMapper;
import yycg.base.dao.mapper.SysuserCustomMapper;
import yycg.base.pojo.po.Sysuser;
import yycg.base.pojo.po.JfTz;
import yycg.base.pojo.po.JfTzExample;
import yycg.base.pojo.vo.QueryVo;
import yycg.base.process.context.Config;
import yycg.base.process.result.ExceptionResultInfo;
import yycg.base.process.result.ResultInfo;
import yycg.base.process.result.ResultUtil;

// 实现userService

public class iftzServiceImpl implements jftzService {
	
	// 通过就spring中的autowride方式查询
	@Autowired
	private SysuserCustomMapper jftzMapper;
	@Autowired
	private JfTzMapper myJfTzMapper;
	@Override
	public Sysuser findInfoByJfTz(String id) throws Exception {
		//调用mapper查询用户信息
		return jftzMapper.findSysuserById(id);

	}
	@Override
	public List<Sysuser> findUserList(String jftz)
		throws Exception {
		return jftzMapper.findUserList(jftz);
	}
	
	@Override
	public List<Sysuser> findUserListByVo(QueryVo queryVo)
		throws Exception {
		return jftzMapper.findUserListByVo(queryVo);
	}
	
	@Override
	public int getUserListCount(QueryVo queryVo)
		throws Exception {
		return jftzMapper.getUserListCount(queryVo);
	}
	
	@Override
	public void insertSysuser(JfTz sysuser)
		throws Exception {
		// 参数校验
		// 通用的参数合法校验：非空、长度
		// 使用工具类
		
		//数据业务合法性校验
		//账号唯一性校验，查询数据库字段重复
		//根据单号查询表，如果查询到则说明账号重复
		// selectByExample自定义条件查询
		JfTz jfTz = this.findUserById(sysuser.getTzbh());
		if(jfTz!=null) {
			// 账号存在
			// 抛出异常，可预知的异常
			//throw new Exception("单号重复");
			
			// 使用process中自定义异常类
			/*ResultInfo resultInfo = new ResultInfo();
			resultInfo.setType(ResultInfo.TYPE_RESULT_FAIL); // 调用resultInfo提供的方法及定义的常量
			// 使用国际化标准，从资源文件中获取异常信息
			String message = ResourcesUtil.getValue("resources.messages","200");
			
			// resultInfo.setMessage("单号重复");
			resultInfo.setMessage(message);*/
			
			// 使用ResultUtil构造resultInfo
			// ResultInfo resultInfo = ResultUtil.createFail("resources.messages", 200, null);
			
			// throw new ExceptionResultInfo(resultInfo);
			// throw也可以进行封装
			ResultUtil.throwExcepion(ResultUtil.createFail("resources.messages", 200, null));
		} else {
			myJfTzMapper.insert(sysuser);
		}
	}
	//根据单号查询箱子信息——可抽出来放到接口使用
	public JfTz findUserById(String tzbh)throws Exception{
		JfTzExample jftzExample = new JfTzExample();
		JfTzExample.Criteria criteria = jftzExample.createCriteria();
		// 设置查询条件，根据账号查询
		criteria.andTzbhEqualTo(tzbh);  
		List<JfTz> list = myJfTzMapper.selectByExample(jftzExample);
		
		// 说明数据库中一定存在数据，不为空返回数据，为空则返回null值
		if(list!=null && list.size() == 1){
			return list.get(0);
			
		}
		return null;
		// Sysuser sysuser = jftz.selectByExample(example)
	}
	@Override
	public void deleteSysuser(String id) throws Exception {
		// 校验约束
		// 校验用户是否存在
		JfTz jfTz = myJfTzMapper.selectByPrimaryKey(id);
		if(jfTz == null) {
			// 用户不存在
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 201, null));
		}
		// 执行删除
		myJfTzMapper.deleteByPrimaryKey(id);
		
	}
	@Override
	public void updateSysuser(String id, JfTz jfTz) throws Exception {
		// 非空校验
		// 修改用户的账号不允许占用别人的账号
		// 页面提交的账号可能用户修改的账号
		String userid_page = jfTz.getTzbh();
		// 数据库中的账号是用户的原始账号
		// 通过id查询数据库
		JfTz jfTz2 = myJfTzMapper.selectByPrimaryKey(id);
		if(jfTz2 == null){
			// 抛出异常
			// 找不到修改的用户信息
		}
		// 用户的原始账号
		String userid = jfTz2.getTzbh();
		if(!userid_page.equals(userid)){
			// 通过页面提交的账号查询数据库，如果查到说明占用的别人的账号
			JfTz jfTz3 = this.findUserById(userid_page);
			if (jfTz3 != null) {
				// 说明占用了别人的账号
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 203, null));
			}
		}
		
		// 调用mapper更新用户
		// 使用updateByPrimaryKey更新要先查询用户
		JfTz jftz_update = myJfTzMapper.selectByPrimaryKey(id);
		jftz_update.setTzbh(jfTz.getTzbh());
		jftz_update.setTdh(jfTz.getTdh());
		jftz_update.setKhbh(jfTz.getKhbh());
		jftz_update.setCmdm(jfTz.getCmdm());
		jftz_update.setHchc(jfTz.getHchc());
		jftz_update.setCc(jfTz.getCc());
		myJfTzMapper.updateByPrimaryKey(jftz_update);
	}
}
