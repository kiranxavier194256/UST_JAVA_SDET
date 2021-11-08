package StepDefs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/resources/Features/MercuryTours.feature",glue= {"StepDefs"},
monochrome=true)

public class StepRunner extends AbstractTestNGCucumberTests  {

}