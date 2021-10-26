<h1 align="center">Tutorial Spring-Kafka</h1>
<p align="center">Este repositório possui dois projetos demonstrando o funcionamento do Spring com o Kafka, um microservice consumidor e um microservice produtor</p>
<h1 align="center">
    <a href="https://kafka.apache.org/">🔗 Kakfa</a>
</h1>
<h1 align="center">
    <a href="https://spring.io/">🔗 Spring</a>
</h1>
<h2 align="center"> 
	Running 🚀
</h2>
<p align="center">1º É necessário que você tenha o docker instalado em seu ambiente de trabalho</p>
<p align="center">2º Após ter feito a instalação do docker, execute o arquivo docker-compose.yml que está na raíz do projeto com o seguinte comando: docker-compose up - d . Feito isso já subimos o container com uma instancia do Kafka e do Zookeeper</p>
<p align="center">3º Caso queira acompanhar as mensagens que estão sendo enviadas para o tópico do Kafka, faça o download da ferramenta https://www.kafkatool.com/</p>
<p align="center">4º Execute os dois projetos</p>
<p align="center">5º Envie uma requisição post para o projeto produtor na seguinte rota: http://localhost:8080/orders/save com um JSON no seguinte formato: {code:"String", 
	"nameProduct": "String"
	"value": "Numeric";
}</p>
<p align="center">6º Confira no Zookeeper as mensagens que foram enviadas para o Kafka, essa parte eu deixarei com você. Abraços 😊
}</p>