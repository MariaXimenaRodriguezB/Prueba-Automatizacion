package co.com.choucair.test.auto.interactions;

import groovyjarjarpicocli.CommandLine;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

public class WaitStatic implements Interaction {
    private final long millis;
    static final Logger logger = LoggerFactory.getLogger(WaitStatic.class);

    public WaitStatic(long time) {
        this.millis = time;
    }
    public static WaitStatic milliseconds(int time) {
        return Tasks.instrumented(WaitStatic.class, time);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException | CommandLine.ExecutionException e) {
            logger.debug("Interrupted: {} {}",e, Level.WARN);
            Thread.currentThread().interrupt();
        }
    }
}
