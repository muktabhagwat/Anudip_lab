package Collection;
import java.util.ArrayList; 
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        
        List<String> studentNames = new ArrayList<>();
		
		// studentNames.add("Mukta");
		 //studentNames.add("Shita");
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the How many Students you want:");
		n=sc.nextInt();
		
		System.out.println("Enter the Student Name:");
		sc.nextLine();
		
        for( i=0;i<n;i++)
		{
			String c=sc.nextLine();
			studentNames.add(c);
		}

        System.out.println("Original Student Names: " + studentNames);

        Iterator<String> iterator = studentNames.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("S")||name.startsWith("s")) {
                iterator.remove();
            }
        }

        	//2ND Way:-
        	//studentNames.removeIf(name -> name.startsWith("S"));
       
        System.out.println("Modified Student Names: " + studentNames);
    }
}

    

     

    