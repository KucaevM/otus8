package artlebedev.tests;

import artlebedev.components.Main_menu;
import artlebedev.pages.MainPage;
import artlebedev.pages.ToolsPage;
import artlebedev.pages.ToolsPages.MatrixPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.*;


public class TestSearchMatrix {


   @BeforeClass
    public void BeforeTest(){

       Configuration.browser = "Chrome";
       System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/FirstTest/chromedriver.exe");
      // WebDriverManager.chromedriver().setup();
   }
   @Test
   public void TestSearchMatrix() {

       String textWord = "Автотест";

       new MainPage().enterToMainPage();

       MatrixPage matrixPage = new Main_menu().EnterToolsPage().EnterItemMatrix();
       matrixPage.inputToWord(textWord).EnterToButtonSearch().checkTheResults(textWord);


   }
}
