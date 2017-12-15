package edu.cnm.deepdive.springdatarestpeople.group;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Interface for the Group class
 */
@RepositoryRestResource(collectionResourceRel = "groupies", path = "groupies")
public interface GroupRepository extends CrudRepository<Group, Long> {

}
