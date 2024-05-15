package song.pg.approval.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ResponsePaymentApproval implements Serializable
{
  private static final long serialVersionUID = -2158428747150755842L;

  private String code;
  private String message;
  private PaymentMethodCardInfo data;
}
