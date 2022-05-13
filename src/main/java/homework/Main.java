package homework;

import homework.event.EventGame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ResourceBundle resource = ResourceBundle.getBundle("text", Locale.US);

        Game game = context.getBean(Game.class);

        context.publishEvent(EventGame.of(resource.getString("start")));
        context.publishEvent(EventGame.of(resource.getString("attempt")));
        game.doGame(context, resource);
    }
}
