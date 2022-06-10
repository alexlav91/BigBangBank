package ru.bank.bigbangbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bank.bigbangbank.models.entity.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
