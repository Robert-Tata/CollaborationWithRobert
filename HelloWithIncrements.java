//Robert's Comment
// Comment on Robert1
//Commment on Main
public class HelloWithIncrements {
    public static void main(String[] args) {
        int number = 0;
// Tata change on Robert1
        System.out.println("Hello, World");
        number++;
        number = number + number++;
        number = new HelloWithIncrements().incrementByTwo(number);
        number--;
        System.out.println("Final number: " + number);
        System.out.println("Goodbye, World");
    }

    public int incrementByTwo(int number) {
        return(number + 2);
    }
//2nd comment on Main
}
