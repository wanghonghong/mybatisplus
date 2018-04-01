package net.joywise.mybatisplus.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import net.joywise.mybatisplus.model.TSource;
import net.joywise.mybatisplus.service.TSourceService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author K神带你飞
 * @since 2018-04-01
 */
@RestController
@RequestMapping("/tSource")
public class TSourceController {

    @Resource
    private TSourceService tSourceService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public Object getSource() {
        return tSourceService.selectList(new EntityWrapper<>());
    }


    @RequestMapping(value = "insert",method = RequestMethod.GET)
    public Object insert() {
        TSource tSource = new TSource();
        tSource.setFileName("wwwwwwwwww");
        return tSourceService.insert(tSource);
    }

    @RequestMapping(value = "update",method = RequestMethod.GET)
    public Object update(String id) {
        TSource tSource = tSourceService.selectById(id);
        tSource.setFailReason("bbbbb");
        tSource.updateById();
        return tSource;
    }
}

