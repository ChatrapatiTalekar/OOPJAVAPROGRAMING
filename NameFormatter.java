public class NameFormatter {
    public static void main(String[] args) {
        // Example usage:
        printName("Himanshu Talekar");
        printName("Bill Joy");
    }

    public static void printName(String fullName) {
        // Trim any leading or trailing spaces
        fullName = fullName.trim();

        // Split the full name into first and last name
        String[] names = fullName.split("\\s+");

        // Reformat the name as "<last name>, <first name>"
        String formattedName = names[names.length - 1] + ", " + names[0];

        // Print the formatted name
        System.out.println(formattedName);
        
    }
}
