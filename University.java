class University {

    static String universityName;

    static int totalStudents;
    
    static {
        universityName = "Global Tech University";
        System.out.println("Static Block Executed");
        System.out.println("University Name Initialized: " + universityName);
    }
    {
        System.out.println("Instance Block Executed");
    }
    University() {
        totalStudents++;
        System.out.println("Constructor Executed");
        System.out.println("Student Created. Total Students: " + totalStudents);
        System.out.println();
    }
    static int getTotalStudents() {
        return totalStudents;
    }
    public static void main(String[] args) {

        System.out.println("Main Method Started\n");

        University student1 = new University();
        University student2 = new University();

        System.out.println("Final Total Students: " + University.getTotalStudents());
    }
}
