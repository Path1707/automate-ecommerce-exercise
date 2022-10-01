package modulos.produtos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@DisplayName("Testes Web do Modulo de Produto")
public class ProdutosTest {
    @Test
    @DisplayName("Inserirndo um produto no carrinho")
    public void testInserirProdutoNoCarrinho(){
        // Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        // Maximizar a tela
        navegador.manage().window().maximize();

        //Navegar para a pagina da loja Web
        navegador.get("http://automationpractice.com/index.php");

        // Fazer login
        navegador.findElement(By.linkText("Sign in")).click();
        navegador.findElement(By.id("email")).sendKeys("path.monteiro17@gmail.com");
        navegador.findElement(By.id("passwd")).sendKeys("12345");
        navegador.findElement(By.cssSelector("i[class='icon-lock left']")).click();

        // Selecionar um produto para comprar
        navegador.findElement(By.cssSelector("a[title='Women']")).click();
        navegador.get("http://automationpractice.com/index.php?id_product=1&controller=product");
        navegador.findElement(By.cssSelector("button[class='exclusive']")).click();

        // Verificar se o produto foi corretamente inserido no carrinho validando as informações da última tela aberta
        //String textoDoElemento = navegador.findElement(By.cssSelector("span[id='layer_cart_product_title']")).getText();
        //System.out.println("Texto: " + textoDoElemento);
        //Assertions.assertEquals("Faded Short Sleeve T-shirts", textoDoElemento);
    }

}
