package br.com.helton;

import br.com.helton.client.ClientHttpConfiguration;
import br.com.helton.service.AbrigoService;

import java.io.IOException;

public class ListarAbrigoCommand implements Command{

    @Override
    public void execute() {
        ClientHttpConfiguration client = new ClientHttpConfiguration();
        AbrigoService abrigoService = new AbrigoService(client);

        try {
            abrigoService.listarAbrigo();
        }
        catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
