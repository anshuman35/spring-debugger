package org.example.springdebugger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation;
@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringDebuggerApplicationTests {

    @Test
    void contextLoads() {
    }
    public void contextLoadsOnInit(){

    }

}
