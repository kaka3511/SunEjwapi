package com.huaao.sunejwapi.mapper;

import com.huaao.sunejwapi.dao.SpsSDictionary;
import com.huaao.sunejwapi.dao.SpsSDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpsSDictionaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sps_s_dictionary
     *
     * @mbggenerated Sat May 27 10:52:47 CST 2017
     */
    int countByExample(SpsSDictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sps_s_dictionary
     *
     * @mbggenerated Sat May 27 10:52:47 CST 2017
     */
    int deleteByExample(SpsSDictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sps_s_dictionary
     *
     * @mbggenerated Sat May 27 10:52:47 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sps_s_dictionary
     *
     * @mbggenerated Sat May 27 10:52:47 CST 2017
     */
    int insert(SpsSDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sps_s_dictionary
     *
     * @mbggenerated Sat May 27 10:52:47 CST 2017
     */
    int insertSelective(SpsSDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sps_s_dictionary
     *
     * @mbggenerated Sat May 27 10:52:47 CST 2017
     */
    List<SpsSDictionary> selectByExample(SpsSDictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sps_s_dictionary
     *
     * @mbggenerated Sat May 27 10:52:47 CST 2017
     */
    SpsSDictionary selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sps_s_dictionary
     *
     * @mbggenerated Sat May 27 10:52:47 CST 2017
     */
    int updateByExampleSelective(@Param("record") SpsSDictionary record, @Param("example") SpsSDictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sps_s_dictionary
     *
     * @mbggenerated Sat May 27 10:52:47 CST 2017
     */
    int updateByExample(@Param("record") SpsSDictionary record, @Param("example") SpsSDictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sps_s_dictionary
     *
     * @mbggenerated Sat May 27 10:52:47 CST 2017
     */
    int updateByPrimaryKeySelective(SpsSDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sps_s_dictionary
     *
     * @mbggenerated Sat May 27 10:52:47 CST 2017
     */
    int updateByPrimaryKey(SpsSDictionary record);
}