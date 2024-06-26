package org.example;

public class StringFormat {
    public String nameCase(String name){// jonas kornelijus vaisGANTAS->Jonas Kornelijus Vaisgantas
        return name;
    }
    public static String formatPhoNo(String phoNo){
        //Tikrina ar nėra turščias laukas
        if (phoNo == null || phoNo.isEmpty()) {
          throw new IllegalArgumentException("Neįvestas telefono numeris!");
        }
        //Pašalina visus simbolius ir tarpus
       phoNo = phoNo.replaceAll("[^0-9]", "");

        if (phoNo.startsWith("370") && phoNo.length() == 11) {
            return phoNo.substring(3);
        } else if (phoNo.startsWith("00") && phoNo.length() == 10) {
            return phoNo.substring(2);
        } else if (phoNo.startsWith("06") && phoNo.length() == 9) {
            return phoNo.substring(1);
        } else if (phoNo.startsWith("00370") && phoNo.length() == 13) {
            return phoNo.substring(5);
        } else if (phoNo.startsWith("6") && phoNo.length() == 8) {
            return phoNo;
        }
        else {
            return "Netinkamas telefono numeris";
        }
    }

    public boolean formatEmail(String email){
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }
}
