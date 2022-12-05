package com.example.demo.charge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/charges")
public class ChargeController {

  @Autowired
  private ChargeRepository charge_repository;

  @GetMapping("/list-all")
  public Iterable<Charge> listAllCharges() {
    return charge_repository.findAll();
  }

  @PostMapping("/post-new")
  public Charge postNewCharge(@RequestBody Charge obj) {
    return charge_repository.save(obj);
  }

}
