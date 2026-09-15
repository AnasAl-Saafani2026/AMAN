package Aman;
public class Aman2 extends Encryption {//يرث من الكلاس Encryption
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
                   encryptedText=encryptedText.concat("vc28#");//اضافة الشفره الى المتغير بحيث يتم اضافة الشفره الى نهاية النص
                    break;
                case 'ب'://4
                     encryptedText=encryptedText.concat("V5}q$");
                                        break;
                case 'ت'://7
                    encryptedText=encryptedText.concat("eNfx2");
                    break;
                case 'ث'://10
                    encryptedText=encryptedText.concat("#Xw9c");
                    break;
                case 'ج'://15
                    encryptedText=encryptedText.concat("q18^v");
                    break;
                case 'ح'://20
                    encryptedText=encryptedText.concat("6oLcV");
                    break;
                case 'خ'://25
                    encryptedText=encryptedText.concat("5wAxm");
                    break;
                case 'د'://32
                    encryptedText=encryptedText.concat("!b_Nq");
                    break;
                case 'ذ'://40
                    encryptedText=encryptedText.concat("iy(v$");
                    break;
                case 'ر'://48
                    encryptedText=encryptedText.concat("rHE8c");
                    break;
                case 'ز'://56
                    encryptedText=encryptedText.concat("LF[Nw");
                    break;
                case 'س'://64
                    encryptedText=encryptedText.concat("67]w2");
                    break;
                case 'ش'://75
                    encryptedText=encryptedText.concat("9~?xc");
                    break;
                case 'ص'://81
                    encryptedText=encryptedText.concat("%@+$#");
                    break;
                case 'ض'://100
                    encryptedText=encryptedText.concat("ZnS^q");
                    break;
                case 'ط'://112
                    encryptedText=encryptedText.concat("7uYwB");
                    break;
                case 'ظ'://135
                    encryptedText=encryptedText.concat("1K%ow");
                    break;
                case 'ع'://160
                    encryptedText=encryptedText.concat("zCm-v");
                    break;
                case 'غ'://175
                    encryptedText=encryptedText.concat("A^=x$");
                    break;
                case 'ف'://200
                    encryptedText=encryptedText.concat("t79i2");
                    break;
                case 'ق'://216
                    encryptedText=encryptedText.concat("GUW5#");
                    break;
                case 'ك'://240
                    encryptedText=encryptedText.concat(">J9jv");
                    break;
                case 'ل'://300
                    encryptedText=encryptedText.concat("3yASc");
                    break;
                case 'م'://324
                    encryptedText=encryptedText.concat("d<{x8");
                    break;
                case 'ن'://384
                    encryptedText=encryptedText.concat("(pgRw");
                    break;
                case 'ه'://3500
                    encryptedText=encryptedText.concat("=9~^&");
                    break;
                case 'و'://2
                    encryptedText=encryptedText.concat("5862#");
                    break;
                case 'ي'://5
                    encryptedText=encryptedText.concat("vVAq$");
                    break;
                case '1'://8
                    encryptedText=encryptedText.concat("Ln!B5");
                    break;
                case '2'://12
                    encryptedText=encryptedText.concat(">CK8e");
                    break;
                case '3'://16
                    encryptedText=encryptedText.concat("butN5");
                    break;
                case '4'://21
                    encryptedText=encryptedText.concat("@)2Vc");
                    break;
                case '5'://27
                    encryptedText=encryptedText.concat("w%x1?");
                    break;
                case '6'://35
                    encryptedText=encryptedText.concat("x9h5V");
                    break;
                case '7'://45
                    encryptedText=encryptedText.concat("?~pe$");
                    break;
                case '8'://50
                    encryptedText=encryptedText.concat("S^4B8");
                    break;
                case '9'://60
                    encryptedText=encryptedText.concat("zodx#");
                    break;
                case '0'://70
                    encryptedText=encryptedText.concat("i=Zcx");
                    break;
                case 'A'://80
                    encryptedText=encryptedText.concat("F}o2w");
                    break;
                case 'B'://90
                    encryptedText=encryptedText.concat("Hm*$B");
                    break;
                case 'C'://105
                    encryptedText=encryptedText.concat("KA)ec");
                    break;
                case 'D'://120
                    encryptedText=encryptedText.concat("&~av#");
                    break;
                case 'E'://144
                    encryptedText=encryptedText.concat("%<_N8");
                    break;
                case 'F'://168
                    encryptedText=encryptedText.concat("s7=ew");
                    break;
                case 'G'://180
                    encryptedText=encryptedText.concat("9sUcv");
                    break;
                case 'H'://210
                    encryptedText=encryptedText.concat("619Tq");
                    break;
                case 'I'://256
                    encryptedText=encryptedText.concat("46_-w");
                    break;
                case 'J'://280
                    encryptedText=encryptedText.concat("Cuofe");
                    break;
                case 'K'://336
                    encryptedText=encryptedText.concat("r3Y]V");
                    break;
                case 'L'://400
                    encryptedText=encryptedText.concat("7Foi#");
                    break;
                case 'M'://3600
                    encryptedText=encryptedText.concat("@mS<]");
                    break;
                case 'N'://3
                    encryptedText=encryptedText.concat("#$25@");
                    break;
                case 'O'://6
                    encryptedText=encryptedText.concat("tHN8#");
                    break;
                case 'P'://9
                    encryptedText=encryptedText.concat("%?xq5");
                    break;
                case 'Q'://14
                    encryptedText=encryptedText.concat("6hewq");
                    break;
                case 'R'://18
                    encryptedText=encryptedText.concat("K*285");
                    break;
                case 'S'://24
                    encryptedText=encryptedText.concat("GO#$v");
                    break;
                case 'T'://30
                    encryptedText=encryptedText.concat("LpiNV");
                    break;
                case 'U'://36
                    encryptedText=encryptedText.concat("3ypqe");
                    break;
                case 'V'://49
                    encryptedText=encryptedText.concat("cB)[8");
                    break;
                case 'W'://54
                    encryptedText=encryptedText.concat("a1HVc");
                    break;
                case 'X'://63
                    encryptedText=encryptedText.concat("@%fVB");
                    break;
                case 'Y'://72
                    encryptedText=encryptedText.concat("ZDQqv");
                    break;
                case 'Z'://84
                    encryptedText=encryptedText.concat("17=2N");
                    break;
                case '~'://96
                    encryptedText=encryptedText.concat("3}_qe");
                    break;
                case '!'://108
                    encryptedText=encryptedText.concat("%yWV#");
                    break;
                case '@'://128
                    encryptedText=encryptedText.concat("yGEc5");
                    break;
                case '#'://150
                    encryptedText=encryptedText.concat("rJASV");
                    break;
                case '$'://162
                    encryptedText=encryptedText.concat("HaI#x");
                    break;
                case '%'://192
                    encryptedText=encryptedText.concat("F*-$e");
                    break;
                case '^'://225
                    encryptedText=encryptedText.concat("@opmB");
                    break;
                case '&'://288
                    encryptedText=encryptedText.concat("!>b7+");
                    break;
                case '*'://320
                    encryptedText=encryptedText.concat("6D~gv");
                    break;
                case '('://360
                    encryptedText=encryptedText.concat("X&^+x");
                    break;
                case ')'://420
                    encryptedText=encryptedText.concat("1}S=V");
                    break;
                case '='://432
                    encryptedText=encryptedText.concat("4K_k8");
                    break;
                case '-'://480
                    encryptedText=encryptedText.concat("1G~jq");
                    break;
                case '_'://512
                    encryptedText=encryptedText.concat("(&-]B");
                    break;
                case '+'://576
                    encryptedText=encryptedText.concat("CuRQw");
                    break;
                case '['://630
                    encryptedText=encryptedText.concat("%^Ufe");
                    break;
                case ']'://648
                    encryptedText=encryptedText.concat("jQ?18");
                    break;
                case '{'://720
                    encryptedText=encryptedText.concat("HAdE#");
                    break;
                case '}'://800
                    encryptedText=encryptedText.concat("_oAZX");
                    break;
                case '/'://840
                    encryptedText=encryptedText.concat("TsoD2");
                    break;
                case ';'://960
                    encryptedText=encryptedText.concat("uoPgw");
                    break;
                case ':'://1050
                    encryptedText=encryptedText.concat("LHS~Y");
                    break;
                case '?'://1200
                    encryptedText=encryptedText.concat("!@9ig");
                    break;
                case '>'://1440
                    encryptedText=encryptedText.concat("^*a_#");
                    break;
                case ','://1600
                    encryptedText=encryptedText.concat("4&9oE");
                    break;
                case '<'://1680
                    encryptedText=encryptedText.concat("!%A=R");
                    break;
                case '.'://1800
                    encryptedText=encryptedText.concat("+io7n");
                    break;
                case 'a'://2000
                    encryptedText=encryptedText.concat("Sm9Dy");
                    break;
                case 'b'://2160
                    encryptedText=encryptedText.concat("!@^_+");
                    break;
                case 'c'://2250
                    encryptedText=encryptedText.concat("%^9iU");
                    break;
                case 'd'://2400
                    encryptedText=encryptedText.concat("@&9ig");
                    break;
                case 'e'://2500
                    encryptedText=encryptedText.concat("m~9GA");
                    break;
                case 'f'://2560
                    encryptedText=encryptedText.concat("!7i-g");
                    break;
                case 'g'://2880
                    encryptedText=encryptedText.concat("4yARk");
                    break;
                case 'h'://2800
                    encryptedText=encryptedText.concat("=9i7D");
                    break;
                case 'i'://3000
                    encryptedText=encryptedText.concat("7Si^a");
                    break;
                case 'j'://3200
                    encryptedText=encryptedText.concat("&7^i-");
                    break;
                case 'k'://450
                    encryptedText=encryptedText.concat("@^9*#");
                    break;
                case 'l'://500
                    encryptedText=encryptedText.concat("&9i^$");
                    break;
                case 'm'://540
                    encryptedText=encryptedText.concat("97{%e");
                    break;
                case 'n'://600
                    encryptedText=encryptedText.concat("@&ioL");
                    break;
                case 'o'://672
                    encryptedText=encryptedText.concat("4O=gw");
                    break;
                case 'p'://700
                    encryptedText=encryptedText.concat("7iofq");
                    break;
                case 'q'://750
                    encryptedText=encryptedText.concat("9io*$");
                    break;
                case 'r'://810
                    encryptedText=encryptedText.concat("!@1^+");
                    break;
                case 's'://900
                    encryptedText=encryptedText.concat("!9i+6");
                    break;
                case 't'://1000
                    encryptedText=encryptedText.concat("&9io4");
                    break;
                case 'u'://1080
                    encryptedText=encryptedText.concat("@!^*a");
                    break;
                case 'v'://1280
                    encryptedText=encryptedText.concat("!i-g4");
                    break;
                case 'w'://1500
                    encryptedText=encryptedText.concat("i@io&");
                    break;
                case 'x'://1620
                    encryptedText=encryptedText.concat("!@i*Q");
                    break;
                case 'y'://1750
                    encryptedText=encryptedText.concat("i!oi=");
                    break;
                case 'z'://1920
                    encryptedText=encryptedText.concat("!^*g&");
                    break;
                case ' '://2100
                    encryptedText=encryptedText.concat("!^*=o");
                    break;
                default://في حال ادخال حرف غير مدهوم يتم تفريغ المتغير المسؤول عن تخزين النص المشفر
                    System.out.println("حرف خاطئ !! ");
                    encryptedText = "حرف خاطئ !!!!!!!!!";
                    return ;
             }
        }

    }


}