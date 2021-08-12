package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.es.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class StepDefinitions {

    private WebDriver driver;


    @Dado("^que estoy en website de (.*)$")
    public void I_go_to(String url) {
        System.setProperty("webdriver.chrome.driver","/Users/diego_sorensen/dev/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.navigate().to(url);
       // driver.close();

    }

    @Dado("que estoy en la pagina de carroya")
    public void que_estoy_en_la_pagina_de_carroya() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.className("placeholderText")).click();

    }

    @Cuando("^busco un carro de (.*) con (.*)$")
    public void busco_un_carro_parameter(String marca, String linea) throws InterruptedException {
        System.out.println(marca);
        System.out.println(linea);

        driver.findElement(By.className("placeholderText")).click();



        driver.findElement(By.xpath(String.format("//h3[(.='%s')]",marca))).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[contains(text(),'Todas las líneas')]")).click();

        //
        //WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);

        driver.findElement(By.xpath(String.format("//h3[(.='%s')]",linea))).click();


        Thread.sleep(2000);
        driver.findElement(By.xpath("//button/h3[contains(text(),'Buscar')]")).click();


    }


    @Entonces("quiero verificar que la busqueda retorne vehiculos")
    public void verificar_vehiculos() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("");
        Thread.sleep(2000);
        String offers = driver.findElement(By.className("titleTotalVehicles")).getText();
        short numberofCars=0;
        offers = offers.replaceAll("\\D+","");
        numberofCars = Short.parseShort(offers);
        boolean boolFindCars = numberofCars >0 ;
        Assert.assertTrue("Numero de vehiculos menor a cero",boolFindCars);
        driver.close();
    }

}
