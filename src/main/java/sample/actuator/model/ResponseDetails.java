package sample.actuator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;

@Transactional
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseDetails {

    private String trxconfirm;
}
