
package factorial066208;


public class Factorial066208 {

    public static void main(String[] args) {
        double Num = 1;
        int cont = 0;
        double facto = 1;
        while (cont < 15) {
            facto = facto*Num++;
            cont = cont++;
        }
        
        System.out.println("total=" + facto);
    }
    
    
}
