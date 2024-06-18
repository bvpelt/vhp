package nl.bsoft.vhp;

import lombok.extern.slf4j.Slf4j;
import nl.bsoft.vhp.model.Man;
import nl.bsoft.vhp.model.Woman;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class VhpApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    @Order(1)
    void test01() {
        Man man = new Man();
        Man man1 = new Man();
        Woman woman = new Woman();

        log.info("man: {}", man);
        log.info("man1: {}", man1);
        log.info("woman: {}", woman);

        Assert.notNull(man, "man is null");
        Assert.notNull(woman, "woman is null");
        Assert.isTrue(!man.equals(man1), "man equals man1");
    }

}
