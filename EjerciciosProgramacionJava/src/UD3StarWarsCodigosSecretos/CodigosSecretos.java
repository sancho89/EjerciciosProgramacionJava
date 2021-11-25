package UD3StarWarsCodigosSecretos;

/*
 * Proyecto STAR_WARS_-_CODIGOS_SECRETOS - Archivo CodigosSecretos.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Carlos Sancho Sanfélix <carlos.sancho.sanfelix@gmail.com>
 * @version 1.0
 * @date 28 oct. 2021 19:16:12
 */
import java.util.Scanner;

public class CodigosSecretos {

    public static void main(String[] args) {

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Variables recurrentes en todos los niveles 
        int Niveles = 1;
        int respuesta;
        String Perder = "Ese no era el código correcto… La misión ha sido un fracaso… :( :( :( Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!";

        // Empezamos el juego
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n"
                + "Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa\n"
                + "Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan\n"
                + "en una nave imperial robada en una misión secreta para infiltrarse\n"
                + "en otra estrella de la muerte que el imperio está construyendo\n"
                + "para destruirla. (Presiona Intro para continuar)");

        // Capturamos entrada del usuario
        in.nextLine();

        switch (Niveles) {

            // Nivel 1
            case 1:

                // Variables
                int suma = 0;
                int S1 = (int) (1 + Math.random() * (10 - 1 + 1));
                int S2 = (int) (20 + Math.random() * (30 - 20 + 1));

                System.out.println("***** NIVEL 1 *****\n"
                        + "Los problemas empiezan cuando deben realizar un salto\n"
                        + "hiperespacial hasta el sistema estelar " + S1 + " en el sector " + S2 + ", pero el\n"
                        + "control de navegación está estropeado y el computador tiene\n"
                        + "problemas para calcular parte de las coordenadas de salto.\n"
                        + "Chewbacca, piloto experto, se da cuenta que falta el cuarto\n"
                        + "número de la serie. Recuerda de sus tiempos en la academia de\n"
                        + "pilotos que para calcularlo hay que calcular el sumatorio entre el\n"
                        + "nº del sistema y el nº del sector (ambos inclusive). ¿Qué debe\n"
                        + "introducir\n"
                        + "");

                // Capturamos entrada del usuario
                respuesta = in.nextInt();

                // Calculamos el sumatorio
                for (int i = S1; i <= S2; i++) {
                    suma += i;
                }

                // Evaluamos respuesta
                if (suma == respuesta) {
                    System.out.println("¡Correcto!\n"
                            + "");
                } else {
                    System.out.println(Perder);
                    break;
                }

            // Nivel 2    
            case 2:

                // Variables
                int prod = 1;
                int P1 = (int) (1 + Math.random() * (7 - 1 + 1));
                int P2 = (int) (8 + Math.random() * (12 - 8 + 1));

                System.out.println("***** NIVEL 2 *****\n"
                        + "Gracias a Chewbacca consiguen llegar al sistema correcto y ven a\n"
                        + "lo lejos la estrella de la muerte. Como van en una nave imperial\n"
                        + "robada se aproximan lentamente con la intención de pasar\n"
                        + "desapercibidos. De repente suena el comunicador. “Aquí agente\n"
                        + "de espaciopuerto " + P1 + " contactando con nave imperial " + P2 + ". No están\n"
                        + "destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el\n"
                        + "comunicador e improvisa. “Eh... tenemos un fallo en el... eh...\n"
                        + "condensador de fluzo... Solicitamos permiso para atracar y\n"
                        + "reparar la nave”. El agente, que no se anda con tonterías,\n"
                        + "responde “Proporcione código de acceso o abriremos fuego”. Han\n"
                        + "Solo ojea rápidamente el manual del piloto que estaba en la\n"
                        + "guantera y da con la página correcta. El código es el productorio\n"
                        + "entre el no del agente y el no de la nave (ambos inclusive).\n"
                        + "¿Cuál es el código?\n"
                        + "");

                // Capturamos entrada del usuario
                respuesta = in.nextInt();

                // Calculamos el productorio
                for (int i = P1; i <= P2; i++) {
                    prod *= i;
                }

                // Evaluamos la respuesta
                if (prod == respuesta) {
                    System.out.println("¡Correcto!\n"
                            + "");
                } else {
                    System.out.println(Perder);
                    break;
                }

            // Nivel 3
            case 3:

                // Variables
                int fact = 1;
                int N = (int) (50 + Math.random() * (100 - 50 + 1));

                System.out.println("***** NIVEL 3 *****\n"
                        + "Han Solo proporciona el código correcto. Atracan en la estrella de\n"
                        + "la muerte, se equipan con trajes de soldados imperiales que\n"
                        + "encuentran en la nave para pasar desapercibidos y bajan. Ahora\n"
                        + "deben averiguar en qué nivel de los " + N + " existentes se encuentra el\n"
                        + "reactor principal. Se dirigen al primer panel computerizado que\n"
                        + "encuentran y la Princesa Leia intenta acceder a los planos de la\n"
                        + "nave pero necesita introducir una clave de acceso. Entonces\n"
                        + "recuerda la información que le proporcionó Lando Calrissian “La\n"
                        + "clave de acceso a los planos de la nave es el factorial de " + "( " + N + "/10)" + "\n"
                        + "(redondeando " + N + " hacia abajo), donde " + N + " es el no de niveles”.\n"
                        + "¿Cual es el nivel correcto?\n"
                        + "");

                // Capturamos respuesta usuario
                respuesta = in.nextInt();

                // Calculamos el factorial de N/10, redondeamos a la baja mediante la función Math.floor 
                for (int i = (int) Math.floor(N / 10); i > 0; i--) {
                    fact *= i;
                }

                // Evaluamos respuesta
                if (fact == respuesta) {
                    System.out.println("¡Correcto!\n"
                            + "");
                } else {
                    System.out.println(Perder);
                    break;
                }

            // Nivel 4
            case 4:

                // Variables, damos de alta un boolean para decir si es primo o no
                boolean esPrimo = true;
                int P = (int) (10 + (Math.random() * (100 - 10 + 1)));

                System.out.println("***** NIVEL 4 *****\n"
                        + "Gracias a la inteligencia de Leia llegan al nivel correcto y\n"
                        + "encuentran la puerta acorazada que da al reactor principal. R2D2\n"
                        + "se conecta al panel de acceso para intentar hackear el sistema y\n"
                        + "abrir la puerta. Para desencriptar la clave necesita verificar si el\n"
                        + "número " + P + " es primo o no. Si es primo introduce un 1, si no lo es\n"
                        + "introduce un 0.\n"
                        + "");

                // Capturamos respuesta usuario
                respuesta = in.nextInt();

                // Calculamos si el número es primo o no
                for (int i = 2; i < P / 2; i++) {
                    if (P % i == 0) {
                        esPrimo = false;
                    }
                }

                // Evaluamos la respuesta, combinamos el boolean con la respuesta del usuario que será 1 ó 0 con un "&"
                if ((esPrimo && respuesta == 1) || (!esPrimo && respuesta == 0)) {
                    System.out.println("¡Correcto!\n"
                            + "");

                } else {
                    System.out.println(Perder);
                    break;
                }

            // Nivel 5    
            case 5:

                // Variables
                int M = (int) (5 + Math.random() * (10 - 5 + 1));
                int S = (int) (5 + Math.random() * (10 - 5 + 1));
                int factM = 1;
                int factS = 1;

                System.out.println("***** NIVEL 5 *****\n"
                        + "Consiguen entrar al reactor. Ya solo queda que Luke Skywalker\n"
                        + "coloque la bomba, programe el temporizador y salir de allí\n"
                        + "corriendo. Necesita programarlo para que explote en exactamente\n"
                        + M + " minutos y " + S + " segundos, el tiempo suficiente para escapar antes\n"
                        + "de que explote pero sin que el sistema de seguridad anti-\n"
                        + "explosivos detecte y desactive la bomba. Pero el temporizador\n"
                        + "utiliza un reloj Zordgiano un tanto peculiar. Para convertir los\n"
                        + "minutos y segundos al sistema Zordgiano hay que sumar el\n"
                        + "factorial de " + M + " y el factorial de " + S + ". ¿Qué valor debe introducir?\n"
                        + "");

                // Capturamos respuesta usuario
                respuesta = in.nextInt();

                // Calculamos el factorial de M
                for (int i = M; i > 0; i--) {
                    factM *= i;
                }
                // Calculamos el factorial de S
                for (int i = S; i > 0; i--) {
                    factS *= i;
                }

                // Sumamos ambos factoriales
                int zordgiano = factM + factS;
                System.out.println(zordgiano);

                // Evaluamos respuesta usuario
                if (respuesta == zordgiano) {
                    System.out.println("¡Correcto!\n"
                            + "Luke Skywalker introduce el tiempo correcto, activa el\n"
                            + "temporizador y empiezan a sonar las alarmas. Salen de allí\n"
                            + "corriendo, no hay tiempo que perder. La nave se convierte en un\n"
                            + "hervidero de soldados de arriba a abajo y entre el caos que les\n"
                            + "rodea consiguen llegar a la nave y salir de allí a toda prisa. A\n"
                            + "medida que se alejan observan por la ventana la imagen de la\n"
                            + "colosal estrella de la muerte explotando en el silencio del espacio,\n"
                            + "desapareciendo para siempre junto a los restos del malvado\n"
                            + "imperio.\n"
                            + "\n"
                            + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D\n"
                            + "");

                } else {
                    System.out.println(Perder);
                }
        }
        // FIN
        System.out.println("Gracias por jugar :D");
    }
}