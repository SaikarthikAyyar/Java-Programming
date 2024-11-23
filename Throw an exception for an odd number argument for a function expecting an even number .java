class NewMethod{
    public void getNumber(int evenInteger) throws Exception{
        try {

            if (evenInteger % 2 != 0) {
                throw new Exception();
            }
        }
        catch (Exception e){
            System.out.println("Odd number entered");
        }
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        NewMethod even = new NewMethod();
        even.getNumber(15);
    }
}
