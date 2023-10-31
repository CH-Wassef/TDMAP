package org.example;

import java.util.Map;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete{

    TreeMap<Employe, Departement> treeMap1= new TreeMap<>();


    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        treeMap1.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        treeMap1.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> entry : treeMap1.entrySet()){
            System.out.println(entry.getKey() + "Afficher les employés" + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
       for (Employe employe : treeMap1.keySet()){
            System.out.println(employe);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement departement : treeMap1.values()){
            System.out.println(departement);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement depart= treeMap1.get(e);
        if (depart != null){
            System.out.println(e.getNom()+ "in department" + depart.getNom());
        }
        else {
            System.out.println("employee not found");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return false;
    }
}
