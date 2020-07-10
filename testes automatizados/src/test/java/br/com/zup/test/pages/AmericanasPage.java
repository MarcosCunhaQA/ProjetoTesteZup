package br.com.zup.test.pages;

public class AmericanasPage extends BasePage {
	
	private String XPATH_ITEM_RETORNADO = "//img[contains(@alt, '%s')]/../../../../..//div[2]//div//h2";
	private String XPATH_PRODUTO = "//h2[text()='%s']/../../../../../..//div";
	private String XPATH_QUANTIDADE_RETORNADA = "//span[text()='%s']";
	private String XPATH_BOTAO_COMPRAR = "//a[@id='btn-buy']";
	private String XPATH_JOGO_CARRINHO = "//a[@title='%s']";
	private String XPATH_LOGO_AMERICANAS = "//div[@id='h_brand']";
	private String XPATH_QUANTIDADE_ITENS_CESTA = "//div[@id='h_minicart']//a//span[@class='crt-quantity']"; 

	
	public AmericanasPage() {
		super();
	}
	
	public AmericanasPage validarImagemTexto(String imagem, String texto) {
		getDSL().esperarAteExistente(String.format(XPATH_ITEM_RETORNADO, imagem), 5000)
				.validarConteudo(String.format(XPATH_ITEM_RETORNADO, imagem), texto);
		return this;
	}
	
	public AmericanasPage validarQuantidadeRetornada(String quantidade) {
		getDSL().esperarAteExistente(String.format(XPATH_QUANTIDADE_RETORNADA, quantidade), 2000)
				.validarConteudo(String.format(XPATH_QUANTIDADE_RETORNADA, quantidade), quantidade);
		return this;
	}
	
	public AmericanasPage clicarProduto(String produto) {
		getDSL().clicar(String.format(XPATH_ITEM_RETORNADO, produto));
		return this;
	}
	
	public AmericanasPage scrollAteProduto(String texto) {
		getDSL().scrollbarAteElemento(String.format(XPATH_PRODUTO, texto));
		return this;
	}
	
	public AmericanasPage clicarComprar() {
		getDSL().clicar(XPATH_BOTAO_COMPRAR);
		return this;
	}
	
	public AmericanasPage validarPresencaCarrinho(String produto) {
		getDSL().esperarAteExistente(String.format(XPATH_JOGO_CARRINHO, produto), 1000)
				.validarConteudo(String.format(XPATH_JOGO_CARRINHO, produto), produto);
		return this;
	}
	
	public AmericanasPage clicoLogo() {
		getDSL().clicar(XPATH_LOGO_AMERICANAS);
		return this;
	}
	
	public AmericanasPage validarQuantidadeItensCesta(String valor) {
		esperarPaginaCarregar();
		getDSL().validarConteudo(XPATH_QUANTIDADE_ITENS_CESTA, valor);
		return this;
	}
}
