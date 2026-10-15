import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {
    @Test
    void addsTwoPositiveNumbers() {
        assertEquals(7, Addition.add(3, 4));
    }

    @Test
    void addsPositiveAndNegativeNumbers() {
        assertEquals(1, Addition.add(5, -4));
    }

    @Test
    void addsTwoNegativeNumbers() {
        assertEquals(-9, Addition.add(-4, -5));
    }

    @Test
    void addsZero() {
        assertEquals(8, Addition.add(8, 0));
    }
}
