 class Student {
    String name;
    int rollNo;
    int marks;
    Student(String name,int rollNo,int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public void printStudentDetails(){
        System.out.println("-------");
        System.out.println("*******");
        System.out.println("Name of Student:"+name);
        System.out.println("Student rollNo:" +rollNo);
        System.out.println("Student of Marks:"+ marks);
        System.out.println("--------");
        System.out.println("*******");
    }
    public static void main(String[] args) {
        Student s1 = new Student("Riya",12,90);
        s1.printStudentDetails();
        Student s2 = new Student("Priya",13,99);
        s2.printStudentDetails();

    }
    
}
