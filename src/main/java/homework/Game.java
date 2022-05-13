package homework;

import homework.event.EventGame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

import java.util.ResourceBundle;
import java.util.Scanner;

public class Game implements ApplicationListener<EventGame> {

    private Analyzer analyzer;
    private Generator generator;

    public Game (Analyzer analyzer, Generator generator) {
        this.analyzer = analyzer;
        this.generator = generator;
    }

    public void doGame(ApplicationContext context, ResourceBundle resource) {

        int randomVar = generator.doGenerateVar();
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        analyzer.doAnalyze(var, randomVar, context, resource);
    }

    @Override
    public void onApplicationEvent(EventGame event) {
        System.out.println(event.getSource().toString());
    }
}
