package com.adrian.olvera.di.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adrian.olvera.di.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository <Persona, Integer>{

}
