package com.radhsyn83;

public class User {

    private static final String u = "RizkiAdam";
    private static final String p = "terbaikselalu";

    private String username;
    private String password;
    private boolean statusAkun;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean cekAkun(String parUserName, String parPassword) {
        if (u.equals(parUserName) && p.equals(parPassword))
            return true;
        else
            return false;
    }

    private void hasilLogin(boolean status, String parUserName) {
        if (status) {
            System.out.println("***** HALO " + parUserName.toUpperCase() + " *****");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Oops, Username dan Password yang anda masukkan salah.");
        }
    }

    public void pengecekkanLogin(String parUserName, String parPassword) {
        this.username = parUserName;
        this.password = parPassword;
        statusAkun = cekAkun(username, password);

        hasilLogin(statusAkun, parUserName);
    }
}
