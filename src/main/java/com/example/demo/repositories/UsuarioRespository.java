package com.example.demo.repositories;

import com.example.demo.models.Response.GenericResponse;
import org.springframework.stereotype.Repository;

import com.example.demo.models.UsuarioModel;

import java.util.ArrayList;

public interface UsuarioRespository {

    public ArrayList<UsuarioModel> getUsers();

    public GenericResponse<UsuarioModel> saveUser(UsuarioModel user);
}
