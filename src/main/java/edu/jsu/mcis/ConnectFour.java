package edu.jsu.mcis;
private Location [][]borad;

public class ConnectFour {
    public enum Location {EMPTY, RED, BLACK};
    
    public ConnectFour() {
        borad = new Location [ROWS][COLUMN]
		for (int i=0; i < borad.length; i++){
			for(int j=0;j<borad[i].length;i++){
				borad[i][j] Location.EMPTY;
			}
		}
		return true;
    }
    
    public Location getTopOfColumn(int column) {

    }
    
    public int getHeightOfColumn(int column) {
        
    }
    
    public void dropToken(int column) {
        
    }
}
