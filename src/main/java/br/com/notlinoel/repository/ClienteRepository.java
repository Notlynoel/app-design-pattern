package br.com.notlinoel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.notlinoel.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}