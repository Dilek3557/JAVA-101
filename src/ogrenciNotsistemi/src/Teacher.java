public class Teacher {

    String name;
    String npno;
    String branch;

Teacher(String name, String npno, String branch) {

    this.name=name;
    this.npno=npno;
    this.branch=branch;
}

void print(){
    System.out.println("adı "+this.name);
    System.out.println("telefonu "+this.npno);
    System.out.println(" bölümü "+this.branch);


}
}
