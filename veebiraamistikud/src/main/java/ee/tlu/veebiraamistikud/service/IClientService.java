package ee.tlu.veebiraamistikud.service;

import ee.tlu.veebiraamistikud.dto.RespDto;

public interface IClientService {

    RespDto getAllClients();

    RespDto getClientByName(String name);

    RespDto getClientById(Integer id);

}
