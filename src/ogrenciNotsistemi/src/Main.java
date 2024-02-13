

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Teacher t1=new Teacher("mahmut ", "555","TRH");
Teacher t2=new Teacher("grahambbel","000","FZK");
Teacher t3=new Teacher("külyutmaz","1111","BIO");




Course tarih=new Course("tarih","101","TRH");
tarih.addTeacher(t1);


Course fizik=new Course("fizik","102","FZK");
fizik.addTeacher(t2);


Course biyo=new Course("biyoloj","101","BIO");
biyo.addTeacher(t3);


Student s1=new Student("inek şaban","123","4", tarih,fizik,biyo);
   s1.addBulexamplenot(100.0,100.0,50.0,90.0,90.0,90.0);
   s1.isPass();


   Student s2=new Student("güdük necmi","444","4",tarih,fizik,biyo);
   s2.addBulexamplenot(100.0,50.0,100.0,40.0,80.0,80.0);
   s2.isPass();
    }}


