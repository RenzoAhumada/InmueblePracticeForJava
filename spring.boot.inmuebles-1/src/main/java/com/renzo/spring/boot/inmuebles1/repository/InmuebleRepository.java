package com.renzo.spring.boot.inmuebles1.repository;

import com.renzo.spring.boot.inmuebles1.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InmuebleRepository extends JpaRepository<Inmueble, Long>{


}
