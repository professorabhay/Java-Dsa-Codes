public abstract class bank {
    String name;

    // abstract void readData(){};
    abstract void readData();
    
}

class CBI extends bank{
    void readData(){
        System.out.println("vjbl;");
    }
}

class Market extends bank{

    @Override
    void readData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readData'");
    }

}

// with abstract keyword not possible to create object with class




















// Abstraction example
