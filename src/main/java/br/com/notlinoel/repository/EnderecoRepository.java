package br.com.notlinoel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.notlinoel.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}