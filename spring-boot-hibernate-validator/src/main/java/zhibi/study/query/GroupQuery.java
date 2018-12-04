package zhibi.study.query;

import lombok.Data;
import zhibi.study.group.GroupA;
import zhibi.study.group.GroupB;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Dream笔
 * @date 2018/12/4 11:28
 */
@Data
public class GroupQuery {

    /**
     * 名字
     */
    @NotNull(message = "名字不能为null", groups = GroupA.class)
    @NotBlank(message = "名字不能为空", groups = GroupB.class)
    private String name;

    /**
     * 密码
     */
    @NotNull(message = "密码不能为null")
    private String password;

}
