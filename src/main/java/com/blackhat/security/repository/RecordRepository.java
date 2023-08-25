package com.blackhat.security.repository;

import com.blackhat.security.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface RecordRepository extends JpaRepository<Record, Integer> {

    Optional<Record> findByEmail(String email);
}
