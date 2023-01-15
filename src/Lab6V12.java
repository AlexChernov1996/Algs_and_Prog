import java.io.*;
class Input{
public static void main(String[] args) throws IOException { // Эксэпшн на случай если файла нет(Можно заменить try catch)
    File inFile = new File("E:\\java\\MyLabs\\MyLabs\\src\\Primer.java");
    File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
BufferedReader br = new BufferedReader(new FileReader(inFile));
BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
PrintWriter pw = new PrintWriter(bw);
String s = null;
    while((s=br.readLine())!=null){
      String s1 = s.replaceAll("[\\s]{2,}", " ");
       pw.println(s1);
    }
    br.close();  pw.close();
    //Delete the original file
    if (!inFile.delete()) {
        System.out.println("Could not delete file");
        return;
      }
      //Rename the new file to the filename the original file had.
      if (!tempFile.renameTo(inFile))
        System.out.println("Could not rename file");
}}