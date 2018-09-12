package br.marketplace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.marketplace.model.Category;
import br.marketplace.repository.CategoryRepository;

@Service //Define a classe como um bean do Spring
public class CategoryService {

	@Autowired
	private CategoryRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todo categorias inseridos
	public List<Category> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um categoria a partir do ID
	public Category getOne(Long id) {
		return repository.getOne(id);
	}
	
	//Salva ou atualiza uma categoria
	public Category save(Category category) {
		return repository.saveAndFlush(category);
	}
	
	//Exclui um categoria
	public void delete(Long id) {
		repository.deleteById(id);
	}

}