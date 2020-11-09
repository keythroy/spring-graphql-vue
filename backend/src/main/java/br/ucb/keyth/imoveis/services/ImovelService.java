package br.ucb.keyth.imoveis.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import br.ucb.keyth.imoveis.repositories.ImovelRepository;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import br.ucb.keyth.imoveis.models.Imovel;

@Service
@GraphQLApi
public class ImovelService {

    private final ImovelRepository repo;
    //private final FotoService fotoService;

    public ImovelService(ImovelRepository repo) {
        this.repo = repo;
      //  this.fotoService = fotoService;
    }

    @GraphQLQuery(name = "imoveis")
    public List<Imovel> getImoveis() {
        return repo.findAll();
    }

    @GraphQLQuery(name = "imovel")
    public Optional<Imovel> getImovelById(@GraphQLArgument(name = "id") Long id) {
        return repo.findById(id);
    }

    @GraphQLMutation(name = "salvarImovel")
    public Imovel saveImovel(@GraphQLArgument(name = "ImovelInput") Imovel imovel) {
        return repo.save(imovel);
    }

    @GraphQLMutation(name = "deleteImovel")
    public void deleteImovel(@GraphQLArgument(name = "id") Long id) {
        repo.deleteById(id);
    }

    // @GraphQLQuery(name = "isCool")
    // public boolean isCool(@GraphQLContext Imovel Imovel) {
    //     return !Imovel.getName().equals("AMC Gremlin") &&
    //             !Imovel.getName().equals("Triumph Stag") &&
    //             !Imovel.getName().equals("Ford Pinto") &&
    //             !Imovel.getName().equals("Yugo GV");
    // }

    // @GraphQLQuery(name = "giphyUrl")
    // public String getGiphyUrl(@GraphQLContext Imovel Imovel) {
    //     return giphyService.getGiphyUrl(Imovel.getName());
    // }
}
