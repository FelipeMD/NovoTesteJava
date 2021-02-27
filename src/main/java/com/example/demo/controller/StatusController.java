package com.example.demo.controller;

import com.example.demo.model.UsuarioModel;
import com.example.demo.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StatusController {

    @Autowired
    private IUsuarioRepository repository;

    @GetMapping(path = "/api/status")
    public String check()
    {
        return "online";
    }
}
