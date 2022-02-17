package com.example.restservice.service;

import com.example.restservice.model.Address;
import com.example.restservice.model.City;
import com.example.restservice.model.Owner;
import com.example.restservice.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetService {

    public List<Pet> getAllPets(){
        Pet pet1 = new Pet(1, new Owner("A", new Address(100, "Rose",
                new City("Verdun", "QC")), "111111"));
        Pet pet2 = new Pet(2, new Owner("B", new Address(200, "Cat",
                new City("Longueill", "QC")), "2222"));
        Pet pet3 = new Pet(3, new Owner("C", new Address(300, "Dog",
                new City("Montreal", "QC")), "333333"));

        List<Pet> pets = new ArrayList<>();
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        return pets;
    }
}
