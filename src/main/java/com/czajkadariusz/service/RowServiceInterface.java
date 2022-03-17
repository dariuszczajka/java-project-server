package com.czajkadariusz.service;

import com.czajkadariusz.entity.Row;

import java.util.List;

public interface RowServiceInterface {
    List<Row> findAllRows();
    List<Row> findDistinct();
    List<Row> findRepeating();
}
