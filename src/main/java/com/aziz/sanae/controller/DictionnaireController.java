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

import com.aziz.sanae.model.Dictionnaire;
import com.aziz.sanae.service.DictionnaireService;


@Controller
@RequestMapping("/document/dictionnaire")
public class DictionnaireController {
    @Autowired
    private DictionnaireService dictionnaireService;
    @GetMapping("/add")
    public String add(@ModelAttribute Dictionnaire dictionnaire){
        return "document/AddDictionnaire";
    }
    @PostMapping("/add")
    public String save(@Valid @ModelAttribute Dictionnaire dictionnaire, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "document/AddDictionnaire";
        }
        dictionnaireService.save(dictionnaire);
        return "redirect:/document";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id, Model model){
        model.addAttribute("dictionnaire",dictionnaireService.findById(id));
        return "document/AddDictionnaire";
    }
    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute Dictionnaire dictionnaire, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "document/AddDictionnaire";
        }
        dictionnaireService.Update(dictionnaire);
        return "redirect:/document";
        //return "document/AddDictionnaire";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        dictionnaireService.delete(id);
        return "redirect:/adherent";
    }

}
