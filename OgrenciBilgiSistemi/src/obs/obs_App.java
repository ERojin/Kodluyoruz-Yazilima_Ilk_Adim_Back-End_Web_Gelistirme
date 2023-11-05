package obs;

public class obs_App {
    public static void run()
    {
        Course math = new Course("Matematik", "MAT101", "MAT");
        Course physics = new Course("Fizik", "FZK101", "FZK");
        Course chemistry = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Çelik", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Cengiz Yılmaz", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Eylül Rojin Gündüz", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Ayşe Kaya", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();
    }
}
