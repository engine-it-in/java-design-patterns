package behavior.TemplateMethod.domain;

import org.nikitinia.domain.Document;

import java.math.BigDecimal;
import java.util.Date;

public class BillTest extends Document {
    private String number;

    private String signatory;

    private BigDecimal sum;

    private Date signDate;
}
