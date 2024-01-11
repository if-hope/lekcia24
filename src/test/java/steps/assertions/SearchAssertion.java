package steps.assertions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SearchResultPage;
import utils.SharedData;

public class SearchAssertion {

    SearchResultPage searchResultPage = new SearchResultPage();
    private SharedData sharedData = SharedData.getSharedData();

    @Then("[UI] Relevant search results should appear")
    public void uiRelevantSearchResultsShouldAppear() {
        Assert.assertTrue(searchResultPage.searchContains(sharedData.getSearchResultLinks(), sharedData.getSearchResultDescriptions()), "search result doesn't contain search text");
    }
}
