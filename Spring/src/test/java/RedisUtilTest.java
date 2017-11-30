import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import validator.Person;

import java.util.Set;

/**
 * Created by Mosen on 2017/9/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/redis.xml"})
public class RedisUtilTest {

@Autowired
private StringRedisTemplate stringRedisTemplate;
@Autowired
private RedisTemplate redisTemplate;

    @Test
    public void testRedis() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("1111","6666");
        String str = ops.get("1111");
        System.out.println(str);
        ops.increment("1111",1);
        System.out.println(ops.get("1111"));
        Set<String> set = stringRedisTemplate.keys("*");
        System.out.println(set);
        stringRedisTemplate.delete("1111");
        System.out.println(stringRedisTemplate.hasKey("1111"));
    }

    @Test
    public void redisTemplateTest(){
        RedisSerializer<String> stringSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringSerializer );
        redisTemplate.setValueSerializer(stringSerializer );
        redisTemplate.setHashKeySerializer(stringSerializer );
        redisTemplate.setHashValueSerializer(stringSerializer );

        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
        ops.set("1111","6666");
        Object str = ops.get("1111");
        System.out.println(str);
        ops.increment("1111",1);
        System.out.println(ops.get("1111"));
        Set<String> set = redisTemplate.keys("*");
        System.out.println(set);
        redisTemplate.delete("1111");
        System.out.println(redisTemplate.hasKey("1111"));

    }

    @Test
    public void serializer(){
        Jackson2JsonRedisSerializer<Person> jsonRedisSerializer = new Jackson2JsonRedisSerializer<Person>(Person.class);
        RedisSerializer<String> stringSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringSerializer );
        redisTemplate.setValueSerializer(jsonRedisSerializer );
        Person person = new Person();
        person.setName("lisi");
        redisTemplate.opsForValue().set("111",person);
        /* boundValueOps.get(){ return this.ops.get(this.getKey()); } */
        Person p1 = (Person) redisTemplate.opsForValue().get("111");
        Person p2 = (Person) redisTemplate.boundValueOps("111").get();
        System.out.println(p1.getName());
        redisTemplate.delete("111");
    }

}
