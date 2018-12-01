package zhibi.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dream笔
 * @date 2018/12/1 21:01
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "OK";
    }
}
