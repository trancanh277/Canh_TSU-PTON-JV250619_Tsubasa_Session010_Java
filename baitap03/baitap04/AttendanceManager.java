package baitap04;

import java.util.ArrayList;

public class AttendanceManager implements Manager<Student> {
public ArrayList<Student> students;
public AttendanceManager() {
    students = new ArrayList<>();

}
    @Override
    public void add(Student item) {

    students.add(item);
    }

    @Override
    public void update(int index, Student item) {
    if(index >= 0 && index < students.size()) {
        students.set(index, item);
    }
    }

    @Override
    public void delete(int index) {
    if(index >= 0 && index < students.size()) {
        students.remove(index);
    }
    }

    @Override
    public void display() {
    if(students.isEmpty()){
        System.out.println("Chưa có sinh viên nào trong danh sách.");

    }else
        for(Student item : students) {
            System.out.println(item);
        }
    }
}
