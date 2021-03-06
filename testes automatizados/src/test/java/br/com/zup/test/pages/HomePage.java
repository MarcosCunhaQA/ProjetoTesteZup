package br.com.zup.test.pages;

public class HomePage extends BasePage {
	
	private String URL_SITE = "http://www.americanas.com.br/";
	private String CAMPO_PESQUISA = "//input[@id='h_search-input']";

	
	public HomePage() {
		super();
	}
	
	public void acessarSiteAmericanas() {
		getDSL().visitarPagina(URL_SITE);
	}
	
	public void pesquisarItem(String nome) {
		esperarPaginaCarregar();
		getDSL().digitar(CAMPO_PESQUISA, nome);
	}
	
}
