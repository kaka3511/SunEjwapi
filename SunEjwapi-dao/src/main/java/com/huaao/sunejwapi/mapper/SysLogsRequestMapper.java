package com.huaao.sunejwapi.mapper;

import com.huaao.sunejwapi.dao.SysLogsRequest;
import com.huaao.sunejwapi.dao.SysLogsRequestExample;
import com.huaao.sunejwapi.dao.SysLogsRequestWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogsRequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    int countByExample(SysLogsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    int deleteByExample(SysLogsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    int deleteByPrimaryKey(String reqId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    int insert(SysLogsRequestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    int insertSelective(SysLogsRequestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    List<SysLogsRequestWithBLOBs> selectByExampleWithBLOBs(SysLogsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    List<SysLogsRequest> selectByExample(SysLogsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    SysLogsRequestWithBLOBs selectByPrimaryKey(String reqId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    int updateByExampleSelective(@Param("record") SysLogsRequestWithBLOBs record, @Param("example") SysLogsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") SysLogsRequestWithBLOBs record, @Param("example") SysLogsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    int updateByExample(@Param("record") SysLogsRequest record, @Param("example") SysLogsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    int updateByPrimaryKeySelective(SysLogsRequestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(SysLogsRequestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    int updateByPrimaryKey(SysLogsRequest record);
}