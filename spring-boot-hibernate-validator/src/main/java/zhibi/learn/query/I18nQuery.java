package zhibi.learn.query;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author 执笔
 * @date 2018/12/2 19:14
 */
@Data
public class I18nQuery {

    /**
     * 名字
     */
    @NotBlank(message = "{name.not.null}")
    private String name;

    /**
     * 密码
     */
    @Size(min = 2,max = 9,message = "{password.size.error}")
    private String password;



    /**
     * 年龄
     */
    @Min(value = 12,message = "{age.size.error}")
    private Integer age;

}
