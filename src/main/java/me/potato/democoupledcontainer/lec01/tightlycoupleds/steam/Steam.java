package me.potato.democoupledcontainer.lec01.tightlycoupleds.steam;


import me.potato.democoupledcontainer.lec01.tightlycoupleds.games.AssassinsCreed;
import me.potato.democoupledcontainer.lec01.tightlycoupleds.games.CounterStrike;

public class Steam {
    public void launchGame(AssassinsCreed assassinsCreed){
        assassinsCreed.launch();
    }

    public void launchGame(CounterStrike counterStrike){
        counterStrike.launch();
    }
}
