package com.wbg.sums.dao;

import com.wbg.sums.dto.RolesAndPermissions;
import com.wbg.sums.entity.Backups;
import com.wbg.sums.entity.Roles;

import java.util.List;

public interface RolesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backups
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer rId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backups
     *
     * @mbg.generated
     */
    int insert(Roles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backups
     *
     * @mbg.generated
     */
    Roles selectByPrimaryKey(Integer rId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backups
     *
     * @mbg.generated
     */
    List<Roles> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table backups
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Roles record);
    int count();
    List<RolesAndPermissions>  rolesAndpermissions(String rName);
    int counts(String rName);
}
