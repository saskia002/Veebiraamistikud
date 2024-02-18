package ee.tlu.veebiraamistikud.mapper;

import ee.tlu.veebiraamistikud.dto.ClientDto;
import ee.tlu.veebiraamistikud.model.ClientModel;

import java.util.ArrayList;
import java.util.List;

public class ClientMapper {


    public static ClientDto toDto(ClientModel model) {
        return ClientDto.builder()
                .id(model.getId())
                .firstName(model.getFirstName())
                .lastName(model.getLastName())
                .email(model.getEmail())
                .phone(model.getPhone())
                .build();
    }

    public static ClientModel toModel(ClientDto dto) {
        return ClientModel.builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .build();
    }

    public static List<ClientModel> toModelList(List<ClientDto> dtoList) {
        //return dtoList.stream().map(ClientMapper::toModel).toList();

        var list = new ArrayList<ClientModel>();
        for (ClientDto dto : dtoList) {
            list.add(toModel(dto));
        }
        return list;
    }

    public static List<ClientDto> toDtoList(List<ClientModel> modelList) {
        //return modelList.stream().map(ClientMapper::toDto).toList();

        var list = new ArrayList<ClientDto>();
        for (ClientModel model : modelList) {
            list.add(toDto(model));
        }
        return list;
    }

}
