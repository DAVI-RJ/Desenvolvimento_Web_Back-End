package BaoziStore.BeckEndWeb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "customers")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private LocalDate dateRegister
  ;

  // Construtor vazio obrigatório para o JPA
  public Customer() {
  }

  public Customer(String name, LocalDate dateRegister

  ) {
    this.name = name;
    this.dateRegister
     = dateRegister
    ;
  }

  // Getters e Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return name;
  }

  public void setNome(String name) {
    this.name = name;
  }

  public LocalDate getClienteDesde() {
    return dateRegister
    ;
  }

  public void setClienteDesde(LocalDate dateRegister

  ) {
    this.dateRegister = dateRegister;
  }
}