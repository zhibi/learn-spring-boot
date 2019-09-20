package learn.zhibi.lasticsearch.dao;

import learn.zhibi.lasticsearch.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 执笔
 * @date 2019/9/20 9:07
 */
@Repository
public interface UserDao extends ElasticsearchRepository<User, String> {
}
