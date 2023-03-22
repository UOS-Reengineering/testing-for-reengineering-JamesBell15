package example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import example.project.domain.*;
import org.junit.jupiter.api.Test;


import java.util.*;

public class TestChecker {

    @Test
    public void testCheckCollisionViolations()
    {
        // setup
        Simulator simulator = mock();
        Scenario scenario = mock();
        SimulationResult result = new SimulationResult();

        when(simulator.run(scenario)).thenReturn(result);

        // testing target
        Checker checker = new Checker(simulator);
        boolean isCollision = checker.checkCollisionViolations(scenario); // this invokes a null pointer exception due to the dummy simulator
        assertEquals(false, isCollision);
    }

}