package com.example.restservice.api;

import com.example.restservice.model.Pet;
import com.example.restservice.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    PetService petService = new PetService();
    //GET
    @GetMapping("/pet")
    public List<Pet> getAllPets(){
        return petService.getAllPets();
    }

    //I want to use the same route => (/pet) but I want to send an id to filter the data
    //PathVariable
    @GetMapping("/pet/{id}")
    public Pet getPetById(@PathVariable int id){
        return petService.getById(id);
    }

    //POST
    @PostMapping("/pet")
    public Pet savePet(@RequestBody Pet pet){
        petService.addPet(pet);
        return pet;
    }

    //PUT

    //DELETE
}

