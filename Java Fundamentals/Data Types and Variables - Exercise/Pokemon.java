    import java.util.Scanner;

    public class Pokemon {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = Integer.parseInt(scanner.nextLine());           // power
            int M = Integer.parseInt(scanner.nextLine());           // distance
            int Y = Integer.parseInt(scanner.nextLine());           // Exhaustion factor
            int pokeCounter = 0;
            int originalN = N;

            while (N >= M) {
                N -= M;
                pokeCounter++;


                if (N == 0.5*originalN) {
                    if (N != 0 && Y != 0){
                        N /= Y;
                    }
                }

            }
            System.out.println(N);
            System.out.println(pokeCounter);
        }
    }
