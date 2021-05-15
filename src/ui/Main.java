package ui;

import model.Flag;
import thread.ThreadFlag;

public class Main {

	public final static String ESC   = "\u001b[";

	public static void main(String[] args) throws InterruptedException  {
		Flag flag = new Flag ();
		ThreadFlag tf1 = new ThreadFlag(flag,"\u001b[43m","\u001b[33m",0,12);
		ThreadFlag tf2 = new ThreadFlag(flag,"\u001b[44m","\u001b[34m",13,22);
		ThreadFlag tf3 = new ThreadFlag(flag,"\u001b[41m","\u001b[31m",22,32); 
		
		
		System.out.print(ESC+"2J");//Clear screen
		//System.out.print(ESC+"0G"+ESC+"0d");//Cursor in 0,0
		tf1.start();		
		tf1.join();
		
		//System.out.print(ESC+"0G"+ESC+"13d");//Cursor in 0,13
		tf2.start();		
		tf2.join();
		
		//System.out.print(ESC+"0G"+ESC+"22d");//Cursor in 0,22
		tf3.start();		
		tf3.join();
		
		System.out.print(ESC+"0G"+ESC+"32d");//Cursor in 0,32
		System.out.println("\u001B[0m");
		System.out.println("FIN");
		
		
		
	}

}
