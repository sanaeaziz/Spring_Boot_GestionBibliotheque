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

import com.aziz.sanae.GBibliotheque.model.Emprunt;
import com.aziz.sanae.GBibliotheque.service.AdherentService;
import com.aziz.sanae.GBibliotheque.service.DictionnaireService;
import com.aziz.sanae.GBibliotheque.service.EmpruntService;
import com.aziz.sanae.GBibliotheque.service.LivreService;
import com.aziz.sanae.GBibliotheque.service.RevueService;

@Controller
@RequestMapping("/emprunt")
public class EmpruntController {
    @Autowired
    private EmpruntService empruntService;
    @Autowired
    private AdherentService adherentService;
    @Autowired
    private LivreService livreService;
    @Autowired
    private RevueService revueService;
    @Autowired
    private DictionnaireService dictionnaireService;
    @GetMapping
    public String index(Model modelAndView){
        modelAndView.addAttribute("emprunts",empruntService.findAll());
        return "emprunt/index";
    }
    @GetMapping("/add")
    public String add(@ModelAttribute Emprunt emprunt,Model model){
        model.addAttribute("adherents",adherentService.findAllAdherent());
        model.addAttribute("livres",livreService.findAll());
        model.addAttribute("revues",revueService.findAll());
        model.addAttribute("dictionnaires",dictionnaireService.findAll());
        return "emprunt/add";
    }
    @PostMapping("/add")
    public String save(@ModelAttribute Emprunt emprunt){


        empruntService.save(emprunt);
        return "redirect:/emprunt";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id, Model model){
        model.addAttribute("emprunt",empruntService.findById(id));
        return "emprunt/add";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        empruntService.delete(id);
        return "redirect:/emprunt";
    }

}
