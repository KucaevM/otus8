package artlebedev.pages.ToolsPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;


public class MatrixPage {

    @FindBy(name = "Word")
    SelenideElement inputWord;

    @FindBy(css = "[class = 'button blue-button']")
    SelenideElement buttonSearch;

    private static final By RESULT_1 = By.cssSelector("div.als-text-container.content-margin > div > div:nth-child(1)");
    private static final By RESULT_2 = By.cssSelector("div.als-text-container.content-margin > div > div:nth-child(2)");

    public MatrixPage inputToWord(String text){
        inputWord.setValue(text);
        return page(MatrixPage.class);
    }

    public MatrixPage EnterToButtonSearch(){
        buttonSearch.click();
        return this;
    }

    public void checkTheResults(String textWord){

        $(RESULT_1).shouldBe(visible).shouldHave(text(textWord));
        $(RESULT_2).shouldBe(visible).shouldHave(text(textWord));

    }

}
