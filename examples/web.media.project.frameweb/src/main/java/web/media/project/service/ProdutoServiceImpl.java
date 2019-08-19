package web.media.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.media.project.model.Produto;
import web.media.project.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public Optional<Produto> findProdutoById(Long id) {
		return produtoRepository.findById(id);
	}

	@Override
	public List<Produto> findAllProdutos() {
		return produtoRepository.findAll();
	}

	@Override
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Override
	public void deleteProduto(Produto produto) {
		produtoRepository.delete(produto);
	}

}