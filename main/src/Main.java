public class Main {
    public static void main(String[] args) {
        System.out.println("Task 5: change 1 from Branch1");
        MyMethod(4, 5);
    }

    public static int MyMethod(int a, int b){
        return(a + b);
        System.out.println("Task 6: change 1 from Branch2");
        System.out.println("Task 8: change 1 from Branch3");
        System.out.println("Task 8: change 2 from Branch3");
        System.out.println("Task 8: change 3 from Branch3");
        SecondMethod();
    }

    public static void SecondMethod(){
        System.out.println("Changed");
        MyMethod(4, 5);
    }

    public static int MyMethod(int a, int b){
        return(a + b);

    }
}
