//Kari Lampi


package stackProject;

public class Stack {
	
	
	private ListItem top;
	private ListItem current;
	private int size;
	
	public Stack() {
		top = null;
		size = 0;
	}
	
	// tehtävänä on muodostaa uusi lista-alkio 
	//ja viedä se pinon huipulle
	public void push(String aData) {
		ListItem newItem = new ListItem(); 
		newItem.setData(aData); 
		newItem.setNext(top); //kytketään uusi lista-alkio aikaisempaan huippualkioon
		top = newItem; // uusi alkio asetetaan pinon huippualkioksi
		size++;
		System.out.println("push " + aData);
		
	}
	
	// tehtävänä on palauttaa alkio pinon huipulta, 
	//jos pino on tyhjä palauta null
	
	public ListItem pop() {
		if(top == null) {
			System.out.println("Virhe: ei alkioita!");
			return top;
		} else {
			ListItem dropItem = top; //Osoitetaan pinon päällimmäiseen alkioon
			System.out.println("pop "+ dropItem.getData());
			top = dropItem.getNext(); //Poistetaan päälimmäinen alkio topin osoitinta siirtämällä
			size--;
			return dropItem;
		}
			
	}
	
	// tulosta pinon sisältö muuttamatta pinoa
	public void printItems() {
		if(top == null) {
			System.out.println("Pino on tyhjä!");
		} else {
			ListItem printItem = top; //Osoitetaan pinon päällimmäiseen alkioon
			for(int i=0; i<size;i++) {
				System.out.println(printItem.getData()); //tulostetaan päällimmäisen sisältö
				printItem = printItem.getNext(); //siirrytään seuraavaan olioon
			}
			
		}
	}
	
	//palauta pinon koko
	public int getSize() {
		return size;
	}

}
