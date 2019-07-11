package zhibi.learn.cache.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 执笔
 * @date 2019/7/11 17:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisCacheServiceTest {

    @Autowired
    private RedisCacheService redisCacheService;

    @Test
    public void selectList() {
        System.out.println(redisCacheService.selectList(2));
    }

    @Test
    public void updateList() {
        System.out.println(redisCacheService.updateList(2));
    }

    @Test
    public void del() {
        redisCacheService.del(2);
    }
}