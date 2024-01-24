package com.example.btap_crud.service;

import com.example.btap_crud.model.Cake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.btap_crud.repository.CakeRepository;

import java.util.List;

@Service
public class CakeService {
    @Autowired
    private CakeRepository cakeRepository;

    public List<Cake> getAllProducts() {
        return cakeRepository.getAllProduct();
    }

    public void createCake(Cake cake) {
        cakeRepository.createCake(cake);
    }

    public void update(int id, Cake cake) {
        cakeRepository.update(id, cake);
    }

    public Cake findById(int id) {
        return cakeRepository.findById(id);
    }

    public void remove(int id) {
        cakeRepository.remove(id);
    }
}