import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.testng.annotations.Test;
import utils.Chromerunner;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class registretionwishlist extends Chromerunner {
    @Test
    public void wishlist(){
        $(".ty-account-info__title").click();
        $(byText("ავტორიზაცია")).click();
        $("#login_popup268").setValue("tamuniatqo@gmail.com");
        $("#psw_popup268").setValue("M210913a");
        sleep(5000);
        $(".ty-btn__login").click();
        sleep(5000);


    }
    @Test
    public void itemcard(){
        $(byText("კალათაში დამატება")).click();
        sleep(5000);
        $(".product-title").click();
        sleep(5000);
        $(byXpath("//*[@id=\"button_cart_78328\"]/span/span")).click();
        sleep(5000);
        $(byXpath("//*[@id=\"sw_dropdown_267\"]/a/i")).click();
        $(byText("კალათის ნახვა")).click();
        $(byText("შეკვეთის განთავსება")).click();
        sleep(5000);




    }


}
