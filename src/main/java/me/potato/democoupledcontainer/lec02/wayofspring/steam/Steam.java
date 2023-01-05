package me.potato.democoupledcontainer.lec02.wayofspring.steam;

import me.potato.democoupledcontainer.lec02.wayofspring.games.Game;
import org.springframework.stereotype.Service;

@Service
public class Steam {
    public void launchGame(Game game){
        game.launch();
    }

}
