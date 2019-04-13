package zhibi.learn.devtools.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author 执笔
 * @date 2019/4/13 11:08
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(HttpSession session) {
        session.setAttribute("test", "sss");
        return "index";
    }

    @RequestMapping("/test")
    public Object test(HttpSession session) {
        System.out.println("111222211");
        return session.getAttribute("test");
    }
}
