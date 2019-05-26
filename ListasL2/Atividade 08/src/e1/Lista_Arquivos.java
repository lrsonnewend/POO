package e1;
import java.io.File;

public class Lista_Arquivos {
    public static void main(String[] args) {
        File file = new File("/.");
        File arquivos[] = file.listFiles();
        for(File arquivo: arquivos){
            System.out.println(arquivo.getName()+" Diretório: "+arquivo.isDirectory());
        }
    }
}
   
