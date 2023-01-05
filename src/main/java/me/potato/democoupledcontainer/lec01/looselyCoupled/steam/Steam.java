package me.potato.democoupledcontainer.lec01.looselyCoupled.steam;

import me.potato.democoupledcontainer.lec01.looselyCoupled.games.Game;
import me.potato.democoupledcontainer.lec01.tightlycoupleds.games.AssassinsCreed;
import me.potato.democoupledcontainer.lec01.tightlycoupleds.games.CounterStrike;

public class Steam {
    public void launchGame(Game game){
        game.launch();
    }

}
