package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class exampleJenkinsTest {

    @Test
    void test1 () {
        assertTrue(true);
    }

    @Test
    void test2 () {
        assertTrue(true);
    }

    @Test
    void test3 () {
        assertTrue(true);
    }

    @Test
    void test4 () {
        assertTrue(true);
    }

    @Test
    void test5 () {
        assertTrue(true);
    }

    @Test
    void test6 () {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test7 () {
        assertTrue(false);
    }

    @Test
    @Disabled
    void test8 () {
        assertTrue(false);
    }

    @Test
    void test9 () {
        assertTrue(false);
    }

    @Test
    void test10 () {
        assertTrue(false);
    }
}
