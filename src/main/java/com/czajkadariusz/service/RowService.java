package com.czajkadariusz.service;

import com.czajkadariusz.entity.Row;
import com.czajkadariusz.repository.RowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RowService implements RowServiceInterface{
    @Autowired
    private RowRepository rowRepository;

    @Override
    public List<Row> findAllRows() {
        List<Row> rows = rowRepository.findAll();

        return rows;
    }

    public List<Row> findRepeating() {
        List<Row> rows = rowRepository.findRepeating();

        return rows;
    }

    public List<Row> findDistinct() {
        List<Row> rows = rowRepository.findDistinct();

        return rows;
    }
}
