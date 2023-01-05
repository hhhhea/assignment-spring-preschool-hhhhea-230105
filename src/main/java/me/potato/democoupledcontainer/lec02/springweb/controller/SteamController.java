package me.potato.democoupledcontainer.lec02.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import me.potato.democoupledcontainer.lec02.springweb.controller.dto.GameRequest;
import me.potato.democoupledcontainer.lec02.springweb.steam.Steam;
import me.potato.democoupledcontainer.lec02.springweb.games.AssassinsCreed;
import me.potato.democoupledcontainer.lec02.springweb.games.CounterStrike;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("steam")
public class SteamController {
    @Autowired
    private Steam steam;
    @PostMapping("launch")
    public void launchGame(@RequestBody GameRequest request){

        switch (request.name()) {
            case "assassins-creed" -> steam.launchGame(new AssassinsCreed());
            case "counter-strike" -> steam.launchGame(new CounterStrike());
            default -> throw new NoSuchElementException("No such game");
        }

    }
}
