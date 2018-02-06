package nl.pa3bmg.neo.bootstrap;

import java.math.BigDecimal;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import nl.pa3bmg.neo.model.Product;
import nl.pa3bmg.neo.repository.ProductRepository;

@Component
public class NeoBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	private ProductRepository productRepository;
	
	public NeoBootstrap(ProductRepository _productRepository) {
		productRepository = _productRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		Product product1 = new Product();
        product1.setDescription("Product1");
        product1.setImageUrl("www1");
        product1.setPrice(BigDecimal.valueOf(100.00));
        productRepository.save(product1);
        
        Product product2 = new Product();
        product2.setDescription("Product2");
        product2.setImageUrl("www2");
        product2.setPrice(BigDecimal.valueOf(102.00));
        productRepository.save(product2);
		
	}
}
