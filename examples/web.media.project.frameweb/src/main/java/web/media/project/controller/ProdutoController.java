package web.media.project.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import web.media.project.model.Produto;
import web.media.project.service.ProdutoService;

@Scope(value = "session")
@Component(value = "produtoController")
@ELBeanName(value = "produtoController")
@Join(path = "/produto", to = "/cadastrar-produto.jsf")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	private Produto produto = new Produto();

	public String save() {
		produtoService.saveProduto(produto);
		produto = new Produto();
		return "/lista-produtos.xhtml?faces-redirect=true";
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}