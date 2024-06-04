package com.sustentacion2.demo.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sustentacion2.demo.Domain.Cerveceria;

public interface CerveceriaRepository extends JpaRepository<Cerveceria, Long> {
    List<Cerveceria> findByNombre(String nombre);
   
}
