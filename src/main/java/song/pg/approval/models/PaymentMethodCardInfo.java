package song.pg.approval.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PaymentMethodCardInfo
{
  private String cardNumber1;

  private String cardNumber2;

  private String cardNumber3;

  private String cardNumber4;

  private int expireYear;

  private int expireMonth;

  private int cvc;

  private int password;

  private String cardHolderName;
}
