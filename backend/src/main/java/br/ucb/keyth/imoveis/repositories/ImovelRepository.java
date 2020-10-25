package br.ucb.keyth.imoveis.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import br.ucb.keyth.imoveis.model.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
    
}