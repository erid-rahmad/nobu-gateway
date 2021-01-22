package sample.actuator.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDateTime;


@Transactional
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response {

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;
    private String clientid;
    private String key;
    private String branchid;
    private String counterid;
    private String producttype;
    private String trxtype ;
    private ResponseDetails responseDetails;
    private String Responcode;
    private String Respondetail;
}
