package artlebedev.pages;

import artlebedev.pages.ToolsPages.MatrixPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class ToolsPage {
     @FindBy(id = "item-matrix")
     SelenideElement itemMatrixElement;

     public MatrixPage EnterItemMatrix () {
         itemMatrixElement.pressEnter();
         return page(MatrixPage.class);
     }

}
