package co.com.choucair.test.auto.runners;



import co.com.choucair.test.auto.utils.BeforeSuite;
import co.com.choucair.test.auto.utils.CustomRunner;
import co.com.choucair.test.auto.utils.DataFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;


@RunWith(CustomRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "co.com.choucair.test.auto.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerApp {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataFeature.overrideFeatureFilesDB("./src/test/resources/features/registeremployee.feature",
                "./src/test/resources/fileData/data.xlsx");
    }
}
