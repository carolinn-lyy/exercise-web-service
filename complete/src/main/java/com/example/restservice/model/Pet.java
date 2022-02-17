package com.example.restservice.model;

//POJO classes
//plain object java class
public class Pet {
    private int id;
    private Owner owner;

    public Pet(int id, Owner owner) {
        this.id = id;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
// DON't make another class int the same file !!!!
// here we do JAVA and not python
