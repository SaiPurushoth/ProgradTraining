import java.io.*;
import java.util.*;
public class FileHandling {

	public static void main(String[] args) {
		 try
		  {
		   File f=new File("stud.txt");
		   
			  FileWriter wr=new FileWriter(f);
			  
			
			Scanner sc = new Scanner(System.in);
			int roll_no,m1,m2,tot;
		   
		   String name;
		   
		   System.out.println("Roll No  Name M1 M2 Total");
		   for(int i=1; i<2; i++)
		   {
		    roll_no = sc.nextInt();
		    wr.write(roll_no);
		    name = sc.next();
		    wr.write(name);
		    m1 = sc.nextInt();
		    wr.write(m1);
		    m2 = sc.nextInt();
		    wr.write(m2);
		    tot=m1+m2;
		    wr.write(tot);
		   
		    System.out.print("total marks= 1"+tot);
		   }
		   while (sc.hasNextLine())
			      System.out.println(sc.nextLine());

		   sc.close();
		   wr.close();
		 
		  }
		  catch(FileNotFoundException e)
		  {
			  System.out.println(e);
		  }
		  catch(IOException e)
		  {
			  System.out.println(e);
		  }
		  
		  catch(InputMismatchException e){
			  System.out.println("invalid input datatypes");
			  
		}
		 
		  catch(Exception ee){
		   System.out.println(ee);
		  }

	}

}
