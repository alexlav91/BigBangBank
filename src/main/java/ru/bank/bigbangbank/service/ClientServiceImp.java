package ru.bank.bigbangbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bank.bigbangbank.models.entity.Client;
import ru.bank.bigbangbank.repo.ClientRepository;

import java.util.List;
@Service
public class ClientServiceImp implements ClientService{
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> getAllClient() {

        return clientRepository.findAll();
    }

    @Override
    public void saveClient(Client client) {
        this.clientRepository.save(client);

    }
}
