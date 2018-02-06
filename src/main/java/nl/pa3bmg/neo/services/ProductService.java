package nl.pa3bmg.neo.services;

import java.util.List;

import nl.pa3bmg.neo.commands.ProductForm;
import nl.pa3bmg.neo.model.Product;

public interface ProductService {
	List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
