package artlebedev.pages;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

     public MainPage enterToMainPage(){
        open("https://www.artlebedev.ru/");
        return page(MainPage.class);
     }

}
