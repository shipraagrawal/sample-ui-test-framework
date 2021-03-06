package com.sampleframework.ui.stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sampleframework.ui.supportMethods.FileRead;
import com.sampleframework.ui.testRunner.TestRunner;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sampleframework.ui.webDriver.Driver.webdriver;


public class Hooks {

    private static final Logger logger = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void beforeAll() throws IOException {
        TestRunner.config = FileRead.readProperties();
    }

    @Before
    public void before(Scenario scenario) {
        TestRunner.scenario = scenario;
    }

    @After
    public void after(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {

            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMDDHHmmss");
            String timestamp = sdf.format(now);

            File srcFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
            File destFile = new File("./target/errors/"
                    + timestamp + "_"
                    + scenario.getName().replaceAll(" ", "_") + ".png");
            FileUtils.moveFile(srcFile, destFile);
            logger.info("Screenshot taken: " + destFile.getAbsolutePath());
        }
    }

}
