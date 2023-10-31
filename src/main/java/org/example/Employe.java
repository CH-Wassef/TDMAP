package org.example;

import java.util.Objects;

public class Employe implements Comparable{
    private int cin;
    private String matricule;
    private String nom;
    private String prenom;

    public Employe(int cin,String matricule,String nom,String prenom){
        this.cin=cin;
        this.matricule=matricule;
        this.nom=nom;
        this.prenom=prenom;
    }
    public Employe(){}

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "cin=" + cin +
                ", matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        return cin == employe.cin && matricule == employe.matricule && Objects.equals(nom, employe.nom) && Objects.equals(prenom, employe.prenom);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
