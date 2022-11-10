/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele.gproduits;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author almamy
 */
public class Produit {
    private int id;
    private String nom;
    private String prix;
    private String quantite;
    private String categorie;
    private Date dateExpiration;
    private Image photo;

    public Produit(int id, String nom, String prix, String quantite, String categorie, Date dateExpiration, Image photo) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
        this.dateExpiration = dateExpiration;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
    
    
    public static void etat(){
   
    }
    
}
