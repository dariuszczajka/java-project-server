package com.czajkadariusz.controller;

import com.czajkadariusz.entity.Row;
import com.czajkadariusz.service.RowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class RowController {
    @Autowired
    private RowService rowService;

    @CrossOrigin
    @GetMapping(value = "/api/rows")
    public ResponseEntity<List<Row>> getRows(){
        List<Row> listRow = rowService.findAllRows();

        return new ResponseEntity<>(listRow, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/api/rows/repeating")
    public ResponseEntity<List<Row>> getRepeatingRows(){
        List<Row> listRow = rowService.findRepeating();

        return new ResponseEntity<>(listRow, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/api/rows/distinct")
    public ResponseEntity<List<Row>> getDistinctRows(){
        List<Row> listRow = rowService.findDistinct();

        return new ResponseEntity<>(listRow, HttpStatus.OK);
    }

}
