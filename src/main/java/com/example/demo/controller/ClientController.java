package com.example.demo.controller;

import com.example.demo.Model.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final List<Client> clients = new ArrayList<>();

    @GetMapping
    public List<Client> getClients() {
        return clients;
    }

    @PostMapping
    public ResponseEntity<String> addClient(@RequestBody Client client) {
        clients.add(client);
        return ResponseEntity.ok("Client ajouté !");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteClient(@RequestBody Client client) {
        for (Client c : clients) {
            if (Objects.equals(c.getId(), client.getId())) {
                clients.remove(c);
                return ResponseEntity.ok("Client supprimé !");
            }
        }
        return ResponseEntity.notFound().build();
    }
}
