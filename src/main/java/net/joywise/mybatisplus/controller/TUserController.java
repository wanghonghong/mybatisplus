package net.joywise.mybatisplus.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import net.joywise.mybatisplus.model.TUser;
import net.joywise.mybatisplus.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author K神带你飞
 * @since 2018-04-01
 */
@Controller
@RequestMapping("/tUser")
public class TUserController {

    @Resource
    private TUserService tUserService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public TUser getUser(Long userId) {
        return tUserService.getUser(userId);
    }


    @RequestMapping(value = "list",method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String,Object>> getUserList() {
        return tUserService.selectList();
    }

    @RequestMapping(value = "page",method = RequestMethod.GET)
    @ResponseBody
    public Page getUserPage(Page page) {
        return tUserService.selectPage(
                new Page<>(1,20),
                new EntityWrapper<TUser>().eq("email","445605973@qq.com")
                );
    }

    @RequestMapping(value = "user",method = RequestMethod.GET)
    @ResponseBody
    public Object getUser() {
        return tUserService.getUser();
    }

    @RequestMapping(value = "update",method = RequestMethod.GET)
    @ResponseBody
    public Object update(String id) {
        return tUserService.update(id);
    }
}

