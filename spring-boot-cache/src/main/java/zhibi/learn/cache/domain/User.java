package zhibi.learn.cache.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 执笔
 * @date 2019/7/11 16:56
 */
@Data
public class User implements Serializable {

    /**
     * 名字
     */
    private String name;

    private Date addTime;

    private Address address;
}
