package zhibi.study.service;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @author Dream笔
 * @date 2018/12/4 11:05
 */
@Validated
public class SimpleService {

    public void param(@NotNull String name) {
        System.out.println(name);
    }
}
