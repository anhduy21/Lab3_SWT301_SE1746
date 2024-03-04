/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Duy
 */
public class ManageMatrixTest {

    private ManageMatrix manageMatrix;

    @Before
    public void setUp() {
        
        manageMatrix = new ManageMatrix();
        
    }

    @Test
    public void testAdditionMatrixValid() {
        
        double[][] matrix1 = {{1, 2}, {3, 4}};
        
        double[][] matrix2 = {{5, 6}, {7, 8}};
        
        double[][] expected = {{6, 8}, {10, 12}};
        assertArrayEquals(expected, manageMatrix.additionMatrix(matrix1, matrix2));
    }

    @Test
    public void testAdditionMatrixDifferentSizes() {
        
        double[][] matrix1 = {{1, 2}, {3, 4}, {5, 6}};
        
        double[][] matrix2 = {{7, 8}, {9, 10}};
        assertNull(manageMatrix.additionMatrix(matrix1, matrix2));
    }

    @Test
    public void testAdditionMatrixEmpty() {
        
        double[][] matrix1 = {{1, 2}, {3, 4}};
        double[][] emptyMatrix = {};
        
        assertNull(manageMatrix.additionMatrix(matrix1, emptyMatrix));
    }

    @Test
    public void testAdditionMatrixWithStrings() {
        
        double[][] matrix1 = {{1, 2}, {3, 4}};
        
        String[][] matrix2 = {{"a", "b"}, {"c", "d"}};
        assertNull(manageMatrix.additionMatrix(matrix1, matrix2));
    }

    @Test
    public void testSubtractionMatrixValid() {
        
        double[][] matrix1 = {{1, 2}, {3, 4}};
        
        double[][] matrix2 = {{5, 6}, {7, 8}};
        
        double[][] expected = {{4, 4}, {4, 4}};
        
        assertArrayEquals(expected, manageMatrix.subtractionMatrix(matrix2, matrix1));
    }

    @Test
    public void testSubtractionMatrixDifferentSizes() {
        
        double[][] matrix1 = {{1, 2}, {3, 4}, {5, 6}};
        
        double[][] matrix2 = {{7, 8}, {9, 10}};
        
        assertNull(manageMatrix.subtractionMatrix(matrix2, matrix1));
    }

    @Test
    public void testSubtractionMatrixEmpty() {
        
        double[][] matrix1 = {{1, 2}, {3, 4}};
        
        double[][] emptyMatrix = {};
        
        assertNull(manageMatrix.subtractionMatrix(matrix1, emptyMatrix));
    }

    @Test
    public void testSubtractionMatrixWithStrings() {
        
        double[][] matrix1 = {{1, 2}, {3, 4}};
        
        String[][] matrix2 = {{"a", "b"}, {"c", "d"}};
        
        assertNull(manageMatrix.subtractionMatrix(matrix1, matrix2));
    }

    @Test
    public void testMultiplicationMatrixValid() {
        
        double[][] matrix1 = {{1, 2}, {3, 4}};
        
        double[][] matrix2 = {{5, 6}, {7, 8}};
        
        double[][] expected = {{19, 22}, {43, 50}};
        
        assertArrayEquals(expected, manageMatrix.multiplicationMatrix(matrix1, matrix2));
    }

    @Test
    public void testMultiplicationMatrixDifferentSizes() {
        
        double[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        
        double[][] matrix2 = {{7, 8}, {9, 10}, {11, 12}};
        
        assertNull(manageMatrix.multiplicationMatrix(matrix1, matrix2));
    }

    @Test
    public void testMultiplicationMatrixEmpty() {
        
        double[][] matrix1 = {{1, 2}, {3, 4}};
        
        double[][] emptyMatrix = {};
        
        assertNull(manageMatrix.multiplicationMatrix(matrix1, emptyMatrix));
    }

    @Test
    public void testMultiplicationMatrixWithStrings() {
        
        String[][] matrix1 = {{"1", "2"}, {"3", "4"}};
        
        String[][] matrix2 = {{"a", "b"}, {"c", "d"}};
        
        assertNull(manageMatrix.multiplicationMatrix(matrix1, matrix2));
    }

    @Test
    public void testInvalidMatrixInput() {
        
        double[][] matrix1 = {{1, -2}, {3, 4}};
        
        double[][] matrix2 = {{5, 6}, {-7, 8}};
        
        assertNull(manageMatrix.additionMatrix(matrix1, matrix2));
        assertNull(manageMatrix.subtractionMatrix(matrix1, matrix2));
        assertNull(manageMatrix.multiplicationMatrix(matrix1, matrix2));
    }
}
