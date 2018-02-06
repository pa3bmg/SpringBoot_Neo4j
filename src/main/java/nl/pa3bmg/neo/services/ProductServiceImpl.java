package nl.pa3bmg.neo.services;

import java.util.ArrayList;
import java.util.List;

import nl.pa3bmg.neo.commands.ProductForm;
import nl.pa3bmg.neo.converters.ProductFormToProduct;
import nl.pa3bmg.neo.model.Product;
import nl.pa3bmg.neo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository;
    private ProductFormToProduct productFormToProduct;
    
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductFormToProduct productFormToProduct) {
        this.productRepository = productRepository;
        this.productFormToProduct = productFormToProduct;
    }
    
	@Override
	public List<Product> listAll() {
		System.out.println("AAAAA");
		List<Product> products = new ArrayList<>();
		System.out.println("AAAAA products size =" +products.size());
        productRepository.findAll().forEach(products::add);
        return products;
	}

	@Override
	public Product getById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public Product saveOrUpdate(Product product) {
		productRepository.save(product);
        return product;
	}

	@Override
	public void delete(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product saveOrUpdateProductForm(ProductForm productForm) {
		Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));
        System.out.println("Saved Product Id: " + savedProduct.getId());
        return savedProduct;
	}
}
