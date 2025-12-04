import java.util.Objects;

public class Product {
    private int id;
    private String nom;
    private double prix;

    // Constructeur sans paramètre
    public Product() {
        this.id = 0;
        this.nom = "";
        this.prix = 0.0;
    }

    // Constructeur avec paramètres
    public Product(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    // Getters & Setters
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Redéfinition de toString()
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }

    // Optionnel : redéfinir equals() et hashCode() pour une meilleure gestion des collections
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.prix, prix) == 0 && Objects.equals(nom, product.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prix);
    }
}