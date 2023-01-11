import java.util.*;

class queueLinkedList
{
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    Node front, rear;
    queueLinkedList()
    {
        front = rear = null;
    }
    void enqueue(int data)
    {
        Node temp = new Node(data);
        if(front == null)
        {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }
    void dequeue()
    {
        if(front == null)
        {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        if(front == null)
            rear = null;
    }
    int getFront()
    {
        if(front == null)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
    int getRear()
    {
        if(rear == null)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return rear.data;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        queueLinkedList q = new queueLinkedList();
        while(true)
        {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Get front");
            System.out.println("4. Get rear");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the data to be inserted");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    System.out.println("The front element is " + q.getFront());
                    break;
                case 4:
                    System.out.println("The rear element is " + q.getRear());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}