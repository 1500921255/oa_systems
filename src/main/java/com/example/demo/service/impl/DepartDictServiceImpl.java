package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.DepartDict;
import com.example.demo.mapper.DepartDictMapper;
import com.example.demo.service.DepartDictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lxh
 * @since 2020-09-28
 */
@Service
public class DepartDictServiceImpl extends ServiceImpl<DepartDictMapper, DepartDict> implements DepartDictService {

    @Autowired
    private DepartDictMapper departDictMapper;
    QueryWrapper<DepartDict> queryWrapper = new QueryWrapper();

    @Override
    public List<DepartDict> SelectList() {



        List<DepartDict> list=departDictMapper.selectList(queryWrapper);
        return list;
    }

    @Override
    public List<DepartDict> SelectPage() {



        IPage<DepartDict> page=new Page<>(1,5);
        page=departDictMapper.selectPage(page,null);
        return page.getRecords();
    }

    @Override
    public List<DepartDict> SelectDim() {

        List<DepartDict> list=departDictMapper.selectList(queryWrapper.like("depart_id",1));
        return list;
    }
}
