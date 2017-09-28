package yycg.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yycg.base.pojo.po.JfTz;
import yycg.base.pojo.po.JfTzExample;

public interface JfTzMapper {
    int countByExample(JfTzExample example);

    int deleteByExample(JfTzExample example);

    int deleteByPrimaryKey(String tzbh);

    int insert(JfTz record);

    int insertSelective(JfTz record);

    List<JfTz> selectByExample(JfTzExample example);

    JfTz selectByPrimaryKey(String tzbh);

    int updateByExampleSelective(@Param("record") JfTz record, @Param("example") JfTzExample example);

    int updateByExample(@Param("record") JfTz record, @Param("example") JfTzExample example);

    int updateByPrimaryKeySelective(JfTz record);

    int updateByPrimaryKey(JfTz record);
}