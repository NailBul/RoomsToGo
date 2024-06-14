package com.roomsToGo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-report.html",
                "rerun:target/rerun.txt" ,
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        features="src/test/resources/Features",
        glue="com/roomsToGo/stepDefinitions",
        dryRun=false,
        tags="@wip",

        publish=true
)
public class CukesRunner {
}
