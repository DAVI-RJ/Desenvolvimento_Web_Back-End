package BaoziStore.BeckEndWeb.services;

import BaoziStore.BeckEndWeb.models.Customer;
import BaoziStore.BeckEndWeb.repository.CustomerRepository;
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
    return repository.findById(id)
    .orElseThrow(() -> new RuntimeException("Customer not found: " + id));
  }

  public Customer save(Customer data){
    return repository.save(data); 
  }

  public void destroy(Long id){
    if (!repository.existsById(id)) {
      throw new RuntimeException("Customer not found: " + id);
    }
    repository.deleteById(id); 
  }
}
