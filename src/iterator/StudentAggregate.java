package iterator;

// 抽象聚合对象
public interface StudentAggregate {

    // 增删聚合对象
    void addStudent(Student student);
    void removeStudent(Student student);

    // 获取迭代器对象
    StudentIterator getStudentIterator();
}
