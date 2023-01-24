package com.maru.microservice.repository;

import com.maru.microservice.models.UsuarioCertificado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioCertificadoRepository extends CrudRepository<UsuarioCertificado, Integer> {
}
