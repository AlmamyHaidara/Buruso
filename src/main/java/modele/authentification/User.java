/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele.authentification;

import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author almamy
 */
public class User {
    private String login;
    private String password;
    private String role;
    private String email;
    private String tel;
    private int id;
    private Image photo;

    public User() {
    }

    public User(String login, String password, String role, int id) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.id = id;
    }

    public User(String login, String password, String role, String email, String tel, int id, Image photo) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.email = email;
        this.tel = tel;
        this.id = id;
        this.photo = photo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
    
    public void files() throws IOException{
        File file = new File("/home/almamy/Documents/MyProject/Buruso/src/main/java/modele/authentification/folderloginFiles.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch(IOException e){
            }
                
        }else{
            
                FileWriter write = new FileWriter(file);
            try (BufferedWriter bw = new BufferedWriter(write)) {
                bw.write("Bonjour le monde");
                
            }
           
            
        }
      
    }
    
}
