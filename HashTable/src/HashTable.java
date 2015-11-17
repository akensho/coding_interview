import java.util.HashMap;

/**
 * Created by akensho on 2015/11/17.
 */

public class HashTable {
    static class Student{
        private int id;
        private String name;

        Student(int id, String name){
            this.id = id;
            this.name = name;
        }

        public int getId(){
            return this.id;
        }
    }

    public static void main(String... args){
        Student student = new Student(1, "aoki");
        //System.out.println(student.name);
        Student[] students = new Student[100];
        for(int id = 1; id < 100; id++) students[id] = new Student(id, "fgt");
        HashMap<Integer, Student> studentHashMap = buildMap(students);
    }

    public static HashMap<Integer, Student> buildMap(Student[] students){
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        for(Student s: students){
            map.put(s.getId(), s);
        }
        return map;
    }
}
