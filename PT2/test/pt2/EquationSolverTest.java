/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pt2;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Duy
 */
public class EquationSolverTest {
    
    EquationSolver solver;
    
    public EquationSolverTest() {
        
        solver = new EquationSolver();
        
    }

    @Test
    public void testInputCoefficients_AllNumbers() {
        String input = "1\n2\n3\n";
        
        InputStream in = new ByteArrayInputStream(input.getBytes());
        
        System.setIn(in);

        EquationSolver solver = new EquationSolver();
        
        double[] coefficients = solver.inputCoefficients();

        assertEquals(1.0, coefficients[0], 0.0001);
        
        assertEquals(2.0, coefficients[1], 0.0001);
        
        assertEquals(3.0, coefficients[2], 0.0001);
    }

    @Test
    public void testInputCoefficients_InvalidInput() {
        String input = "a\nb\nc\n-ii";
        
        InputStream in = new ByteArrayInputStream(input.getBytes());
        
        System.setIn(in);

        EquationSolver solver = new EquationSolver();
        
        double[] coefficients = solver.inputCoefficients();

        assertEquals(1.0, coefficients[0], 0.0001);
        
        assertEquals(2.0, coefficients[1], 0.0001);
        
        assertEquals(3.0, coefficients[2], 0.0001);
        
    }

    
    @Test
    public void testSolveQuadraticEquation_TwoDistinctRoots() {
        EquationSolver solver = new EquationSolver();
        
        double a = 1;
        
        double b = -3;
        
        double c = 2;

        double[] expectedRoots = {2.0, 1.0};
        
        
        assertArrayEquals(expectedRoots, solver.solveQuadraticEquation(a, b, c), 0.0001);
    }
    
     @Test
    public void testSolveQuadraticEquation_OneRoot() {
        
        double a = 1;
        
        double b = -2;
        
        double c = 1;

        double[] expectedRoots = {1.0, 1.0};
        
        assertArrayEquals(expectedRoots, solver.solveQuadraticEquation(a, b, c), 0.0001);
        
    }

    @Test
    public void testSolveQuadraticEquation_NoRoot() {
        
        double a = 1;
        
        double b = 2;
        
        double c = 3;

        double[] expectedRoots = {Double.NaN, Double.NaN};
        
        assertArrayEquals(expectedRoots, solver.solveQuadraticEquation(a, b, c), 0.0001);
        
    }
    

    @Test
    public void testSolveQuadraticEquation_LinearEquation() {
        
        double a = 0;
        
        double b = 2;
        
        double c = 4;

        double[] expectedRoots = {-2.0, -2.0};
        
        assertArrayEquals(expectedRoots, solver.solveQuadraticEquation(a, b, c), 0.0001);
        
    }

    @Test
    public void testSolveQuadraticEquation_ConstantEquation() {
        
        double a = 0;
        
        double b = 0;
        
        double c = 5;

        double[] expectedRoots = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
        
        assertArrayEquals(expectedRoots, solver.solveQuadraticEquation(a, b, c), 0.0001);        
    } 
}
