#!/bin/bash


echo "═══════════════════════════════════"
echo "🔐 تثبيت أداة AMAN"
echo "═══════════════════════════════════"


# 1. التحقق من وجود Java
if ! command -v javac &> /dev/null; then
    echo "❌ Java JDK غير مثبتة. جاري التثبيت..."
    sudo apt update
    sudo apt install -y default-jdk
fi


echo "✅ Java مثبتة"


# 2. الانتقال إلى مجلد الكلاسات
cd aman.java/scr/Aman
if [ ! -d "$(pwd)" ] || [ ! -f "Main.java"]; then
echo "❌ لم يتم العثور على مجلد الكلاسات !"
exit 1
fi
echo "📦 المسار الحالي: $(pwd)"


# 3. ترجمة المشروع
echo "📦 جاري ترجمة المشروع..."
javac *.java


if [ $? -ne 0 ]; then
    echo "❌ فشلت الترجمة!"
    exit 1
fi


echo "✅ تمت الترجمة بنجاح"


# 4. إنشاء ملف JAR
echo "📦 جاري إنشاء ملف JAR..."
jar cfe AMAN.jar Aman.Main *.class


echo "✅ تم إنشاء AMAN.jar"


# 5. إنشاء مجلد التثبيت
sudo mkdir -p /opt/AMAN


# 6. نسخ ملف JAR
sudo cp AMAN.jar /opt/AMAN/


# 7. إنشاء سكربت التشغيل AMAN
sudo tee /usr/local/bin/AMAN > /dev/null << 'EOF'
#!/bin/bash
java -jar /opt/AMAN/AMAN.jar
EOF


# 8. إعطاء صلاحية التنفيذ
sudo chmod +x /usr/local/bin/AMAN
sudo chmod +x /opt/AMAN/AMAN.jar


# 9. التحقق
echo ""
echo "═══════════════════════════════════"
echo "🎉 تم التثبيت بنجاح!"
echo "═══════════════════════════════════"
echo ""
echo "للاستخدام:"
echo "  AMAN -e \"النص\" -k المفتاح -a الخوارزمية"
echo ""
