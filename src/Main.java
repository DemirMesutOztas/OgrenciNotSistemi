public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT", 0.20);
        Course fizik = new Course("Fizik", "FZK101", "FZK",0.30);
        Course kimya = new Course("Kimya", "KMY101", "KMY",0.15);

        Teacher t1 = new Teacher("Mahmut Hoca", "MAT", "021231");
        Teacher t2 = new Teacher("Fatma Ayşe", "FZK", "646464654");
        Teacher t3 = new Teacher("Ali Veli", "KMY", "56545456");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40,100,50,60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40,90,78,80);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(100,100,100,60,60,60);
        s3.isPass();

        s3.printNote();
    }
}