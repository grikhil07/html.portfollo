import java.util.*;

class Students {
    int rollno;
    String name;
    int mark;

    // Constructor
    public Students(int rollno, String name, int mark) {
        this.rollno = rollno;
        this.name = name;
        this.mark = mark;
    }
}

public class RankList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        Students[] students = new Students[n];
        
        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollno = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Mark: ");
            int mark = sc.nextInt();
            students[i] = new Students(rollno, name, mark);
        }
        
        // Sorting students based on marks in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].mark < students[j].mark) {
                    Students temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        
       // Display rank list
        System.out.println("\nRank List:");
        //System.out.println("Roll   Name   Marks   Rank");
        for (int i = 0; i < n; i++) {
            System.out.println("Roll : " + students[i].rollno + ", Name : " + students[i].name + ", Mark : " + students[i].mark + ", Rank : "+(i + 1));
        }
        
        sc.close();
    }
}
