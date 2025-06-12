import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //clase scanner para que el usuario escriba
        Scanner scan = new Scanner(System.in);
        // declarciones y asignciones
        String palabraSecreta =  "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char [] letrasAdivinadas = new char[palabraSecreta.length()];

        //Bucle
        for (int index = 0; index < letrasAdivinadas.length; index++) {
            letrasAdivinadas[index]= '_' ;
            
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                                // esto se utilzia cuando tenemos una palabra  de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " ()" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra por favor");
            // usamos scanner para pedir una letrg
            //char letra = scan.next().charAt(0);
            char letra = Character.toLowerCase(scan.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length (); i++) {
                // estructura condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i]= letra;
                    letraCorrecta = true;
                }   
            }
            if (!letraCorrecta) {
                intentos ++;
                System.out.println("Incorrecto te que dedan " + (intentosMaximos - intentos) + " intentos.");  
            }
            if ( String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felcidades has adivinado la palabra " + palabraSecreta + " en " + intentos + " intentos");
            }
            
        }
        if (!palabraAdivinada) {
            System.out.println("Que pena te has quedado sin intentos");
        }

        scan.close();
    }
}
