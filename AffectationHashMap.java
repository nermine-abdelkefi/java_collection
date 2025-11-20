package entities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//q1 classe AffectationHashMap
public class AffectationHashMap {
    HashMap<Employe, Departement>  map = new HashMap<>();
    //q2 affectation emp lil dep
    public void ajouterEmployeDepartement(Employe e , Departement d){
        if (map.containsKey(e)) {
            System.out.println("  employé  déjà mawjoud fi  département !");
        } else {
            map.put(e, d);
            System.out.println("c bon  Affectation ajoutée : " + e + " → " + d);
        }
    }
    //q3 affichage les affectations
    public void afficherEmployesEtDepartements(){
        if (map.isEmpty()) {
            System.out.println("Aucune affectation !");
            return;
        }
        System.out.println(" Liste des Affectations :");
        for (Map.Entry<Employe, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
    //q4 supp emp
    public void supprimerEmploye(Employe e){
        if (map.containsKey(e)) {
            map.remove(e);
        }
    }
    //q5 supp affectation precise
    public void supprimerEmployeEtDepartement(Employe e ,Departement d){
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
            System.out.println("Affectation supprimée pour " + e);
        } else {
            System.out.println("Cette affectation n’existe pas");
        }
    }
    //q6 affichage ta3 liste employee
    public void afficherEmployes(){
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }
    //q7 affichage liste dep
    public void afficherDepartements(){
        for  (Departement d : map.values()){
            System.out.println(d);
        }
    }
    //q8 rechercher d'un empl
    public boolean rechercherEmploye(Employe e)
        {
        if (map.containsKey(e)) {
            return true;
        }
        else  {
            return false;
        }

    }
    //q9 rechercher d'un dep
    public boolean rechercherDepartement(Departement d) {
        if (map.containsKey(d)) {
            return true;
        } else {
            return false;
        }
    }
        //q10 tri emp selon leur id
        public TreeMap<Employe, Departement> trierMap() {
            TreeMap<Employe, Departement> treeMap = new TreeMap<>(map);
            return treeMap;
        }

}
