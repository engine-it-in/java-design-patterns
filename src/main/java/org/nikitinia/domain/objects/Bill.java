package org.nikitinia.domain.objects;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class Bill extends Document{
    private String number;

    private String signatory;

    private BigDecimal sum;

    private Date signDate;
}
