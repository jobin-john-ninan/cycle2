import java.util.*;

import java.io.*;

class replacestring {

    public static void main(String[] args) {

        Scanner obj = new Scanner (System.in);

        System.out.println("Enter the string:");

        String str = obj.nextLine();

        int strLength = str.length();

        System.out.println("Enter the char to replace:");

        String str1 = obj.nextLine();

        System.out.println("Enter the new char:");

        String str2 = obj.nextLine();

        System.out.println(str.replace(str1,str2));

    }

}
