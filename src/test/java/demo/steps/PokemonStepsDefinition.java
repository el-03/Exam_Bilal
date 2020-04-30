package demo.steps;

import demo.controller.PokemonController;
import demo.pages.ArticlePage;
import demo.pages.ResultPage;
import demo.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

public class PokemonStepsDefinition {

    PokemonController pokemonController = new PokemonController();
    String actualName;
    int actualId;

    private SearchPage searchPage = new SearchPage();
    private ResultPage resultPage = new ResultPage();
    private ArticlePage articlePage = new ArticlePage();

    @Given("User get the name and id data of pokemon with name {string}")
    public void userGetTheNameAndIdDataOfPokemonWithName(String pokemonName) {
        Response response = pokemonController.getPokemon(pokemonName.toLowerCase());
        actualName = response.body().path("name");
        actualId = response.body().path("id");
    }

    @Given("User open Google search-page")
    public void userOpenGoogleSearchPage() {
        searchPage.openSearchPage();
    }

    @When("User input {string} Wikipedia Indonesia on input search bar on Google search-page")
    public void userInputWikipediaIndonesiaOnInputSearchBarOnGoogleSearchPage(String pokemonName) {
        searchPage.inputSearch(pokemonName + " Wikipedia Indonesia");
    }

    @When("User press ENTER key on input search bar")
    public void userPressENTERKeyOnInputSearchBar() {
        searchPage.pressEnter();
    }

    @When("User click the first article of {string} on the result-page")
    public void userClickTheFirstArticleOfOnTheResultPage(String pokemonName) {
        resultPage.clickFirstArticle(pokemonName);
    }

    @Then("User see pokemon article with the pokemon name same as API Data")
    public void userSeePokemonArticleWithThePokemonNameSameAsAPIData() {
        String pokemonName = articlePage.getName().toLowerCase();
        Assert.assertEquals(actualName, pokemonName);
    }

    @And("User see pokemon article with the pokemon ID same as API Data")
    public void userSeePokemonArticleWithThePokemonIDSameAsAPIData() {
        int pokemonId = Integer.parseInt(articlePage.getNumber());
        Assert.assertEquals(actualId, pokemonId);
    }
}
