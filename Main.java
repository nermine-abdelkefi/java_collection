import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ProductManagement pm = new ProductManagement();

        // Création de produits
        Product p1 = new Product(3, "Ordinateur", 1200.0);
        Product p2 = new Product(1, "Souris", 25.0);
        Product p3 = new Product(2, "Clavier", 45.0);

        List<Product> products = Arrays.asList(p1, p2, p3);

        // 1. Afficher tous les produits
        System.out.println("=== Tous les produits ===");
        pm.displayProducts(products, System.out::println);

        // 2. Afficher les produits dont le prix > 30
        System.out.println("\n=== Produits > 30€ ===");
        Predicate<Product> prixSup30 = p -> p.getPrix() > 30;
        pm.displayProductsByFilter(products, prixSup30, System.out::println);

        // 3. Retourner les noms des produits
        Function<Product, String> getName = Product::getNom;
        String names = pm.returnProductsNames(products, getName);
        System.out.println("\nNoms des produits : " + names);

        // 4. Créer un produit via Supplier
        Supplier<Product> productSupplier = () -> new Product(4, "Écran", 300.0);
        Product newProduct = pm.createProduct(productSupplier);
        System.out.println("\nNouveau produit créé : " + newProduct);

        // 5. Trier par ID
        Comparator<Product> byId = Comparator.comparingInt(Product::getId);
        List<Product> sorted = pm.sortProductsById(products, byId);
        System.out.println("\nProduits triés par ID :");
        sorted.forEach(System.out::println);

        // 6. Convertir en Stream et compter
        long count = pm.convertToStream(products).count();
        System.out.println("\nNombre de produits : " + count);
    }
}