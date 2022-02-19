package com.example.restservice.api;

import com.example.restservice.exception.PetExistException;
import com.example.restservice.exception.PetNotFoundException;
import com.example.restservice.model.Pet;
import com.example.restservice.service.PetService;
import org.apache.tomcat.util.http.parser.HttpParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Pet> getPetById(@PathVariable int id) {
        try{
            return new ResponseEntity<>(petService.getById(id), HttpStatus.OK);
        }
        catch(PetNotFoundException petNotFoundException ){
            return new ResponseEntity(petNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/pet/ownername/{name}")
    public ResponseEntity<Pet> getPetByOwnerName(@PathVariable String name){

        //add exception
        try{
            return new ResponseEntity<>(petService.getByOwnerName(name), HttpStatus.OK);
        }
        catch(PetNotFoundException petNotFoundException){
            return new ResponseEntity(petNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    //POST
    @PostMapping("/pet")
    public ResponseEntity<Pet> savePet(@RequestBody Pet pet){
        try{
            petService.addPet(pet);
            return new ResponseEntity<>(pet, HttpStatus.CREATED);
        }
        catch (PetExistException exception){
            return new ResponseEntity(exception.getMessage(), HttpStatus.CONFLICT);
        }

    }

    //swagger

    //PUT
    @PutMapping("/pet/{id}")
    public Pet modifyPet(@PathVariable int id, @RequestBody Pet pet){

        //add exception if the pet does not exist
        petService.updatePet(id, pet);
        return pet;
    }

    //DELETE
    @DeleteMapping("/pet/{id}")
    public void deletePet(@PathVariable int id){
        //add exception if the pet does not exist
        petService.deletePet(id);
    }

    //CRUD operation => Create, READ, Update and delete

}

