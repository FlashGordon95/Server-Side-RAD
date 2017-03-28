package com.web1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @RequestMapping(value = "/hello")
  public String helloWorld(Model model) {

    model.addAttribute("greeting", "Hello to the World!");
    return "helloWorld";
  }
}
