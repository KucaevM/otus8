package artlebedev.tests;

import artlebedev.components.MainMenu;
import artlebedev.pages.MainPage;
import artlebedev.pages.ToolsPages.MatrixPage;
import com.codeborne.selenide.Configuration;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;


public class TestSearchMatrix {


   @BeforeClass
    public void BeforeTest(){

      // WebDriverManager.chromedriver().setup();
       System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/FirstTest/chromedriver.exe");
       Configuration.browser = "Chrome";

   }
   @Test
   public void TestSearchMatrix() {

       String textWord = "Автотест";

       new MainPage().enterToMainPage();

       new MainMenu().EnterToolsPage()
               .EnterItemMatrix()
               .inputToWord(textWord)
               .EnterToButtonSearch()
               .checkTheResults(textWord);

   }
}
