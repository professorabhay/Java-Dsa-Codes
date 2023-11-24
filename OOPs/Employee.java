class Employee {
    private int empID = 2;
    private int baseSal = 20000;
    private int incentive = 200;
    private String name = "Abhay";
    static int age = 35;

    void totalSal(){
        System.out.println(baseSal + incentive);
    }

    Employee(){
        empID = 100;
        name = "Default";
    }

    // private Employee(){
    //     empID = 100;
    //     name = "Default";
    // }

    Employee (int id, String empNam){
        empID = id;
        name = empNam;
    // Parameterised Constructor
    }

    // getter and setter

    int getempID(){
        return empID;
    }

    String getName(){
        return name;
    }

    void setempId(int newId){
        empID = newId;
    }

    void setName(String name){
        // name = name;
        this.name = name;
    }
}
