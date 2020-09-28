package com.example.demo.service;

import com.example.demo.entity.DepartDict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lxh
 * @since 2020-09-28
 */
public interface DepartDictService extends IService<DepartDict> {
    List<DepartDict> SelectList();    //查询列表
    List<DepartDict> SelectPage();   //分页查询
    List<DepartDict> SelectDim();    //模糊查询
}
