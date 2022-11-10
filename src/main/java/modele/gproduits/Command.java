/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele.gproduits;

import java.util.Date;

/**
 *
 * @author almamy
 */
public class Command {
    private int numcomand;
    private Date dateHeure;
    private boolean eta;
    private String prixtotal;

    public Command(int numcomand, Date dateHeure, boolean eta, String prixtotal) {
        this.numcomand = numcomand;
        this.dateHeure = dateHeure;
        this.eta = eta;
        this.prixtotal = prixtotal;
    }

    public int getNumcomand() {
        return numcomand;
    }

    public void setNumcomand(int numcomand) {
        this.numcomand = numcomand;
    }

    public Date getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Date dateHeure) {
        this.dateHeure = dateHeure;
    }

    public boolean isEta() {
        return eta;
    }

    public void setEta(boolean eta) {
        this.eta = eta;
    }

    public String getPrixtotal() {
        return prixtotal;
    }

    public void setPrixtotal(String prixtotal) {
        this.prixtotal = prixtotal;
    }
    
}
