/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele.gventes;

/**
 *
 * @author almamy
 */
public class Client {
    private String nom;
    private String person;
    private String adresse;

    public Client(String nom, String person, String adresse) {
        this.nom = nom;
        this.person = person;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    
}
