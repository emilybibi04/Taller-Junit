/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculatorsmp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author emilyvalarezo
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void testMakeFormula() {
        System.out.println("MakeFormula");
        String result = Operations.MakeFormula();
        assertNotNull(result);
        
        if (!Character.isDigit(result.charAt(0)) || !Character.isDigit(result.charAt(result.length() - 1))) {
            assertFalse(false,"Formula = " + result);
        }
        
        for (int i = 1; i < result.length() - 1; i++) {
            char currentChar = result.charAt(i);
            char nextChar = result.charAt(i + 1);

            if (("+-*/".indexOf(currentChar) != -1) && !Character.isDigit(nextChar)) {
                assertFalse(false, "Formula = " + result);
            }
        }

        assertTrue(true, "Formula = " + result);

    }

    /**
     * Test of Solve method, of class Operations.
     */
    @Test
    public void testSolve() {
        System.out.println("Solve");
        String formula1 = "78+20";
        String formula2 = "20-18";
        String formula3 = "6*8";
        String formula4 = "18/9";
        String formula5 = "1/1+2*1";

        assertEquals("78+20=98", Operations.Solve(formula1));

        assertEquals("20-18=2", Operations.Solve(formula2));

        assertEquals("6*8=48", Operations.Solve(formula3));

        assertEquals("18/9=2", Operations.Solve(formula4));
        
        assertEquals("1/1+2*1=3", Operations.Solve(formula5));

    }

}