package br.com.fiap.financiamento.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.produtos.mvc.dto.Produto;
import br.com.fiap.produtos.mvc.service.impl.ProdutoServiceImpl;

@Controller
public class controle_intenção {

	
	@Autowired
	ProdutoServiceImpl service;
	
	@GetMapping("novo-produto")
	public ModelAndView homeProduto() {
		ModelAndView view = new ModelAndView("produto");
		view.addObject(new Produto());
		return view;
	}
	
	@PostMapping("salvar-produto")
	public String salvarProduto(@Valid Produto produto, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(produto);
			return "produto";
		}
		service.salvarProduto(produto);
		return "redirect:/";
	}
	
}
