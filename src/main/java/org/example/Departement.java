package org.example;

import java.util.Objects;

public class Departement {
    private int id;
    private String nom;

    public Departement(int id,String nom){
        this.id=id;
        this.nom=nom;
    }
    public Departement(){}

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

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return id == that.id && Objects.equals(nom, that.nom);
    }

}
