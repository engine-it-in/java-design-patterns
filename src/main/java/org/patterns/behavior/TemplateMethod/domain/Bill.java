package org.patterns.behavior.TemplateMethod.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Bill extends Document{
    private String number;

    private String signatory;

    private BigDecimal sum;

    private Date signDate;
}
