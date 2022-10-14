public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    int sozluNote;

    double oran;

    Course(String name, String code, String prefix, double oran)
    {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.sozluNote=0;
        this.oran = oran;

    }

    void printTeacherInfo()
    {
        this.teacher.print();
    }

    void addTeacher(Teacher teacher)
    {
        if(teacher.branch.equals((this.prefix)))
        {
            this.teacher = teacher;
            printTeacherInfo();
        }
        else
        {
            System.out.println("Öğretmen branşı ile kurs uyuşmuyor!");
        }


    }

}
