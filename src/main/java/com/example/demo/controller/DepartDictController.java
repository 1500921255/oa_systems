package com.example.demo.controller;


import com.example.demo.common.Result;
import com.example.demo.entity.DepartDict;
import com.example.demo.service.DepartDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lxh
 * @since 2020-09-28
 */
@RestController
@RequestMapping("/depart-dict")
public class DepartDictController {
    @Autowired
    private DepartDictService departDictService;

    @GetMapping("employees")
    public Result selectList() {
        List<DepartDict> list = departDictService.SelectList();
        if (list == null) {
            return Result.succ(401, "暂无数据", null);
        } else {
            return Result.succ(200, "查询成功", list);
        }
    }
    @GetMapping("employeesPage")
    public Result selectPage() {
        List<DepartDict> list = departDictService.SelectPage();
        if (list == null) {
            return Result.succ(401, "暂无数据", null);
        } else {
            return Result.succ(200, "查询成功", list);
        }
    }
    @GetMapping("employeesDim")
    public Result selectDim() {
        List<DepartDict> list = departDictService.SelectDim();
        if (list == null) {
            return Result.succ(401, "暂无数据", null);
        } else {
            return Result.succ(200, "查询成功", list);
        }
    }
}
