package com.radicalize.app.controller.dto;

import com.radicalize.app.model.ServicoDisponivel;

import java.util.List;
import java.util.stream.Collectors;

public class ServicoDisponivelDTO {

    private String title;
    private String location;
    private String imageUrl;

    public ServicoDisponivelDTO(ServicoDisponivel servicoDisponivel) {
        this.title = servicoDisponivel.getTitle();
        this.location = servicoDisponivel.getLocation();
        this.imageUrl = servicoDisponivel.getImageUrl();
    }
    public ServicoDisponivelDTO(){}

    public static List<ServicoDisponivelDTO> converter(List<ServicoDisponivel> servicos) {
        return servicos.stream().map(ServicoDisponivelDTO::new).collect(Collectors.toList());
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
