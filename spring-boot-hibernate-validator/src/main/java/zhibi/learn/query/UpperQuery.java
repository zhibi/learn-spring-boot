package zhibi.learn.query;

import lombok.Data;
import zhibi.learn.valid.Upper;

/**
 * @author 执笔
 * @date 2018/12/4 13:32
 */
@Data
public class UpperQuery {

    @Upper(message = "名字必须大写")
    private String name;
}
