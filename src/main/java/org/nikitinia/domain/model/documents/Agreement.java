package org.nikitinia.domain.model.documents;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.dictionarys.Type;
import org.nikitinia.domain.model.additional.TextField;

import java.math.BigDecimal;
import java.util.Date;


@Setter
@Getter
@ToString
public class Agreement extends Document {

    private Double number;
    private String signatory;
    private Status status;
    private Type type;
    private BigDecimal sum;
    private Date beginDate;
    private Date endDate;
    private TextField textField;

    public Agreement(
            Double number,
            String signatory,
            Status status,
            Type type,
            BigDecimal sum,
            Date beginDate,
            Date endDate,
            TextField textField) {

        super(number, signatory, status, type, textField);
        this.number = number;
        this.signatory = signatory;
        this.status = status;
        this.type = type;
        this.textField = textField;
        this.sum = sum;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }
}
