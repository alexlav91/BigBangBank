package ru.bank.bigbangbank.service;

import ru.bank.bigbangbank.models.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClient();
    void saveClient(Client client);
}
