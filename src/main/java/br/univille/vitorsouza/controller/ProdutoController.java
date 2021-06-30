package br.univille.vitorsouza.controller;

//import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.vitorsouza.model.Produto;
import br.univille.vitorsouza.service.ProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ModelAndView index(){
        /*
        Produto prdo1 = new Produto();
        prdo1.setDescricao("Produto legal 1");
        prdo1.setDataRegistro(new Date());
        prdo1.setPreco(2000);

        Produto prdo2 = new Produto();
        prdo2.setDescricao("Produto legal 2");
        prdo2.setDataRegistro(new Date());
        prdo2.setPreco(1538);
*/

        List<Produto> listaProduto = service.getAllProduto();

        /*
        listaProduto.add(prdo1);
        listaProduto.add(prdo2);
        */
        return new  ModelAndView("produto/index","listaProdutos", listaProduto);

          }

          @GetMapping("/novo")
          public ModelAndView novo(@ModelAttribute Produto produto){
              return new ModelAndView("produto/form");
          }

          @PostMapping(params = "form")
          public ModelAndView save(Produto produto){
              service.save(produto);
              return new ModelAndView("redirect:/produto");
              
          }

          @GetMapping(value = "/alterar/{id}")
          public ModelAndView alterar(@PathVariable("id") Produto produto){

              return new ModelAndView("produto/form", "produto", produto);

          }
  
}
