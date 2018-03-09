package demo;

public class Point {
	private int x;
	private int y;
	private int color = 10;
	 public void draw () {
		 
	 }
	 
	 public Point(int c) {
		 color = c;
	 }
	 
	 public Point() {
		 
	 }
	 
	 public void draw(int x, int y) {
		 this.x=x;
		 this.y=y;
	 }
	 
	 public int getColor() {
		 return color;
	 }
}
