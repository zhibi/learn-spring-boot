package zhibi.learn.cache;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import zhibi.learn.cache.domain.Address;

/**
 * @author 执笔
 * @date 2019/7/11 17:13
 */
public class ObjectMapperTest {

    @Test
    public void test() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Address      address      = new Address("123");
        System.out.println(objectMapper.writeValueAsBytes(address));
    }
}
