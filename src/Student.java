public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya){
        if (mat >= 0 & mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 & fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 & kimya <= 100) {
            this.kimya.note = kimya;
        }


    }

    public void  addQuizExamNote(int mat,int fizik, int kimya){
        if (mat >= 0 & mat <= 100) {
            this.mat.quizNote = mat;
        }
        if (fizik >= 0 & fizik <= 100) {
            this.fizik.quizNote = fizik;
        }
        if (kimya >= 0 & kimya <= 100) {
            this.kimya.quizNote = kimya;
        }

    }


    public void isPass(){
        if (this.mat.note == 0 | this.fizik.note == 0 | this.kimya.note == 0){
            System.out.println("Notlar eksik girilmiş.");
        }else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAverage(){
        this.average = ((this.fizik.note + this.fizik.quizNote)/2 +  (this.kimya.note + this.kimya.quizNote)/2 + (this.mat.note + this.mat.quizNote)/2 )/ 3;
    }
    public  boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.quizNote);

        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.quizNote);

        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.quizNote);
    }
}
