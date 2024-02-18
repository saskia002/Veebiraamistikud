package ee.tlu.veebiraamistikud.service;

import ee.tlu.veebiraamistikud.dto.RespDto;
import ee.tlu.veebiraamistikud.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClientService implements IClientService {

    private final ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public RespDto getAllClients() {
        return new RespDto("getAllClients", "Clients fetched successfully", "/v1/client", clientRepository.findAll());
    }

    @Transactional(readOnly = true)
    public RespDto getClientByName(String name) {
        return new RespDto("getClientByName", "Client fetched successfully", "/v1/client", clientRepository.findByFirstName(name));
    }

    @Transactional(readOnly = true)
    public RespDto getClientById(Integer id) {
        return new RespDto("getClientById", "Client fetched successfully", "/v1/client", clientRepository.findById(id));
    }

}
