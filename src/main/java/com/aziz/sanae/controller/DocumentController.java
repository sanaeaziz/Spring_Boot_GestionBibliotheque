package com.aziz.sanae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aziz.sanae.repository.DictionnaireRepository;
import com.aziz.sanae.repository.LivreRepository;
import com.aziz.sanae.repository.RevueRepository;
import com.aziz.sanae.service.DictionnaireService;


@Controller
@RequestMapping("/document")
public class DocumentController {
    @Autowired
    LivreRepository livreRepository;
    @Autowired
    RevueRepository revueRepository;
    @Autowired
    DictionnaireRepository dictionnaireRepository;
    @Autowired
    DictionnaireService dictionnaireService;

    @GetMapping
    public String index(Model modelAndView){
        modelAndView.addAttribute("nb_livre",livreRepository.count());
        modelAndView.addAttribute("nb_revue",revueRepository.count());
        modelAndView.addAttribute("nb_dictionnaire",dictionnaireRepository.count());
        modelAndView.addAttribute("dictionnaires",dictionnaireService.findAll());
        return "document/index";
    }
}
