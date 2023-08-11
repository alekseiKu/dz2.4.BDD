package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TransferPage {

    public TransferPage() {

        $("[data-test-id=\"dashboard\"]").should(visible);

    }

    public DashboardPage transferForm(String sum, DataHelper.CardInfo cardInfo) {

        $("[data-test-id=amount] input").setValue(sum);
        $("[data-test-id=from] input").setValue(cardInfo.getCardNumber());
        $("[data-test-id=action-transfer]").click();
        return new DashboardPage();

    }
}