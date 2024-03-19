public class Task3 {
    public void printSum(int a, int b, int c){
        int sum = a+b+c;
        System.out.println("Sum of three numbers is: " + sum);
    }
    public static void main(String[] args){
        Task3 sum = new Task3();
        sum.printSum(2, 5, 3);
    }
}
