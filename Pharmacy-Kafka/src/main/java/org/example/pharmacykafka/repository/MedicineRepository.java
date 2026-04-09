package org.example.pharmacykafka.repository;

import org.example.pharmacykafka.model.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Long>
{
}
