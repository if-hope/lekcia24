package utils;

import com.codeborne.selenide.ElementsCollection;

public class SharedData {

    private static SharedData sharedData;
    private ElementsCollection searchResultLinks;
    private ElementsCollection searchResultDescriptions;

    private SharedData() {
    }

    public static SharedData getSharedData(){
        if(sharedData == null){
            sharedData = new SharedData();
            return sharedData;
        }
        else {
            return sharedData;
        }
    }

    public void setSearchResultLinks(ElementsCollection searchResultLinks) {
        this.searchResultLinks = searchResultLinks;
    }

    public void setSearchResultDescriptions(ElementsCollection searchResultDescriptions) {
        this.searchResultDescriptions = searchResultDescriptions;
    }

    public ElementsCollection getSearchResultLinks() {
        return searchResultLinks;
    }

    public ElementsCollection getSearchResultDescriptions() {
        return searchResultDescriptions;
    }
}
