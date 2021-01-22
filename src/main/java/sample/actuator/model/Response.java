package sample.actuator.model;

import lombok.Data;

import javax.security.sasl.SaslServer;
import java.sql.Time;

@Data
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
