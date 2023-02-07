package com.uselessshitxd.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.uselessshitxd.springboot.backend.apirest.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
