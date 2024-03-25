
public class Polymorphism {

	public static void main(String[] args) {
		PlayerRating p1=new PlayerRating(1, "Beckham");
		PlayerRating p2=new PlayerRating(1, "Oscar");
        p1.calculateAverageRating(9,9.9f);
        p1.calculateCategory();
        p1.display();
//      p2.calculateAverageRating(1, 1, 1);
//      p2.calculateCategory();
//      p2.display();
        
	}
}
class PlayerRating{
	int playerPosition;
	String playerName;
    float criticOneRating;
    float criticTwoRating;
    float criticThreeRating;
    float averageRating;
    char  category;
    PlayerRating(int playerPosition,String playerName){
    	this.playerPosition=playerPosition;
    	this.playerName=playerName;
    }
    public void calculateAverageRating(float criticOneRating,float criticTwoRating) {
    	this.criticOneRating=criticOneRating;
    	this.criticTwoRating=criticTwoRating;
    	this.averageRating=(criticOneRating+criticTwoRating)/2;
    }
    public void calculateAverageRating(float criticOneRating,float criticTwoRating,float criticThreeRating) {
    	this.criticOneRating=criticOneRating;
    	this.criticTwoRating=criticTwoRating;
    	this.criticThreeRating=criticThreeRating;
    	this.averageRating=(criticOneRating+criticTwoRating+criticThreeRating)/3;
    }
    public void calculateCategory() {
    	if(averageRating>8) {
    		this.category='A';
    	}
    	else if(averageRating>5 && averageRating<=8) {
    		this.category='B';
    	}
    	else if(averageRating>0 && averageRating<=5) {
    		this.category='C';
    	}
    }
    public void display() {
    	System.out.println("The Player name is "+playerName);
    	System.out.println("The Player position is "+playerPosition);
    	System.out.println("The Average Rating is "+this.averageRating);
    	System.out.println("The category is "+this.category);
  
    }
}