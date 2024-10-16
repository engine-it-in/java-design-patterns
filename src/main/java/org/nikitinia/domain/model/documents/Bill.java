package org.nikitinia.domain.model.documents;

import lombok.*;
import org.nikitinia.domain.dictionaries.Status;
import org.nikitinia.domain.dictionaries.Type;
import org.nikitinia.domain.model.additional.TextField;

import java.math.BigDecimal;
import java.util.Date;


@Setter
@Getter
@ToString
public class Bill extends Document {

    private Double number;
    private String signatory;
    private Status status;
    private Type type;
    private TextField textField;
    private BigDecimal sum;
    private Date signDate;

    public Bill(Double number, String signatory, Status status, Type type,  TextField textField, BigDecimal sum, Date signDate) {
        super(number, signatory, status, type, textField);
        this.number = number;
        this.signatory = signatory;
        this.status = status;
        this.type = type;
        this.sum = sum;
        this.signDate = signDate;
    }

}
