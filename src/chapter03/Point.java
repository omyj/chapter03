package chapter03;

public class Point {
	private int x;
	private int y;

	// Object의 toString() 오버라이딩
	@Override
	public String toString() {
		return "Poing [x : " + x + ", y : " + y + "]";
	}

	// 객체의 내용값으로 비교
	// @Override
	// public boolean equals(Object obj) {
	// if( this == obj ){ //this; p1.equals(p3) 중 p1에 해당
	// return true;
	// }
	//
	// if (this.getClass() != obj.getClass()){
	// return false;
	// }
	// Point other = (Point)obj; //cating
	// if( this.x == other.getX() && this.y == other.getY() ){
	// return true;
	// }
	// return false;
	// }

	// Source -> Generte

	// hash값과 equals에서의 객체의 내용은 결과가 동일해야 함
	// 따라서 오버라이드 할때 같이 해주어야 함

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.println("[x=" + x + ",y=" + y + "]에 점을 그렸습니다.");
	}

	public void show(boolean visible) {
		if (visible) {
			show();
			return;
		}

		System.out.println("[x=" + x + ",y=" + y + "]에 점을 지웠습니다.");
	}

}
