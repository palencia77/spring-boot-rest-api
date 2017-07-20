package com.palencia77.repositorio;

import com.palencia77.modelo.Automovil;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by palencia77 on 7/19/17.
 */
@RepositoryRestResource(collectionResourceRel = "automovil", path = "automoviles")
public interface AutomovilDAO extends MongoRepository<Automovil, Long> {

    //List<Automovil> encontrarPorAdicional(@Param("adicional") String adicional);
}
