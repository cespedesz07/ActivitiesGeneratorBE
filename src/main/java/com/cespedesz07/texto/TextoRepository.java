package com.cespedesz07.texto;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TextoRepository extends CrudRepository<Texto, Integer> {

    /*
    @Query("SELECT t FROM texto t where t.nivel = :nivel")
    public Iterable<Texto> getTextoByNivel(@Param("nivel") int nivel);
    */
}
