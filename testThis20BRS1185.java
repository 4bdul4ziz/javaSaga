

public class testThis20BRS1185 {
    class Student{
        int rollno;
        String name;
        float fee;
        Student(int rollno,String name,float fee){
            this.rollno=rollno;
            this.name=name;
            this.fee=fee;
        }

        void display() {
            System.out.println(rollno + " " + name + " " + fee);
        }
        

    }
    public static void main(String args[]){
        testThis20BRS1185 t = new testThis20BRS1185();
        Student s1 = t.new Student(111,"Bala",5000f);
        Student s2 = t.new Student(112,"Sundaram",6000f);
        s1.display();
        s2.display();
    }
    
}

