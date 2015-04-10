package simulators._1283_boxes_and_stones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		
		String s = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		s = in.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}

	}

}
