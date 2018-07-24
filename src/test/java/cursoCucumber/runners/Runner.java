package cursoCucumber.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/alugar_filme.feature", //Caminho para pegar as features que vão rodar
		glue = "cursoCucumber.steps", //caminho onde estarão os steps definitios
		tags = {}, //Informa quais os testes que possuem esta tag irá ser executado. - Pode também informar a tag na funcionalidade e rodará todos os testes daquela funcionalidade/feature / o comando ~ (ignore) / com {} posso incluir varias tags
		plugin = "pretty", //mostra saida do plugin do cucumber
		monochrome = true, //não tenta mais colocar colorido e caracteres especiais
		snippets = SnippetType.CAMELCASE, // Java por padrão utiliza camelcase (deixa as palavras com juntas ao inves de underline, por exemplo testJava)
		dryRun = false, //esta opção (true) valida a estrutura do step definition e .feature porém sem executar os testes. Auxilia para ver se o metodo esta correto / deixar false para rodar os testes
		strict = false
)
public class Runner {

}
