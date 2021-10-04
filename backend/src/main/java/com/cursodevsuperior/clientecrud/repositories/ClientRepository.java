package com.cursodevsuperior.clientecrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursodevsuperior.clientecrud.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
