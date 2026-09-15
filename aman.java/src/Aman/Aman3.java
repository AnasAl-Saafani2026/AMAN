package Aman;
public class Aman3 extends Encryption {//يرث من الكلاس Encryption

    @Override  //اعادة كتابة الدالة بشكل المطلوب
    public void encryption() {
        encryptedText = ""; //تجهيز المتغير بحيث يكون فارغ في اول الدالة
        int n = orginalText.length();
        for (int i = 0; i < n; i++) {
            char ch = orginalText.charAt(i);//تخزين الحرف  في متغير ثم تمريره الى سوتش لكي تتم عملية التشفير
            switch (ch) {
                case 'ا':
                    encryptedText = encryptedText.concat("$2qeV");//اضافة الشفره الى المتغير بحيث يتم اضافة الشفره الى نهاية النص
                    break;
                case 'ب':
                    encryptedText = encryptedText.concat("!(#85");
                    break;
                case 'ت':
                    encryptedText = encryptedText.concat("=BVve");
                    break;
                case 'ث':
                    encryptedText = encryptedText.concat("^!2cx");
                    break;
                case 'ج':
                    encryptedText = encryptedText.concat("~%wec");
                    break;
                case 'ح':
                    encryptedText = encryptedText.concat("(>i5N");
                    break;
                case 'خ':
                    encryptedText = encryptedText.concat("SAwqe");
                    break;
                case 'د':
                    encryptedText = encryptedText.concat("]D#$5");
                    break;
                case 'ذ':
                    encryptedText = encryptedText.concat("-^VBN");
                    break;
                case 'ر':
                    encryptedText = encryptedText.concat("ROxqw");
                    break;
                case 'ز':
                    encryptedText = encryptedText.concat("NBv_)");
                    break;
                case 'س':
                    encryptedText = encryptedText.concat("gj$#V");
                    break;
                case 'ش':
                    encryptedText = encryptedText.concat("^~@NB");
                    break;
                case 'ص':
                    encryptedText = encryptedText.concat("{Qe#2");
                    break;
                case 'ض':
                    encryptedText = encryptedText.concat("^F~VN");
                    break;
                case 'ط':
                    encryptedText = encryptedText.concat("7y=ex");
                    break;
                case 'ظ':
                    encryptedText = encryptedText.concat("{?S85");
                    break;
                case 'ع':
                    encryptedText = encryptedText.concat("DARBN");
                    break;
                case 'غ':
                    encryptedText = encryptedText.concat("ATSVN");
                    break;
                case 'ف':
                    encryptedText = encryptedText.concat("AES82");
                    break;
                case 'ق':
                    encryptedText = encryptedText.concat("3-+ev");
                    break;
                case 'ك':
                    encryptedText = encryptedText.concat("9U]82");
                    break;
                case 'ل':
                    encryptedText = encryptedText.concat("49<^5");
                    break;
                case 'م':
                    encryptedText = encryptedText.concat("Q7k52");
                    break;
                case 'ن':
                    encryptedText = encryptedText.concat("gsj8V");
                    break;
                case 'ه':
                    encryptedText = encryptedText.concat("^7o=9");
                    break;
                case 'و':
                    encryptedText = encryptedText.concat("#$v!x");
                    break;
                case 'ي':
                    encryptedText = encryptedText.concat("5BNx9");
                    break;
                case '1':
                    encryptedText = encryptedText.concat("R#Nx8");
                    break;
                case '2':
                    encryptedText = encryptedText.concat("&@528");
                    break;
                case '3':
                    encryptedText = encryptedText.concat("uDNcv");
                    break;
                case '4':
                    encryptedText = encryptedText.concat("%Tqwv");
                    break;
                case '5':
                    encryptedText = encryptedText.concat("13p$v");
                    break;
                case '6':
                    encryptedText = encryptedText.concat("^YxNe");
                    break;
                case '7':
                    encryptedText = encryptedText.concat("1HAq#");
                    break;
                case '8':
                    encryptedText = encryptedText.concat("m~t$#");
                    break;
                case '9':
                    encryptedText = encryptedText.concat("9!XJB");
                    break;
                case '0':
                    encryptedText = encryptedText.concat("69h8e");
                    break;
                case 'A':
                    encryptedText = encryptedText.concat("69g82");
                    break;
                case 'B':
                    encryptedText = encryptedText.concat("5Q4~#");
                    break;
                case 'C':
                    encryptedText = encryptedText.concat("9=3Vv");
                    break;
                case 'D':
                    encryptedText = encryptedText.concat("$&^*#");
                    break;
                case 'E':
                    encryptedText = encryptedText.concat("!5-8+");
                    break;
                case 'F':
                    encryptedText = encryptedText.concat("[@VN]");
                    break;
                case 'G':
                    encryptedText = encryptedText.concat("UBAON");
                    break;
                case 'H':
                    encryptedText = encryptedText.concat("(539)");
                    break;
                case 'I':
                    encryptedText = encryptedText.concat("68-4]");
                    break;
                case 'J':
                    encryptedText = encryptedText.concat("CVGAT");
                    break;
                case 'K':
                    encryptedText = encryptedText.concat("ZHTRN");
                    break;
                case 'L':
                    encryptedText = encryptedText.concat("FAGSN");
                    break;
                case 'M':
                    encryptedText = encryptedText.concat("ROKAS");
                    break;
                case 'N':
                    encryptedText = encryptedText.concat("5#@$8");
                    break;
                case 'O':
                    encryptedText = encryptedText.concat("23458");
                    break;
                case 'P':
                    encryptedText = encryptedText.concat("HVKBN");
                    break;
                case 'Q':
                    encryptedText = encryptedText.concat("zfxcv");
                    break;
                case 'R':
                    encryptedText = encryptedText.concat("JOBN8");
                    break;
                case 'S':
                    encryptedText = encryptedText.concat("*#VB&");
                    break;
                case 'T':
                    encryptedText = encryptedText.concat("ZHABN");
                    break;
                case 'U':
                    encryptedText = encryptedText.concat("UO#$5");
                    break;
                case 'V':
                    encryptedText = encryptedText.concat("=wefc");
                    break;
                case 'W':
                    encryptedText = encryptedText.concat("{N?2>");
                    break;
                case 'X':
                    encryptedText = encryptedText.concat("5=3V1");
                    break;
                case 'Y':
                    encryptedText = encryptedText.concat("WwCcu");
                    break;
                case 'Z':
                    encryptedText = encryptedText.concat("53=78");
                    break;
                case '~':
                    encryptedText = encryptedText.concat("45*-8");
                    break;
                case '!':
                    encryptedText = encryptedText.concat("(PQxc");
                    break;
                case '@':
                    encryptedText = encryptedText.concat("!-_qw");
                    break;
                case '#':
                    encryptedText = encryptedText.concat("9483A");
                    break;
                case '$':
                    encryptedText = encryptedText.concat("CQWBN");
                    break;
                case '%':
                    encryptedText = encryptedText.concat("HERVN");
                    break;
                case '^':
                    encryptedText = encryptedText.concat("(9o31");
                    break;
                case '&':
                    encryptedText = encryptedText.concat("7-+5#");
                    break;
                case '*':
                    encryptedText = encryptedText.concat("-4579");
                    break;
                case '(':
                    encryptedText = encryptedText.concat("+5679");
                    break;
                case ')':
                    encryptedText = encryptedText.concat("(5*9)");
                    break;
                case '=':
                    encryptedText = encryptedText.concat("63gkx");
                    break;
                case '-':
                    encryptedText = encryptedText.concat("@7Aj5");
                    break;
                case '_':
                    encryptedText = encryptedText.concat("-_gqe");
                    break;
                case '+':
                    encryptedText = encryptedText.concat("ER+qw");
                    break;
                case '[':
                    encryptedText = encryptedText.concat("=@^*#");
                    break;
                case ']':
                    encryptedText = encryptedText.concat("67+5}");
                    break;
                case '{':
                    encryptedText = encryptedText.concat("Xxmgl");
                    break;
                case '}':
                    encryptedText = encryptedText.concat("69-4o");
                    break;
                case '/':
                    encryptedText = encryptedText.concat("&^*)#");
                    break;
                case ';':
                    encryptedText = encryptedText.concat("?ijgv");
                    break;
                case ':':
                    encryptedText = encryptedText.concat("63ohi");
                    break;
                case '?':
                    encryptedText = encryptedText.concat("t?m]o");
                    break;
                case '>':
                    encryptedText = encryptedText.concat("mug{5");
                    break;
                case ',':
                    encryptedText = encryptedText.concat("SEARB");
                    break;
                case '<':
                    encryptedText = encryptedText.concat("msfjv");
                    break;
                case '.':
                    encryptedText = encryptedText.concat("^ogke");
                    break;


                case 'a':
                    encryptedText = encryptedText.concat("~!o_S");
                    break;
                case 'b':
                    encryptedText = encryptedText.concat("639_+");
                    break;
                case 'c':
                    encryptedText = encryptedText.concat("!^9A+");
                    break;
                case 'd':
                    encryptedText = encryptedText.concat("9S*]L");
                    break;
                case 'e':
                    encryptedText = encryptedText.concat("AS7om");
                    break;
                case 'f':
                    encryptedText = encryptedText.concat("^ER]c");
                    break;
                case 'g':
                    encryptedText = encryptedText.concat("mgjkv");
                    break;
                case 'h':
                    encryptedText = encryptedText.concat("&7=om");
                    break;
                case 'i':
                    encryptedText = encryptedText.concat("i&AOm");
                    break;
                case 'j':
                    encryptedText = encryptedText.concat("FGRAm");
                    break;
                case 'k':
                    encryptedText = encryptedText.concat("r9+i#");
                    break;
                case 'l':
                    encryptedText = encryptedText.concat("7S8A~");
                    break;
                case 'm':
                    encryptedText = encryptedText.concat("459PW");
                    break;
                case 'n':
                    encryptedText = encryptedText.concat("!%^9&");
                    break;
                case 'o':
                    encryptedText = encryptedText.concat("HT-78");
                    break;
                case 'p':
                    encryptedText = encryptedText.concat("yo=m8");
                    break;
                case 'q':
                    encryptedText = encryptedText.concat("^693m");
                    break;
                case 'r':
                    encryptedText = encryptedText.concat("@A%*1");
                    break;
                case 's':
                    encryptedText = encryptedText.concat("1379o");
                    break;
                case 't':
                    encryptedText = encryptedText.concat("^9~]8");
                    break;
                case 'u':
                    encryptedText = encryptedText.concat("HDUAJ");
                    break;
                case 'v':
                    encryptedText = encryptedText.concat("7-9g8");
                    break;
                case 'w':
                    encryptedText = encryptedText.concat("i7mpo");
                    break;
                case 'x':
                    encryptedText = encryptedText.concat("+3179");
                    break;
                case 'y':
                    encryptedText = encryptedText.concat("noihm");
                    break;
                case 'z':
                    encryptedText = encryptedText.concat("@&^_G");
                    break;
                case ' ':
                    encryptedText = encryptedText.concat("3=97o");
                    break;
                default:
                    System.out.println(" wrong laters !! ");
                    encryptedText = "wrong later !!!!!!!!!";
                    return;
            }
        }

    }
}