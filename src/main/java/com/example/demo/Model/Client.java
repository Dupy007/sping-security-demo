package com.example.demo.Model;

import lombok.Getter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@EntityScan
public class Client {
    private final String nom;
    private final String prenom;
    private final Long id;

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = (long) Math.abs(Math.random()*(nom.hashCode()+prenom.hashCode()));
    }

}
