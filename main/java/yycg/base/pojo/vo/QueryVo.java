package yycg.base.pojo.vo;

import yycg.base.pojo.po.JfTz;
import yycg.base.pojo.po.Sysuser;

public class QueryVo {
	
	//分页参数
	private PageQuery pageQuery;
	//用户的查询条件
	private  Sysuser sysuser;
	private JfTz jfTz;
	//可以扩展多个属性
	//....
	public Sysuser getSysuser() {
		return sysuser;
	}

	public void setSysuser(Sysuser sysuser) {
		this.sysuser = sysuser;
	}
	public JfTz getJfTz() {
		return jfTz;
	}

	public void setJfTz(JfTz jftz) {
		this.jfTz = jftz;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
	

}