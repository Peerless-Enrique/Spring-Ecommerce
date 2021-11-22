package com.proyect.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.ecommerce.model.Producto;


@Repository
public interface ProductoRepository  extends JpaRepository<Producto, Integer>{
	
	

}
