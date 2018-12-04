package zhibi.study.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * 为了简单  没有使用接口方式
 *
 * @author Dream笔
 * @date 2018/12/4 10:57
 */
@Service
@Validated
public class MethodService {

    public void param(@NotNull String name) {
        System.out.println(name);
    }
}
