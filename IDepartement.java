package interfaces;

public interface IDepartement <T>{
    public void ajouterDepartement(T t);
    public boolean rechercheDepartement(String nomDepartement);
    public boolean rechercherDepartement(T t);
    public void supprimerDepartement(T t);
    public void afficherDepartement();
    public void trierDepartementParId();
    public void trierDepartementsParNomEtNombreEmployes();

}
