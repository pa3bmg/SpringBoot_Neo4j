package nl.pa3bmg.neo.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import lombok.Getter;
import lombok.Setter;

@NodeEntity
public class Person {
	@Getter @Setter private Long id;
	@Getter @Setter private String name;
	
	public Person() {};

	public Person(String name) {
		this.name = name;
	}
	
	@Relationship(type = "TEAMMATE", direction = Relationship.UNDIRECTED)
	public Set<Person> teammates;

	public void worksWith(Person person) {
		if (teammates == null) {
			teammates = new HashSet<>();
		}
		teammates.add(person);
	}
	
	public String toString() {
		return this.name + "'s teammates => "
				+ Optional.ofNullable(this.teammates).orElse(
						Collections.emptySet()).stream().map(
								person -> person.getName()).collect(Collectors.toList());
	}
}
