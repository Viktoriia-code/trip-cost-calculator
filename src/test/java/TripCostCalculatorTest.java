import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {

    @Test
    void calculateTripCost() {
        assertEquals(100.0, TripCostCalculator.calculateTripCost(1000, 2.0, 5.0));
        assertEquals(200.0, TripCostCalculator.calculateTripCost(1000, 4.0, 5.0));
        assertEquals(400.0, TripCostCalculator.calculateTripCost(1000, 8.0, 5.0));
    }
}