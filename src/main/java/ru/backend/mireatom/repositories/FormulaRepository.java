package ru.backend.mireatom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.backend.mireatom.entities.Formula;

import java.util.ArrayList;

@Repository
public interface FormulaRepository extends JpaRepository<Formula, Long> {
}