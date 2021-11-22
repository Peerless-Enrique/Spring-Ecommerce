package com.proyect.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.ecommerce.model.Producto;
import com.proyect.ecommerce.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	
	@Autowired
	private ProductoRepository productoRepository;
 	

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		
		productoRepository.save(producto);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		
		productoRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> findAll() {
		
		return productoRepository.findAll();
	}
	
	
	

}
