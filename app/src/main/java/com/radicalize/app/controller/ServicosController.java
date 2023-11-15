package com.radicalize.app.controller;

import com.radicalize.app.controller.dto.ServicoDisponivelDTO;
import com.radicalize.app.model.ServicoDisponivel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ServicosController {

    @RequestMapping("/servicos")
    public List<ServicoDisponivelDTO> servico() {
        ServicoDisponivel servicoDisponivel = new ServicoDisponivel("Calhetas", "Calhetas", "https://4600478be0.cbaul-cdnwnd.com/9fdfcd96bff923416175c91e02771cd2/200004380-c12dec12e0/IMG_6337.JPG");

        return ServicoDisponivelDTO.converter(Arrays.asList(servicoDisponivel, servicoDisponivel, servicoDisponivel));
    }

}
