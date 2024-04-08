
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.*;
import java.io.IOException;




public class chTest{
public static void main (String[]args) throws Exception
{

// making three files for the three regions
    FileReader east=new FileReader("inputFile.txt");
    BufferedReader br=new BufferedReader(east);
    FileReader midwest=new FileReader("Midwest.txt");
    BufferedReader mid =new BufferedReader(midwest);
FileReader west=new FileReader("West.txt");
BufferedReader left =new BufferedReader(west);
FileWriter end=new FileWriter("allregions.txt");
PrintWriter last=new PrintWriter(end);
    // end of making files


// these three declarations are for the east region
String eastString;
String eastWins;
double Wins;

//the loop for the east file "inputfile.txt"
    while ((eastString=br.readLine())!=null) {
      eastWins=br.readLine();
     Wins=Double.parseDouble(eastWins);
     // the print write to assign the info into a new file
     last.println("Name: "+eastString+" Region:East ");
 last.println("- Wins " + Wins);
 last.flush();
    }
    br.close();
   
    //the declaraitons for the midwest file
    String midString;
    String  midWins;
    double midparse;
    
    //the loop to read the midwest file "midwest.txt"
    while ((midString=mid.readLine())!=null) {
        midWins=mid.readLine();
        midparse=Double.parseDouble(midWins);
       // the print writer to assign the info to a new file
        last.println("name: "+ midString+" Region:Midwest");
 last.println("- Wins - "+midparse);
 last.flush();
        
    }
    mid.close();
    
    // the west region declarations
String westName;
String westWins;
double westnum;

//loop to read stuff from the west region file "West.txt"
    while ((westName=left.readLine())!=null) {
        westWins=left.readLine();
        westnum=Double.parseDouble(westWins);
      //the print writer to assign the info to new file
        last.println("name: "+westName+ " Region:West ");
 last.println("- Wins- "+westWins);
 last.flush();

    }
    west.close();


    



}
}