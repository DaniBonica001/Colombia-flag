package model;

public class Flag {
	
	public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";
	public final static String NXLN  = ESC+"1E";

	public void advanceColor(int start, int end,String colorb,String colorf) throws InterruptedException {
		char symbol = '*';
		int sleep = 10;		
		int width = 1;
		int maxH = end;
		int maxW = 150;	
		String dir1 = DOWN;
		
		//System.out.print(ESC+"0G"+ESC+String.valueOf(start)+"d");
		Thread.sleep(sleep);
		
		while (width<maxW) {
			String pass = "";
			int height = start;
			while(height<maxH) {
				height++;
				System.out.print(pass);
				System.out.print(ESC+String.valueOf(width-1)+"G"+ESC+String.valueOf(height)+"d"+colorb+colorf +symbol);
				Thread.sleep(sleep);
				System.out.print(LEFT);
				pass = dir1;
			}			
					
			System.out.print(RIGHT);
			System.out.print(ESC+String.valueOf(start)+"d");
		
			width++;
		}				
	}
}
