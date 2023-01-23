// [S5]PLAYERJINAH'S BOTTLEGROUNDS
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test15803 {

    static double[] p_x = new double[3];
    static double[] p_y = new double[3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            p_x[i] = Integer.parseInt(st.nextToken());
            p_y[i] = Integer.parseInt(st.nextToken());
        }

        if(p_x[0]==p_x[1] || p_x[1]==p_x[2] || p_x[2]==p_x[0]) {
            if(p_x[0]==p_x[1] && p_x[1]==p_x[2])
                System.out.println("WHERE IS MY CHICKEN?");
            else
                System.out.println("WINNER WINNER CHICKEN DINNER!");
        }

        else if(p_y[0]==p_y[1] || p_y[1]==p_y[2] || p_y[2]==p_y[0]) {
            if(p_y[0]==p_y[1] && p_y[1]==p_y[2])
                System.out.println("WHERE IS MY CHICKEN?");
            else
                System.out.println("WINNER WINNER CHICKEN DINNER!");
        }

        else {
            if((p_y[1]-p_y[0])/(p_x[1]-p_x[0])==(p_y[2]-p_y[0])/(p_x[2]-p_x[0]))
                System.out.println("WHERE IS MY CHICKEN?");
            else
                System.out.println("WINNER WINNER CHICKEN DINNER!");
        }

    }
}
