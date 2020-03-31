package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student(8, "Ashish"));
        queue.display();
        queue.enqueue(new Student(3, "Arpit"));
        queue.display();
        queue.enqueue(new Student(1, "Akhilesh"));
        queue.display();
        queue.enqueue(new Student(2, "Mitti"));
        queue.display();
        queue.enqueue(new Student(5, "HelloKitty"));
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println("Que Size: " + queue.getSize());

    }
}
