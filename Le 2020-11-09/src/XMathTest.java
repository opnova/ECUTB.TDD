import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class XMathTest {

    @Test
    void testAdd() {

        assertEquals(2, XMath.add(1, 1));

    }

    @Test
    void testDiv() {

        assertEquals(0, XMath.div(1, 2));

    }

    @Test
    void testThrowsException() {

        assertThrows(ArithmeticException.class, () -> XMath.div(1, 0));

    }

    @Test
    void testSub() {

        assertEquals(-1, XMath.subtract(3, 4)); // 3-4

    }

    @Test
    void testMultiply1() {

        assertEquals(12, XMath.multiply(3, 4)); // 3*4

    }

    @Test
    void testMultiply2() {

        assertEquals(12, XMath.multiply(4, 3)); // 4*3

    }

}
