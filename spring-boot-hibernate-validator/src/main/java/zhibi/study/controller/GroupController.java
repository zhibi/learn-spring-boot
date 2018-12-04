package zhibi.study.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhibi.study.group.GroupA;
import zhibi.study.group.GroupB;
import zhibi.study.group.GroupC;
import zhibi.study.query.GroupQuery;

/**
 * @author Dream笔
 * @date 2018/12/4 11:30
 */
@RestController
public class GroupController {

    @RequestMapping("groupA")
    public String groupA(@Validated(GroupA.class) GroupQuery group, BindingResult result){
        StringBuilder builder = new StringBuilder();
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> builder.append(error.getDefaultMessage()));
        }
        return builder.toString();
    }

    @RequestMapping("groupB")
    public String groupB(@Validated(GroupB.class) GroupQuery group, BindingResult result){
        StringBuilder builder = new StringBuilder();
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> builder.append(error.getDefaultMessage()));
        }
        return builder.toString();
    }


    @RequestMapping("groupC")
    public String groupC(@Validated(GroupC.class) GroupQuery group, BindingResult result){
        StringBuilder builder = new StringBuilder();
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> builder.append(error.getDefaultMessage()));
        }
        return builder.toString();
    }
}
