package learn.zhibi.lasticsearch.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * @author 执笔
 * @date 2019/9/19 17:51
 */
@Data
@Document(indexName = "spring-boot", type = "user")
public class User {

    /**
     *
     */
    @Id
    private String id;

    /**
     *
     */
    @Field(store = true, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String name;

    /**
     *
     */
    @Field(store = true, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String address;
}
