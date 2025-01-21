public class ExemploFor {

    public static void main(String[] args) {
        String nomes[] = {"Diogo", "Daniela", "Lorena"};
        
        // for (int x = 0; x < nomes.length; x++) {
        //     System.out.println(x+"-"+nomes[x]);
        // }

        for(String nome:nomes){
            System.out.println(nome);
        }
    }
}