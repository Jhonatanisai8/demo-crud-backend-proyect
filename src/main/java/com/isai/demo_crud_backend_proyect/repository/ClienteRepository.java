package com.isai.demo_crud_backend_proyect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isai.demo_crud_backend_proyect.models.entitis.Cliente;

@Repository
public interface ClienteRepository
        extends JpaRepository<Cliente, Integer> {

}
