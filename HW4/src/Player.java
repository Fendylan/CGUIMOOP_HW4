import java.util.ArrayList;

public class Player {


		private String name;
		private int chips;
		private int bet=0;
		
		private ArrayList<Card> oneRoundCard;
		public Player(String name, int chips){
			this.name=name;
			this.chips=chips;
		}
		public String get_name(){
			return name;
		}
		public int make_bet(){
			bet=1;
			if(chips-bet>0)
			return bet;
			else
			bet=0;
			return bet;
		}
		public void setOneRoundCard (ArrayList<Card> cards){
			oneRoundCard=cards;
		
		}
		public boolean hit_me(){
			if(getTotalValue()<=16)
			return true;
			else				
			return false;
				
		}
		public int getTotalValue(){
			int TotalValue=0;
		
			for(Card a:oneRoundCard){
				int rank=a.getRank();	
				
					if(rank>10)
				{
					rank=10;
				}
					if(rank==1&&TotalValue<11){
						rank=11;
					}
				TotalValue=rank+TotalValue;
			}
			return TotalValue;}
		
		public int get_current_chips() {
			return chips;
		}
		public void increase_chips (int diff){
			chips=chips+diff;
		}


		public void say_hello() {
		System.out.println("Hello, I am " + name + "."); 
		System.out.println("I have " + chips + " chips.");
		}
}
		
		


