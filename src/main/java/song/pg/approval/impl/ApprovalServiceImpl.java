package song.pg.approval.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import song.pg.approval.ApprovalService;
import song.pg.approval.models.RequestPaymentApproval;
import song.pg.approval.models.ResponsePaymentApproval;
import song.pg.approval.utils.UUIDGenerator;

@Service
@Slf4j
public class ApprovalServiceImpl implements ApprovalService
{
  @Override
  public String approval(RequestPaymentApproval requestPaymentApproval)
  {
    /**
     * 1. 토큰 검증 및 카드정보 요청
     */

    RestClient restClient = RestClient.create();

    ResponsePaymentApproval response = restClient.post()
      .uri("http://localhost:8081/api/token/verify/v1")
      .header("Authorization", "Bearer " + requestPaymentApproval.getPaymentToken())
      .retrieve()
      .body(ResponsePaymentApproval.class);

    if (response != null && response.getCode().equals("200"))
    {
      //승인처리
      log.info("승인 카드정보 : {}", response.getData().toString());

      return UUIDGenerator.generateUUID(); //승인번호
    }

    return "";
  }
}
