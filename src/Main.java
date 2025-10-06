import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String firstName;
    String middleName;
    String lastName;
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter your first name: ");
      firstName = scanner.nextLine();

      System.out.print("Enter your middle name: ");
      middleName = scanner.nextLine();

      System.out.print("Enter your last name: ");
      lastName = scanner.nextLine();
    }

    StringBuilder builder = new StringBuilder();
    builder.append(firstName);
    builder.append(" ");
    builder.append(middleName);
    builder.append(" ");
    builder.append(lastName);

    String fullName = builder.toString();

    System.out.format("Your full name is %s\n", fullName);
  }
}
