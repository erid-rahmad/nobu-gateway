package sample.actuator.model;

import lombok.Data;

@Data
public class RequestDetails {

    private String trxid;
    private String token;
    private String nohp;
    private String amount;
}
