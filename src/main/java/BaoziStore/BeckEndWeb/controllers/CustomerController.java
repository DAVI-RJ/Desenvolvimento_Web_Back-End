package BaoziStore.BeckEndWeb.controllers;

import BaoziStore.BeckEndWeb.services.CustomerService;
import BaoziStore.BeckEndWeb.models.Customer;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  private final CustomerService service;

  public CustomerController(CustomerService service) {
    this.service = service;
  }

  @GetMapping
  public List<Customer> list() {
    return service.listAll();
  }

  @GetMapping("/{id}")
  public Customer findById(Long id) {
    return service.findById(id);
  }

  @PostMapping("/register")
  @ResponseStatus(HttpStatus.CREATED)
  public Customer create(@RequestBody Customer data) {
    return service.save(data);
  }

  /* @PutMapping("/{id}")
  public Customer update(Long id, @RequestBody Customer data) {
    return service.update(id, data);
  } */

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void destroy(Long id) {
    service.destroy(id);
  }
}