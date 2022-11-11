package com.adrian.olvera.di.interfaceService;

import java.util.List;
import java.util.Optional;

import com.adrian.olvera.di.modelo.Persona;

public interface IpersonaService {

	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
}
