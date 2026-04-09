package com.vladhatos.homework;

public class TestConfigRunner {
    public static void main(String[] args) {
        //instanta cu constructorul cu 3 parametri
        BrowserConfig test3 = new BrowserConfig(BrowserType.CHROME, "1.0", true);

        //instanta cu constructorul cu 2 parametri
        BrowserConfig test2 = new BrowserConfig(BrowserType.FIREFOX, "2.0");

        //instanta cu constructorul cu 1 parametru
        BrowserConfig test1 = new BrowserConfig(BrowserType.EDGE);

        //instanta folosind metoda statica createDefaultChromeConfig()
        BrowserConfig testFactory = BrowserConfig.createDefaultChromeConfig();

        System.out.print("Configurare constructor 3 parametri: ");
        test3.afiseazaConfig();

        System.out.print("Configurare constructor 2 parametri: ");
        test2.afiseazaConfig();

        System.out.print("Configurare constructor 1 parametru: ");
        test1.afiseazaConfig();

        System.out.print("Configurare metoda 'Factory': ");
        testFactory.afiseazaConfig();
    }
}