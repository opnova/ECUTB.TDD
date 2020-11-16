package timereg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TimeRegEngineTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception {

    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {

    }

    @BeforeEach
    void setUp() throws Exception {

    }

    @AfterEach
    void tearDown() throws Exception {

    }
    @Test
    void testGetChargeability() {

        // Setup 
        TimeRegStoreStub stub = new TimeRegStoreStub();
        TimeRegEngine cut = new TimeRegEngine(stub);

        stub.addTimeRegEntity("john", "p1", 2, true, new Date(2019, 1, 1));
        stub.addTimeRegEntity("john", "p1", 2, false, new Date(2019, 1, 2));
        stub.addTimeRegEntity("john", "p1", 2, true, new Date(2019, 1, 3));

        // Run and assert
        assertEquals(cut.getChargeability("john", 2019, 1), 0.025);

    }


}
