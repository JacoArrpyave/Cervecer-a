package com.sustentacion2.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sustentacion2.demo.Domain.Cerveceria;

public interface CerveceriaRepository extends JpaRepository<Cerveceria, Long> {
   
}   
