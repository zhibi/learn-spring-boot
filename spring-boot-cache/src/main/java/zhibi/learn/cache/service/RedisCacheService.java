package zhibi.learn.cache.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import zhibi.learn.cache.domain.Address;
import zhibi.learn.cache.domain.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 执笔
 * @date 2019/7/11 16:57
 */
@Service
@CacheConfig(cacheNames = "redis-cache")
public class RedisCacheService {

    @Cacheable
    public List<User> selectList(int num) {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            User user = new User();
            user.setName(System.currentTimeMillis() + "");
            user.setAddTime(new Date());
            user.setAddress(new Address("name+" + i));
            list.add(user);
        }
        return list;
    }

}
