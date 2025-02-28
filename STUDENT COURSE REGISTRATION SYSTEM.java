import java.util.*;
class Course 
{
    private String courseCode;
    private String title;
    private String description;
    private int capacity;
    private String schedule;
    private Set<Integer> registeredStudents;
    public Course(String courseCode, String title, String description, int capacity, String schedule) 
    {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.registeredStudents = new HashSet<>();
    }

    public String getCourseCode() 
    {
        return courseCode;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getDescription() 
    {
        return description;
    }

    public int getCapacity() 
    {
        return capacity;
    }

    public String getSchedule() 
    {
        return schedule;
    }

    public int getAvailableSlots() 
    {
        return capacity - registeredStudents.size();
    }

    public boolean registerStudent(int studentId) 
    {
        if (registeredStudents.size() < capacity) 
        {
            registeredStudents.add(studentId);
            return true;
        }
        return false;
    }

    public boolean dropStudent(int studentId) 
    {
        return registeredStudents.remove(studentId);
    }

    @Override
    public String toString() 
    {
        return String.format("%s - %s\nDescription: %s\nSchedule: %s\nAvailable Slots: %d/%d",
                courseCode, title, description, schedule, getAvailableSlots(), capacity);
    }
}
class Student 
{
    private int studentId;
    private String name;
    private Set<String> registeredCourses;
    public Student(int studentId, String name) 
    {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new HashSet<>();
    }

    public int getStudentId() 
    {
        return studentId;
    }

    public String getName() 
    {
        return name;
    }

    public Set<String> getRegisteredCourses() 
    {
        return registeredCourses;
    }

    public boolean registerCourse(String courseCode)
    {
        return registeredCourses.add(courseCode);
    }

    public boolean dropCourse(String courseCode) 
    {
        return registeredCourses.remove(courseCode);
    }

    @Override
    public String toString() 
    {
        return String.format("Student ID: %d\nName: %s\nRegistered Courses: %s",
                studentId, name, registeredCourses);
    }
}
public class CourseRegistrationSystem 
{
    private static Map<String, Course> courses = new HashMap<>();
    private static Map<Integer, Student> students = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        initializeCourses();
        initializeStudents();

        while (true) 
        {
            System.out.println("----- Course Registration System -----");
            System.out.println("1. Display Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. Drop a Course");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    displayAvailableCourses();
                    break;
                case 2:
                    registerForCourse();
                    break;
                case 3:
                    dropCourse();
                    break;
                case 4:
                    displayStudentDetails();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeCourses() 
    {
        courses.put("CSCI101", new Course("CSCI101", "Introduction to Computer Science",
                "Basic concepts of programming and algorithms.", 30, "Mon/Wed 10:00 AM - 11:30 AM"));
        courses.put("MATH101", new Course("MATH101", "Calculus I",
                "Introduction to differential and integral calculus.", 25, "Tue/Thu 1:00 PM - 2:30 PM"));
        courses.put("PHYS101", new Course("PHYS101", "Physics I",
                "Fundamentals of mechanics and thermodynamics.", 20, "Mon/Wed 3:00 PM - 4:30 PM"));
    }

    private static void initializeStudents() 
    {
        students.put(1001, new Student(1001, "Alice Johnson"));
        students.put(1002, new Student(1002, "Bob Smith"));
    }

    private static void displayAvailableCourses() 
    {
        System.out.println("\n----- Available Courses -----");
        for (Course course : courses.values()) 
        {
            System.out.println(course);
            System.out.println();
        }
    }

    private static void registerForCourse() 
    {
        System.out.print("Enter your Student ID: ");
        int studentId = scanner.nextInt();
        if (!students.containsKey(studentId)) 
        {
            System.out.println("Student ID not found.");
            return;
        }

        System.out.print("Enter the Course Code to register: ");
        String courseCode = scanner.next();
        if (!courses.containsKey(courseCode))
        {
            System.out.println("Course not found.");
            return;
        }

        Course course = courses.get(courseCode);
        if (course.registerStudent(studentId)) 
        {
            students.get(studentId).registerCourse(courseCode);
            System.out.println("Registration successful!");
        } 
        else
        {
            System.out.println("Registration failed. No available slots.");
        }
    }

    private static void dropCourse() 
    {
        System.out.print("Enter your Student ID: ");
        int studentId = scanner.nextInt();
        if (!students.containsKey(studentId)) 
        {
            System.out.println("Student ID not found.");
            return;
        }

        System.out.print("Enter the Course Code to drop: ");
        String courseCode = scanner.next();
        if (!courses.containsKey(courseCode)) 
        {
            System.out.println("Course not found.");
            return;
        }

        Course course = courses.get(courseCode);
        if (course.dropStudent(studentId)) 
        {
            students.get(studentId).dropCourse(courseCode);
            System.out.println("Course dropped successfully!");
        } 
        else
        {
            System.out.println("You are not registered for this course.");
        }
    }

    private static void displayStudentDetails() 
    {
        System.out.print("Enter your Student ID: ");
        int studentId = scanner.nextInt();
        if (!students.containsKey(studentId)) 
        {
            System.out.println("Student ID not found.");
            return;
        }

        System.out.println("\n----- Student Details -----");
        System.out.println(students.get(studentId));
    }
}
