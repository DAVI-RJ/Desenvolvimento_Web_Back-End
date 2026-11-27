package BaoziStore.BeckEndWeb.repository;

import BaoziStore.BeckEndWeb.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
  boolean existsByName(String name); // validação
}
