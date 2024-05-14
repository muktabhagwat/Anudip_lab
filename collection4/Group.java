package collection4;

public class Group {
    public static void main(String[] args) {
        int rollNumber = 12; // Change this value to test with different roll numbers

        String group = "";
        int remainder = rollNumber % 4;

        switch (remainder) {
            case 1:
                group = "Sapphire";
                break;
            case 2:
                group = "Perl";
                break;
            case 3:
                group = "Ruby";
                break;
            case 0:
                group = "Emerald";
                break;
        }

        System.out.println("Roll number " + rollNumber + " belongs to group: " + group);
    }
}
