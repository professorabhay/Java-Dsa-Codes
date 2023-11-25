public class DadaG {
    String name = "Head" ;
    String surname = "Porwal";
}

class Father extends DadaG {
    String name = "Master";
}

class Me extends Father {
    String name = "Student";
}

class Run {
    public static void main(String[] args) {
        Me akg = new Me();
        System.out.println(akg.name);
        System.out.println(akg.surname);
    }
}

// In-heritance Example 
