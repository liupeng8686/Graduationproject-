package com.wbg.sums.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class MonthlyPlanSummary {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_plan_summary.m_id
     *
     * @mbg.generated
     */
    private int mId;

    public DepartmentType getDepartmenttype() {
        return departmenttype;
    }

    public void setDepartmenttype(DepartmentType departmenttype) {
        this.departmenttype = departmenttype;
    }

    private DepartmentType departmenttype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_plan_summary.m_title
     *
     * @mbg.generated
     */
    private String mTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_plan_summary.d_id
     *
     * @mbg.generated
     */
    private int dId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_plan_summary.m_date
     *
     * @mbg.generated
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date mDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_plan_summary.m_file
     *
     * @mbg.generated
     */
    private String mFile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_plan_summary.m_remarks
     *
     * @mbg.generated
     */
    private String mRemarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_plan_summary.m_m_id
     *
     * @mbg.generated
     */
    private String mName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_plan_summary.m_contexts
     *
     * @mbg.generated
     */
    private String mContexts;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_plan_summary.m_id
     *
     * @return the value of monthly_plan_summary.m_id
     *
     * @mbg.generated
     */
    public int getmId() {
        return mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_plan_summary.m_id
     *
     * @param mId the value for monthly_plan_summary.m_id
     *
     * @mbg.generated
     */
    public void setmId(int mId) {
        this.mId = mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_plan_summary.m_title
     *
     * @return the value of monthly_plan_summary.m_title
     *
     * @mbg.generated
     */
    public String getmTitle() {
        return mTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_plan_summary.m_title
     *
     * @param mTitle the value for monthly_plan_summary.m_title
     *
     * @mbg.generated
     */
    public void setmTitle(String mTitle) {
        this.mTitle = mTitle == null ? null : mTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_plan_summary.d_id
     *
     * @return the value of monthly_plan_summary.d_id
     *
     * @mbg.generated
     */
    public int getdId() {
        return dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_plan_summary.d_id
     *
     * @param dId the value for monthly_plan_summary.d_id
     *
     * @mbg.generated
     */
    public void setdId(int dId) {
        this.dId = dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_plan_summary.m_date
     *
     * @return the value of monthly_plan_summary.m_date
     *
     * @mbg.generated
     */
    public Date getmDate() {
        return mDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_plan_summary.m_date
     *
     * @param mDate the value for monthly_plan_summary.m_date
     *
     * @mbg.generated
     */
    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_plan_summary.m_file
     *
     * @return the value of monthly_plan_summary.m_file
     *
     * @mbg.generated
     */
    public String getmFile() {
        return mFile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_plan_summary.m_file
     *
     * @param mFile the value for monthly_plan_summary.m_file
     *
     * @mbg.generated
     */
    public void setmFile(String mFile) {
        this.mFile = mFile == null ? null : mFile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_plan_summary.m_remarks
     *
     * @return the value of monthly_plan_summary.m_remarks
     *
     * @mbg.generated
     */
    public String getmRemarks() {
        return mRemarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_plan_summary.m_remarks
     *
     * @param mRemarks the value for monthly_plan_summary.m_remarks
     *
     * @mbg.generated
     */
    public void setmRemarks(String mRemarks) {
        this.mRemarks = mRemarks == null ? null : mRemarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_plan_summary.m_m_id
     *
     * @return the value of monthly_plan_summary.m_m_id
     *
     * @mbg.generated
     */
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_plan_summary.m_contexts
     *
     * @return the value of monthly_plan_summary.m_contexts
     *
     * @mbg.generated
     */
    public String getmContexts() {
        return mContexts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_plan_summary.m_contexts
     *
     * @param mContexts the value for monthly_plan_summary.m_contexts
     *
     * @mbg.generated
     */
    public void setmContexts(String mContexts) {
        this.mContexts = mContexts == null ? null : mContexts.trim();
    }
}