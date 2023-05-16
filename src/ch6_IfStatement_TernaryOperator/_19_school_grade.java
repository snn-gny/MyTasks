package ch6_IfStatement_TernaryOperator;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE
        double sinavNotu=80;
        double araSinavNotu=68;
        double finalNotu=90;
        double notOrt=(int)(sinavNotu+araSinavNotu+finalNotu)/3;
        System.out.println("notOrt = " + notOrt);//notOrt = 79.0
        if (notOrt>=90){
            System.out.println("Notunuz: "+"A");
        }else if (notOrt>= 70 && notOrt<90){
            System.out.println("Notunuz: "+"B");
        }else if (notOrt>=50 && notOrt<90){
            System.out.println("Notunuz: "+"C");
        }else if (notOrt>= 50 ){
            System.out.println("Notunuz: "+"" + "F");
        }
    }
}
