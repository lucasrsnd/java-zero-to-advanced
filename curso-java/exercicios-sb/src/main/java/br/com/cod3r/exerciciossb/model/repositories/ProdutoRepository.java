package br.com.cod3r.exerciciossb.model.repositories;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

    public Optional<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
