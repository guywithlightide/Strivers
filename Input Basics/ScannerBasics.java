import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
public class ScannerBasics {
    public static void main(String[] args) throws Exception{

        /**
         * Basic IO Ops
         */
        // Scanner sc = new Scanner(System.in);
        // System.out.print(sc.next());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println(bufferedReader.readLine());
        
        bufferedReader = new BufferedReader(new FileReader("file.txt"));
        if(bufferedReader.markSupported()){
            bufferedReader.mark(600);
        }
        
        // char [] sen = new char[100];
        // System.out.println("Chars read = "+bufferedReader.read(sen, 5, 20) );
        // for (int i=0; i<sen.length; i++) {
        //     System.out.print(sen[i]);
        // }
        
        // This means 0 + ASCII of 5th character which is 76 for L
        // System.out.println(+sen[5]);
        bufferedReader.reset();

        bufferedReader.skip(20);
        
        System.out.print(bufferedReader.readLine());
        bufferedReader.reset();
        System.out.print(bufferedReader.readLine());
        



        bufferedReader.close();

    }
}
