public class Student
{
    Course c1;
    Course c2;
    Course c3;
String name;
String stuno;
String classes;
double avarage;
boolean isPass;

Student(String name, String stuno, String classes, Course c1 , Course c2, Course c3) {
    this.name=name;
    this. stuno=stuno;
    this.classes=classes;
    this.c1=c1;
    this.c2=c2;
    this.c3=c3;
    this.avarage=0.0;
    this.isPass=false;

}
void addBulexamplenot(double note1 ,double note2, double note3, double sNot1, double sNot2, double sNot3) {
    if(note1>=0 &&note1<=100){
       this. c1.note = note1;
    }
    if(note2>=0 &&note2<=100) {
       this. c2.note = note2;
    }
    if(note3>=0 &&note3<=100) {
       this. c3.note = note3;
    }

    if (sNot1 >= 0 && sNot1 <= 100)
        this.c1.sNote =sNot1;

    if (sNot2 >= 0 && sNot2 <= 100)
        this.c2.sNote = sNot2;

    if (sNot3 >= 0 && sNot3 <= 100)
        this.c3.sNote = sNot3;

}
void printnote(){
    System.out.println(this.c1.name+" notu"+ this.c1.note);
    System.out.println(this.c2.name+" notu"+ this.c2.note);
    System.out.println(this.c3.name+" notu"+ this.c3.note);
}

    void isPass()
    {
        System.out.println("-------------------------------");
        System.out.println(name);

        double c1=(this.c1.sNote*0.20)+(this.c1.note*0.80);
        double c2=(this.c2.sNote*0.20)+(this.c2.note*0.80);
        double c3=(this.c3.sNote*0.20)+(this.c3.note*0.80);
this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;

if(this.avarage>55){
    System.out.println("geçmiştir");
this.isPass=true;
}
else {
    System.out.println("kalmıştır");
    this.isPass=false;
}
//printnote();
    }
    void printNote(){
        System.out.println(this.c1.name + " sınav notu: " + this.c1.note + " sözlü notu: " + this.c1.sNote);
        System.out.println(this.c2.name + " sınav notu: " + this.c2.note + " sözlü notu: " + this.c2.sNote);
        System.out.println(this.c3.name + " sınav notu: " + this.c3.note + " sözlü notu: " + this.c3.sNote);
        System.out.println("Ortalamanız: " + this.avarage);
}


}
