/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;


/**
 *
 * @author almamy
 */
public class TestClass {
    public static void main(String[] args) throws IOException{
      
        fichiertest();
       // System.out.println("Email1: " + emailvalidate("almamyh27"));
        }
   
        public static String emailvalidate(String email){
            if(email == null || email.isEmpty()){
                return "Invalid";
            }
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+ "(?:[a-zA-Z0-9-]+\\.)+[a-zA-A]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if(pattern.matcher(email).matches()){
            return "Validate";
        }else{
            return "Invalidate";
        }
            
        }
        public static void fichiertest() throws FileNotFoundException, IOException{
            File file = new File("/home/almamy/Documents/MyProject/Buruso/src/main/java/modele/authentification/LogUp.txt");
            FileInputStream input = new FileInputStream(file);
           System.out.println(input.read());
        
            input.close();
            
        }
    }
