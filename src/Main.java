import observadores.Logger;
import observavel.CarteiraAcao;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		CarteiraAcao ca = new CarteiraAcao();
        
        Logger l = new Logger();
        
        ca.addObservador(l);
        
        ca.alterar("ABC001", 5);
        Thread.sleep(3000);
        
        ca.alterar("DEF002", 10);
        Thread.sleep(3000);
        
        ca.alterar("ABC001", 5);
	}

}
