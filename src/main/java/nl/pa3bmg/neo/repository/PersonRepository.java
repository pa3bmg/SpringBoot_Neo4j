package nl.pa3bmg.neo.repository;

import org.springframework.data.neo4j.repository.
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends GraphRepository<Person> {

}
