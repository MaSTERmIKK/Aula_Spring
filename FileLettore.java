import java.io.*;

public class FileLettore {
    public static void main(String[] args) {
        System.out.println("Inserisci il nome del file:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        try {
            fileName = reader.readLine();
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close(); // Chiusura del bufferedReader
        } catch (FileNotFoundException e) {
            System.out.println("Il file " + fileName + " non è stato trovato.");
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file.");
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Errore nella chiusura del BufferedReader.");
            }
        }
    }
}
