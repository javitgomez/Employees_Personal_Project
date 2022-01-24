package steps;

import actions.EmployeesActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class EmployeesSteps {

    @Steps
    private EmployeesActions employeesActions;
    @Given("^select employees$")
    public void enter_Web(){
        employeesActions.openEmployees();
        //employeesActions.();
    }

    /*@Given("^User enter$")
    public void enter_zara(){
        employeesActions.openZara();
        employeesActions.buttonCookies();
    }
    @Given("^User click on login$")
    public void user_access_zara()throws InterruptedException{
        zaraActions.buttonLoginZara();
        zaraActions.enterUser();
        zaraActions.enterPass();
        zaraActions.buttonLoginConfirm();
        Thread.sleep(1000);
    }

    @When("^User goes to perfume$")
    public void goes_search(){
        zaraActions.buttonSearch();
        zaraActions.enterSearch();
        zaraActions.buttonPerfume();
    }
    @When("^User goes to the last purchase screen$")
    public void goes_last_screen()throws InterruptedException{
        zaraActions.buttonAddCart();
        Thread.sleep(1000);
        zaraActions.buttonGoCart();
        Thread.sleep(1000);
        //zaraActions.buttonEditOrder();
        //zaraActions.buttonGiftCard();
        //zaraActions.enterMessage();
        //zaraActions.enterFrom();
        //zaraActions.buttonSaveEdit();
        zaraActions.buttonContinue1();
        zaraActions.buttonContinue2();
        zaraActions.buttoncard();
        zaraActions.buttonContinue3();
    }
    @Then("^User logout$")
    public void button_Logout(){
        zaraActions.buttonBack();
        zaraActions.buttonGoCart();
        zaraActions.buttonLess1();
        zaraActions.buttonAccount();
        zaraActions.buttonLogout();
    }
    @When("^User goes to bag$")
    public void button_Bag(){
        zaraActions.buttonOpenMenu();
        zaraActions.buttonBag();
        zaraActions.buttonNewCollection();
        zaraActions.buttonWomen();
        zaraActions.buttonSelectBag();
        zaraActions.buttonColor();
    }
    @When("^User goes to the last one purchase screen$")
    public void button_last_one_screen()throws InterruptedException{
        zaraActions.buttonAddCart2();
        Thread.sleep(1000);
        zaraActions.buttonGoCart();
        Thread.sleep(1000);
        zaraActions.buttonContinue1();
        zaraActions.buttonContinue2();
        zaraActions.buttoncard();
        zaraActions.buttonContinue3();
    }
 /*@When("^Select color and size$")
    public void click_color_size(){
        zaraActions.buttonSize(); }*/
}

