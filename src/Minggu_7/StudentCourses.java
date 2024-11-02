package Minggu_7;
import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String courseName;
    int sks;
    double grade;

    Course(String courseName, int sks, double grade) {
        this.courseName = courseName;
        this.sks = sks;
        this.grade = grade;
    }
}

class CourseItem {
    Course course;

    CourseItem(Course course) {
        this.course = course;
    }

    double getGrade() {
        return course.grade;
    }

    int getSKS() {
        return course.sks;
    }

    String getCourseName() {
        return course.courseName;
    }
}

public class StudentCourses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CourseItem> courseList = new ArrayList<>();

        // Input for student's name and semester
        System.out.print("Masukkan nama mahasiswa: ");
        String studentName = scanner.nextLine();

        System.out.print("Masukkan semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Loop to input courses
        String addMore;
        do {
            System.out.print("Masukkan nama mata kuliah: ");
            String courseName = scanner.nextLine();

            System.out.print("Masukkan SKS: ");
            int sks = scanner.nextInt();

            System.out.print("Masukkan nilai: ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Add the course to the list
            Course course = new Course(courseName, sks, grade);
            courseList.add(new CourseItem(course));

            System.out.print("Tambahkan mata kuliah lain? (y/n): ");
            addMore = scanner.nextLine();
        } while (addMore.equalsIgnoreCase("y"));

        // Display the student's information and courses
        System.out.println("=======================================================");
        System.out.println("\nNama Mahasiswa: " + studentName);
        System.out.println("Semester: " + semester);
        System.out.println("-------------------------------------------------------");
        System.out.println("Daftar Mata Kuliah:");
        System.out.printf("%-20s %-5s %-5s\n", "Nama Mata Kuliah", "SKS", "Nilai");
        
        for (CourseItem item : courseList) {
            System.out.printf("%-20s %-5d %-5.2f\n", item.getCourseName(), item.getSKS(), item.getGrade());
        }
        System.out.println("=======================================================");

        scanner.close();
    }
}
