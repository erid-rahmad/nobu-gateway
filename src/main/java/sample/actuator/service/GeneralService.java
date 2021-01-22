package sample.actuator.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import sample.actuator.entity.ReqJpa;
import sample.actuator.model.Request;
import sample.actuator.model.RequestDetails;
import sample.actuator.model.Response;
import sample.actuator.model.ResponseDetails;

import javax.persistence.EntityManager;
import java.util.Random;

@org.springframework.stereotype.Service
@Slf4j
public class GeneralService {

    @Autowired
    ReqJpa reqJpa;

    @Autowired
    EntityManager em;

    Random rand = new Random();

    @Transactional
    public Response general(Request request_income){
        Response response = new Response();

        response.setTime(request_income.getTime());
        response.setClientid(request_income.getClientid());
        response.setKey(request_income.getKey());
        response.setBranchid(request_income.getBranchid());
        response.setCounterid(request_income.getCounterid());
        response.setProducttype(request_income.getProducttype());
        response.setTrxtype(request_income.getTrxtype());


        if(request_income.getTrxtype().contains("CASHOUT")){
            ResponseDetails responseDetails = new ResponseDetails();
            responseDetails.setTrxconfirm(Request(request_income));
            response.setResponseDetails(responseDetails);
            response.setRespondetail("succes");
            response.setResponcode("00");

        }else if(request_income.getTrxtype().contains("notifikasi")){

        }

        return response;
    }

    public String Request(Request request_income){
        RequestDetails rd = new RequestDetails();
        Request request = new Request();

        long trxConfirm = (long)(rand.nextDouble()*1000000000000000L);
        log.info("this random x {}",String.valueOf(trxConfirm));

        request.setTrxconfirm(String.valueOf(trxConfirm));
        request.setTime(request_income.getTime());
        request.setClientid(request_income.getClientid());
        em.persist(request);

        rd = request_income.getRequestDetails();
        em.persist(rd);

        request.setRequestDetails(rd);

        return String.valueOf(trxConfirm);

    }
}
