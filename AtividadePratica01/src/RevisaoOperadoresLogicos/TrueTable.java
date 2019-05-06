package RevisaoOperadoresLogicos;

public class TrueTable {
    public static void and (boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
        for (int i = 0; i < 4; i++){
            resultado[i] = coluna1[i] && coluna2 [i];
            System.out.printf("%s and %s = %s\n",coluna1[i], coluna2[i], resultado[i]);
        }
    }
    
    public static void or (boolean[] c1, boolean[] c2, boolean[] res){
        for (int i = 0; i < 4; i++){
            res[i] = c1[i] || c2[i];
            System.out.printf("%s or %s = %s\n",c1[i],c2[i],res[i]);
        }
    }
    
    public static void not (boolean[] col1){
        for (int i = 0; i < 4; i++){
            System.out.printf("Not %s = %s\n",col1[i],!col1[i]);
        }
    }
    
    public static void main(String[] args) {
        
        boolean[] coluna1 = {true, true, false, false};
        boolean[] coluna2 = {true, false, true, false};
        boolean[] resultado = new boolean[4];
        TrueTable t1 = new TrueTable();
        t1.and(coluna1, coluna2, resultado);
        
        System.out.printf("\n");
        
        boolean[] c1 = {true, true, false, false};
        boolean[] c2 = {true, false, true, false};
        boolean[] res = new boolean[4];
        TrueTable t2 = new TrueTable();
        t2.or(c1, c2, res);
        System.out.printf("\n");
        boolean[] col1 = {true, false, true, false};
        TrueTable t3 = new TrueTable();
        t3.not(col1);
        System.out.printf("\n");
    }
}
