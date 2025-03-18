package co.com.choucair.test.auto.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.BeforeClass;

import static co.com.choucair.test.auto.utils.EnvironmentConstants.client;

public class Hooks {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(client);
    }

    @BeforeClass
    public static void setUpTags() {
        String tags = System.getProperty("cucumber.filter.tags", "@defaultTag");
        System.setProperty("cucumber.filter.tags", tags);
    }

}
