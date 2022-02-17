package com.example.restservice.service;

import com.example.restservice.exception.PetNotFoundException;
import com.example.restservice.model.Address;
import com.example.restservice.model.City;
import com.example.restservice.model.Owner;
import com.example.restservice.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetService {

    static List<Pet> pets = new ArrayList<>();

    public List<Pet> getAllPets(){

        Pet pet1 = new Pet(1, new Owner("A", new Address(100, "Rose",
                new City("Verdun", "QC")), "111111"));
        Pet pet2 = new Pet(2, new Owner("B", new Address(200, "Cat",
                new City("Longueill", "QC")), "2222"));
        Pet pet3 = new Pet(3, new Owner("C", new Address(300, "Dog",
                new City("Montreal", "QC")), "333333"));


        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);

        return pets;
    }

    public Pet getById(int id){
        Pet pet = findById(id);
        if (pet != null){
            return pet;
        }
        throw  new PetNotFoundException("Pet is not available");
    }

    public Pet getByOwnerName(String ownerName){
        for(Pet p : pets){
            if (p.getOwner().getName().equals(ownerName)){
                return p;
            }
        }
        return null;
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void updatePet(int id, Pet pet){
        //find the pet and update it
        Pet fetchedPet = this.findById(id);
        if(fetchedPet != null){
            fetchedPet = pet;
           //update pet !!!! => will teach database next week!!!
        }
    }

    public void deletePet(int id){
        Pet fetchedPet = this.findById(id);
        if(fetchedPet != null){
            //delete pet !!!! => will teach database next week!!!
        }
    }

    private Pet findById(int id){
        for(Pet p : pets){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
}
