
/*
Sınıfın Nitelikleri :
name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı

 */

public class Employee {

    String name; //mmaaşo
    double salary;
    int workHous;//haftalıkçalışmasaaati
    int hireyear;//ise baslangiçyili

    Employee(String name, double salary, int workHous, int hireyear){
        this.name=name;
        this.salary=salary;
        this.workHous=workHous;
        this.hireyear=hireyear;//işe başlama yili

    }
     double vergi;
    double raiseSalary;// zam
    double bonus;


void tax(){
    if(this.salary>1000){
        this.vergi=this.salary*0.03;
    }
    else {
        this.vergi=0.0;
    }

}

void bonus(){

    if(this.workHous>40){
        this.bonus=(this.workHous - 40) * 30;
    }
    else {
        this.bonus=0;
    }
}


void raiseSalary(){
    int yil=2021-this.hireyear;
    if(yil<10){
        this.salary=this.salary*0.05;

    }
    else if(yil>9 && yil<20)
    {
        this.raiseSalary=this.salary*0.10;
    }
    else{
        this.raiseSalary=this.salary*0.15;
    }

}
void string(){
    System.out.println("-------------");
    System.out.println("--------------------------------");
    System.out.println("Adı: " + this.name);
    System.out.println("Maaşı: " + this.salary);
    System.out.println("Çalışma Saati: " + this.workHous);
    System.out.println("Başlangıç Yılı: " + this.hireyear);
    System.out.println("Vergi: " + this.vergi);
    System.out.println("Bonus: " + this.bonus);
    System.out.println("Maaş Artışı: " + this.raiseSalary);
    System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.salary+this.bonus-this.vergi));
    System.out.println("Toplam Maaş: " + (this.salary+this.bonus+this.raiseSalary-this.vergi));
}



}
