package obs;

public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;

    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = mat;
        this.physics = fizik;
        this.chemistry = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100)
            this.math.note = math;

        if (physics >= 0 && physics <= 100)
            this.physics.note = physics;

        if (chemistry >= 0 && chemistry <= 100)
            this.chemistry.note = chemistry;

    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0)
            System.out.println("Notlar tam olarak girilmemiş");
         else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Ortalama : %f%n ", this.avarage);
            if (this.isPass)
                System.out.println("Sınıfı Geçti. ");
            else
                System.out.println("Sınıfta Kaldı.");

        }
    }

    public void calcAvarage() {
        this.avarage = (this.physics.note + this.chemistry.note + this.math.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.printf("Öğrenci : %s%n" , this.name);
        System.out.printf("Matematik Notu : %d%n " , this.math.note);
        System.out.printf("Fizik Notu : %d%n " ,this.physics.note);
        System.out.printf("Kimya Notu : %d%n " , this.chemistry.note);
    }

}
