package com.globallogic.bootcampgl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.bootcampgl.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Long>{

}
