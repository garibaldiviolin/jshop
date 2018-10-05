package br.marketplace.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import br.marketplace.utils.RESTAPIEndpoints;

@RestController
@RequestMapping(value = RESTAPIEndpoints.BASE_URL)
public class HelloController {

	@RequestMapping(value = RESTAPIEndpoints.HELLO)
	public String index() {
		return "Hello world!";
	}

}
