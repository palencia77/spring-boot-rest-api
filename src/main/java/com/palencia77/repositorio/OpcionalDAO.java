package com.palencia77.repositorio;

import com.palencia77.modelo.Opcional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by palencia77 on 7/20/17.
 */
@RepositoryRestResource(collectionResourceRel = "opcional", path = "opcionales")
public interface OpcionalDAO extends MongoRepository<Opcional, Long> {
}
