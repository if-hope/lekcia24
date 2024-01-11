package steps.definitions;

import com.codeborne.selenide.ElementsCollection;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AbstractPage;
import pages.SearchResultPage;
import utils.SharedData;

public class SearchDefinition {

    SearchResultPage searchResultPage = new SearchResultPage();

    private SharedData sharedData = SharedData.getSharedData();
    ElementsCollection searchResultLinks;
    ElementsCollection searchResultDescriptions;


    @When("\\[UI] User fill Search form with data (.*)$")
    public void uiUserFillSearchFormWithDataText(String text) {
        searchResultLinks = new AbstractPage().openMainPage()
                .search(text)
                .getSearchResultLinks();
        sharedData.setSearchResultLinks(searchResultLinks);

        searchResultDescriptions = searchResultPage
                .getSearchResultDescriptions();

        sharedData.setSearchResultDescriptions(searchResultDescriptions);
    }

//    @Then("[UI] Relevant search results should appear")
//    public void uiRelevantSearchResultsShouldAppear() {
//        Assert.assertTrue(searchResultPage.searchContains(searchResultLinks, searchResultDescriptions), "search result doesn't contain search text");
//    }
}
