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

        /* Going over all temperatures in the array above
         * And finding avg temperature of the array */

        System.out.println("List of temperatures in the past 7 days (Array):");
        double totalArray=0.0d;
        int index=1;
        for (double temp : temp1) {
            System.out.println("Temperature of " + "day " + index + " is " + temp);
            totalArray+=temp;
            index++;
        }
        System.out.println("The average temperature of the list above is = " + (totalArray / temp1.length));

        /* Create ArrayList and assign temperatures to it */
        ArrayList<Double> temp2 = new ArrayList<Double>();
        temp2.add(9.0d);
        temp2.add(8.0d);
        temp2.add(12.0d);
        temp2.add(12.0d);
        temp2.add(10.0d);
        temp2.add(10.0d);
        temp2.add(8.0d);

        /* Going over all temperatures in the ArrayList above
        * And calculating average*/
        double totalList=0.0d;
        System.out.println("\nList of temperatures in the past 7 days (ArrayList):");
        index=1;
        for (double temp : temp2){
            System.out.println("Temperature of " + "day " + index + " is " + temp);
            totalList+=temp;
            index++;
        }
        System.out.println("The average temperature of the ArrayList above is = " + (totalList / temp2.size()));

    }
}
