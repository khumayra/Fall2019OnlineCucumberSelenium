package com.vytrack.runners;

import com.vytrack.utilities.Driver;
import io.cucumber.java.*;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("Test setup");
    }
    @After
    public void tearDown(){
        System.out.println("Test clean up");
        Driver.closeDriver();
    }
}
