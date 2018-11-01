package strings._2722_evergreen_trick;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * URI Online Judge | 2722
 * Evergreen Trick
 * By Neilor Tonin, URI BR Brazil
 * Timelimit: 1
 *
 *
 * Evergreen Bushy, one of Noel's helper elves, is responsible for inventing many of the toys distributed by Noel and
 * also well-known for joking with the good old man, has made another joke this year.
 * As he always does every year, Bushy separated the presents for each child by placing a note with the children's name.
 * The problem is that he did not simply put the correct name of the child in the present: he joked :) each of the names
 * by mixing the letters in a sequence: two letters of the name followed by two letters of the surname, followed by two
 * letters of the name and by two letters of the surname and so on.
 * Well, as Noel is very tired this year and without time for jokes, he asked you that is an expert in programming to
 * make a program that converts the name mixed by Evergreen into the correct name of each child.
 *
 * Just a curiosity: the first line of each test case will always have an even number of characters and the second line
 * will always have the same number of characters of the first line (or the same number -1 character).
 *
 * Input:
 * - The input contains an integer N (N < 2000) that indicates the number of test cases. Each test case consists of two
 *   lines with up to 100 characters (maximum). These two lines contain the name that was mixed by Evergreen Bushy,
 *   which is basically composed of uppercase, lowercase, and white spaces.
 *
 * Output:
 * - Based on these two input lines, your program must print the correct children's name, according to the rule to
 *   decode it, as described above.
 * Input Sample 	Output Sample
 *  3                Pedro Malazartes
 * Peo lart          Roberta Rantula
 * drMazaes          Jucimar Telinho
 * RortRaul
 * bea nta
 * JumaTenh
 * cir lio
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //String myPackage = strings._2722_evergreen_trick.Main.class.getPackage().getName().replace(".", "/");
        //FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri2722.txt");
        //BufferedReader in = new BufferedReader(new InputStreamReader(stream));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(in.readLine());
        String childrenName = "";

        for (int i = 0; i<N; i++) {
            String firstLine = in.readLine();
            String secondLine = in.readLine();
            int flength = firstLine.length();
            int slength = secondLine.length();
            int cont = 0;
            String s;
            for (int j = 0; j < (flength / 2); j++) {
                String f = firstLine.substring(cont, ((cont%flength)+2));
                if ((cont%slength)+2 > slength) {
                    s = secondLine.substring(cont, ((cont%slength)+1));
                } else {
                    s = secondLine.substring(cont, ((cont%slength)+2));
                }
                childrenName += (f + s);
                cont+=2;
            }
            out.write(childrenName + "\n");
            childrenName = "";
        }
        in.close();
        out.flush();
    }
}
