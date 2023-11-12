package org.patterns.behavior.TemplateMethod.domain;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

public class Agreement extends Document {

    private Type type;

    private BigDecimal sum;

    private Date beginDate;

    private Date endDate;

}
