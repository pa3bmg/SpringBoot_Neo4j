package nl.pa3bmg.neo.commands;


import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

public class ProductForm {
	@Getter @Setter private Long id;
	@Getter @Setter private String description;
	@Getter @Setter private BigDecimal price;
	@Getter @Setter private String imageUrl;
}
