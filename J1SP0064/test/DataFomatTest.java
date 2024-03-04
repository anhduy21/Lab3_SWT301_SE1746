/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Duy
 */
public class DataFomatTest {
    
    DataFomat dataFormat;
    
    public DataFomatTest() {
        
        dataFormat = new DataFomat();
        
    }

    @Test
    public void testCheckPhone_Correct() {       
        String phone = "1234567890";
        
        String result = dataFormat.checkPhone(phone);
        assertEquals("", result);
    }

    @Test
    public void testCheckPhone_Empty() {
        
        String phone = "";
        
        String result = dataFormat.checkPhone(phone);
        assertEquals("Phone number cannot be empty", result);
    }

    @Test
    public void testCheckPhone_NotNumber() { 
        
        String phone = "abcdefghij";
        
        String result = dataFormat.checkPhone(phone);
        assertEquals("Phone number must be number", result);
    }

    @Test
    public void testCheckPhone_Not10Digits() {
       
        String phone = "123456789";
        
        String result = dataFormat.checkPhone(phone);
        assertEquals("Phone number must be 10 digits", result);
    }

    @Test
    public void testCheckMail_Correct() {
        
        String email = "duy@gmail.com";
        
        String result = dataFormat.checkMail(email);
        assertEquals("", result);
    }

    @Test
    public void testCheckMail_Empty() {      
        
        String email = "";
        
        String result = dataFormat.checkMail(email);
        assertEquals("Email cannot be empty", result);
    }

    @Test
    public void testCheckMail_IncorrectFormat() {   
        
        String email = "duy@duy";
        
        String result = dataFormat.checkMail(email);
        
        assertEquals("Email must is correct format", result);
    }

    @Test
    public void testCheckDate_Correct() {       
        String date = "01/01/2025";
        
        String result = dataFormat.checkDate(date);
        
        assertEquals("", result);
    }

    @Test
    public void testCheckDate_BeforeCurrentDate() {      
        String date = "01/01/2020";
        
        String result = dataFormat.checkDate(date);
        
        assertEquals("Date must be greater than current date", result);
    }

    @Test
    public void testCheckDate_IncorrectFormat() {       
        String date = "2025/01/01";
        
        String result = dataFormat.checkDate(date);
        
        assertEquals("Date to correct format(dd/mm/yyyy)", result);
    }

    @Test
    public void testCheckDate_Nonexistent() {        
        String date = "31/02/2025";
        
        String result = dataFormat.checkDate(date);
        
        assertEquals("Date does not exist", result);
    }    
}
