package Aman;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;//من اجل دالة random التي سنستخدمها لاختيار الخوارزمية بشكل عشوائي
import com.github.lalyos.jfiglet.FigletFont;// من اجل دالة الطباعة لAMAN باستخدام Stander ASCII
import java.io.IOException;//من اجل استخدام throws Exception التي هي لازمة لاستخدام الخط و التاخير


public class Main {

    public static final String Reset ="\u001B[0m"; // لاعادة الخط الى الحالة الطبيعية
    public static final String Red ="\u001B[31m";//لتلوين النص بالون الاحمر
    public static final String Green ="\u001B[32m";//لتلوين النص بالون الاخضر
    public static final String Yellow ="\u001B[33m";//لتلوين النص بالون الاصفر
    public static final String Blue ="\u001B[34m";//لتلوين النص بالون الازرق
    public static final String Purple ="\u001B[35m";//لتلوين النص بالون البنفسجي
    public static final String Bold ="\u001B[1m";//لجعل النص غامق
    public static final String Underline ="\u001B[4m";//لاضافة خط تحت النص
    public static final String White ="\u001B[97m";//لون ابيض
    public static void main(String[] args) throws Exception { // من اجل sleep و stander ASCII
        Scanner input = new Scanner(System.in);//تعريف اوبجكت من الكلاس اسكنر
        Random rand = new Random();//لانشاء ارقام عشوائية لكي يتم اختيار الخوارزمية بشكل عشوائي
        Aman1 A1 =new Aman1(); // انشاء object  من class  التشفير الاول
        Aman2 A2 =new Aman2(); // انشاء object  من class  التشفير الثاني
        Aman3 A3 =new Aman3(); // انشاء object  من class  التشفير االثالث
        Aman4 A4 =new Aman4(); // انشاء object  من class  التشفير الرابع
        Decryption dec;//تعريف اوبجكت من الكلاس ديكربشن
        String text;//لتخزين النص المرغوب بتشفيره
        int random ;//لتخزين الرقم العشوائي الذي سيتم استخدامه في اختيار الخوارزمية


        //الغرض من هذه الاكواد هو عرض طريقة اشتقاق اسم AMAN من اسماء اعضاء الفريق
        Thread.sleep(1000);//تاخير لمدة ثانية واحده
       /* System.out.print(Bold+Blue+"A"+Reset);//تم استخدام تاثيرات على النص وهي ان يكون غامق ولونه ازرق ثم تم ارجاع النص الى حالته الطبيعية بعد ان تم طباعة النص المطلوب لكي لا يواثر على النصوص التي بعده
        Thread.sleep(300);
        System.out.print(Bold+Green+"NAS"+Reset);
        Thread.sleep(300);
        System.out.print(Bold+Blue+"\tM"+Reset);
        Thread.sleep(300);
        System.out.print(Bold+Green+"OHAMMED"+Reset);
        Thread.sleep(300);
        System.out.print(Bold+Green+"\tAL-BR"+Reset);
        Thread.sleep(300);
        System.out.print(Bold+Blue+"A"+Reset);
        Thread.sleep(300);
        System.out.print(Bold+Green+"A"+Reset);
        Thread.sleep(300);
        System.out.print(Bold+Green+"    MOU"+Reset);
        Thread.sleep(300);
        System.out.print(Bold+Blue+"N"+Reset);
        Thread.sleep(300);
        System.out.print(Bold+Green+"IR\n"+Reset);
        Thread.sleep(300);
        //الغرض من هذه الاكواد هو عرض الحرف المستخرج من الاسم مع مكانه في الاسم
        System.out.print(Bold+Blue+"A");
        Thread.sleep(200);
        System.out.print("\t\tM");
        Thread.sleep(200);
        System.out.print("\t\t\t\t A");
        Thread.sleep(200);
        System.out.print("\t\t  N\n"+Reset);
        Thread.sleep(500);*/
        System.out.print(Green+Bold+"[*] Initializing AMAN tool");
        for(int i=0;i<5;i++)
        {
            Thread.sleep(300);
            System.out.print(".");
        }
        System.out.println("[DONE]"+Reset);

        //الغرض من هذا الاكود هو طباعة النص باستخدام الدوال خارجية تم اضافتها من مكتبة خارجية
        String banner = FigletFont.convertOneLine("AMAN");//تجهيز النص المكتوب بخط ديفولت في المتغير
        String [] lines = banner.split("\n");//تقسيم النص في مصفوفه بحيث يتم تخزين كل جزاء من النص في خانه من خانات المصفوفة ويتم التقسيم بلاعتماد على وجود ال\n اي عندما يدها يقوم بتخزين النص التي بعدها في خانه جديده في المصفوفه حتى يجد \n اخرى
        for (String line : lines)// استخام الدواره التي بهذا الشكل كونها تقوم بعمل دورات بعدد العناصر في المصفوفة وفي كل دوره تقوم بتخزين خانه من خانات المصفوفة في المتغير line
        {
            System.out.println(Bold+Blue+line+Reset);//يتم طباعة المتغير مع تاثيرات على النص
            Thread.sleep(200);//تاخير خمس ثانية بين كل دوره والتي تليها
        }
        System.out.println(Bold+Underline+Purple+"Advanced Text Encryption Program "+Reset);//طباعة نص توضيحي عن نوع البرنامج
        int  choice; //لتخزين القيمة التي يدخلها المستخدم من اجل السوتش
        do {//لكي تستمر بتكرار البرنامج الى ان يختار المستخدم الخروج
            dec=new Decryption();//
            System.out.println("---".repeat(20));//كباعة النص --- وتكراره 20 مره اي -*60
            //عرض النص الخاص بالقائمة الرائيسية
            System.out.println(Blue + Bold + "The Menu: " + Reset);
            Thread.sleep(200);
            System.out.println(Purple + "1-Encryption. " + Reset);
            Thread.sleep(200);
            System.out.println(Purple + "2-Decryption. " + Reset);
            Thread.sleep(200);
            System.out.println(Purple + "3-Info. " + Reset);
            Thread.sleep(200);
            System.out.println(Yellow + "4-Exit. " + Reset);
            Thread.sleep(200);
            choice=0;
            try {//اذا تم ادخال قيمة غير الارقام
                System.out.print(Blue + "Enter The Number of Your choice:" + Reset);//رسالة توضيحية للمستخدم
                choice = input.nextInt();//استقبال الاختيار
            }catch (InputMismatchException e){
                System.out.println(Red+Bold+"Enter Only Number !!!"+Reset);
                input.nextLine();
            }

            switch (choice)//تمرير الاختيار الى سوتش
            {
                case 1://القيام بعملية التشفير
                    System.out.print(Yellow+Bold+Underline+"Enter Your Text :"+Reset);
                    input.nextLine();//تم استخدام هذا السطر لكي يتم استقبال النص الذي بعدها بشكل صحيح لانه تحدث مشاكل عند استخدام nextInt ثم nextLine  لذالك تم استخدام هذا السطر لحل المشكلة
                    text=input.nextLine();// استقبال النص الذي سيتم تشفيره
                    random = 1+rand.nextInt(4);// اختيار رقم عشوائي من 1 الى 4 لكي يتم اختيار خوارزمية التشفير بشكل عشوائي

                    switch (random)//تمرير الرقم العشوائي الى سوتش
                    {
                        case 1 ://استخدام الخوارزمية الاولى
                            A1.setOrginalText(text);//تمرير الى الدالة المسؤلة عن تمرير النص الى  الكلاس لكي يقوم بتشفيره
                            Thread.sleep(200);
                            System.out.println(Blue+"The Encrypted Text :"+Reset);
                            Thread.sleep(300);
                            System.out.println(Purple+A1.getEncryptedText()+Reset);//طباعة النص  من الدالة المسؤلة عن طباعة النص المشفر
                            break;
                        case 2 :
                            A2.setOrginalText(text);
                            Thread.sleep(200);
                            System.out.println(Blue+"The Encrypted Text :"+Reset);
                            Thread.sleep(300);
                            System.out.println(Purple+A2.getEncryptedText()+Reset);
                            break;
                        case 3 :
                            A3.setOrginalText(text);
                            Thread.sleep(200);
                            System.out.println(Blue+"The Encrypted Text :"+Reset);
                            Thread.sleep(300);
                            System.out.println(Purple+A3.getEncryptedText()+Reset);
                            break;
                        case 4 :
                            A4.setOrginalText(text);
                            Thread.sleep(200);
                            System.out.println(Blue+"The Encrypted Text :"+Reset);
                            Thread.sleep(300);
                            System.out.println(Purple+A4.getEncryptedText()+Reset);
                            break;
                                     }
                    break;
                case 2://القيام بعملية فك التشفير
                    Thread.sleep(200);
                    System.out.print(Yellow+"Enter The encrypted text:"+Reset);
                    input.nextLine();//حل مشكلة الاستقبال
                    text=input.nextLine();
                    dec.setOrginalText(text);//تمرير النص الى الكلاس المسؤل عن فك التشفير عن طريق هذه الدالة
                    Thread.sleep(200);
                    System.out.println(Blue+ "Text after decryption:"+Reset);
                    Thread.sleep(300);
                    text=dec.getText();//استقبال النص بعد فك تشفيره
                    System.out.println(Purple+text+Reset);
                    break;
                case 3://عرض معلومات عن البرنامج
                    Thread.sleep(200);
                    System.out.println(White+"\nAbout:"+Reset);
                    Thread.sleep(200);
                   System.out.println(Green+"A text encryption and decryption program built");
                    Thread.sleep(200);
                    System.out.println("in java using Object-Oriented Programming (OOP)");
                    Thread.sleep(200);
                    System.out.println("concepts. It converts readable text  into an");
                    Thread.sleep(200);
                    System.out.println("unintelligible format while allowing for its");
                    Thread.sleep(200);
                    System.out.println("complete recovery."+Reset);
                    Thread.sleep(200);
                    System.out.println("===".repeat(20));//كباعة النص --- وتكراره 20 مره اي -*60
                    System.out.println(Green+"Version: "+Reset+White+"v1.0.0 (Stable Release)"+Reset);
                    Thread.sleep(200);
                    System.out.println(Green+"Developed by:"+Purple+Bold+"   AMAN-2026\n"+Reset);
                    Thread.sleep(200);
                    System.out.println(Green+"License:"+Reset+White+" Educational / Open source"+Reset);
                    Thread.sleep(200);
                    System.out.println("===".repeat(20));//كباعة النص --- وتكراره 20 مره اي -*60
                    Thread.sleep(200);
                    System.out.println(Yellow+Bold+"\t[!] UPCOMING RELEASES "+Reset+White+"- STAY TUNED!"+Reset);
                    Thread.sleep(200);
                    System.out.println(Purple+"\t> v1.1.0 "+Reset+White+"- More encryption algorithms (First batch)"+Reset);
                    Thread.sleep(200);
                    System.out.println(Purple+"\t> v1.2.0 "+Reset+White+"- File encryption support"+Reset);
                    Thread.sleep(200);
                    System.out.println(Purple+"\t> v1.3.0 "+Reset+White+"- Control the size of the encrypted text "+Reset);
                    Thread.sleep(200);
                    System.out.println(Purple+"\t> v2.0.0 "+Reset+White+"- Many algorithms + Categories + Smart selection"+Reset);
                    Thread.sleep(200);
                    System.out.println(Green+"\t+ New version"+Reset+White+" will be available soon!"+Reset);
                    Thread.sleep(200);
                    System.out.println(Green+"\t+ Thank you "+Reset+White+"for using AMAN Tool"+Reset);
                    Thread.sleep(200);

                    break;


                case 4://عرض رسالة الخروج
                    Thread.sleep(200);
                    System.out.println(Purple+"Thanks for use AMAN program "+Reset);
                    Thread.sleep(500);
                    String banner2 = FigletFont.convertOneLine("AMAN");//تجهيز النص المكتوب بخط ديفولت في المتغير
                    String [] lines2 = banner.split("\n");//تقسيم النص في مصفوفه بحيث يتم تخزين كل جزاء من النص في خانه من خانات المصفوفة ويتم التقسيم بلاعتماد على وجود ال\n اي عندما يدها يقوم بتخزين النص التي بعدها في خانه جديده في المصفوفه حتى يجد \n اخرى
                    for (String line : lines2)// استخام الدواره التي بهذا الشكل كونها تقوم بعمل دورات بعدد العناصر في المصفوفة وفي كل دوره تقوم بتخزين خانه من خانات المصفوفة في المتغير line
                    {
                        System.out.println(Bold+Red+line+Reset);//يتم طباعة المتغير مع تاثيرات على النص
                        Thread.sleep(200);//تاخير خمس ثانية بين كل دوره والتي تليها
                    }
                    System.out.print(Red+Bold+"[*]  Shutting down the tool");
                    for(int i=0;i<5;i++)
                    {
                        Thread.sleep(300);
                        System.out.print(".");
                    }
                    System.out.println("[DONE]"+Reset);
                    break;
                default:
                    break;
            }
        }while (choice != 4);//التوقف عندما يختار المستخدم الرقم 4
    }
}