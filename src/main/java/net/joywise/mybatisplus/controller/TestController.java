package net.joywise.mybatisplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author whh
 * @version 1.0.0
 * @Description:
 * @Copyright: 福建卓智网络科技有限公司 (c)2016
 * @Created Date : 2018/3/31 23:20
 */
@Controller
public class TestController {

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public String view1() {
        return "test";
    }


    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public String view2() {
        return "test";
    }





}
