package com.hnkhuy.demo;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.hnkhuy.ui.HomePage.MY_ACCOUNT_TAB;
import static com.hnkhuy.ui.HomePage.MY_ACCOUNT_TITLE;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

@RunWith(SerenityRunner.class)
public class SimpleTcs {
    private Actor brown;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
        brown = theActorCalled("Brown");
    }

    @Test
    @Title("To understand how verify function works")
    public void demoTheSimplestTestcaseOnDemoshop() {
        givenThat(brown).wasAbleTo(Open.url("https://demoshop.webtestit.com/"));
        when(brown).attemptsTo(Click.on(MY_ACCOUNT_TAB));
        then(brown).should(seeThat(the(MY_ACCOUNT_TITLE), containsText("My account")));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
