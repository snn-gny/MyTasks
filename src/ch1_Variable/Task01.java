package ch1_Variable;

public class Task01 {
/* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı  kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.
	 */


    public static void main(String[] args) {


        //System.out.println(isim +     " isimli personelin yasi = "+yas+ " maasi = "+maas);
        //amac tek bir sout icinde alt alta yazilabilir mi? variables
        String isim="zafer";
        int yas=33;
        double maas=15.000;
        System.out.println(isim+" isimli personelin yasi= "+yas);//output zafer isimli personelin yasi = 33
        System.out.println(isim  +     " \n isimli personelin yasi = "+yas);//output //zafer
                                                                                  //isimli personelin yasi = 33
        //task: maas ve yas i alt alta tek sout icinde print ediniz

        System.out.println("yas = " + yas +  "\n" + "maas= " +maas);//\n icin ayri bir  "" cift tirnak acmak ve \n i icine yazamaniz gerekir

        System.out.println("efsane \n java \n gunleri \n basladi ");//efsane
                                                                     //java
                                                                       //gunleri
                                                                       // basladi


        System.out.println(isim  +     " \n isimli personelin yasi = "+yas   + "/*     */ ");


        //output "zafer" olacak sekilde yazdiriniz
        System.out.println("\"" +isim  +"\"" );   //     \": prints double quote :"" Çift tırnak yazdırır.
            //tricky point special chars. mutlaka "" cift tirnak icin yazilmali
            //main method yoksa sout yazdiginizda System.out.println() gelmez


        //  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdırınız

        System.out.println("Hello \", \"World  \\ /");




        // Soru-2 : Pazartesi kelimesini her harfini ayrı bir satira gelecek sekilde yazdırınız.
        System.out.println("P\n" +"a\n" + "z\n"+"a\n"+"r\n"+"t\n"+"e\n"+"s\n"+"i\n");

        //Soru-3 : "Java" ile hayat cok 'afilli'   yazdırınız
        System.out.println(" \"Java\" ile hayat cok 'afilli' ");


        //Soru-4 : "Basari" gayreti 'sever'  yazdırınız sonraki "Clarusway ile java cok kolay ..." ifadesi  3 satır sonra ve satır basından 1 tab ileride yazılsın.

        System.out.println(" \"Basari\" gayreti 'sever' "+ "\n \n \n "+"\tClarusway ile java cok kolay..." );


   /*
        TASK:
		 * Sadece System.out.println kullanarak bu işlemleri yapınız.
         *    Herhangi bir değişken kullanmayın.
         * 1. Adım : İsim ve Soyismiminizi ekrana yazdırın.
         * 2. Adım : Satır atlayarak boyunuzu ekrana yazdırın.
         * 3. Adım : Satır atlayarak kilonu ekrana yazdırın.
         * 4. Adım : Satır atlayarak hobilerinizi ekrana yazdırın.

	             OUTPUT :
	             zafer e
	             165
	             65
	             Yuzme FUTBOL Java ...
		 */

        System.out.println("Sinan Günay");
        System.out.println("\n181");
        System.out.println("\n95");
        System.out.println("\nspazieren gehen, Tennis,Fußball, Basketball, Schwimmen,...  ");














    }

}
