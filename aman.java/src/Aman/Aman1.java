package Aman;
public class Aman1 extends Encryption {//يرث من الكلاس Encryption


    @Override //اعادة كتابة الدالة بشكل المطلوب
    public void encryption ()
    {
        encryptedText="";//تجهيز المتغير بحيث يكون فارغ في اول الدالة
         int n = orginalText.length();
        for(int i = 0 ; i < n ; i++ )
        {
            char ch = orginalText.charAt(i);//تخزين الحرف  في متغير ثم تمريره الى سوتش لكي تتم عملية التشفير
            switch (ch)
            {
                case 'ا'://1
                   encryptedText=encryptedText.concat("e#8wq");//اضافة الشفره الى المتغير بحيث يتم اضافة الشفره الى نهاية النص
                    break;
                case 'ب'://4
                     encryptedText=encryptedText.concat("$72v5");
                                        break;
                case 'ت'://7
                    encryptedText=encryptedText.concat("VN)xc");
                    break;
                case 'ث'://10
                    encryptedText=encryptedText.concat("z#8~B");
                    break;
                case 'ج'://15
                    encryptedText=encryptedText.concat("@^#qv");
                    break;
                case 'ح'://20
                    encryptedText=encryptedText.concat("&^wB#");
                    break;
                case 'خ'://25
                    encryptedText=encryptedText.concat("~^$#8");
                    break;
                case 'د'://32
                    encryptedText=encryptedText.concat("}gVw5");
                    break;
                case 'ذ'://40
                    encryptedText=encryptedText.concat("ij$#N");
                    break;
                case 'ر'://48
                    encryptedText=encryptedText.concat("-*#qB");
                    break;
                case 'ز'://56
                    encryptedText=encryptedText.concat("=j#2e");
                    break;
                case 'س'://64
                    encryptedText=encryptedText.concat("_g8xc");
                    break;
                case 'ش'://75
                    encryptedText=encryptedText.concat("%mo#$");
                    break;
                case 'ص'://81
                    encryptedText=encryptedText.concat("+{#$2");
                    break;
                case 'ض'://100
                    encryptedText=encryptedText.concat("&^9$w");
                    break;
                case 'ط'://112
                    encryptedText=encryptedText.concat("EC=N#");
                    break;
                case 'ظ'://135
                    encryptedText=encryptedText.concat("W^?x2");
                    break;
                case 'ع'://160
                    encryptedText=encryptedText.concat("&e9_$");
                    break;
                case 'غ'://175
                    encryptedText=encryptedText.concat("m)iwN");
                    break;
                case 'ف'://200
                    encryptedText=encryptedText.concat("~jS5v");
                    break;
                case 'ق'://216
                    encryptedText=encryptedText.concat("+R%qN");
                    break;
                case 'ك'://240
                    encryptedText=encryptedText.concat("]*eAV");
                    break;
                case 'ل'://300
                    encryptedText=encryptedText.concat("!^9*#");
                    break;
                case 'م'://324
                    encryptedText=encryptedText.concat("&+Q#5");
                    break;
                case 'ن'://384
                    encryptedText=encryptedText.concat("U_g#2");
                    break;
                case 'ه'://3500
                    encryptedText=encryptedText.concat("&9iA=");
                    break;
                case 'و'://2
                    encryptedText=encryptedText.concat("(#$58");
                    break;
                case 'ي'://5
                    encryptedText=encryptedText.concat("S#$wv");
                    break;
                case '1'://8
                    encryptedText=encryptedText.concat("!>52b");
                    break;
                case '2'://12
                    encryptedText=encryptedText.concat("<txve");
                    break;
                case '3'://16
                    encryptedText=encryptedText.concat("&CZ#5");
                    break;
                case '4'://21
                    encryptedText=encryptedText.concat("@=#$2");
                    break;
                case '5'://27
                    encryptedText=encryptedText.concat("%+52q");
                    break;
                case '6'://35
                    encryptedText=encryptedText.concat("A[NVv");
                    break;
                case '7'://45
                    encryptedText=encryptedText.concat("kS825");
                    break;
                case '8'://50
                    encryptedText=encryptedText.concat(">^9cw");
                    break;
                case '9'://60
                    encryptedText=encryptedText.concat("%&^#$");
                    break;
                case '0'://70
                    encryptedText=encryptedText.concat("!9T#$");
                    break;
                case 'A'://80
                    encryptedText=encryptedText.concat("4iE#$");
                    break;
                case 'B'://90
                    encryptedText=encryptedText.concat("XSW52");
                    break;
                case 'C'://105
                    encryptedText=encryptedText.concat("@i=58");
                    break;
                case 'D'://120
                    encryptedText=encryptedText.concat("HmRvc");
                    break;
                case 'E'://144
                    encryptedText=encryptedText.concat("CEk#$");
                    break;
                case 'F'://168
                    encryptedText=encryptedText.concat("HhE2e");
                    break;
                case 'G'://180
                    encryptedText=encryptedText.concat("79Qw#");
                    break;
                case 'H'://210
                    encryptedText=encryptedText.concat("ao[q$");
                    break;
                case 'I'://256
                    encryptedText=encryptedText.concat("-yEwN");
                    break;
                case 'J'://280
                    encryptedText=encryptedText.concat("i)_2c");
                    break;
                case 'K'://336
                    encryptedText=encryptedText.concat("EsT8V");
                    break;
                case 'L'://400
                    encryptedText=encryptedText.concat("!^g~x");
                    break;
                case 'M'://3600
                    encryptedText=encryptedText.concat("(9m]+");
                    break;
                case 'N'://3
                    encryptedText=encryptedText.concat("eV@8c");
                    break;
                case 'O'://6
                    encryptedText=encryptedText.concat("2qU$c");
                    break;
                case 'P'://9
                    encryptedText=encryptedText.concat("wke5#");
                    break;
                case 'Q'://14
                    encryptedText=encryptedText.concat("Bzqf$");
                    break;
                case 'R'://18
                    encryptedText=encryptedText.concat("2ZxIw");
                    break;
                case 'S'://24
                    encryptedText=encryptedText.concat("#?8Ec");
                    break;
                case 'T'://30
                    encryptedText=encryptedText.concat("9PV$2");
                    break;
                case 'U'://36
                    encryptedText=encryptedText.concat("7Wq5c");
                    break;
                case 'V'://49
                    encryptedText=encryptedText.concat("8Y#hv");
                    break;
                case 'W'://54
                    encryptedText=encryptedText.concat("*{2V$");
                    break;
                case 'X'://63
                    encryptedText=encryptedText.concat("=+x52");
                    break;
                case 'Y'://72
                    encryptedText=encryptedText.concat("kRw#v");
                    break;
                case 'Z'://84
                    encryptedText=encryptedText.concat("4<)$N");
                    break;
                case '~'://96
                    encryptedText=encryptedText.concat("XOjV5");
                    break;
                case '!'://108
                    encryptedText=encryptedText.concat("6sI8V");
                    break;
                case '@'://128
                    encryptedText=encryptedText.concat("r-_B$");
                    break;
                case '#'://150
                    encryptedText=encryptedText.concat("^m*wB");
                    break;
                case '$'://162
                    encryptedText=encryptedText.concat(">+{5e");
                    break;
                case '%'://192
                    encryptedText=encryptedText.concat("@gRw2");
                    break;
                case '^'://225
                    encryptedText=encryptedText.concat("9oQ$8");
                    break;
                case '&'://288
                    encryptedText=encryptedText.concat("&_+Vc");
                    break;
                case '*'://320
                    encryptedText=encryptedText.concat("AR]w#");
                    break;
                case '('://360
                    encryptedText=encryptedText.concat("^-k52");
                    break;
                case ')'://420
                    encryptedText=encryptedText.concat("49dfB");
                    break;
                case '='://432
                    encryptedText=encryptedText.concat("ag{8q");
                    break;
                case '-'://480
                    encryptedText=encryptedText.concat("!iORe");
                    break;
                case '_'://512
                    encryptedText=encryptedText.concat("_wR-2");
                    break;
                case '+'://576
                    encryptedText=encryptedText.concat("_jWq#");
                    break;
                case '['://630
                    encryptedText=encryptedText.concat("69)+$");
                    break;
                case ']'://648
                    encryptedText=encryptedText.concat("gW+2x");
                    break;
                case '{'://720
                    encryptedText=encryptedText.concat("tAEkq");
                    break;
                case '}'://800
                    encryptedText=encryptedText.concat("Fm~]#");
                    break;
                case '/'://840
                    encryptedText=encryptedText.concat("@S)_V");
                    break;
                case ';'://960
                    encryptedText=encryptedText.concat("HiE_e");
                    break;
                case ':'://1050
                    encryptedText=encryptedText.concat("9o=<B");
                    break;
                case '?'://1200
                    encryptedText=encryptedText.concat("S^s-2");
                    break;
                case '>'://1440
                    encryptedText=encryptedText.concat("uiEI8");
                    break;
                case ','://1600
                    encryptedText=encryptedText.concat("^A_]N");
                    break;
                case '<'://1680
                    encryptedText=encryptedText.concat("=y@9u");
                    break;
                case '.'://1800
                    encryptedText=encryptedText.concat("A~j+c");
                    break;
                case 'a'://2000
                    encryptedText=encryptedText.concat("Lm^i_");
                    break;
                case 'b'://2160
                    encryptedText=encryptedText.concat("9*RQ#");
                    break;
                case 'c'://2250
                    encryptedText=encryptedText.concat("Z9Am{");
                    break;
                case 'd'://2400
                    encryptedText=encryptedText.concat("69o*]");
                    break;
                case 'e'://2500
                    encryptedText=encryptedText.concat("^AGi9");
                    break;
                case 'f'://2560
                    encryptedText=encryptedText.concat("9-ER$");
                    break;
                case 'g'://2880
                    encryptedText=encryptedText.concat("A_j+2");
                    break;
                case 'h'://2800
                    encryptedText=encryptedText.concat("n9S=g");
                    break;
                case 'i'://3000
                    encryptedText=encryptedText.concat("1ASmR");
                    break;
                case 'j'://3200
                    encryptedText=encryptedText.concat("49mR-");
                    break;
                case 'k'://450
                    encryptedText=encryptedText.concat("Zi~{w");
                    break;
                case 'l'://500
                    encryptedText=encryptedText.concat("z9~^4");
                    break;
                case 'm'://540
                    encryptedText=encryptedText.concat("Sal!8");
                    break;
                case 'n'://600
                    encryptedText=encryptedText.concat("LAO9>");
                    break;
                case 'o'://672
                    encryptedText=encryptedText.concat("C)_s#");
                    break;
                case 'p'://700
                    encryptedText=encryptedText.concat("zi=96");
                    break;
                case 'q'://750
                    encryptedText=encryptedText.concat("(%^Ao");
                    break;
                case 'r'://810
                    encryptedText=encryptedText.concat("13?~<");
                    break;
                case 's'://900
                    encryptedText=encryptedText.concat("%piS}");
                    break;
                case 't'://1000
                    encryptedText=encryptedText.concat("CmS^7");
                    break;
                case 'u'://1080
                    encryptedText=encryptedText.concat("@F9OJ");
                    break;
                case 'v'://1280
                    encryptedText=encryptedText.concat("y^_-V");
                    break;
                case 'w'://1500
                    encryptedText=encryptedText.concat("1umS~");
                    break;
                case 'x'://1620
                    encryptedText=encryptedText.concat("%@Dil");
                    break;
                case 'y'://1750
                    encryptedText=encryptedText.concat("4^o)~");
                    break;
                case 'z'://1920
                    encryptedText=encryptedText.concat("@79_G");
                    break;
                case ' '://2100
                    encryptedText=encryptedText.concat("3F9=o");
                    break;
                default://في حال ادخال حرف غير مدهوم يتم تفريغ المتغير المسؤول عن تخزين النص المشفر
                    System.out.println("حرف خاطئ !! ");
                    encryptedText = "حرف خاطئ !!!!!!!!!";
                    return ;
            }
        }

    }


}