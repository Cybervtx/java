public class ExemploBreak {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 3)
                continue;
            
            System.out.println("N: "+i);
        }
    }    
}