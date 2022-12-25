import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.Random;
import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello welcome to this program!!!");
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
//        User Input stored in 'input' later converted to char array named 'inp'.
        System.out.println("Enter code to Encrypt");
        String input = sc.nextLine();
        char[] inp = input.toCharArray();
//        Key which is integer array initialised.
        Integer[] key = new Integer[input.length()];
//        Sum of all the elements in key, later used to find the size of output(encrypted) string.
        int sum=0;
        for (int i=0;i<key.length;i++){
            key[i]= rd.nextInt(50);
            sum+=key[i];
        }

        char[] out = new char[sum+inp.length];

//        Encrypted String formulation
        int k=0;
        for (int i =0; i<input.length();i++){
            for (int j=0;j<key[i];j++){
                out[k++]=(char) (rd.nextInt(93)+33);    //Random Letter inserted.
            }
            (out[k++])= (char)((int)(inp[i]) + key[i]);
        }
//      Encrypted string displayed.
        for (int i=0;i<out.length;i++){
            System.out.print(out[i]);
        }
        System.out.println("");

//        Private Key is stored in txt file which will be sent to the user.
        File file = new File("myfile.txt");
        FileWriter myWriter = new FileWriter("myfile.txt");
        myWriter.write(""+inp.length);
        myWriter.write("@");

        for (int i=0;i<key.length;i++){
//            System.out.print(key[i]);
            myWriter.write(""+key[i]);
            myWriter.write("@");
        }
        myWriter.close();
        System.out.println("");

    }
}