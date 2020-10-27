package br.ucb.keyth.imoveis.services;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import br.ucb.keyth.imoveis.repositories.FotoRepository;
import br.ucb.keyth.imoveis.models.Foto;

@Service
@GraphQLApi
public class FotoService {

    private final FotoRepository repo;
    //private final FotoService fotoService;

    public FotoService(FotoRepository repo) {
        this.repo = repo;
      //  this.fotoService = fotoService;
    }

    @GraphQLQuery(name = "fotos")
    public List<Foto> getImoveis() {
        return repo.findAll();
    }

    @GraphQLQuery(name = "foto")
    public Optional<Foto> getFotoById(@GraphQLArgument(name = "id") Integer id) {
        return repo.findById(id);
    }

    @GraphQLMutation(name = "salvarFoto")
    public Foto saveFoto(@GraphQLArgument(name = "foto") Foto foto) {
        return repo.save(foto);
    }

    @GraphQLMutation(name = "deleteFoto")
    public void deleteFoto(@GraphQLArgument(name = "id") int id) {
        repo.deleteById(id);
    }

    // @GraphQLQuery(name = "isCool")
    // public boolean isCool(@GraphQLContext Foto Foto) {
    //     return !Foto.getName().equals("AMC Gremlin") &&
    //             !Foto.getName().equals("Triumph Stag") &&
    //             !Foto.getName().equals("Ford Pinto") &&
    //             !Foto.getName().equals("Yugo GV");
    // }

    // @GraphQLQuery(name = "giphyUrl")
    // public String getGiphyUrl(@GraphQLContext Foto Foto) {
    //     return giphyService.getGiphyUrl(Foto.getName());
    // }
}
