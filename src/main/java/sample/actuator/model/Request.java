package sample.actuator.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.time.LocalDateTime;



@Entity
@Transactional
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Request {

    @Id
    @GeneratedValue
    private Long id;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;
    private String clientid;
    private String key;
    private String branchid;
    private String counterid;
    private String producttype;
    private String trxtype ;
    @JsonIgnore
    private String trxconfirm;


    @OneToOne(fetch= FetchType.LAZY)
    private RequestDetails requestDetails;


}
