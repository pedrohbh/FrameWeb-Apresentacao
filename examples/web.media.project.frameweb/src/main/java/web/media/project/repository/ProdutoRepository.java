package web.media.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web.media.project.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}