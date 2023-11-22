package org.nikitinia.domain.model.documents;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.nikitinia.domain.dictionarys.Type;

import java.math.BigDecimal;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
public class Agreement extends Document {
    private String number;
    private String signatory;
    private Type type;
    private BigDecimal sum;
    private Date beginDate;
    private Date endDate;

}
