package BaoziStore.BeckEndWeb.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "products")
public class Product {

  @Id 
  @GeneratedValue (strategy = GenerationType.IDENTITY)

  private Long id;
  private String name;
  @Column(precision = 10, scale = 2)
  private BigDecimal price;
  private Integer stock;
  private Boolean status; 
  @Column(unique = true, nullable = false)
  private String sku; 

  // Construtor vazio obrigatório para o jpa. 
  public Product() {}

  // Getters e Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public Boolean getStatus(){
    return status;
  }

  public void setStatus(Boolean status){
    this.status = status; 
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

}
