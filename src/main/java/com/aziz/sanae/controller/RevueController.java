package com.aziz.sanae.controller;

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

import com.aziz.sanae.model.Revue;
import com.aziz.sanae.repository.DictionnaireRepository;
import com.aziz.sanae.repository.LivreRepository;
import com.aziz.sanae.repository.RevueRepository;
import com.aziz.sanae.service.RevueService;


@Controller
@RequestMapping("/document/revue")
public class RevueController {
    @Autowired
    private RevueService revueService;
    //
    @Autowired
    LivreRepository livreRepository;
    @Autowired
    RevueRepository revueRepository;
    @Autowired
    DictionnaireRepository dictionnaireRepository;
    @GetMapping
    public String index(Model model){
        model.addAttribute("revues",revueService.findAll());
        model.addAttribute("nb_livre",livreRepository.count());
        model.addAttribute("nb_revue",revueRepository.count());
        model.addAttribute("nb_dictionnaire",dictionnaireRepository.count());
        return "document/revueIndex";
    }
    @GetMapping("/add")
    public String add(@ModelAttribute Revue revue){
        return "document/addRevue";
    }
    @PostMapping("/add")
    public String save(@Valid @ModelAttribute Revue revue, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "document/addRevue";
        }
        revueService.save(revue);
        return "redirect:/document/revue";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id, Model model){
        model.addAttribute("revue",revueService.findById(id));
        return "document/addRevue";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        revueService.delete(id);
        return "redirect:/document/livre";
    }
}
