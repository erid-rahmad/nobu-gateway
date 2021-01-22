package sample.actuator.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Request {

//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;
    private String clientid;
    private String key;
    private String branchid;
    private String counterid;
    private String producttype;
    private RequestDetails requestDetails;
    private String trxtype ;

}
