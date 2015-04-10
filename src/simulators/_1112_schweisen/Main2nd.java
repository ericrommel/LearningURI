package simulators._1112_schweisen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2nd {
	static int MAX_X = 1000;
	static int MAX_Y = 1000;

	static int[][] tree = new int[MAX_X][MAX_Y];

//	static int query(int x, int y) {
//		int sum=0, yy=y;
//		if (x==0 || y==0) {
//			return 0;
//		}
//		while (x>0) {
//			while (y>0) {
//				sum += tree[x][y];
//				y -= y&(-y);
//			}
//			x -= x&(-x);
//			y = yy;
//		}
//		return sum;
//	}

	// sum[(0, 0), (r, c)]
	public static int sum(int r, int c) {
		int res = 0;
		for (int i = r; i >= 0; i = (i & (i + 1)) - 1) {
			for (int j = c; j >= 0; j = (j & (j + 1)) - 1) {
				res += tree[i][j];
			}
		}
		return res;
	}

	// sum[(r1, c1), (r2, c2)]
	static int sum(int r1, int c1, int r2, int c2) {
		return sum(r2, c2) - sum(r1 - 1, c2) - sum(r2, c1 - 1) + sum(r1 - 1, c1 - 1);
	}

	public static void add(int r, int c, int value) {
		for (int i = r; i < tree.length; i |= i + 1) {
			for (int j = c; j < tree[0].length; j |= j + 1) {
				tree[i][j] += value;
			}
		}
	}	

	static void update(int x, int y, int v) {
		int yy=y;
		if (x==0 || y==0) {
			return;
		}
		while (x<=MAX_X) {
			while (y<=MAX_Y) {
				tree[x][y] += v;
				y += y&(-y);
			}
			x += x&(-x);
			y = yy;
		}
	}

	public static void main(String[] args) throws IOException {
		int x=0, y=0, z=0, w=0, P=0, row=1, Q=0, schweisen=0, valor=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//String[] s = in.readLine().split(" ");
		String s="";
		while ((s=in.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				if (row == 1) {
					MAX_X = Integer.parseInt(st.nextToken());
					MAX_Y = Integer.parseInt(st.nextToken());
					P = Integer.parseInt(st.nextToken());
					if (MAX_X==0 & MAX_Y==0 & P==0) {
						break;
					} 
					row++;
				} else if (row == 2) {
					Q = Integer.parseInt(st.nextToken());
					Q = Q + ++row;
				} else if (row != Q) {
					row++;

					if (st.nextToken().equals("A")) {
						schweisen = Integer.parseInt(st.nextToken());
						x = Integer.parseInt(st.nextToken());
						y = Integer.parseInt(st.nextToken());
						add(x, y, schweisen);
						break;
					} else {
						x = Integer.parseInt(st.nextToken());
						y = Integer.parseInt(st.nextToken());
						z = Integer.parseInt(st.nextToken());
						w = Integer.parseInt(st.nextToken());
						valor = sum(Math.min(x, z), Math.min(y, w), Math.max(x, z), Math.max(y, w));
						System.out.println(valor*P);
						break;
					}
				} else {
					row = 1;
				}
			}					
		}
		in.close();
	}
}
