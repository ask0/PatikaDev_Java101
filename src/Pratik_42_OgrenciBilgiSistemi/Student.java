package Pratik_42_OgrenciBilgiSistemi;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course dbms;
    double avarage;
    boolean isPass;
    double percentage1 = 20;
    double percentage2 = 80;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya, Course dbms) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.dbms = dbms;
        calcAvarage();
        this.isPass = false;
    }
    public void addBulkExamNote(int mat, int fizik, int kimya, int dbms) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (dbms >= 0 && dbms <= 100) {
            this.dbms.note = dbms;
        }

    }

    public void addBulkVerbalNotes(int mat, int fizik, int kimya, int dbms) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note2 = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note2 = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note2 = kimya;
        }

        if (dbms >= 0 && dbms <= 100) {
            this.dbms.note2 = dbms;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.dbms.note == 0 || this.mat.note2 == 0 || this.fizik.note2 == 0 || this.kimya.note2 == 0 || this.dbms.note2 == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note + this.kimya.note + this.mat.note + this.dbms.note) * percentage2 / 100 + (this.fizik.note2 + this.kimya.note2 + this.mat.note2 + this.dbms.note2) * percentage1 / 100) / 4;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Dbms Notu : " + this.dbms.note);
    }

}
