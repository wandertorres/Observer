package observadores;

import interfaci.Observador;

public class Logger implements Observador {

    @Override
    public void notificar(String acao, int qtd) {
        System.out.println("A ação "+acao+" foi modificada, sua quantidade agora é "+qtd);
    }
    
}
