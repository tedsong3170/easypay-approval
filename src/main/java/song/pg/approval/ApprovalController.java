package song.pg.approval;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import song.pg.approval.models.RequestPaymentApproval;

@RestController
@RequestMapping("/api/approval")
@Slf4j
@RequiredArgsConstructor
public class ApprovalController
{
  private final ApprovalService approvalService;

  @PostMapping("/v1")
  public ResponseEntity<String> approval(
    @RequestBody final RequestPaymentApproval requestPaymentApproval
  )
  {
    return ResponseEntity.ok()
      .body(approvalService.approval(requestPaymentApproval));
  }
}
