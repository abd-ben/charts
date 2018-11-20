/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.Employe;
import beans.Machine;
import beans.Marque;
import beans.Profil;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.Date;
import service.EmployeService;
import service.MachineService;
import service.MarqueService;
import service.ProfileService;
import util.HibernateUtil;

/**
 *
 * @author a
 */
public class Test {

    public static void main(String[] args) {
        
        Profil profil = new Profil("C10", "Dev");
        ProfileService ps = new ProfileService();
        //ps.create(profil);
        
        EmployeService es = new EmployeService();
        Employe employe = new Employe("ben", "abd", new Date(), "abd@ben.ka", "123456", ps.findById(1));
        es.create(employe);
    }
}
