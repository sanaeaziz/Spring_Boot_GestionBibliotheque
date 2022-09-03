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

import com.aziz.sanae.GBibliotheque.model.Adherent;
import com.aziz.sanae.GBibliotheque.service.AdherentService;

@Controller
@RequestMapping("/adherent")
public class AdherentController {
    @Autowired
    private AdherentService adherentService;

    @GetMapping("")
    public String index(Model modelAndView){
        System.out.println(adherentService.findAllAdherent().size());
        modelAndView.addAttribute("adherents",adherentService.findAllAdherent());
        return "adherent/index";
    }
    @GetMapping("/add")
    public String add(@ModelAttribute Adherent adherent){
        return "adherent/add";
    }
    @PostMapping("/add")
    public String save(@Valid @ModelAttribute Adherent adherent, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "adherent/add";
        }
        adherentService.save(adherent);
        return "redirect:/adherent";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id,Model model){
        model.addAttribute("adherent",adherentService.findAdherentByID(id));
        return "adherent/add";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        adherentService.deleteAdherent(id);
        return "redirect:/adherent";
    }


}