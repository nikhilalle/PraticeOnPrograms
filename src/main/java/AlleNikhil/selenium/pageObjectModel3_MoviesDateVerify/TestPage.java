package AlleNikhil.selenium.pageObjectModel3_MoviesDateVerify;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestPage extends BaseTest {
    @Test
    public void VerifyPage(){
       initBrowser();
       WikiPage wikiPage=new WikiPage(driver);  // Driver in WikiPage Constructor
       wikiPage.pageWiki();

       ImdbPage  imdbPage=new ImdbPage(driver);  // Driver in IMDBPage Constructor
       imdbPage.PageImdb();


        // actualNameImdb is return List String Value Through  listImdbElement () Method
        // implement in List  String i.e  List<String> actualNameImdb =imdbPage.listImdbElement();

        List<String> actualNameImdb =imdbPage.listImdbElement();
        System.out.println("actualNameImdb "+actualNameImdb);

        // actualNameImdb is return List String Value Through  listWikiElement () Method
        // implement in List  String i.e   List<String> actualNameWiki =wikiPage.listWikiElement();


        List<String> actualNameWiki =wikiPage.listWikiElement();
        System.out.println("actualNameWiki  "+actualNameWiki);

        Assert.assertEquals(actualNameImdb,actualNameWiki);
   }
}
