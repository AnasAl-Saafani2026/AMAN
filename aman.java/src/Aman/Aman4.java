package Aman;
public class Aman4 extends Encryption {//يرث من الكلاس Encryption

   @Override //اعادة كتابة الدالة بشكل المطلوب
   public void encryption ()
    {
        encryptedText=""; //تجهيز المتغير بحيث يكون فارغ في اول الدالة
         int n = orginalText.length();
        for(int i = 0 ; i < n ; i++ )
        {
            char ch = orginalText.charAt(i);//تخزين الحرف  في متغير ثم تمريره الى سوتش لكي تتم عملية التشفير
            switch (ch)
            {
                case 'ا'://1
                   encryptedText=encryptedText.concat("#528B");//اضافة الشفره الى المتغير بحيث يتم اضافة الشفره الى نهاية النص
                    break;
                case 'ب'://4
                    encryptedText=encryptedText.concat("64qwe");
                                        break;
                case 'ت'://7
                    encryptedText=encryptedText.concat("fvcxN");
                    break;
                case 'ث'://10
                    encryptedText=encryptedText.concat("9LNBV");
                    break;
                case 'ج'://15
                    encryptedText=encryptedText.concat("1^VBN");
                    break;
                case 'ح'://20
                    encryptedText=encryptedText.concat("46~$2");
                    break;
                case 'خ'://25
                    encryptedText=encryptedText.concat("528io");
                    break;
                case 'د'://32
                    encryptedText=encryptedText.concat("gG825");
                    break;
                case 'ذ'://40
                    encryptedText=encryptedText.concat("SD>v$");
                    break;
                case 'ر'://48
                    encryptedText=encryptedText.concat("yup8N");
                    break;
                case 'ز'://56
                    encryptedText=encryptedText.concat("NBV=_");
                    break;
                case 'س'://64
                    encryptedText=encryptedText.concat("ERq82");
                    break;
                case 'ش'://75
                    encryptedText=encryptedText.concat("io%N#");
                    break;
                case 'ص'://81
                    encryptedText=encryptedText.concat("@%135");
                    break;
                case 'ض'://100
                    encryptedText=encryptedText.concat("~Abz#");
                    break;
                case 'ط'://112
                    encryptedText=encryptedText.concat("CXZL)");
                    break;
                case 'ظ'://135
                    encryptedText=encryptedText.concat("9@K3$");
                    break;
                case 'ع'://160
                    encryptedText=encryptedText.concat("E^bzV");
                    break;
                case 'غ'://175
                    encryptedText=encryptedText.concat("[ASew");
                    break;
                case 'ف'://200
                    encryptedText=encryptedText.concat("~S>rt");
                    break;
                case 'ق'://216
                    encryptedText=encryptedText.concat("&13K4");
                    break;
                case 'ك'://240
                    encryptedText=encryptedText.concat("!4@Go");
                    break;
                case 'ل'://300
                    encryptedText=encryptedText.concat("*9i>B");
                    break;
                case 'م'://324
                    encryptedText=encryptedText.concat("as13#");
                    break;
                case 'ن'://384
                    encryptedText=encryptedText.concat("tL&_H");
                    break;
                case 'ه'://3500
                    encryptedText=encryptedText.concat("=ASm7");
                    break;
                case 'و'://2
                    encryptedText=encryptedText.concat("852$4");
                    break;
                case 'ي'://5
                    encryptedText=encryptedText.concat("AvxcN");
                    break;
                case '1'://8
                    encryptedText=encryptedText.concat("yrVve");
                    break;
                case '2'://12
                    encryptedText=encryptedText.concat("s4weV");
                    break;
                case '3'://16
                    encryptedText=encryptedText.concat("&728$");
                    break;
                case '4'://21
                    encryptedText=encryptedText.concat(")@#$e");
                    break;
                case '5'://27
                    encryptedText=encryptedText.concat("3I$28");
                    break;
                case '6'://35
                    encryptedText=encryptedText.concat("f^qwe");
                    break;
                case '7'://45
                    encryptedText=encryptedText.concat("QANVB");
                    break;
                case '8'://50
                    encryptedText=encryptedText.concat("9ibNV");
                    break;
                case '9'://60
                    encryptedText=encryptedText.concat("#!CKm");
                    break;
                case '0'://70
                    encryptedText=encryptedText.concat("vcr9Y");
                    break;
                case 'A'://80
                    encryptedText=encryptedText.concat("A&LZV");
                    break;
                case 'B'://90
                    encryptedText=encryptedText.concat("#4@%~");
                    break;
                case 'C'://105
                    encryptedText=encryptedText.concat("#$KST");
                    break;
                case 'D'://120
                    encryptedText=encryptedText.concat("-m@Vv");
                    break;
                case 'E'://144
                    encryptedText=encryptedText.concat("#$+g!");
                    break;
                case 'F'://168
                    encryptedText=encryptedText.concat("#v_%f");
                    break;
                case 'G'://180
                    encryptedText=encryptedText.concat("^+bnN");
                    break;
                case 'H'://210
                    encryptedText=encryptedText.concat("f^@!#");
                    break;
                case 'I'://256
                    encryptedText=encryptedText.concat("ZXC7j");
                    break;
                case 'J'://280
                    encryptedText=encryptedText.concat("bzC9=");
                    break;
                case 'K'://336
                    encryptedText=encryptedText.concat("64@TG");
                    break;
                case 'L'://400
                    encryptedText=encryptedText.concat("#!mSR");
                    break;
                case 'M'://3600
                    encryptedText=encryptedText.concat("~m4jQ");
                    break;
                case 'N'://3
                    encryptedText=encryptedText.concat("vcxNK");
                    break;
                case 'O'://6
                    encryptedText=encryptedText.concat("61qwe");
                    break;
                case 'P'://9
                    encryptedText=encryptedText.concat("52813");
                    break;
                case 'Q'://14
                    encryptedText=encryptedText.concat("=6#$v");
                    break;
                case 'R'://18
                    encryptedText=encryptedText.concat("+!852");
                    break;
                case 'S'://24
                    encryptedText=encryptedText.concat("vcx*&");
                    break;
                case 'T'://30
                    encryptedText=encryptedText.concat("*^#qw");
                    break;
                case 'U'://36
                    encryptedText=encryptedText.concat("as528");
                    break;
                case 'V'://49
                    encryptedText=encryptedText.concat(")=#$5");
                    break;
                case 'W'://54
                    encryptedText=encryptedText.concat("+a58B");
                    break;
                case 'X'://63
                    encryptedText=encryptedText.concat("528f+");
                    break;
                case 'Y'://72
                    encryptedText=encryptedText.concat("_+$vx");
                    break;
                case 'Z'://84
                    encryptedText=encryptedText.concat("#@Dhv");
                    break;
                case '~'://96
                    encryptedText=encryptedText.concat("nzZ%G");
                    break;
                case '!'://108
                    encryptedText=encryptedText.concat("#!ZKW");
                    break;
                case '@'://128
                    encryptedText=encryptedText.concat("ZZtL]");
                    break;
                case '#'://150
                    encryptedText=encryptedText.concat("mS@C$");
                    break;
                case '$'://162
                    encryptedText=encryptedText.concat("#!13+");
                    break;
                case '%'://192
                    encryptedText=encryptedText.concat("RKnbz");
                    break;
                case '^'://225
                    encryptedText=encryptedText.concat("5HKAS");
                    break;
                case '&'://288
                    encryptedText=encryptedText.concat("nb%G<");
                    break;
                case '*'://320
                    encryptedText=encryptedText.concat("5479-");
                    break;
                case '('://360
                    encryptedText=encryptedText.concat("!@%^7");
                    break;
                case ')'://420
                    encryptedText=encryptedText.concat("LZ@9h");
                    break;
                case '='://432
                    encryptedText=encryptedText.concat("bzH*<");
                    break;
                case '-'://480
                    encryptedText=encryptedText.concat("4179j");
                    break;
                case '_'://512
                    encryptedText=encryptedText.concat("547gj");
                    break;
                case '+'://576
                    encryptedText=encryptedText.concat("64&as");
                    break;
                case '['://630
                    encryptedText=encryptedText.concat("6KJmY");
                    break;
                case ']'://648
                    encryptedText=encryptedText.concat("51asd");
                    break;
                case '{'://720
                    encryptedText=encryptedText.concat("!@&^*");
                    break;
                case '}'://800
                    encryptedText=encryptedText.concat("469Aj");
                    break;
                case '/'://840
                    encryptedText=encryptedText.concat("4197=");
                    break;
                case ';'://960
                    encryptedText=encryptedText.concat("479%g");
                    break;
                case ':'://1050
                    encryptedText=encryptedText.concat("C@^~)");
                    break;
                case '?'://1200
                    encryptedText=encryptedText.concat("@uyAS");
                    break;
                case '>'://1440
                    encryptedText=encryptedText.concat("439a-");
                    break;
                case ','://1600
                    encryptedText=encryptedText.concat("!iojg");
                    break;
                case '<'://1680
                    encryptedText=encryptedText.concat("%uy^T");
                    break;
                case '.'://1800
                    encryptedText=encryptedText.concat("Q9iEx");
                    break;
                case 'a'://2000
                    encryptedText=encryptedText.concat("6io9g");
                    break;
                case 'b'://2160
                    encryptedText=encryptedText.concat("37SPO");
                    break;
                case 'c'://2250
                    encryptedText=encryptedText.concat("49io+");
                    break;
                case 'd'://2400
                    encryptedText=encryptedText.concat("@7ioj");
                    break;
                case 'e'://2500
                    encryptedText=encryptedText.concat("&~^9i");
                    break;
                case 'f'://2560
                    encryptedText=encryptedText.concat("-_g#A");
                    break;
                case 'g'://2880
                    encryptedText=encryptedText.concat("479-+");
                    break;
                case 'h'://2800
                    encryptedText=encryptedText.concat("=-AS4");
                    break;
                case 'i'://3000
                    encryptedText=encryptedText.concat("1io9j");
                    break;
                case 'j'://3200
                    encryptedText=encryptedText.concat("6mSRE");
                    break;
                case 'k'://450
                    encryptedText=encryptedText.concat("Wo~!V");
                    break;
                case 'l'://500
                    encryptedText=encryptedText.concat("279io");
                    break;
                case 'm'://540
                    encryptedText=encryptedText.concat("J&^+8");
                    break;
                case 'n'://600
                    encryptedText=encryptedText.concat("417mS");
                    break;
                case 'o'://672
                    encryptedText=encryptedText.concat("87_=K");
                    break;
                case 'p'://700
                    encryptedText=encryptedText.concat("2iofu");
                    break;
                case 'q'://750
                    encryptedText=encryptedText.concat("rpS~^");
                    break;
                case 'r'://810
                    encryptedText=encryptedText.concat("4@3ok");
                    break;
                case 's'://900
                    encryptedText=encryptedText.concat("31mA&");
                    break;
                case 't'://1000
                    encryptedText=encryptedText.concat("!ioAy");
                    break;
                case 'u'://1080
                    encryptedText=encryptedText.concat("!@&9+");
                    break;
                case 'v'://1280
                    encryptedText=encryptedText.concat("579gj");
                    break;
                case 'w'://1500
                    encryptedText=encryptedText.concat("179io");
                    break;
                case 'x'://1620
                    encryptedText=encryptedText.concat("CX^lW");
                    break;
                case 'y'://1750
                    encryptedText=encryptedText.concat("!io^=");
                    break;
                case 'z'://1920
                    encryptedText=encryptedText.concat("479ag");
                    break;
                case ' '://2100
                    encryptedText=encryptedText.concat("@&^mT");
                    break;
                default://في حال ادخال حرف غير مدهوم يتم تفريغ المتغير المسؤول عن تخزين النص المشفر
                    System.out.println("حرف خاطئ !! ");
                    encryptedText = "حرف خاطئ !!!!!!!!!";
                    return ;
            }
        }

    }



}