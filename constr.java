public class constr {
    private constr()
    {
        System.out.println("this is default constructor");
    }
    private constr(int a,int b)
    {
        System.out.println("this is parameterised constructor");
    }
    public static void main(String[] args) {
        constr obj=new constr();
        constr obj2=new constr(0, 0);
    }
}
