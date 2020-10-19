import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class StepDefinitions {

    // Calculator
    Calculator calculator;

    @Given("^El numero (\\d+)$")
    public void Dado_un_numero(int number) {
        calculator= new Calculator();
        calculator.addNumber(number);
    }

    @When("^Le sumo el numero (\\d+)$")
    public void Le_sumo_otro_numero(int number) {
        calculator.sumNumber(number);
    }

    @When("^Le resto el numero (\\d+)$")
    public void Le_resto_otro_numero(int number) {
        calculator.substact(number);
    }

    @Then("^Debo tener el numero (\\d+)$")
    public void Debo_tener_el_numero(int number) {
        Assert.assertEquals(number, calculator.getResponse());
    }

    // Bank Account
    BankAccount account;

    @Given("^Dada una cuenta con (\\d+) pesos$")
    public void Dada_una_cuenta_con_pesos(int number) {
        account = new BankAccount(number);
    }

    @When("^Le deposito (\\d+) pesos$")
    public void Le_deposito_mas_pesos(int number) {
        account.deposit(number);
    }

    @Then("^Debo tener ahora (\\d+) pesos$")
    public void Debo_tener_de_saldo(int number) {
        Assert.assertEquals(number, account.getBalance());
    }
}

