
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author congt
 */
public class DataFomat {
    
    Scanner sc = new Scanner(System.in);
    
    public String inputPhone(){
        while(true){
            System.out.println("Enter phone: ");
            String phone = sc.nextLine().trim();
            String msg = checkPhone(phone);
            if(msg.isEmpty()){
                return phone;
            }else{
                System.out.println(msg);
            }
        }
    }
    
    public String checkPhone(String phone){
        while(true){
            if(phone.isEmpty()){
                return "Phone number cannot be empty";
            }
            else if(!phone.matches("^[0-9]+$")){
                return "Phone number must be number";
            }else if(!phone.matches("^[0-9]{10}$")){
                return "Phone number must be 10 digits";
            }else{
                return "";
            }
        }
    }
    
    public String inputEmail(){
        while(true){
            System.out.println("Enter email: ");
            String email = sc.nextLine().trim();
            String msg = checkMail(email);
            if(msg.isEmpty()){
                return email;
            }else{
                System.out.println(msg);
            }
        }
    }
    
    public String checkMail(String email){
        while(true){
            if(email.isEmpty()) {
                return "Email cannot be empty";
            }
            if(!email.matches("[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.][a-zA-Z0-9]+")){
                return "Email must is correct format";
            }else{
                return "";
            }
        }
    }
    
    public String inputDate(){
        while(true){
            System.out.println("Enter date: ");
            String date = sc.nextLine().trim();
            String msg = checkDate(date);
            if(msg.isEmpty()){
                return date;
            }else{
                System.out.println(msg);
            }
        }
    }
    
    public String checkDate(String date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateInput = dateFormat.parse(date);
            Date currentDate = new Date();
            if (dateInput.before(currentDate)) {
                return "Date must be greater than current date";
            }
            if(checkDataExist(date, dateFormat)==false){
                return "Date does not exist";
            }
            return "";
        } catch (ParseException ex) {
            return "Date to correct format(dd/mm/yyyy)";
        }
    }

    public boolean checkDataExist(String dateInput, SimpleDateFormat dateFormat) {
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(dateInput);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
    
    
}
