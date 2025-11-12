package entities;

import java.util.Objects;

public class Departement {
    int id;
    String nomDepartement;
    int nombreEmployes;
    public Departement(){};
     public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }
    //les getters et setters

    public void setId(int id) {
        this.id = id;
    }
    public void setNomDepartement(String nomDepartement) {
         this.nomDepartement = nomDepartement;
    }
    public void setNombreEmployes(int nombreEmployes) {
         this.nombreEmployes = nombreEmployes;
    }
    public int getId() {
        return id;
    }
    public String getNomDepartement() {
         return nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }
    // methode toString

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
    //equals

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id  && Objects.equals(nomDepartement, that.nomDepartement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartement, nombreEmployes);
    }
}
