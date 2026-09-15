package Aman;
public abstract class Encryption
{

        protected String orginalText;//جعل النص بروتكتد لكي يكون مرئي للكلاسات الابناء

        public void setOrginalText(String orginalText) {
            this.orginalText = orginalText;
        }//استقبال النص من الكلاس المين واستخدامة في الكلاسات الابناء
        protected String encryptedText;//متفير لتخزين النص المشفر
        abstract void encryption ();// الدالة المسؤولة عن التشفير تم وضعة مجرد لكي يتم اعادة كتابة في كل ابن

        public String getEncryptedText()//الدالة المسؤولة عن ارجاع النص بعد تشفيره الى الدالة الرئيسية
        {
            encryption();//استدعاء الدالة التي تقوم بالتشفير
            return encryptedText;//ارجاع النص المشفر
        }

}