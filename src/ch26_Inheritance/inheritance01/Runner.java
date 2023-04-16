package ch26_Inheritance.inheritance01;

public class Runner {
    /*
	 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
	 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
	 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
	 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
	 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
	 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
	 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
	   denir.
	 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
	 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

	*/
    public static void main(String[] args) {

        //data type  obj name =  new    constructorName();
        Animal      animal1   =   new    Animal();
        animal1.yeme();
        animal1.hareket();
        animal1.icme();

        System.out.println(" ***** ");

        Pet pet1= new Pet();
        pet1.beslenme();//pet class dan geliyor
        pet1.hareket();//animal class dan geliyor
        pet1.yeme();//parent class olan animal dan gelir
        pet1.uyuma();//child class olan pet class dan gelir
        pet1.icme();//super class olan animal dan gelir

        System.out.println(" ***** ");

        Fish hamsi = new Fish();
        hamsi.izgaraAlabalik();//obj den Fish class daki method call edildi
        hamsi.hareket();//child class objesinden parent class methodu call edildi
        hamsi.icme();//super class dan method call edildi

        System.out.println(" ***** ");

        Dog karabas = new Dog();
        karabas.dogMethod();//child class daki method call edildi
        karabas.beslenme();//ara class olan pet class dan method call
        karabas.yeme();//parent class daki method call edildi
        karabas.uyuma();//parent olan pet class dan geliyor
        karabas.hareket();//grand parent class olan animal dan gelir





    }
}
