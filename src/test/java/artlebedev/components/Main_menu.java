package artlebedev.components;

import artlebedev.pages.MainPage;
import artlebedev.pages.ToolsPage;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class Main_menu extends ElementsContainer {
    //private static final By MAIN_MENU = By.cssSelector("main-menu");

    private SelenideElement MaimMenuMailPageButton = $("div.main-menu-piece-8 > menu > li:nth-child(1)");
    private SelenideElement MaimMenuToolsPageButton = $("div.main-menu-piece-8 > menu > li:nth-child(2)");

    public MainPage EnterMainPage() {
        MaimMenuMailPageButton.click();
        return page(MainPage.class);
    }

    public ToolsPage EnterToolsPage() {
        MaimMenuToolsPageButton.click();
        return page(ToolsPage.class);
    }
}
