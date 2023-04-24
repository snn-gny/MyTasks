package ch22_Task22;

public class T03_Lesson {
    static String name;
    static int credit =(int) (Math.random() * ((10 - 1 + 1) + 1));
   static String isim;

    public T03_Lesson() {
    }

    public T03_Lesson(String isim,String name, int credit) {
        this.name = name;
        this.credit = credit;

    }

    @Override
    public String toString() {
        return "T03_Lesson{" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                '}';
    }
}
