package com.example.demo.repository;


import com.example.demo.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<UsuarioModel, Integer> {


}
