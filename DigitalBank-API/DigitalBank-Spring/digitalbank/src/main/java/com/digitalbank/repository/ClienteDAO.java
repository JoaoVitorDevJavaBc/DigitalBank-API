package com.digitalbank.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.digitalbank.model.Cliente;

@Repository
public class ClienteDAO {

    private final JdbcTemplate jdbcTemplate;

    public ClienteDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void salvar(Cliente cliente) {
       String sql = "INSERT INTO clientes (nome, cpf, email, data_nascimento, celular) VALUES (?, ?, ?, ?, ?)";


        jdbcTemplate.update(
            sql,
            cliente.getNome(),
            cliente.getCPF(),
            cliente.getEmail(),
            cliente.getDataDeNascimento(),
            cliente.getCelular()
        );
    }

    }


