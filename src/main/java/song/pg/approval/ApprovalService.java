package song.pg.approval;

import song.pg.approval.models.RequestPaymentApproval;

public interface ApprovalService
{
  String approval(RequestPaymentApproval requestPaymentApproval);
}
