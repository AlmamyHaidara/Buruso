/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele.gventes;

import java.util.Date;

/**
 *
 * @author almamy
 */
public class Vente {
    private int ref ;
    private Date date;
    private String prixTotal;

    public Vente(int ref, Date date, String prixTotal) {
        this.ref = ref;
        this.date = date;
        this.prixTotal = prixTotal;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(String prixTotal) {
        this.prixTotal = prixTotal;
    }
    
     
}
