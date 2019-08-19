package web.media.project.controller;

import java.util.List;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import web.media.project.service.ProdutoService;

@Scope(value = "session")
@Component(value = "listaProdutosController")
@ELBeanName(value = "listaProdutosController")
@Join(path = "/", to = "/lista-produtos.jsf")
public class ListaProdutosController {

	@Autowired
	private ProdutoService produtoService;

	private List produtos;

	@Deferred
	@RequestAction
	@IgnorePostback
	public void loadData() {
		produtos = produtoService.findAllProdutos();
	}

	public List getProdutos() {
		return produtos;
	}

	public void setProdutos(List produtos) {
		this.produtos = produtos;
	}

}