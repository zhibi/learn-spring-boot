package zhibi.learn.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhibi.learn.query.I18nQuery;

import javax.validation.Valid;

/**
 * @author 执笔
 * @date 2018/12/2 19:16
 */
@RestController
public class I18nController {

    /**
     * i18n请求
     *
     * @param i18nQuery
     * @param result
     * @return
     */
    @RequestMapping("i18n")
    public String i18n(@Valid I18nQuery i18nQuery, BindingResult result) {
        StringBuilder builder = new StringBuilder();
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> builder.append(error.getDefaultMessage()));
        }
        return builder.toString();
    }

}
