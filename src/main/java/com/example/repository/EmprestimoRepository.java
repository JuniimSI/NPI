package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Emprestimo;
import com.example.model.Usuario;

@Repository
@Transactional
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer>{
	Emprestimo findByOrigem(Usuario u);
	
}
