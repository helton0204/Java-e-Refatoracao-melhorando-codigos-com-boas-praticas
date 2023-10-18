package br.com.helton;

import br.com.helton.client.ClientHttpConfiguration;
import br.com.helton.service.PetService;

import java.io.IOException;

public class ListarPetsDoAbrigoCommand implements Command {
    @Override
    public void execute() {
        ClientHttpConfiguration client = new ClientHttpConfiguration();
        PetService petService = new PetService(client);
        try {
            petService.listarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
