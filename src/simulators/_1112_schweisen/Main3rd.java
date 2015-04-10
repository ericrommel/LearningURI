package simulators._1112_schweisen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3rd {
	
	public static void main(String[] args) throws IOException {
		int x=0, y=0, z=0, w=0, P=0, row=1, Q=0, schweisen=0, valor=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//String[] s = in.readLine().split(" ");
		String s="";
		BIT_2D bit=null;
		while ((s=in.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				if (row == 1) {
					x = Integer.parseInt(st.nextToken());
					y = Integer.parseInt(st.nextToken());
					P = Integer.parseInt(st.nextToken());
					if (x==0 & y==0 & P==0) {
						break;
					}
					bit = new BIT_2D(x, y);
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
						bit.add(x, y, schweisen);
						break;
					} else {
						x = Integer.parseInt(st.nextToken());
						y = Integer.parseInt(st.nextToken());
						z = Integer.parseInt(st.nextToken());
						w = Integer.parseInt(st.nextToken());
						valor = bit.sum(Math.min(x, z), Math.min(y, w), Math.max(x, z), Math.max(y, w));
						System.out.println(valor*P);
						break;
					}
				} else {
					row = 1;
					System.out.println();
				}
			}
			
		}
		in.close();
	}
	
	static class BIT_2D {

		   int[][] t;
		   int max_x, max_y;

		   public BIT_2D(int max_x, int max_y) {
		      this.max_x = max_x;
		      this.max_y = max_y;
		      this.t = new int[max_x][max_y];
		   }

		   public BIT_2D(int[][] t) {
		      this.t = t;
		      max_x = t.length;
		      max_y = t[0].length; // maybe a BUG
		   }

		   public void add(int r, int c, int value) {
		      for (int i = r; i < t.length; i |= i + 1)
		         for (int j = c; j < t[0].length; j |= j + 1)
		            t[i][j] += value;
		   }

		   // sum[(0, 0), (r, c)]
		   public int sum(int r, int c) {
		      int res = 0;
		      for (int i = r; i >= 0; i = (i & (i + 1)) - 1)
		         for (int j = c; j >= 0; j = (j & (j + 1)) - 1)
		            res += t[i][j];
		      return res;
		   }

		   // sum[(r1, c1), (r2, c2)]
		   public int sum(int r1, int c1, int r2, int c2) {
		      return sum(r2, c2) - sum(r1 - 1, c2) - sum(r2, c1 - 1)
		            + sum(r1 - 1, c1 - 1);
		   }

		   public int get(int r, int c) {
		      return sum(r, c, r, c);
		   }

		   public void set(int r, int c, int value) {
		      add(r, c, -get(r, c) + value);
		   }

		}
}
