package me.potato.democoupledcontainer.lec02;

import me.potato.democoupledcontainer.lec01.looselyCoupled.games.AssassinsCreed;
import me.potato.democoupledcontainer.lec01.looselyCoupled.games.CounterStrike;
import me.potato.democoupledcontainer.lec01.looselyCoupled.steam.Steam;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Steam.class);
        var steam = context.getBean(Steam.class);

        System.out.println("Steam is running");
        steam.launchGame(new AssassinsCreed());
        steam.launchGame(new CounterStrike());
        System.out.println("Steam is shutting down");
    }

}
