package thread;

import model.Flag;

public class ThreadFlag extends Thread{
	
	private Flag flag;
	private String colorBackground;
	private String colorFont;
	private int start;
	private int end;
	public ThreadFlag(Flag fl,String colorback,String colorfont,int s,int e) {
		flag=fl;
		colorBackground = colorback;
		colorFont = colorfont;
		start = s;
		end = e;
	}
	
	
	public void run() {
		try {
			flag.advanceColor(start,end,colorBackground,colorFont);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	
	
	
	

}
