import java.io.*;
// public class CopyFile {

//    public static void main(String args[]) throws IOException {
//       FileReader in = null;
//       FileWriter out = null;

//       try {
//          in = new FileReader("input.txt");
//          out = new FileWriter("output.txt");
         
//          int c;
//          while ((c = in.read()) != -1) {
//             out.write(c);
//          }
//       }finally {
//          if (in != null) {
//             in.close();
//          }
//          if (out != null) {
//             out.close();
//          }
//       }
//    }
// }

// public class CopyFile {

//     public static void main(String args[]) throws IOException {  
//        FileInputStream in = null;
//        FileOutputStream out = null;
 
//        try {
//           in = new FileInputStream("input.txt");
//           out = new FileOutputStream("output.txt");
          
//           int c;
//           while ((c = in.read()) != -1) {
//              out.write(c);
//           }
//        }finally {
//           if (in != null) {
//              in.close();
//           }
//           if (out != null) {
//              out.close();
//           }
//        }
//     }
//  }


public class latihan1 {

   public static void main(String args[]) throws IOException {
      InputStreamReader cin = null;

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'q' to quit.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
   }
}