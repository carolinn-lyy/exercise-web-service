package com.example.restservice.api;

import com.example.restservice.model.Address;
import com.example.restservice.model.City;
import com.example.restservice.model.Owner;
import com.example.restservice.model.Pet;
import com.example.restservice.service.PetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PetController {

    //GET
    @GetMapping("/pet")
    public List<Pet> getAllPets(){
        PetService service = new PetService();
        return service.getAllPets();
    }

    //I want to use the same route => (/pet) but I want to send an id to filter the data
    //PathVariable
    @GetMapping("/pet/{id}")
    public Pet getPetById(@PathVariable int id){
        PetService service = new PetService();
        List<Pet> pets = service.getAllPets();
        //Lambda expression
        for(Pet p : pets){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
        //JAVA 8 lambda expression
//        return pets.stream().filter(pet -> pet.getId() == id).findFirst().get();


    }

    //POST

    //PUT

    //DELETE
}

