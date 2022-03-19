public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int matP, int fizikP, int kimyaP) {

        if (mat >= 0 && mat <= 100 && matP >= 0 && matP <= 100) {
            this.mat.note = mat;
            this.mat.performanceNote = matP;
        }

        if (fizik >= 0 && fizik <= 100 && fizikP >= 0 && fizikP <= 100) {
            this.fizik.note = fizik;
            this.fizik.performanceNote = fizikP;
        }

        if (kimya >= 0 && kimya <= 100 && kimyaP >= 0 && kimyaP <= 100) {
            this.kimya.note = kimya;
            this.kimya.performanceNote = kimyaP;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
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
        double dersOrtalama = ((this.fizik.note * this.fizik.noteWeight) + (this.kimya.note * this.kimya.noteWeight) + (this.mat.note * this.mat.noteWeight)) / 3.0;
        double performansOrtalama = ((this.fizik.performanceNote * this.fizik.performanceWeight) + (this.kimya.performanceNote * this.kimya.performanceWeight) + (this.mat.performanceNote * this.mat.performanceWeight)) / 3.0;
        this.avarage = dersOrtalama + performansOrtalama;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " (%" + Math.round(this.mat.noteWeight*100) + ")");
        System.out.println("Matematik Sözlü : " + this.mat.performanceNote + " (%" + Math.round(this.mat.performanceWeight*100) + ")");
        System.out.println("Fizik Notu : " + this.fizik.note + " (%" + Math.round(this.fizik.noteWeight*100) + ")");
        System.out.println("Fizik Sözlü : " + this.fizik.performanceNote + " (%" + Math.round(this.fizik.performanceWeight*100) + ")");
        System.out.println("Kimya Notu : " + this.kimya.note + " (%" + Math.round(this.kimya.noteWeight*100) + ")");
        System.out.println("Kimya Sözlü : " + this.kimya.performanceNote + " (%" + Math.round(this.kimya.performanceWeight*100) + ")");
    }

}