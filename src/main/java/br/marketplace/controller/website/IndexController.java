package br.marketplace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.marketplace.service.CategoryService;
import br.marketplace.model.Category;

@Controller
public class IndexController {
	
	@Autowired
	private CategoryService service; //	Injeta a classe de serviços
	
	//Vai para tela principal do CRUD aonde são listados todos as categorias
	@GetMapping("/")
	public ModelAndView findAll() {
		
		ModelAndView mv = new ModelAndView("/category");
		mv.addObject("categories", service.findAll());
		
		return mv;
	}
	
	//Vai para tela de adição de category
	@GetMapping("/add")
	public ModelAndView add(Category category) {
		
		ModelAndView mv = new ModelAndView("/categoryAdd");
		mv.addObject("category", category);
		
		return mv;
	}
	
	//Vai para tela de edição de categorias (mesma tela de adição, contudo é enviado para a view um objeto que já existe)
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		
		return add(service.getOne(id));
	}
	
	//Exclui um category por seu ID e redireciona para a tela principal
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		
		return findAll();
	}
	
	//Recebe um objeto preenchido do Thymeleaf e valida 
	//Se tudo estiver ok, salva e volta para tela principal
	//Se houver erro, retorna para tela atual exibindo as mensagens de erro
	@PostMapping("/save")
	public ModelAndView save(Category category, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(category);
		}
		
		service.save(category);
		
		return findAll();
	}
	
}