package ru.bank.bigbangbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bank.bigbangbank.models.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
