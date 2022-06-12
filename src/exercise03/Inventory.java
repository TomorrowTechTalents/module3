package exercise03;

import java.util.ArrayList;
import java.util.List;

class Inventory {
    private final List<Product> products = new ArrayList<>();



    void add(Product product) {
        this.products.add(product);
    }

    // talvez fazer privada
    Product findProductById(int id) { // usar stream
        for (Product product : this.products) {
            if (product.id == id) { // garantir que o id é único, static na class, automatico++
                return product;
            }
        }

        System.err.println("id não encontrado");
        return null;
    }

    void checkProductById(int id) {
        Product product = findProductById(id);

        if (product != null) {
            System.out.println(product);
        }
    }

    void delete(Product product) {
        products.remove(product);
    }
}
