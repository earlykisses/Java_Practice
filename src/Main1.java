import java.util.Scanner;

class Room {
    // Attributes
    private int roomno;
    private String roomtype;
    private double roomarea;
    private boolean ACmachine;

    // Method to set data
    public void setData(int rno, String rtype, double rarea, boolean ac) {
        roomno = rno;
        roomtype = rtype;
        roomarea = rarea;
        ACmachine = ac;
    }

    // Method to display data
    public void displayData() {
        System.out.println("Room Number: " + roomno);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Room Area: " + roomarea + " sq.ft");
        System.out.println("AC Machine: " + (ACmachine ? "Yes" : "No"));
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Room object
        Room r1 = new Room();

        // Taking input from user
        System.out.print("Enter Room Number: ");
        int roomno = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Room Type: ");
        String roomtype = sc.nextLine();

        System.out.print("Enter Room Area: ");
        double roomarea = sc.nextDouble();

        System.out.print("Is there an AC Machine? (true/false): ");
        boolean ACmachine = sc.nextBoolean();

        // Set data using member function
        r1.setData(roomno, roomtype, roomarea, ACmachine);

        // Display data
        System.out.println("\n--- Room Details ---");
        r1.displayData();

        sc.close();
    }
}

