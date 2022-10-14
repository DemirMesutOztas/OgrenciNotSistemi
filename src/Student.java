
public class Student {
    Course c1,c2,c3;
    String name;
    int stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, int stuNo, String classes, Course c1,Course c2, Course c3)
    {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3, int sozluc1, int sozluc2, int sozluc3)
    {

        if(note1>=0 && note1  <=100 && sozluc1>=0 && sozluc1<=100)
        {
            c1.note = note1;
            c1.sozluNote = sozluc1;


        }
        if(note2>=0 && note2 <=100 && sozluc2>=0 && sozluc2<=100)
        {
            c2.note = note2;
            c2.sozluNote = sozluc2;
        }
        if(note3>=0 && note3<=100 && sozluc3>=0 && sozluc3<=100)
        {
            c3.note = note3;
            c3.sozluNote = sozluc3;
        }


    }

    void printNote()
    {
        System.out.println("c1.name" +"Notu: "+ this.c1.note);
        System.out.println("c2.name" +"Notu: "+ this.c2.note);
        System.out.println("c3.name" +"Notu: "+ this.c3.note);
        System.out.println("Ortalamanız: " + this.average);
    }

    void isPass()
    {
            this.average = (((this.c1.note*(1-this.c1.oran)+this.c1.sozluNote*this.c1.oran)+(this.c2.note*(1-this.c2.oran)+this.c2.sozluNote*this.c2.oran)+(this.c3.note*(1-this.c3.oran)+this.c3.sozluNote*this.c3.oran)))/3.0;
            if(this.average>55)
            {
                System.out.println("Sınıfı geçtiniz");
                this.isPass=true;
            }
            else
            {
                System.out.println("Sınıfta kaldınız");
                this.isPass=false;
            }

    }





}
