// import Basic.Encapsulations;


class Test {
    public static void main(String[] args) {
        Employee enginner = new Employee(232,"Abhay" );
        // Encapsulations myclass = new Encapsulations();
        // myclass.print();
        enginner.setName("Setter");
        enginner.setempId(1000);
        System.out.println(enginner.getempID());
        System.out.println(enginner.getName());
    }
    
}
