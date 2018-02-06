package nl.pa3bmg.neo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import nl.pa3bmg.neo.model.Product;

public interface ProductRepository extends Neo4jRepository<Product, Long> {

}
