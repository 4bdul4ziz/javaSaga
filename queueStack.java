import java.util.*;
//implement queue using stack

class queueStack {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    void enqueue(int data) {
        s1.push(data);
    }

    void dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        s2.pop();
    }
    int getFront() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    int getRear() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (s1.isEmpty()) {
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        return s1.peek();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        queueStack q = new queueStack();
        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Get front");
            System.out.println("4. Get rear");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the data");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    System.out.println(q.getFront());
                    break;
                case 4:
                    System.out.println(q.getRear());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}