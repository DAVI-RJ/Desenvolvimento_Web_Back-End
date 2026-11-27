package BaoziStore.BeckEndWeb.repository;

import BaoziStore.BeckEndWeb.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
  boolean existsBySku(String sku); // Validação
}
