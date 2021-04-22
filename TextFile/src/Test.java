import java.io.*;

public class Test {
//    public static void main(String[] args) {
//
//       try {
//           FileWriter writer = new FileWriter("Hello1.txt");
//           writer.write("Hello !");
//           writer.close();
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
//    }
//    public static void main(String[] args) {
//
//        File file1 = new File("C:/File/demo1.txt");
//        File file2 = new File("C:/java/demo1.txt");
//        if(file1.compareTo(file2) == 0) {
//            System.out.println("Both paths are same!");
//        } else {
//            System.out.println("Paths are not same!");
//        }
//    }

    public static void main(String[] args)
            throws Exception {
        File file = null;
        File dir = new File("C:/newfile.txt");
        file = File.createTempFile
                ("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }
}
