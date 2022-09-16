package dzien5;

public class VarArgs {
    public static void main(String[] args) {
        //wywolanie metody printNumbers i przekazanie jest x parametrow
     VarArgs varArgs = new VarArgs();
     varArgs.printNumbers(1,2,3,5,7,8,9,7655);
     varArgs.printArgs(3, 3,5,3,6,7,4);
     varArgs.printArgs();
    }


    void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }


    void printArgs(int firstArg, int... numbers) {
        System.out.println("Argument stały: " + firstArg);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Argument ze zmiennej grupy: " + numbers[i]);
        }
    }
    void printArgs(){
        System.out.println("Bez argumetentu");
    }
}
