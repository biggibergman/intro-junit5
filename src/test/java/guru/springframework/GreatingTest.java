package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    Greeting greeting;
    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {

        System.out.printf(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {

        System.out.printf(greeting.helloWorld("John"));
    }
}