import java.util.List;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ProductManagement implements Inter_Management {



    // 1. Afficher tous les produits avec un Consumer
    @Override
    public void displayProducts(List<Product> products, Consumer<Product> con) {
        for (Product p : products) {
            con.accept(p);
        }
    }

    // 2. Afficher les produits filtrés avec un Predicate
    @Override
    public void displayProductsByFilter(List<Product> products, Predicate<Product> pre, Consumer<Product> con) {
        for (Product p : products) {
            if (pre.test(p)) {
                con.accept(p);
            }
        }
    }

    // 3. Retourner les noms des produits concaténés en une seule chaîne
    @Override
    public String returnProductsNames(List<Product> products, Function<Product, String> fun) {
        StringBuilder result = new StringBuilder();
        for (Product p : products) {
            result.append(fun.apply(p)).append(", ");
        }
        // Supprimer la dernière virgule et espace
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }
        return result.toString();
    }

    // 4. Créer un produit avec un Supplier
    @Override
    public Product createProduct(Supplier<Product> sup) {
        return sup.get();
    }

    // 5. Trier les produits par ID avec un Comparator
    @Override
    public List<Product> sortProductsById(List<Product> products, Comparator<Product> com) {
        List<Product> sortedList = new ArrayList<>(products);
        sortedList.sort(com);
        return sortedList;
    }

    // 6. Convertir la liste en Stream
    @Override
    public Stream<Product> convertToStream(List<Product> products) {
        return products.stream();
    }
}