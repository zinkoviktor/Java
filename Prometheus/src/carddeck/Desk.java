package carddeck;

public class Desk {
	private Card [] newCard = new Card[36];
	private int draw = 35;
	public Desk () {
		
	}
	//Перемішує колоду у випадковому порядку 
    public void shuffle() {
    	Card temp;
    	if(newCard[0] !=null) {
	    	for(int i=0;i<36;i++) {
	    		int random = (int) (Math.random() * 35);
	    		temp=newCard[i];
	    		newCard[i]=newCard[random];
	    		newCard[random]=temp;
	    	}
    	}
    }
    /* * Впорядкування колоди за мастями та значеннями 
    * Порядок сотрування: 
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES 
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6 
    * Наприклад 
    * HEARTS Ace 
    * HEARTS King 
    * HEARTS Queen 
    * HEARTS Jack 
    * HEARTS 10 
    * HEARTS 9 
    * HEARTS 8 
    * HEARTS 7 
    * HEARTS 6 
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
    	int i=0;   	
     	for(int j=0;j<4;j++) {    		   			
     		for(int k=0;k<9;k++) {			
	    		newCard[i]=new Card(Rank.values[k], Suit.values[j]);
	    		i++;
    		}
    	}
    	
    }
    
    
	//Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
    	if(newCard[0]!=null)return true;
    	else return false;
    }
    
    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {    	   	
    	Card tempCard;
    	
    	if(newCard[0]!=null) {
    		tempCard=newCard[draw];
    		newCard[draw]=null;
    		--draw;
    		return tempCard;
    	}
    	else {
    		return null;
    	}  	
   }     
    
}