import java.util.*;

import java.io.*;

class tracem {

    public static void main(String args[]) {

        Scanner obj = new Scanner (System.in);

        System.out.println("Enter the number of entries:");

        int n = obj.nextInt();

        int[][] a=new int[10][10];

        int i,j,trace=0 ;

        

        for(i=0;i<n;i++)

            for(j=0;j<n;j++)

                {

                System.out.println("Enter the [" + (i)+"]["+(j)+"] element of matrix A :");

                 a[i][j]=obj.nextInt();

                }

        for(i=0;i<n;i++)

            for(j=0;j<n;j++)

                if (i==j)

                    trace+=a[i][j];

        System.out.println(" Trace:"+trace);

    }

}
