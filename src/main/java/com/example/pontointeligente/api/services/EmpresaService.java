package com.example.pontointeligente.api.services;

import java.util.Optional;

import com.example.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	Empresa persistir(Empresa empresa);

}
