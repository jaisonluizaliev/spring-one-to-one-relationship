package com.example.demo.charge;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity

@Table(name = "charges")


@Getter
@Setter
public class Charge {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private long id;

  private String charge;

  private double salary;
  
}


