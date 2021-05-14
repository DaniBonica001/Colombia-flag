package ui;

import model.Flag;
import thread.ThreadFlag;

public class Main {


	public static void main(String[] args) throws InterruptedException  {
		Flag flag = new Flag (10);
		ThreadFlag tf1 = new ThreadFlag(flag,"\u001b[43m","\u001b[33m"); 
		
		tf1.start();		
	}

}
