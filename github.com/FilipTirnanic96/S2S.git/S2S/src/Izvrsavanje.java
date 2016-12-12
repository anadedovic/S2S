import java.util.LinkedList;
public class Izvrsavanje {
	public void prikaziSveStudente(LinkedList studenti){
		if(studenti==null){
			System.out.println("Greska!");
			return;
		}
		int i=0;
		while(i<studenti.size()){
		System.out.println(studenti.get(i).toString());
		i++;
		}
	}
}
