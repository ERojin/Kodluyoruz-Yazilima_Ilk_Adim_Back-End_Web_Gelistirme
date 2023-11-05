package obs;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        }
        else
            System.out.printf("%s Akademisyeni bu dersi veremez.%n", t.name);

    }

    public void printTeacher() {
        if (courseTeacher != null)
            System.out.printf("%s dersinin Akademisyeni : %s%n ", this.name, courseTeacher.name);
         else
            System.out.printf("%s dersine Akademisyen atanmamıştır.", this.name);

    }
}
