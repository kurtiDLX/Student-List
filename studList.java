import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            out.print("1. Add student \n2. Remove student \n3. Clear list\nchoice: ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                out.print("new student: ");
               String newStudent = scanner.nextLine();
                if (studentList.contains(newStudent)) {
                    out.println("this student is already on the list");
                } else {
                    studentList.add(newStudent);
                    out.println("\n" + newStudent + " added to the list\nall list: " + studentList + "\n");
                }
            }
            if (choice.equals("2")) {
                if (studentList.size() > 0) {
                    out.print("\n\t\t\t\t\t\tlist \n");
                    for (String el : studentList)
                        out.println(el);
                    out.print("\nthe name of the student to be deleted: ");
                    String deletedStudent = scanner.nextLine();
                    if (studentList.contains(deletedStudent)) {
                        studentList.remove(deletedStudent);
                        out.println(deletedStudent + " removed\nall list: " + studentList + "\n");
                    } else {
                        out.println("\nSuch a student does not exist\n");
                    }
                } else {
                    out.println("\nlist empty\n");
                }
            }
            if (choice.equals("3")){
                if (studentList.size() > 0) {
                    out.print("\nClear all list? y/n\n enter: ");
                    String clearList = scanner.nextLine();
                    if (clearList.equals("y")) {
                        studentList.clear();
                        out.println("\nlist cleaned!");
                    } else {
                        out.println("\nlist was not cleaned");
                    }
                } else {
                    out.println("\nlist empty\n");
                }
            }
        }
    }
}