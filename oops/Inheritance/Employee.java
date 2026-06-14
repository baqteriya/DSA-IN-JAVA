class Employee {
    String CompanyName;
    int id;
    Employee(String CompanyName, int id){
        this.CompanyName = CompanyName;
        this.id = id;
    }
    
}
class Manager extends Employee{
    Manager(String CompanyName, int id){
        super(CompanyName, id);
    }


}
class Developer extends  Manager{
    Developer(String CompanyName, int id){
        super(CompanyName, id);
    }
    public  void printDisplay(){
        System.out.println("------");
        System.out.println("******");
        System.out.println("Name of company:"+CompanyName);
        System.out.println("Company id:"+ id);
        System.out.println("******");
        System.out.println("------");
    }

public static void main(String args[]){
    Developer developer = new Developer("Google",1110);
    developer.printDisplay();
}
}
