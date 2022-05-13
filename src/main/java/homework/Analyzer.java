package homework;

import homework.event.EventGame;
import org.springframework.context.ApplicationContext;


import java.util.ResourceBundle;

public class Analyzer {

    public void doAnalyze(int var, int randomVar, ApplicationContext context, ResourceBundle resource) {

        if (randomVar > var) {
            context.publishEvent(EventGame.of(resource.getString("more")));
        }
        if (randomVar < var) {
            context.publishEvent(EventGame.of(resource.getString("small")));
        }
        if (randomVar == var) {
            context.publishEvent(EventGame.of(resource.getString("true") + randomVar));
        }
    }
}
