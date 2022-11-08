package tests.local;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class AndroidLocalWikiTestOpsTest extends TestBase {

    @Test
    @DisplayName("Test 1")
    void checkPrimaryTextsOnScreens() {

        step("Check text on first screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("The Free Encyclopedia …in over 300 languages"));
        });

        step("Click on 'continue' button", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check text on second screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("New ways to explore"));
        });

        step("Click on 'continue' button", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check text on third screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Reading lists with sync"));
        });

        step("Click on 'continue' button", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check text on fourth screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).shouldHave(text("GET STARTED"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });
    }

    @Test
    @DisplayName("Test 2")
    void checkSecondaryTextsOnScreens() {

        step("Check text on first screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("The Free Encyclopedia …in over 300 languages"));
        });

        step("Click on 'continue' button", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check text on second screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("New ways to explore"));
        });

        step("Click on 'continue' button", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check text on third screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Reading lists with sync"));
        });

        step("Click on 'continue' button", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check text on fourth screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).shouldHave(text("GET STARTED"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });
    }

    @Test
    @DisplayName("Test 3")
    void checkThirdTextsOnScreens() {

        step("Check text on first screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("The Free Encyclopedia …in over 300 languages"));
        });

        step("Click on 'continue' button", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check text on second screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("New ways to explore"));
        });

        step("Click on 'continue' button", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check text on third screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("Reading lists with sync"));
        });

        step("Click on 'continue' button", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        step("Check text on fourth screen", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).shouldHave(text("GET STARTED"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });
    }
}
