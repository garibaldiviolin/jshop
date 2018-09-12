package br.marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.marketplace.model.Category;

@Repository //Define a classe como um bean do Spring
public interface CategoryRepository extends JpaRepository<Category, Long> { } 
//Deve estender JpaRepository e declarar a entidade (Category) e o tipo de chave primária (Long)
