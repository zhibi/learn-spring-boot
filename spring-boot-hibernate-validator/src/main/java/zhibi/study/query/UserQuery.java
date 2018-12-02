package zhibi.study.query;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Dream笔
 * @date 2018/12/2 17:33
 */
@Data
public class UserQuery {

    /**
     * 用户名
     */
    @NotNull(message = "用户名必填")
    private String name;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;

}
