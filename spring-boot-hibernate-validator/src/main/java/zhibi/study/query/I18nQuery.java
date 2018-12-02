package zhibi.study.query;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Dream笔
 * @date 2018/12/2 19:14
 */
@Data
public class I18nQuery {

    /**
     * 名字
     */
    @NotBlank(message = "{name.not.null}")
    private String name;


}
