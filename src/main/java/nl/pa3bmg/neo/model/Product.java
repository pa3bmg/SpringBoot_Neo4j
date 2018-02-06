package nl.pa3bmg.neo.model;


import java.math.BigDecimal;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import lombok.Getter;
import lombok.Setter;

@NodeEntity
public class Product {
	
    @Getter @Setter @Id @GeneratedValue private Long id;
	@Getter @Setter private String description;
	@Getter @Setter private BigDecimal price;
	@Getter @Setter private String imageUrl;
}
