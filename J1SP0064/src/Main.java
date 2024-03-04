
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author congt
 */
public class Main {
    public static void main(String[] args) {
        DataFomat v = new DataFomat();
        v.checkPhone(v.inputPhone());
        v.checkDate(v.inputDate());
        v.checkMail(v.inputEmail());
    }
}
