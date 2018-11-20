/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.Date;
import javafx.scene.chart.PieChart;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Machine implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String marque;
    private String reference;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateAchat;
    private double prix;
    
    @ManyToOne
    @JoinColumn(name = "id_marque")
    private Marque marque1;

     
    public Machine() {
    }

    public Machine(String marque, String reference, Date dateAchat, double prix) {
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
    }
    
    public Machine(String marque, String reference, Date dateAchat, double prix, Marque marque1) {
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.marque1 = marque1;
    }
       
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Marque getMarque1() {
        return marque1;
    }

    public void setMarque1(Marque marque1) {
        this.marque1 = marque1;
    }
    
}
