import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        double[] temp1 = new double[7];
        temp1[0]=9.0d;
        temp1[1]=8.0d;
        temp1[2]=12.0d;
        temp1[3]=12.0d;
        temp1[4]=10.0d;
        temp1[5]=10.0d;
        temp1[6]=8.0d;

        /* Going over all temperatures in the array above */

        System.out.println("List of temperatures in the past 7 days (Array):");
        for (int i = 0; i < 7; i++) {
            System.out.println(temp1[i]);
        }

        /* Find avg temperature of the array */
        double totalArray=0.0d;
        int counter = 0;
        for (int i = 0; i < 7; i++) {
            totalArray+=temp1[i];
            counter+=1;
        }
        System.out.println("The average temperature of the list above is = " + (totalArray / counter));

        /* Create ArrayList and assign temperatures to it */
        ArrayList<Double> temp2 = new ArrayList<Double>();
        temp2.add(9.0d);
        temp2.add(8.0d);
        temp2.add(12.0d);
        temp2.add(12.0d);
        temp2.add(10.0d);
        temp2.add(10.0d);
        temp2.add(8.0d);

        /* Going over all temperatures in the ArrayList above */
        System.out.println("List of temperatures in the past 7 days (Array):");
        for (int i = 0; i < temp2.size(); i++) {
            System.out.println(temp2.get(i));
        }

        double totalList=0.0d;
        for (int i = 0; i < temp2.size(); i++) {
            totalList+=temp2.get(i);
        }
        System.out.println("The average temperature of the list above is = " + (totalList / temp2.size()));
    }
}
