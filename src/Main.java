import com.workintech.example.BankAccount;
import org.w3c.dom.ls.LSOutput;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1234353, 2000.00, "Şevval", "sevvala@gmail.com", "ab123as");
        System.out.println(account1.getAccountBalance());
        account1.withdraw(2500);
        System.out.println(account1.getAccountBalance());
        account1.deposit(2500);
        System.out.println(account1.getAccountBalance());
        account1.withdraw(1500);
        System.out.println(account1.getAccountBalance());
        Queue<String> pq = new PriorityQueue<>();
        pq.add("Hello");
        pq.add("HackkerRank");
        String s1 = pq.poll();
        pq.remove();
        System.out.println(s1);
        // String s2 = pq.remove();
        // System.out.println(s2);
        PriorityQueue toDo = new PriorityQueue();
        toDo.add("dishes");
        toDo.add("laundry");
        toDo.add("bills");
        toDo.offer("bills");
        System.out.println(toDo.size() + " " + toDo.poll());
        System.out.println(" " + toDo.peek() + " " + toDo.poll());
        System.out.println(" " + toDo.poll() + " " + toDo.poll());
        int x = 0;
        for(int i = 0; i < 10000000; i++){
            x = x + 1;
        }
        System.out.println(x);
        int a = 1;
        double b = 3.5;
        float c = 3597.3F;
        long d = 30000000000L;
        System.out.println((a+d)*(c+b));

        class Parent{
            void print(String text){
                System.out.println("String: " + text);
            }
            void print(int number){
                System.out.println("Integer: " + number);
            }
        }
        class Child extends Parent{
            void print(int number){
                System.out.println("I am a child" + number);
            }
            void print(float number){
                System.out.println("Float: " + number);
            }
        }
        Parent p = new Parent();
        p.print(5);
        p = new Child();
        //p.print(2.3f);
        class A {
            static int add(int i , int j){
                return i + j;
            }
        }
        class B extends A {
            public static void main(String[] args) {
                short s = 9;
                System.out.println(add(s,6));
            }
        }
    };
}





