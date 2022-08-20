package UI.steps;

import UI.pages.HomePage;
import io.qameta.allure.Step;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        homePage = new HomePage();
    }

    @Step("Go to accounts page")
    public HomePageSteps goToAccountsPage() {
        homePage.goToAccounts();
        return this;
    }

    @Step("Go to accounts page")
    public HomePageSteps goToContactsPage() {
        homePage.goToContacts();
        return this;
    }
}