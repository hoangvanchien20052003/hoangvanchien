package product.repostitory;

import product.model.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);

    void suaId (int id);

    void removeProduct (int id);

    List<Product> findALl();

    void findName(int name);

    
}
