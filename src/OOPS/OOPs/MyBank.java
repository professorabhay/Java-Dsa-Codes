interface MyBank {
    void method();
}

// class SBI extends MyBank{

// }

class SBI implements MyBank{

    @Override
    public void method() {
       System.out.println("SBI READ");
    }
    
}