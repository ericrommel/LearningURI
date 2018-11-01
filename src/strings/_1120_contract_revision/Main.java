package strings._1120_contract_revision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * For years, all contracts of the Association of Contracts for Modernization (ACM) were typed using
 * an old typewriter machine.
 * Recently Mr. Miranda, one of the accountants of the ACM, realized that the machine had a failure
 * in one, and only one, numerical digit. More specifically, the flawed digit, when typed, is not
 * printed on the sheet, as if the corresponding key was not pressed. He realized that this could
 * have changed the numerical representation of contract values. Worried about accounting,
 * Mr. Miranda wants to know, from the original values agreed for the contracts (which he kept in
 * handwritten notes) which values are actually represented in the contracts. For example, if the
 * failed digit in the machine is 5, an agreed value of 1500 would be represented in the
 * corresponding contract as 100, because the digit 5 would not be printed. Note that Mr. Miranda
 * wants to know the numeric value represented in the contract, ie, in the same machine, the number
 * 5000 corresponds to the numeric value 0, not 000 (as it actually appears in the contract).
 * 
 * Input
 * - The input consists of several test cases, each in one line. Each line contains two integers D
 *   and N (1 <= D <= 9, 1 <= N < 10^100 ), representing, respectively, the digit that has failed in
 *   the machine and the number that was originally agreed for the contract (which can be very large
 *   because of hiperinflation).
 *   
 *   The last test case is followed by a line which contains only two zeros separated by white space.
 *   
 * Output
 * - For each test case in the input your program must print one line containing a single integer,
 *   the numeric value represented in the contract.
 *   
 * @author e.dantas
 *
 */
 
public class Main {
 
    public static void main(String[] args) throws IOException {
//    	String myPackage = Main.class.getPackage().getName().replace(".", "/");
//    	FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1120.txt");
//    	BufferedReader in = new BufferedReader(new InputStreamReader(stream));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String[] s=null;
        String value = "";
        while (( s=in.readLine().split(" ")) != null) {
            if (s[0].equals("0") & s[1].equals("0")) {
                break;
            } else {
            	for (int i=0; i<s[1].length(); i++) {
            		if (s[1].charAt(i) != s[0].charAt(0)) {
            			
            		}
            	}
                String n = (s[1].replaceAll(s[0], "").equals("") ? "0" : (s[1].replaceAll(s[0], "")));
                if (n.equals("0")) {
                	out.write("0\n");
                } else {
                	out.write(n + "\n");
                }
            }
        }
        in.close();
        out.flush();
    }
}