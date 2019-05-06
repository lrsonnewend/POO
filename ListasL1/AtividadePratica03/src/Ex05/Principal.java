package Ex05;

public class Principal {
    public static void primo(int num){
        int count = 0;
        
        for (int i = 1; i <= num; i++){
            if(num % i == 0)
                count+=1;
        }
        if (count <= 2)
            System.out.println(num);
    }
    public static void main(String[] args) {
        int vetor[] = new int [1000];
                
        for (int i = 2; i <= 999; i++){
            primo(i);            
        }
    }
}
