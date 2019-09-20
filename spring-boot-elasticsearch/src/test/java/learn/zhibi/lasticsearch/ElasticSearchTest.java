package learn.zhibi.lasticsearch;

import learn.zhibi.lasticsearch.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

/**
 * @author 执笔
 * @date 2019/9/20 9:30
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ElasticSearchTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void testCreate() {
        assertTrue(elasticsearchTemplate.createIndex(User.class));
        // elasticsearchTemplate.putMapping()
    }

    @Test
    public void testCreateMapping(){
        assertTrue(elasticsearchTemplate.putMapping(User.class));
    }
}
