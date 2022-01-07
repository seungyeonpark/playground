package mc.ys.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./student_info.txt"));
        ArrayList<Student> students = new ArrayList<>();
        
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            
            Student s = new Student();
            s.setStudentID(Integer.parseInt(line.substring(0, 6)));
            s.setEmail(line.substring(6, 10));
            s.setKor(Integer.parseInt(line.substring(10, 13).trim()));
            s.setEng(Integer.parseInt(line.substring(13, 16).trim()));
            s.setMath(Integer.parseInt(line.substring(16, 19).trim()));
            s.setScience(Integer.parseInt(line.substring(19, 22).trim()));
            s.setHistory(Integer.parseInt(line.substring(22, 25).trim()));
            s.setTotal(Integer.parseInt(line.substring(25, 28).trim()));
            s.setTeacherCode(line.charAt(28));
            s.setGrade(line.charAt(29));
            s.setLocalCode(line.charAt(30));
            
            students.add(s);
        }
        br.close();
    }

}
