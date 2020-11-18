package rpn;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {

    Calc cut = null;

    @BeforeEach
    void setUp() throws Exception {

        cut = new Calc();
    }

    @AfterEach
    void tearDown() throws Exception {

        cut = null;
    }

    @Test
    void test_simple1() throws ExpressionException {

        assertEquals(3, cut.compute("1 2 +"));
    }

    @Test
    void test_simple2() throws ExpressionException {

        Calc cut = new Calc();
        assertEquals(21, cut.compute("1 2 + 3 4 + *"));
    }

    @Test
    void test_simple3() throws ExpressionException {

        Calc cut = new Calc();
        assertEquals(2, cut.compute("2 2 + sqrt"));
    }

    @Test
    void test_simple4() throws ExpressionException {

        Calc cut = new Calc();
        assertEquals(4, cut.compute("2 sqr"));
    }

    @Test
    void test_emptyString() {

        Calc cut = new Calc();
        // 1 0 *
        assertThrows(ExpressionException.class, () -> cut.compute(""));
    }

    @Test
    void test_badExpression_tooFewOperands() {

        Calc cut = new Calc();
        // 1 0 *
        // 1 + ->
        assertThrows(ExpressionException.class, () -> cut.compute("+"));
    }

    @Test
    void test_badExpression_null() {

        Calc cut = new Calc();
        assertThrows(ExpressionException.class, () -> cut.compute(null));
    }
    
    @Test
    void test_computeProvider() throws ExpressionException {
        WordProviderStub stub = new WordProviderStub();
        Calc cut = new Calc(stub);
        
        //21
        stub.addWords("1 2 + 3 4 + *".split(" "));
        
        assertEquals(21, cut.compute());
        
    }

}
