package com.asat.ASATAPI.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.asat.ASATAPI.model.ProductModel;

public interface ProductRepository extends MongoRepository<ProductModel, Integer>{

	Optional<ProductModel> findById(String id);
}
