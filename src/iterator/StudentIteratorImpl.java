package iterator;

import java.util.List;

// 具体迭代器角色
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> studentList;
    private int index = 0;

    public StudentIteratorImpl(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        Student currentStudent = studentList.get(index);
        index ++;
        return currentStudent;
    }
}
