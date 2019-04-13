package zhibi.learn.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhibi.learn.query.UserQuery;

/**
 * @author 执笔
 * @date 2018/12/4 14:15
 */
@RestController
public class ExceptionController {

    @RequestMapping("object")
    public String object(@Validated UserQuery userQuery) {
        return "ok";
    }
}
