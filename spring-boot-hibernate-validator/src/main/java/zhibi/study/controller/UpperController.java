package zhibi.study.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhibi.study.query.UpperQuery;

import javax.validation.Valid;

/**
 * @author Dream笔
 * @date 2018/12/4 13:31
 */
@RestController
public class UpperController {

    @RequestMapping("upper")
    public String upper(@Valid UpperQuery upperQuery, BindingResult result) {
        StringBuilder builder = new StringBuilder("error:");
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> builder.append(error.getDefaultMessage()));
        }
        return builder.toString();
    }
}
