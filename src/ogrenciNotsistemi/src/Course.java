public class Course {
    Teacher teacher;





    String name;
    String code;
    String prefix;


    double note;
    //sınıfımzın k
    //onstructuru
    //t1 teachırdne üreitlecek bir sınıf gtemsil edee

    double sNote;
    Course(String name, String code,String prefix ){


        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this .note=0.0;
        this.sNote=0.0;


    }


    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        }
        else{
            System.out.println("öğretmen ve ders bolumu uyuşmADI");
        }

    }
    void printTeacherInfo(){
        this.teacher.print();
    }


}
