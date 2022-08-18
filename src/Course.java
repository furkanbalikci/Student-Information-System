public class Course {
    Teacher courseTeacher;
    String name,code,prefix;
    int note,quizNote,quizPercentage;

    public Course(String name, String  code, String prefix, int quizPercentage){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.quizPercentage = quizPercentage;
        this.note = 0;
        this.quizNote = 0;
        getRateOfExamAndQuiz();

    }
    public void getRateOfExamAndQuiz(){
        this.quizNote = (this.quizPercentage*quizNote)/100;
        this.note = ((100-this.quizPercentage)*note)/100;
    }

    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("İşlem Başarılı");
        }else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez");
        }
    }
    public void printTeacher(){
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni: " + courseTeacher.name);
        }else {
            System.out.println(this.name + " dersine Akademisyen atanamamıştır.");
        }
    }
}
