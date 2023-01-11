//implement queue using array, the capacity of the queue is given by the user
import java.util.*;
class queueSTS
{
    int front, rear, size, capacity;
    int queue[];
    queueSTS(int c)
    {
        front = rear = 0;
        size = 0;
        capacity = c;
        queue = new int[capacity];
    }
    void enqueue(int data)
    {
        if(size == capacity)
        {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1) % capacity;
        size++;
    }
    void dequeue()
    {
        if(size == 0)
        {
            System.out.println("Queue is empty");
            return;
        }
        front = (front + 1) % capacity;
        size--;
    }
    int getFront()
    {
        if(size == 0)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    int getRear()
    {
        if(size == 0)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[rear - 1];
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the queue");
        int c = sc.nextInt();
        queueSTS q = new queueSTS(c);
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
                    System.out.println("Enter the data");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    System.out.println("Front element is " + q.getFront());
                    break;
                case 4:
                    System.out.println("Rear element is " + q.getRear());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


