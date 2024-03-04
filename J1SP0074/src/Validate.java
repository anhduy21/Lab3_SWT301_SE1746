
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author congt
 */
public class Validate {
    Scanner sc = new Scanner(System.in);
    
    public int checkInputChoice(String message, int min, int max){
        while(true){
            try {
                System.out.print(message);
                String input = sc.nextLine().trim();
                // Check input is empty or not
                if(!input.isEmpty()){
                    int number = Integer.parseInt(input);
                    if(number < min || number > max){
                        System.out.println("Your choice must be number in range " + min + " - " +max);
                        continue;
                    }
                    return number;
                }else{
                    System.out.println("Your choice cannot be empty!");
                }
            } catch (Exception e) {
                System.out.println("Your choice must be a number");
            }
        }
    }
    
    public int checkInputInt(String message, String messageError, int min, int max){
        while(true){
            try {
                System.out.print(message);
                String input = sc.nextLine().trim();
                // Check input is empty or not
                if(!input.isEmpty()){
                    int number = Integer.parseInt(input);
                    if(number < min || number > max){
                        System.out.println("Input must be in range " + min + " - " +max);
                        continue;
                    }
                    return number;
                }else{
                    System.out.println("Input cannot be empty!");
                }
            } catch (Exception e) {
                System.out.println(messageError);
            }
        }
    }
    
    public double checkInputDouble(String message, String messageError, double min, double max){
        while(true){
            try {
                System.out.print(message);
                String input = sc.nextLine().trim();
                // Check input is empty or not
                if(!input.isEmpty()){
                    double number = Double.parseDouble(input);
                    if(number < min || number > max){
                        System.out.println("Input must be in range " + min + " - " +max);
                        continue;
                    }
                    return number;
                }else{
                    System.out.println("Input cannot be empty!");
                }
            } catch (Exception e) {
                System.out.println(messageError);
            }
        }
    }
    
    public int checkInputMatrix(String matrix, int i, int j){
        while(true){
            System.out.print("Enter " + matrix + "[" + (i+1) + "]" + "[" + (j+1) + "]: ");
            try {
                int n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Matrix value must be a digit");
            }
        }
    }
    
    public double checkInputMatrixDouble(String matrix, int i, int j){
        while(true){
            System.out.print("Enter " + matrix + "[" + (i+1) + "]" + "[" + (j+1) + "]: ");
            try {
                double n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Matrix value must be a digit");
            }
        }
    }
    
    public int checkInputRowAndColumn(String msg){
        while(true){
            System.out.print(msg);
            try {
                int n = Integer.parseInt(sc.nextLine());
                if(n<=0){
                    System.out.println("Row or column of matrix must be greater than 0");
                }
                return n;
            } catch (Exception e) {
                System.out.println("Row or column of matrix must be a digit");
            }
        }
    }
}
