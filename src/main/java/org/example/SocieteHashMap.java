package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete, Comparator<Employe> {
    HashMap<Employe,Departement> hashMap2=new HashMap<>();


    @Override
    public int compare(Employe o1, Employe o2) {
        return 0;
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        hashMap2.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        hashMap2.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> entry : hashMap2.entrySet()){
            System.out.println(entry.getKey() + "department" + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe emp : hashMap2.keySet()){
            System.out.println(emp);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement dep : hashMap2.values()){
            System.out.println(dep);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement dep= hashMap2.get(e);
      if (dep != null){
          System.out.println(e.getNom() + " dans le departement" + dep.getNom());
      }
      else {
          System.out.println("employee not found");
      }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return hashMap2.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return hashMap2.containsValue(e);
    }
}
