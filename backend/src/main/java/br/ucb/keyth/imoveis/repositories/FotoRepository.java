package br.ucb.keyth.imoveis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ucb.keyth.imoveis.models.Foto;

public interface FotoRepository extends JpaRepository<Foto, Integer> {
    
}