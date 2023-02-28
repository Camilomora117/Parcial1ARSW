package com.example.demo.repositories;

import com.example.demo.models.Response.GenericResponse;
import com.example.demo.models.UsuarioModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UsuarioRepositoryImp implements UsuarioRespository{

    private ArrayList<UsuarioModel> users = new ArrayList<>();

    public UsuarioRepositoryImp() {
       UsuarioModel carol = new UsuarioModel();
       carol.setNombre("carol");
       carol.setEmail("carol@mail");
       carol.setId(1);
       carol.setPrioridad("alta");
       users.add(carol);
    }

    @Override
    public ArrayList<UsuarioModel> getUsers() {
        return users;
    }

    @Override
    public GenericResponse<UsuarioModel> saveUser(UsuarioModel user) {
        users.add(user);
        return new GenericResponse<UsuarioModel>(HttpStatus.OK,"exitoso",true, user);
    }
}
