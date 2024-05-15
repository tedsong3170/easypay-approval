package song.pg.approval;

import song.pg.approval.models.RequestPaymentApproval;
import song.pg.approval.models.common.CommonResponse;

public interface ApprovalService
{
  CommonResponse<String> approval(RequestPaymentApproval requestPaymentApproval);
}
