
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author congt
 */
public class ManageMatrix {
    Scanner sc = new Scanner(System.in);
    Validate v = new Validate();
    
    public void displayMenu(){
        System.out.println("======Calculator program======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
    }
   

    public double [][] getMatrix1() {
        int row1 = v.checkInputRowAndColumn("Enter Row Matrix 1: ");
        int col1 = v.checkInputRowAndColumn("Enter Column Matrix 1: ");
        double[][] matrix1 = new double[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = v.checkInputMatrixDouble("Matrix 1", i, j);
                System.out.println("hello222222222222");
            }
        }
        return matrix1;
    }
    
    public double [][] getMatrix2(double [][] matrix1, int choice) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2, col2;
        if (choice == 3) {
            while (true) {
                row2 = v.checkInputRowAndColumn("Enter Row Matrix 2: ");
                if (row2 == col1) {
                    break;
                } else {
                    System.err.println("Row 2 in matrix 2 must equal to Column 1 in matrix 1");
                }
            }
            col2 = v.checkInputRowAndColumn("Enter Column Matrix 2: ");
        } else {
            while (true) {
                row2 = v.checkInputRowAndColumn("Enter Row matrix 2: ");
                if (row2 == row1) {
                    break;
                } else {
                    System.err.println("Row 2 in matrix 2 must equal to Row 1 in matrix 1");
                }
            }
            while (true) {
                col2 = v.checkInputRowAndColumn("Enter Column matrix 2: ");
                if (col2 == col1) {
                    break;
                } else {
                    System.err.println("Column 2 in matrix 2 must equal to Column 1 in matrix 1");
                }
            }
        }
        double[][] matrix2 = new double[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println("Hellllllo");
                matrix2[i][j] = v.checkInputMatrixDouble("Matrix 2", i, j);
            }
        }
        return matrix2;
    }
    
    public double [][] additionMatrix(double [][] matrix1, double [][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        double[][] newMat = new double[row][col];
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
                newMat[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return newMat;
    }

    public double [][] subtractionMatrix(double [][] matrix1, double [][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        double[][] newMat = new double[row][col];
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
                newMat[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return newMat;
    }

    public double [][] multiplicationMatrix(double [][] matrix1, double [][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int col2 = matrix2[0].length;
        double[][] newMat = new double[row1][col2];
        for(int i=0; i<row1;i++){
            for(int j=0; j<col2;j++){
                for(int k=0; k<col1;k++){
                    newMat[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return newMat;
    }
    
    
    
    public void displayMatrix(double [][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
    
    public void displayResult(double [][] matrix1, double[][] matrix2, double[][] result, int choice) {
        String expression = "";
        switch (choice) {
            case 1:
                expression = "+";
                break;
            case 2:
                expression = "-";
                break;
            case 3:
                expression = "*";
                break;
        }

        System.out.println("------- Result -------");
        displayMatrix(matrix1);
        System.out.println(expression);
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(result);
    }
}
