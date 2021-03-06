#language:pt


Funcionalidade: Compras no site Americanas.com

	Contexto:
	Dado que acesso ao site da Americanas.com
	
	
	@Run
	Cenário: Retornando um item na pesquisa e adicionando no carrinho
	Quando pesquiso por "The order 1886 ps4"
	E valido a quantidade retornada "1 produto"
	E valido que retornou o item pela imagem "Game The Order: 1886 - PS4" e pelo texto "game the order: 1886 - ps4" 
	E clico no produto "Game The Order: 1886 - PS4"
	Então clico em comprar
	E valido presença no carrinho de compra "Game The Order: 1886 - PS4"
	
	@Run
	Cenário: Retornando vários itens na pesquisa e adicionando um item no carrinho
	Quando pesquiso por "Order ps4"
	E valido a quantidade retornada "18 produtos"
	E desço a barra de rolagem até o produto "Game The Order: 1886 - PS4"
	E valido que retornou o item pela imagem "Game The Order: 1886 - PS4" e pelo texto "game the order: 1886 - ps4"
	E clico no produto "Game The Order: 1886 - PS4"
	Então clico em comprar
	E valido presença no carrinho de compra "Game The Order: 1886 - PS4"
	
	@Run
	Cenário: Validar cesta e adicionar dois itens no carrinho
	Quando pesquiso por "Drone SG700 RC Quadcopter"
	E valido a quantidade retornada "2 produtos"
	E valido que retornou o item pela imagem "Drone SG700 RC Quadcopter" e pelo texto "drone sg700 rc quadcopter" 
	E clico no produto "Drone SG700 RC Quadcopter"
	Então clico em comprar
	E valido presença no carrinho de compra "Drone SG700 RC Quadcopter"
	E vou para a página principal
	E valido se quantidade de itens na cesta de compra é "1"
	E pesquiso por "Order ps4"
	E valido a quantidade retornada "18 produtos"
	E desço até o produto "Game The Order: 1886 - PS4"
	E valido que retornou o item pela imagem "Game The Order: 1886 - PS4" e pelo texto "game the order: 1886 - ps4"
	E clico no produto "Game The Order: 1886 - PS4"
	Então clico em comprar
	E valido presença no carrinho de compra "Drone SG700 RC Quadcopter"
	E valido presença no carrinho de compra "Game The Order: 1886 - PS4"