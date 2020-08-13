package com.hnkhuy.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.ByTarget;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target MY_ACCOUNT_TAB = Target
            .the("My account tab")
            .locatedBy("//ul[@class='nav-menu']//a[text()='My account']");

    public static final Target MY_ACCOUNT_TITLE = Target
            .the("My account title")
            .locatedBy("//h1[@class='entry-title']");
}
