import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) throws Exception{
//        Input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code to decrypt");
        String encrypt = sc.next();

//        Input of KEY from user via a txt file.

        File f = new File("myfile.txt");
        Scanner myReader = new Scanner(f);
        String data = myReader.nextLine();
        String[] data1 = data.split("@");
//        size of key is stored as first integer in txt file.
        int keySize = Integer.parseInt(data1[0]);
        int[] key = new int[keySize];
//        formulation of 'key' array
        for (int k=0;k<keySize;k++){
            key[k]= Integer.parseInt(data1[k+1]);
        }

        int sum=0;
        for (int i=0;i<key.length;i++){
            sum+=key[i];
        }

        char[] arr1 = encrypt.toCharArray();
        char[] arr2 = new char[encrypt.length()-sum];
        int sum2;

//        Decryption Algorithm
        for (int k =0; k<arr2.length;k++){
            sum2=0;
            for (int l=0;l<=k;l++){
                sum2=sum2+key[l];
            }
            sum2= sum2+k;
            (arr2[k])= (char)((int)(arr1[sum2]) - key[k]);
        }
//      Output of Decrypted array
        for (int k=0;k<arr2.length;k++){
            System.out.print(arr2[k]);
        }
        System.out.println("");
    }
}
