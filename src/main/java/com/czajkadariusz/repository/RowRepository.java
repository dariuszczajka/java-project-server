package com.czajkadariusz.repository;

import com.czajkadariusz.entity.Row;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RowRepository extends JpaRepository<Row, Integer> {

    @Query(value = "SELECT x.*\n" +
            "  FROM tabela_testowa x\n" +
            "  JOIN (SELECT t.kolumna1\n" +
            "          FROM tabela_testowa t\n" +
            "      GROUP BY t.kolumna1\n" +
            "        HAVING COUNT(t.kolumna1) > 1) y ON y.kolumna1 = x.kolumna1", nativeQuery = true)
    List<Row> findRepeating();

    @Query(value = "SELECT x.*\n" +
            "  FROM tabela_testowa x\n" +
            "  JOIN (SELECT t.kolumna1\n" +
            "          FROM tabela_testowa t\n" +
            "      GROUP BY t.kolumna1\n" +
            "        HAVING COUNT(t.kolumna1) <= 1) y ON y.kolumna1 = x.kolumna1", nativeQuery = true)
    List<Row> findDistinct();
}