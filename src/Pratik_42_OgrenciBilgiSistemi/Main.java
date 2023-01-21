package Pratik_42_OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course dbms = new Course("Veritabanı Yönetimi ve Modellemesi", "301", "DBMS");


        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");
        Teacher t4 = new Teacher("Elon Musk", "12213213", "DBMS");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        dbms.addTeacher(t4);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya, dbms);
        s1.addBulkExamNote(100, 20, 40, 60);
        s1.addBulkVerbalNotes(10, 100, 100, 100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya, dbms);
        s2.addBulkExamNote(0, 50, 40, 50);
        s2.addBulkVerbalNotes(10, 100, 100, 100);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya, dbms);
        s3.addBulkExamNote(50, 20, 40, 76);
        s3.addBulkVerbalNotes(60, 50, 10, 70);
        s3.isPass();

        Student s4 = new Student("Akın", 4, "21321321", mat, fizik, kimya, dbms);
        s4.addBulkExamNote(90, 50, 40, 100);
        s4.addBulkVerbalNotes(60, 70, 80, 76);
        s4.isPass();

        dbms.printTeacher();

    }
}

