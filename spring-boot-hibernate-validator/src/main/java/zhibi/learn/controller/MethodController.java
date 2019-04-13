package zhibi.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhibi.learn.service.MethodService;
import zhibi.learn.service.SimpleService;

/**
 * @author 执笔
 * @date 2018/12/4 10:56
 */
@RestController
public class MethodController {

    @Autowired
    private MethodService methodService;

    @RequestMapping("method")
    public String method() {
        methodService.param(null);
        return "OK";
    }

    @RequestMapping("method2")
    public String method2() {
        SimpleService simpleService = new SimpleService();
        simpleService.param(null);
        return "OK";
    }
}
