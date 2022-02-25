<h2>Projeto em Spring Boot Cloud com JWT e publicação na AZURE</h2>

Usaremos o conceito de autenticação JWT(JSON Web Tokens) para manter APIs mais seguras.
<Br></br>
Esse metodo gera uma chave, que chamamos de Token, que ao ser gerado será utilizado nas demais APIs por um determinado tempo.
<Br></br>
<h2>Auth0</h2>
Auth0 implementa as regras para geração do token JWT de maneira fácil e simples.

```shell script
		<dependency>
			<groupId>com.auth0</groupId>
			<artifactId>java-jwt</artifactId>
			<version>3.13.0</version>
		</dependency>
```