package ee.tlu.veebiraamistikud.controller;

import ee.tlu.veebiraamistikud.dto.ClientDto;
import ee.tlu.veebiraamistikud.dto.RespDto;
import ee.tlu.veebiraamistikud.service.IClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequiredArgsConstructor
//@CrossOrigin(maxAge = 3600)
@RequestMapping("/v1")
public class ClientController {

    private final IClientService clientService;


    @GetMapping("/client")
    public RespDto getAllClients() {
        log.info("Getting all clients");
        return clientService.getAllClients();
    }

    @GetMapping("/client/name/{name}")
    public RespDto getClientByName(@PathVariable("name") String name) {
        log.info("Getting client by name: " + name);
        return clientService.getClientByName(name);
    }

    // HEAD annab selle, mida GET, aga ilma body'ta ehk näitab seda, et kas on olemas või mitte
    @RequestMapping(
            value = "/client/{id}",
            method = {RequestMethod.GET, RequestMethod.HEAD},
            produces = "application/json"
    )
    public RespDto getClientById(@PathVariable Integer id) {
        log.info("Getting client by id: " + id);
        return clientService.getClientById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/client", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String addNewClient(@RequestBody ClientDto dto) {
        log.info("ClientController.clientPost()");
        return "ClientController.clientPost()";
    }

    @DeleteMapping(value = "/client/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteClient(@PathVariable("id") String id) {
        log.info("ClientController.deleteClient()");
        return "ClientController.deleteClient()";
    }

    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    @PutMapping(value = "/client/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateClient(@PathVariable("id") Integer id, @RequestBody ClientDto dto) {
        log.info("ClientController.updateClient()");
        return "ClientController.updateClient()";
    }

}
