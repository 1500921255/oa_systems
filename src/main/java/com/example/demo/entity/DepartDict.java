package com.example.demo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lxh
 * @since 2020-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DepartDict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门id
     */
    private Integer departId;

    /**
     * 部门名称
     */
    private String departName;

    /**
     * 新增时间
     */
    private LocalDateTime insertTime;


}
