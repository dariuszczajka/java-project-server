package com.czajkadariusz.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "tabela_testowa")

public @Data
class Row {
    @Id
    private @Getter Integer id;

    private @Getter String kolumna1;
    private @Getter String kolumna2;
    private @Getter String kolumna3;
    private @Getter Integer kolumna4;

}
