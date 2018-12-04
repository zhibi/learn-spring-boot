package zhibi.study.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Dream笔
 * @date 2018/12/4 10:38
 */
@RestController
@Validated
public class ParamController {


    @RequestMapping("param")
    public String param(
            @NotNull(message = "用户名不能为空") String name,
            @NotBlank(message = "密码不能为空") String password) {
        return "OK";
    }

}
