package org.example;

import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Employe e1= new Employe(15019560,"150tun150","Wassef","Chargui");
       Employe e2= new Employe(15015660,"150tun564","Khalil","Chikha");
       Employe e3= new Employe(12345678,"150tun654","Yassine","Chargui");

       Departement d1= new Departement(1,"Info");
       Departement d2= new Departement(2,"RH");
       Departement d3= new Departement(3,"Neuchatel");


       SocieteHashMap soc= new SocieteHashMap();
       soc.ajouterEmployeDepartement(e1,d1);
       soc.ajouterEmployeDepartement(e2,d2);
       soc.ajouterEmployeDepartement(e3,d3);

       soc.afficherDepartement(e1);

       soc.rechercherDepartement(d2);
       soc.supprimerEmploye(e3);
       soc.afficherLesEmployesLeursDepartements();
       soc.afficherLesEmployes();
       soc.afficherLesDepartements();

       SocieteTreeMap stm= new SocieteTreeMap();
       stm.ajouterEmployeDepartement(e2,d2);
       stm.afficherDepartement(e3);
       stm.rechercherDepartement(d3);
       stm.supprimerEmploye(e1);
       stm.afficherLesEmployesLeursDepartements();
       stm.afficherLesEmployes();
       stm.afficherLesDepartements();




    }
}