package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String usName;
        String usPassword;

        User u = new User();
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan Username : ");
        usName = s.nextLine();
        u.setUsername(usName);
        System.out.print("Masukkan Password : ");
        usPassword = s.nextLine();
        u.setPassword(usPassword);


        u.pengecekkanLogin(usName, usPassword);

    }
}
