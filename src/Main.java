public class Main {
    public static void main(String[] args)  {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("задача 1");
        byte a = 10;
        long b = 80000000;
        int c = 2100000;
        float d = 1.4F;
        double e = 1.2D;
        short f = 23000;
        double g = a + b + c + d + e + f;
        System.out.println(g);
        System.out.println("int c=2100000,byte a=10,short f=23000,long b=80000000,float d=1.4F,double =1.2D ровно =8.21230092E7");
    }
    public static void task2() {
        System.out.println("задача 2");
        float d = 27.12F;
        long l = 987678965549L;
        double g = 2.786D;
        short s =569;
        short q= -159;
        short j=27897;
        byte n=67;
        System.out.println(d);
        System.out.println(l);
        System.out.println(g);
        System.out.println(s);
        System.out.println(q);
        System.out.println(j);
        System.out.println(n);
    }
    public static void task3() {
        System.out.println("задача 3");
        byte teacher1 =23;
        byte teacher2 =27;
        byte teacher3 =30;
        short threeTeacher = 480;
        System.out.println( "Закупились бумагой"+threeTeacher+"[ученеков учительници 1]="+teacher1+"[ученеков учительници 2]="+teacher2+ "[ученеков учительници 3]=" + teacher3);
        long distributed =threeTeacher/(teacher1+teacher2+teacher3) ;
        System.out.println(distributed);
        System.out.println("«На каждого ученика рассчитано 6 листов бумаги».");
    }
    public static void task4() {
        System.out.println("задача 4");
        byte bottle = 16;
        byte time = 2;
        long time1 = bottle / time;
        System.out.println("выпуск за 1 минуту=" + time1);
        byte time2 = 20;
        long time3 = time2 * time1;
        System.out.println("За 20 мин " + time3);
        System.out.println("За 20 машина произвела 160 штук бутылок");
        short day = (short) (time1 * 60 * 24);
        System.out.println("За сутки=" + day);
        System.out.println("За сутки машина произвела 11520 штук бутылок");
        int day3 =3*day;
        System.out.println("За 3 суток=" + day3);
        System.out.println("За 3 суток машина произвела 34560 штук бутылок");
        long month =time1*day3/3*31;
        System.out.println("За 1 месяц=" + month);
        System.out.println("За 1 месяц машина произвела 2856960 штук бутылок");
    }
    public static void task5() {
        System.out.println("задача 5");
        byte paint = 120;
        System.out.println("краски=" + paint);
        byte classes = (byte)(paint / (2+4));
        System.out.println("классов=" + classes);
        byte waitePaint =(byte)( classes*4);
        System.out.println("белая краска=" + waitePaint);
        byte brownPaint =(byte) (classes*2);
        System.out.println("коричневая краска=" + brownPaint);
        System.out.println("В школе, где 20 классов, нужно 80 банок белой краски и 40 банок коричневой краски" );
    }
    public static void task6() {
        System.out.println("задача 6");
        byte bananas =5;
        byte gram = 80;
        short totalWeightOfBananas = (short)(bananas*gram);
        System.out.println("общий вес бананов=" +totalWeightOfBananas+"грамм");
        short milk = 200;
        short milkInGrams = 105;
        short totalAmountOfMilkInGrams = (short) (milk* milkInGrams);
        System.out.println("общий вес молока=" +totalAmountOfMilkInGrams+"грамм");
        byte iceCreamSundae = 2 ;
        byte iceCreamSundaeGram = 100;
        short iceCreamSundaeTotalWeightGrams = (short)(iceCreamSundae*iceCreamSundaeGram);
        System.out.println("общий вес мороженое-пломбир =" +iceCreamSundaeTotalWeightGrams+"грамм");
        byte rawEggs = 4;
        byte rawEggsGrams = 70;
        short rawEggsTotalWeightGrams = (short) (rawEggs*rawEggsGrams);

        System.out.println("общий вес яйц =" +rawEggsTotalWeightGrams+"грамм");
        int totalWeightInGrams= totalWeightOfBananas+ totalAmountOfMilkInGrams+iceCreamSundaeTotalWeightGrams+ rawEggsTotalWeightGrams;
        System.out.println("общий вес в граммах =" +totalWeightInGrams+"грамм");
        float totalWeightInKilograms =(float) (totalWeightInGrams*0.001);
        System.out.println("общий вес в килограммах =" +totalWeightInKilograms+"грамм");
        System.out.println("общий вес в килограммах 21.88, а в граммах 21880");
    }
    public static void task7() {
        System.out.println("задача 7");
        byte weight = 7;
        short day1 = 250;
        short day2 = 500;
        byte loseWeight = (byte) (weight * 1000 / day1);
        System.out.println("сгоняем вес по max=" + loseWeight);
        byte loseWeight2 = (byte) (weight * 1000 / day2);
        System.out.println("сгоняем вес по min=" + loseWeight2);
        byte minLoseWeight2 =(byte) ((loseWeight+loseWeight2)/2);
        System.out.println("сгоняем вес по min дней=" + minLoseWeight2);
        System.out.println("спортсмен может скинуть вес минимум за 14 дней максимум 28 дней,а минемальное 21");
    }
    public static void task8() {
        System.out.println("задача 8");
        int maha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int receivesMaha=(int) (maha*1.1);
        System.out.println("доходом с нынешней зарплатой=" + receivesMaha);
        int receivesDenis = (int) (denis*1.1);
        System.out.println("доходом с нынешней зарплатой=" +receivesDenis);
        int receivesKristina = (int) (kristina*1.1);
        System.out.println("доходом с нынешней зарплатой=" +receivesKristina);
        int raisingMaha =receivesMaha-maha;
        System.out.println("повыщение зарплаты=" +raisingMaha);
        int raisingDenis= receivesDenis-denis;
        System.out.println("повыщение зарплаты=" +raisingDenis);
        int raisingKristina= receivesKristina-kristina;
        System.out.println("повыщение зарплаты=" +raisingKristina);
        System.out.println("Маша теперь получает 74536 рублей. Годовой доход вырос на 6776 рублей" );
        System.out.println("Денис теперь получает 92059 рублей. Годовой доход вырос на 8369 рублей" );
        System.out.println("Кристина  теперь получает 83853 рублей. Годовой доход вырос на 7623 рублей" );

    }
}










