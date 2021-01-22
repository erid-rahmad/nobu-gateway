package sample.actuator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.security.sasl.SaslServer;
import java.sql.Time;


public class Response {

    private Time time;
    private String idclient;
    private String key;
    private String branchid;
    private String counterid;
    private String producttype;
    private String trxtype ;
    private ResponseDetails responseDetails;
    private String Responcode;
    private String Respondetail;
}
