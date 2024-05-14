package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GroupAssignment {
    public static void main(String[] args) {
        
    	
        Set<Integer> sapphireSet = new HashSet<>();
        Set<Integer> perlSet = new HashSet<>();
        Set<Integer> rubySet = new HashSet<>();
        Set<Integer> emeraldSet = new HashSet<>();

        
        initializePatternSets(sapphireSet, perlSet, rubySet, emeraldSet);

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the roll number: ");
        int rollNumber = scanner.nextInt();

        String group = determineGroup(rollNumber, sapphireSet, perlSet, rubySet, emeraldSet);

        
        System.out.println("The student with roll number " + rollNumber + " belongs to the " + group + " group.");

       
        scanner.close();
    }

   
    private static void initializePatternSets(Set<Integer> sapphireSet, Set<Integer> perlSet,
                                              Set<Integer> rubySet, Set<Integer> emeraldSet) {
        for (int i = 1; i <= 25; i += 4) {
            sapphireSet.add(i);
            perlSet.add(i + 1);
            rubySet.add(i + 2);
            emeraldSet.add(i + 3);
        }
    }
    private static String determineGroup(int rollNumber, Set<Integer> sapphireSet,
                                         Set<Integer> perlSet, Set<Integer> rubySet,
                                         Set<Integer> emeraldSet) {
        if (sapphireSet.contains(rollNumber)) {
            return "Sapphire";
        } else if (perlSet.contains(rollNumber)) {
            return "Perl";
        } else if (rubySet.contains(rollNumber)) {
            return "Ruby";
        } else if (emeraldSet.contains(rollNumber)) {
            return "Emerald";
        } else {
            return "Invalid roll number";
        }
    }
}
