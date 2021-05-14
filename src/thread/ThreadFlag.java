package thread;

import model.Flag;

public class ThreadFlag extends Thread{
	
	private Flag flag;
	private String colorBackground;
	private String colorFont;
	
	public ThreadFlag(Flag fl,String colorback,String colorfont) {
		flag=fl;
		colorBackground = colorback;
		colorFont = colorfont;
	}
	
	
	public void run() {
		try {
			flag.advanceColor(colorBackground,colorFont);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	
	
	
	

}
