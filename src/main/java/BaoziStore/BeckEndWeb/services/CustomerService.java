package BaoziStore.BeckEndWeb.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class CustomerService {
  private final CustomerRepository repository;

  public CustomerService(CustomerRepository repository){
    this.repository = repository; 
  } 

  public List<Customer> listAll(){
    return repository.findAll(); 
  }

  public Customer findById(Long id){
    return repository.findById(id);
  }

  public Customer create(Long data){
    return repository.save(data); 
  }

  public void destroy(Long id){
    repository.deleteById(id); 
  }
}
