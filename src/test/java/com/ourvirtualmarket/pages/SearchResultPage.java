package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{
    @FindBy(xpath = "//*[@id='wrapper']/div[4]/ul/li[2]/a")
    protected WebElement pageName;
    @FindBy(id="product-image-7465747")
    protected WebElement relevantProduct;
    @FindBy(xpath = "//h1[@itemprop='name']")
    protected WebElement relevantProductPageName;



    public void verifySearchResultPageName(){
        Assert.assertEquals(pageName.getText(),"Search");
    }

    public void theUserChooseAOnTheSearchPageAndClicksIt(){
        BrowserUtils.scrollToElement(relevantProduct);
        relevantProduct.click();
    }
    public void verifyRelevantProductPage(){
        Assert.assertTrue(relevantProductPageName.getText().contains("Samsung"));
    }

}
