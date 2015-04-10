package studies.BinaryIndexedTree;


public class Bit2D {

	final static int MAX = 1000;
	static int[][] tree = new int[MAX+1][MAX+1];
	
	int query(int x, int y) {
		int sum=0, yy=y;
		if (x==0 || y==0) {
			return 0;
		}
		while (x>0) {
			while (y>0) {
				sum += tree[x][y];
				y -= y&(-y);
			}
			x -= x&(-x);
			y = yy;
		}
		return sum;
	}
	
	void update(int x, int y, int v) {
		int yy=y;
		if (x==0 || y==0) {
			return;
		}
		while (x<=MAX) {
			while (y<=MAX) {
				tree[x][y] += v;
				y += y&(-y);
			}
			x += x&(-x);
			y = yy;
		}
	}
	
	public static void main(String[] args) {
		//Arrays.fill(tree, 0);
		Bit2D bit2d = new Bit2D();
		bit2d.update(3, 5, 2);
		bit2d.update(2, 3, -1);
		System.out.println(bit2d.query(10, 10));
	}

}
