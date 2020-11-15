import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BaseConverterTest {

    @Test
    void test1() throws ConversionException {

        assertEquals(12, BaseConverter.toDecimal("1100"));

    }

    @Test
    void test2() throws ConversionException {

        assertEquals(5, BaseConverter.toDecimal("101"));

    }

    @Test
    void test_null() {

        assertThrows(ConversionException.class, () -> BaseConverter.toDecimal(null));

    }

    @Test
    void test_empty() {

        assertThrows(ConversionException.class, () -> BaseConverter.toDecimal(""));

    }

    @Test
    void test_illegalCharacters() {

        assertThrows(ConversionException.class, () -> BaseConverter.toDecimal("Z101"));

    }

    @Test
    void test_trim() throws ConversionException {

        assertEquals(5, BaseConverter.toDecimal(" 101 "));

    }

}
