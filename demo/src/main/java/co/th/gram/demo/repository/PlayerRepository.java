package co.th.gram.demo.repository;

import co.th.gram.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
