package org.nikitinia.domain.model.documents;

import lombok.*;
import org.nikitinia.domain.dictionarys.Status;
import org.nikitinia.domain.model.additional.TextField;

import java.util.Date;


@Setter
@Getter
@ToString
public class Invoice extends Document {

    private Double number;
    private String signatory;
    private Status status;
    private TextField textField;
    private String product;
    private Date signDate;

    public Invoice(Double number, String signatory, Status status, TextField textField, String product, Date signDate) {
        super(number, signatory, status, textField);
        this.number = number;
        this.signatory = signatory;
        this.status = status;
        this.textField = textField;
        this.product = product;
        this.signDate = signDate;
    }
}
