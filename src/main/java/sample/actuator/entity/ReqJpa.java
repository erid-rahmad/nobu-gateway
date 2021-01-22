package sample.actuator.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.actuator.model.Request;

public interface ReqJpa extends JpaRepository<Request,Long> {
}
