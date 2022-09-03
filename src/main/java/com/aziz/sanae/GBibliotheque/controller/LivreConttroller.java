package com.aziz.sanae.GBibliotheque.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aziz.sanae.GBibliotheque.model.Livre;
import com.aziz.sanae.GBibliotheque.repository.DictionnaireRepository;
import com.aziz.sanae.GBibliotheque.repository.LivreRepository;
import com.aziz.sanae.GBibliotheque.repository.RevueRepository;
import com.aziz.sanae.GBibliotheque.service.LivreService;


@Controller
@RequestMapping("/document/livre")
public class LivreConttroller {
	@Autowired
    private LivreService livreService;

    @Autowired
    LivreRepository livreRepository;
    @Autowired
    RevueRepository revueRepository;
    @Autowired
    DictionnaireRepository dictionnaireRepository;
    @GetMapping
    public String index(Model model){
        model.addAttribute("livres",livreService.findAll());
        model.addAttribute("nb_livre",livreRepository.count());
        model.addAttribute("nb_revue",revueRepository.count());
        model.addAttribute("nb_dictionnaire",dictionnaireRepository.count());
        return "document/livreIndex";
    }
    @GetMapping("/add")
    public String add(@ModelAttribute Livre livre){
        return "document/addLivre";
    }
    @PostMapping("/add")
    public String save(@Valid @ModelAttribute Livre livre, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "document/addLivre";
        }
        livreService.save(livre);
        return "redirect:/document/livre";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id, Model model){
        model.addAttribute("livre",livreService.findById(id));
        return "document/addLivre";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        livreService.delete(id);
        return "redirect:/document/livre";
    }
}

