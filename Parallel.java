import java.io.IOException;
import java.util.ArrayList;

public class Parallel implements Runnable{

public static ArrayList<String> allLists = new ArrayList<String>();
public static String fileName;
//constructor 

public Parallel(ArrayList<String> a, String fileName){
	allLists = a;
	Parallel.fileName = fileName;
} 


public ArrayList<String> arrayAdd() throws IOException{
			allLists.addAll(FileHandling.readLines(fileName));
			return allLists;
} 	

public void run(){
	try{
		arrayAdd();
	}
	catch(IOException e){
		e.printStackTrace();
	}
	}

}