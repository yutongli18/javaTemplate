package iterator;

public class Client {

    public static void main(String[] args) {

        // 创建聚合对象
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        aggregate.addStudent(new Student("张三", "001"));
        aggregate.addStudent(new Student("李四", "002"));
        aggregate.addStudent(new Student("王五", "003"));
        // 获取迭代器角色
        StudentIterator studentIterator = aggregate.getStudentIterator();
        // 遍历
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }
    }
}
