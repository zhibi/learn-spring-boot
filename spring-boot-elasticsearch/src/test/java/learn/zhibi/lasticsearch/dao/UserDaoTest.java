package learn.zhibi.lasticsearch.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author 执笔
 * @date 2019/9/20 9:22
 */
@SpringBootTest
@DataJpaTest
class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    void testInsert() {

    }
}