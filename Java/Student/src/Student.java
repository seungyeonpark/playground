package mc.ys.assignment2;

public class Student {
    private int studentID;
    private String email;
    private int kor;
    private int eng;
    private int math;
    private int science;
    private int history;
    private int total;
    private char teacherCode;
    private char grade;
    private char localCode;
    
    public int getStudentID() {
        return studentID;
    }
    
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getKor() {
        return kor;
    }
    
    public void setKor(int kor) {
        this.kor = kor;
    }
    
    public int getEng() {
        return eng;
    }
    
    public void setEng(int eng) {
        this.eng = eng;
    }
    
    public int getMath() {
        return math;
    }
    
    public void setMath(int math) {
        this.math = math;
    }
    
    public int getScience() {
        return science;
    }
    
    public void setScience(int science) {
        this.science = science;
    }
    
    public int getHistory() {
        return history;
    }
    
    public void setHistory(int history) {
        this.history = history;
    }
    
    public int getTotal() {
        return total;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    
    public char getTeacherCode() {
        return teacherCode;
    }
    
    public void setTeacherCode(char teacherCode) {
        this.teacherCode = teacherCode;
    }
    
    public char getGrade() {
        return grade;
    }
    
    public void setGrade(char grade) {
        this.grade = grade;
    }
    
    public char getLocalCode() {
        return localCode;
    }
    
    public void setLocalCode(char localCode) {
        this.localCode = localCode;
    }
}
