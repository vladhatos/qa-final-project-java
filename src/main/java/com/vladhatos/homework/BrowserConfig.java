package com.vladhatos.homework;

public class BrowserConfig {
    //creez campurile private
    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    //creez Constructorul supraincarcat care primeste toti cei 3 parametri
    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    //creez Constructorul care primeste doar browser si version, (isHeadless:false)
    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false);
    }

    //creez Constructorul care primește doar browser (version:"latest", isHeadless:false)
    public BrowserConfig(BrowserType browser) {
        this(browser, "latest", false);
    }

    //implementez metoda statica createDefaultChromeConfig() ("Factory") care returneaza BrowserConfig cu valori predefinite
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    //implementez metoda de afisare
    public void afiseazaConfig() {
        System.out.println("Browser: " + browser + ", Version: " + version + ", Headless: " + isHeadless);
    }
}