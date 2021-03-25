package mikekang47.spring.project.controllers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloControllerTest {
    @Test
    void sayHello() {
        HelloController controller = new HelloController();
        assertThat(controller.sayHello()).isEqualTo("Hello, world!");
    }

}
