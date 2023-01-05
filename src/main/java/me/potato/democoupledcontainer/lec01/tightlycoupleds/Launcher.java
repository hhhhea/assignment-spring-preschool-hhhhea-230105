package me.potato.democoupledcontainer.lec01.tightlycoupleds;

import me.potato.democoupledcontainer.lec01.tightlycoupleds.games.AssassinsCreed;
import me.potato.democoupledcontainer.lec01.tightlycoupleds.games.CounterStrike;
import me.potato.democoupledcontainer.lec01.tightlycoupleds.steam.Steam;

public class Launcher {

    public static void main(String[] args) {
        var steam = new Steam();

        System.out.println("Steam is running...");

        var assassinsCreed = new AssassinsCreed();
        steam.launchGame(assassinsCreed);

        var counterStrike = new CounterStrike();
        steam.launchGame(counterStrike);


        System.out.println("Steam is shutting down...");

    }


}
