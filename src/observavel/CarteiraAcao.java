package observavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import interfaci.Observador;

public class CarteiraAcao {
    
    private Map<String, Integer> acoes;
    private List<Observador> observadores;
    
    public CarteiraAcao() {
        acoes = new HashMap<String, Integer>();
        observadores = new ArrayList<Observador>();
    }
    
    public void alterar(String acao, int qtd) {
        if (acoes.containsKey(acao)) {
            qtd += acoes.get(acao);
        }
        acoes.put(acao, qtd);
        notificar(acao, qtd);
    }
    
    public void notificar(String acao, int qtd) {
        for (Observador o : observadores) {
            o.notificar(acao, qtd);
        }
    }
    
    public void addObservador(Observador o) {
        observadores.add(o);
    }
    
}
