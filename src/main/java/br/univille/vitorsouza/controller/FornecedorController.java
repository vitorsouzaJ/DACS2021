package br.univille.vitorsouza.controller;

import java.util.List;

//import java.util.ArrayList;
//import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.vitorsouza.model.Fornecedor;
import br.univille.vitorsouza.service.FornecedorService;


@Controller
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService service;

    @GetMapping
    public ModelAndView index(){
       

        List<Fornecedor> listaFornecedor = service.getAllFornecedor();

       
        return new  ModelAndView("fornecedor/index","listaFornecedor", listaFornecedor);

          }


        @GetMapping("/login")
          public ModelAndView novo(@ModelAttribute Fornecedor fornecedor){
              return new ModelAndView("fornecedor/form");
          }

          @PostMapping(params = "form")
          public ModelAndView save(Fornecedor fornecedor){
              service.save(fornecedor);
              return new ModelAndView("redirect:/fornecedor");
              
          }

          
      

          
  
}
