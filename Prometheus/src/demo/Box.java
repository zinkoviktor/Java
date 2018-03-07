package demo;

public class Box {
	private int x;
	private int y;
	private int z;
	
	public Box() {
		
	}
	
	public Box(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void print() {
		System.out.println("x:"+x+"; y:"+y+"; z:"+z);
	}
	public void change (int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public long getVolume () {
		return x*y*z;
	}
}
