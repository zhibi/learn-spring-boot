package zhibi.learn.cache.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 执笔
 * @date 2019/7/11 16:56
 */
@Data
@AllArgsConstructor
public class Address implements Serializable {

    /**
     *
     */
    private String name;
}
