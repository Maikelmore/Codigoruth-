package arrays;

public class Ejer3Arrays2v2 {
    public static void main(String[] args) {
        String borrasca="Filomena";
        char[] arrayChar = new char [borrasca.length()]; 
        System.out.print("arrayChar = ");

        for (int i=0; i<borrasca.length(); i++){
            arrayChar[i] = borrasca.charAt(i);
            System.out.print( arrayChar[i]);
        }
        System.out.println("\nString borrasca="+borrasca);

    }
}
