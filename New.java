import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class New{

    public static void main(String args[]) throws IOException {
        
        //usingInputsStreamReader();

        //usingFileReader();
       // usingBufferReader();

       //BufferedReaderFile();

        //usingFileWriter();

       // usingBufferedWriter();
    }


    private static void usingFileWriter() {
        try(FileWriter fw =new FileWriter("new.txt",true)) {
            String str="To awaken the students to the reality of identifying their hidden potentials and talents through meticulous and systematic grooming ";
            fw.append("\nHello World");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void BufferedReaderFile() throws FileNotFoundException, IOException {
        try(BufferedReader br =new BufferedReader(new FileReader("notes.txt"))) {

            String str=br.readLine();
            System.out.println(str);
            while(br.ready()) {
                str=br.readLine();
                System.out.println(str);
            }

        }

        catch(Exception e) {
            e.printStackTrace();
        }

        }

    private static void usingBufferReader() {

        try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))){
        String str =br.readLine();
        System.out.println(str);
        }
       
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void usingFileReader() {
        try(FileReader fr = new FileReader("C:\\Users\\STUDENT\\Desktop\\purna\\filehandling\\notes.txt"))  {

            int letters;
            letters = fr.read();
            System.out.println((char) letters);

            while(fr.ready()) {
                letters = fr.read();
                System.out.println((char) letters);
            }

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static void usingInputsStreamReader() {
       try( InputStreamReader isr=new InputStreamReader(System.in)){
        int letter;
        letter=isr.read();
        System.out.println((char) letter);

        while(isr.ready()) {
            letter=isr.read();
            System.out.println((char) letter);
        }

        letter=isr.read();System.out.println((char) letter);
        }  
          catch (IOException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
    }
}
}