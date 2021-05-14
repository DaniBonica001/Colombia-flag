package model;

public class Flag {
	
	public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";
	public final static String NXLN  = ESC+"1E";
	
	public final static String YELLOW = ESC+"43m"+ESC+"33m";
	public final static String BLUE = ESC+"44m"+ESC+"34m";
	public final static String RED = ESC+"41m"+ESC+"31m";
	
	public final static int[] TEXT_FORMAT = new int[] 
			{0,1,22,4,24,27,31,32,33,34,35,36,37,
			 40,41,42,43,44,45,46,47,48,90,91,92,93,94,
			 95,96,97,100,101,102,103,104,105,106,107};
	
	
	private int maximum;
	public Flag(int max) {
		maximum = max;
	}
	
	
	
	public void advanceColor(String colorb,String colorf) throws InterruptedException {
		
		char symbol = '*';
		int sleep = 50;		
		int width = 1;
		int maxd = 10;
		int maxu = 10;
		//int color = 0;
		//boolean mode = true;
		String dir1 = DOWN;
		//String dir2 = LEFT;
		
		System.out.print(ESC+"2J");//Clear screen
		System.out.print(ESC+"0G"+ESC+"0d");//Cursor in 0,0
		
		
		Thread.sleep(sleep);
		
		while (width<maxu) {
			String pass = "";
			int height = 0;
			while(height<maxd) {
				height++;
				System.out.print(pass);
				System.out.print(colorb+"\u001b[30m"+symbol);
				Thread.sleep(sleep);
				System.out.print(LEFT);
				pass = dir1;
			}			
			//String col = String.valueOf(width);
			//String move = col+"d";
			
			System.out.print(RIGHT);
			System.out.print(ESC+"0d");
		
			width++;
		}
	
			
				
	}
}
