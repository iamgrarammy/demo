package co.th.gram.demo.service;

import co.th.gram.demo.repository.PlayerRepository;
import co.th.gram.entity.PlayerEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PlayerServiceImplement implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<PlayerEntity> getAllPlayers() {
        return playerRepository.findAll();
    }

}
