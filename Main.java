public class Main {
    public static void main(String[] args) {
        char one = '*';
        char two = '_';
        int size = 10; 
        int space = size - 1;
        for(int j = 0; j < size; j++){
                for (int i = 0; i <= space; i++) 
                {
                    System.out.print(two);
                }
                space--;
                for (int i = 1; i <= 2 * j - 1; i++) 
                {
                    System.out.print(one);                
                }
                System.out.println("");
        }             
        for(int j = 0; j < size+1; j++){
            for (int i = 0; i <= space; i++) 
                {
                    System.out.print(two);
                }
                space++;
                for (int i = 1; i <= 2 * (size - j) - 1; i++) 
                {
                    System.out.print(one);                
                }
                System.out.println("");
        }
    }
}