package nl.pa3bmg.neo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import nl.pa3bmg.neo.model.Person;

public interface PersonRepository extends Neo4jRepository<Person, Long> {

}
