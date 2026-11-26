package BaoziStore.BeckEndWeb.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  @GetMapping("/")
  public String list() {
    return "server run"; 
  }
  
  @PostMapping ("/create")
  public String create() {
    return "Cliente Salvo"; 
  }
}
