package com.amazon.tests;

import com.amazon.pages.DropDownPage;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest {

        DropDownPage dropDownPage = new DropDownPage();



            @Test
            public void sizeDropDownTest() {
                Driver.getDriver().get("https://www.amazon.com/ZGR-Womens-Fashion-Sneaker-High-Top/dp/B087CL7HLF/ref=sr_1_1_sspa?crid=2UBIMMNEFB7YQ&dib=eyJ2IjoiMSJ9.KCum4DAJisR1w3jndIiyh8cSeryPsv6MvTEFjSsVx48Gofd5LkdjTsicQpw1WcoIGy_2mElLHg-SJQbeIGFH5ftg1D9-0oqnf8NnT03kdFtbm9vg2siSpr8jlPuwjj9dPHIgMKySxU2ylFGrEAqdXLXamxpp66b8RSCLq8GgMXYLBEKvnjyXVT1dn6iSHANXruPpUcEo92zr9-Yy66tdHmC2NxCsCvsdCwiYlrUu0bGQzcAr7E2IjjzYFRb0AxHWIfmaUO_bihe2MPaN3tPnf4VvzxGsky1YqpPBn80CZhg.IHa6E26rKd__6N4rV2EdCMv39LMt6DW9i-jxaXKFOCk&dib_tag=se&keywords=shoes&qid=1713735773&sprefix=shoes%2Caps%2C126&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");

                WebElement drop = Driver.getDriver().findElement(By.className("a-dropdown-prompt"));
                drop.click();

                Select sizeSelect = new Select(dropDownPage.sizeDropDown);

                String firstOption = sizeSelect.getFirstSelectedOption().getText();

                System.out.println(firstOption);
            }


    }
