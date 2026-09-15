package Aman;
public class Decryption
{

    String orginalText="";//لاستقبال النص قبل فك التشفير

    public void setOrginalText(String orginalText) {
        this.orginalText = orginalText;
    }
    private String number = "";// لتخزين قيمة النص بصوره ارقام
    void toNumber (String orginalText)//لتحويل النص المشفر لي صوره رقمية
    {
        int size=orginalText.length();// لتخزين حجم النص قبل تحويلة الى ارقام
        if (size%5!=0)//للتحقق من حجم النص قبل تحويلة الى ارقام
        {
            System.out.println("wrong size!!!");
            return ;
        }

        for(int i=0;i<size;i++)//دوارة للمرور على جميع عناصر النص
        {
            switch (orginalText.charAt(i))//تحويل كل حرف على حده الى قيمته الرقمية
            {
                case '#':
                case '$':
                case '5':
                case '2':
                case '8':
                case 'q':
                case 'w':
                case 'e':
                case 'V':
                case 'B':
                case 'N':
                case 'x':
                case 'c':
                case 'v':
                   number=number.concat("1");//جميع الرموز السابقة تتحول الى القيمة 1
                    break;
                case '!':
                case '(':
                case '4':
                case '6':
                case 'r':
                case 't':
                case 'L':
                case 'Z':
                case 'X':
                case 'C':
                case 'z':
                case 'b':
                case 'n':
                case '>':
                    number=number.concat("2");//جميع الرموز السابقة تتحول الى القيمة 2
                    break;
                case '@':
                case '%':
                case '1':
                case '3':
                case 'p':
                case 'H':
                case 'J':
                case 'K':
                case '?':
                    number=number.concat("3");//جميع الرموز السابقة تتحول الى القيمة 3
                    break;
                case '&':
                case '7':
                case 'y':
                case 'u':
                case 'D':
                case 'F':
                case 'G':
                case '}':
                    number=number.concat("4");//جميع الرموز السابقة تتحول الى القيمة 4
                    break;
                case '^':
                case '9':
                case 'i':
                case 'o':
                case 'A':
                case 'S':
                case 'm':
                case '~':
                    number=number.concat("5");//جميع الرموز السابقة تتحول الى القيمة 5
                    break;
                case '*':
                case 'a':
                case 's':
                case 'd':
                case 'U':
                case 'O':
                case 'P':
                case '<':
                    number=number.concat("6");//جميع الرموز السابقة تتحول الى القيمة 6
                    break;
                case ')':
                case '=':
                case 'f':
                case 'h':
                case 'T':
                case 'Y':
                case '[':
                    number=number.concat("7");//جميع الرموز السابقة تتحول الى القيمة 7
                    break;
                case '-':
                case '_':
                case 'g':
                case 'j':
                case 'E':
                case 'R':
                case ']':
                    number=number.concat("8");//جميع الرموز السابقة تتحول الى القيمة 8
                    break;
                case '+':
                case 'k':
                case 'I':
                case 'Q':
                case 'W':
                case 'l':
                case '{':
                    number=number.concat("9");//جميع الرموز السابقة تتحول الى القيمة 9
                    break;
                default://اذا كان هناك رمز غير الموجوده في السويتش يتم تفريغ المتفير number والذي يحتوي على نص ثم الخروج من الدالة
                    System.out.println("wrong code!!");
                    number="";
                    return;

            }

        }
        return;
    }
    private String text="";//متغير من نوع نصي لتخزين النص بعد فك تشفيره


    void toText()//الدالة المسؤولة عن تحويل النص الذي بصيغة رقمية الى النص المفكوك
    {
        int size = number.length();//لمعرفة طول النص الرقمي
        if(size==0)
        {
            text=null;
            return;
        }
        int temp=1;//المتغير الذي سيتم استخدامه كحاوية تخزن مضروب 5 ارقام ثم تحويل هذا الرقم الى الحرف المفكوك
        for(int i=0;i<size;i+=5)//دوارة تمر على كل اول رقم سيتم ضربه
        {
            for(int j=i;j<i+5;j++)//دوارة مخصصه لضرب كل 5 ارقام مع بعض
            {
                temp = temp *(number.charAt(j)-48);//تم طرح 48 بسبب فارق قيمة ASCII عن قيمة الرقم بصورته الطبيعية
            }
            switch (temp)//ادخال حاصل الضرب الى السوتش لتحويلة الى قيمته الحرفية
            {
                case 1:
                    text=text.concat("ا");
                    break;
                case 4:
                    text=text.concat("ب");
                    break;
                case 7:
                    text=text.concat("ت");
                    break;
                case 10:
                    text=text.concat("ث");
                    break;
                case 15:
                    text=text.concat("ج");
                    break;
                case 20:
                    text=text.concat("ح");
                    break;
                case 25:
                    text=text.concat("خ");
                    break;
                case 32:
                    text=text.concat("د");
                    break;
                case 40:
                    text=text.concat("ذ");
                    break;
                case 48:
                    text=text.concat("ر");
                    break;
                case 56:
                    text=text.concat("ز");
                    break;
                case 64:
                    text=text.concat("س");
                    break;
                case 75:
                    text=text.concat("ش");
                    break;
                case 81:
                    text=text.concat("ص");
                    break;
                case 100:
                    text=text.concat("ض");
                    break;
                case 112:
                    text=text.concat("ط");
                    break;
                case 135:
                    text=text.concat("ظ");
                    break;
                case 160:
                    text=text.concat("ع");
                    break;
                case 175:
                    text=text.concat("غ");
                    break;
                case 200:
                    text=text.concat("ف");
                    break;
                case 216:
                    text=text.concat("ق");
                    break;
                case 240:
                    text=text.concat("ك");
                    break;
                case 300:
                    text=text.concat("ل");
                    break;
                case 324:
                    text=text.concat("م");
                    break;
                case 384:
                    text=text.concat("ن");
                    break;
                case 3500:
                    text=text.concat("ه");
                    break;
                case 2:
                    text=text.concat("و");
                    break;
                case 5:
                    text=text.concat("ي");
                    break;
                case 8:
                    text=text.concat("1");
                    break;
                case 12:
                    text=text.concat("2");
                    break;
                case 16:
                    text=text.concat("3");
                    break;
                case 21:
                    text=text.concat("4");
                    break;
                case 27:
                    text=text.concat("5");
                    break;
                case 35:
                    text=text.concat("6");
                    break;
                case 45:
                    text=text.concat("7");
                    break;
                case 50:
                    text=text.concat("8");
                    break;
                case 60:
                    text=text.concat("9");
                    break;
                case 70:
                    text=text.concat("0");
                    break;
                case 80:
                    text=text.concat("A");
                    break;
                case 90:
                    text=text.concat("B");
                    break;
                case 105:
                    text=text.concat("C");
                    break;
                case 120:
                    text=text.concat("D");
                    break;
                case 144:
                    text=text.concat("E");
                    break;
                case 168:
                    text=text.concat("F");
                    break;
                case 180:
                    text=text.concat("G");
                    break;
                case 210:
                    text=text.concat("H");
                    break;
                case 256:
                    text=text.concat("I");
                    break;
                case 280:
                    text=text.concat("J");
                    break;
                case 336:
                    text=text.concat("K");
                    break;
                case 400:
                    text=text.concat("L");
                    break;
                case 3600:
                    text=text.concat("M");
                    break;
                case 3:
                    text=text.concat("N");
                    break;
                case 6:
                    text=text.concat("O");
                    break;
                case 9:
                    text=text.concat("P");
                    break;
                case 14:
                    text=text.concat("Q");
                    break;
                case 18:
                    text=text.concat("R");
                    break;
                case 24:
                    text=text.concat("S");
                    break;
                case 30:
                    text=text.concat("T");
                    break;
                case 36:
                    text=text.concat("U");
                    break;
                case 49:
                    text=text.concat("V");
                    break;
                case 54:
                    text=text.concat("W");
                    break;
                case 63:
                    text=text.concat("X");
                    break;
                case 72:
                    text=text.concat("Y");
                    break;
                case 84:
                    text=text.concat("Z");
                    break;
                case 96:
                    text=text.concat("~");
                    break;
                case 108:
                    text=text.concat("!");
                    break;
                case 128:
                    text=text.concat("@");
                    break;
                case 150:
                    text=text.concat("#");
                    break;
                case 162:
                    text=text.concat("$");
                    break;
                case 192:
                    text=text.concat("%");
                    break;
                case 225:
                    text=text.concat("^");
                    break;
                case 288:
                    text=text.concat("&");
                    break;
                case 320:
                    text=text.concat("*");
                    break;
                case 360:
                    text=text.concat("(");
                    break;
                case 420:
                    text=text.concat(")");
                    break;
                case 432:
                    text=text.concat("=");
                    break;
                case 480:
                    text=text.concat("-");
                    break;
                case 512:
                    text=text.concat("_");
                    break;
                case 576:
                    text=text.concat("+");
                    break;
                case 630:
                    text=text.concat("[");
                    break;
                case 648:
                    text=text.concat("]");
                    break;
                case 720:
                    text=text.concat("{");
                    break;
                case 800:
                    text=text.concat("}");
                    break;
                case 840:
                    text=text.concat("/");
                    break;
                case 960:
                    text=text.concat(";");
                    break;
                case 1050:
                    text=text.concat(":");
                    break;
                case 1200:
                    text=text.concat("?");
                    break;
                case 1440:
                    text=text.concat(">");
                    break;
                case 1600:
                    text=text.concat(",");
                    break;
                case 1680:
                    text=text.concat("<");
                    break;
                case 1800:
                   text= text.concat(".");
                    break;
                case 2000:
                    text=text.concat("a");
                    break;
                case 2160:
                    text=text.concat("b");
                    break;
                case 2250:
                    text=text.concat("c");
                    break;
                case 2400:
                    text=text.concat("d");
                    break;
                case 2500:
                    text=text.concat("e");
                    break;
                case 2560:
                    text=text.concat("f");
                    break;
                case 2880:
                    text=text.concat("g");
                    break;
                case 2800:
                    text=text.concat("h");
                    break;
                case 3000:
                    text=text.concat("i");
                    break;
                case 3200:
                    text=text.concat("j");
                    break;
                case 450:
                    text=text.concat("k");
                    break;
                case 500:
                    text=text.concat("l");
                    break;
                case 540:
                    text=text.concat("m");
                    break;
                case 600:
                    text=text.concat("n");
                    break;
                case 672:
                    text=text.concat("o");
                    break;
                case 700:
                    text=text.concat("p");
                    break;
                case 750:
                    text=text.concat("q");
                    break;
                case 810:
                    text=text.concat("r");
                    break;
                case 900:
                    text=text.concat("s");
                    break;
                case 1000:
                    text=text.concat("t");
                    break;
                case 1080:
                    text=text.concat("u");
                    break;
                case 1280:
                    text=text.concat("v");
                    break;
                case 1500:
                    text=text.concat("w");
                    break;
                case 1620:
                    text=text.concat("x");
                    break;
                case 1750:
                    text=text.concat("y");
                    break;
                case 1920:
                    text=text.concat("z");
                    break;
                case 2100:
                    text=text.concat(" ");
                    break;
                default:
                    text=null;
                    System.out.println("wrong !!! ");
                    return;
            }
            temp=1;//ارجاع قيمتة الى 1 لكي يبدا بتخزين حاصل ضرب ال5 الارقام التالية
        }

    }
    public String getText() {
        toNumber(orginalText);
        toText();//استدعاء الدالة قبل ارجاع القيمة
        return text;
    }// دالة لاخراج النص المفكوك الى دالة المين

}