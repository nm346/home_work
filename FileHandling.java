import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;

public class FileHandling implements Serializable
{
	
	
	public static ArrayList<String> allLists = new ArrayList<String>();

	private static final long serialVersionUID = 1L;

	/* 
	 * public static ArrayList<String> arrayAdd(){ // for threads
		for(int i = 1; i <= 4; i++){
			allLists.addAll(readLines("file"+i+".txt"));
		}
		return allLists;
	} 	
	*/
	
	public FileHandling(ArrayList<String> all, String file){ //CONSTRUCTOR
	
		}
	
	public static ArrayList<String> sequentially(){
		ArrayList<String> list1 = readLines("file1.txt"); //for thread do all at the same time,
		ArrayList<String> list2 = readLines("file2.txt");
		ArrayList<String> list3 = readLines("file3.txt");
		ArrayList<String> list4 = readLines("file4.txt");
		allLists.addAll(list1);//for thread do all at the same time,
		allLists.addAll(list2);
		allLists.addAll(list3);
		allLists.addAll(list4);
		
		return allLists;
		
	}
	/*
	public static ArrayList<String> parallel(){
		Thread[] threads = new Thread[4];

		for(int i = 1; i < 5; i++){
			Parallel p = new Parallel(allLists, "file"+i+".txt");
			threads[i] = new Thread(p);
			threads[i].start();
			//p.arrayAdd();
		}
		

		return allLists;
	}*/
	public static void main(String[] args)
	{
		
		
		System.out.println(sequentially());
		//System.out.println(allLists);
		binarySerialize(allLists, "serialize.bin");

	}

	public static void binarySerialize(ArrayList<String> lists, String fileName)
	{

		Path path = FileSystems.getDefault().getPath("/Users/NathanMay/Desktop/University/workspace/FileHandling/Mini Project Part 1",
				fileName);
		try
		{
			ObjectOutputStream objectStream = new ObjectOutputStream(Files.newOutputStream(path));
			objectStream.writeObject(lists);
		} catch (IOException exception)
		{
			System.out.println("Something went wrong");
			exception.printStackTrace();
		}

	}

	public static ArrayList<String> readLines(String fileName)
	{
		Path path = FileSystems.getDefault().getPath("/Users/NathanMay/Desktop/University/workspace/FileHandling/Mini Project Part 1",
				fileName);
		// System.out.println(path.toString());

		ArrayList<String> words = new ArrayList<String>();
		try
		{
			BufferedReader fileReader = Files.newBufferedReader(path);
			for (String line; (line = fileReader.readLine()) != null;)
			{
				words = append1(words, line);
			}
			fileReader.close();
		} catch (IOException exception)
		{
			System.out.printf("Error");
			exception.printStackTrace();
		}
		int min = 0;
		int max = words.size();
		max -= 1;
		Random random = new Random();

		ArrayList<String> fiftyWords = new ArrayList<String>();
		for (int i = 0; i < 50; i++)
		{
			int n = random.nextInt(max) + min;
			fiftyWords.add(words.get(n));
		}

		return fiftyWords;
	}

	static ArrayList<String> append1(ArrayList<String> l0, String o)
	{
		ArrayList<String> l = l0;
		l.add(l.size(), o);
		return l;

	}
	/*
	 * public static void thread(ArrayList<String>[] lists){ for(int i = 0; i <
	 * lists.length; i++){ //Threads FileThreads filethreads = new
	 * FileThreads(lists[i]); try { filethreads.readLines(lists[i].getPath); }
	 * catch (IOException e1) { // TODO Auto-generated catch block
	 * e1.printStackTrace(); }
	 * 
	 * }
	 * 
	 * }
	 */

}

