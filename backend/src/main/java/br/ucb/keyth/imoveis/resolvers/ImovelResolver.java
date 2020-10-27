package br.ucb.keyth.imoveis.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ucb.keyth.imoveis.models.Imovel;
import br.ucb.keyth.imoveis.services.ImovelService;

@Component
public class ImovelResolver 
{
    @Autowired
    private ImovelService service;

    public List<Imovel> imoveis() {
        return service.getImoveis();
    }

    public List<Imovel> imovel() {
        return service.getImoveis();
    }
}