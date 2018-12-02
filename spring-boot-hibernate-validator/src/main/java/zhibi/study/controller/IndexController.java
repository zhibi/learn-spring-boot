package zhibi.study.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhibi.study.query.UserQuery;

import javax.validation.Valid;

/**
 * @author Dream笔
 * @date 2018/12/1 21:01
 */
@RestController
public class IndexController {

    /**
     * 测试环境的搭建
     *
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "OK";
    }

    /**
     * 简单的校验
     * @param userQuery
     * @param result
     * @return
     */
    @RequestMapping("simple")
    public String simple(@Valid UserQuery userQuery, BindingResult result) {
        StringBuilder builder = new StringBuilder();
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> builder.append(error.getDefaultMessage()));
        }
        return builder.toString();
    }

}
