package com.huaao.sunejwapi.dao;

import java.io.Serializable;

public class SysLogsRequestWithBLOBs extends SysLogsRequest implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_logs_request.request_params
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    private String requestParams;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_logs_request.response_content
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    private String responseContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_logs_request.error_trace
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    private String errorTrace;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_logs_request
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_logs_request.request_params
     *
     * @return the value of sys_logs_request.request_params
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    public String getRequestParams() {
        return requestParams;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_logs_request.request_params
     *
     * @param requestParams the value for sys_logs_request.request_params
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams == null ? null : requestParams.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_logs_request.response_content
     *
     * @return the value of sys_logs_request.response_content
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    public String getResponseContent() {
        return responseContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_logs_request.response_content
     *
     * @param responseContent the value for sys_logs_request.response_content
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent == null ? null : responseContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_logs_request.error_trace
     *
     * @return the value of sys_logs_request.error_trace
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    public String getErrorTrace() {
        return errorTrace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_logs_request.error_trace
     *
     * @param errorTrace the value for sys_logs_request.error_trace
     *
     * @mbggenerated Wed Jun 07 17:39:30 CST 2017
     */
    public void setErrorTrace(String errorTrace) {
        this.errorTrace = errorTrace == null ? null : errorTrace.trim();
    }
}