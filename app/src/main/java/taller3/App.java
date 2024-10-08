/*
 * This source file was generated by the Gradle 'init' task
 */
package taller3;

public class App {

    public static void main(String[] args) {
        try {
            //1
            System.out.println("1. Orden: "+Escribir_asc(3, 1, 2));
            //2
            System.out.println("2. Cifras: "+Obtener_cifras(9999));
            //3
            System.out.println("3. Clasificación: "+Clasificar_char('@'));
            //4
            System.out.println("4. División: "+Hallar_division_exacta(5, 6));
            //5
            System.out.println("5. Habiticiones: "+Consultar_hab((byte) 3, "AA"));
            //6
            System.out.println("6. Opciones: "+Obtener_obs(true, true, true));
            //7
            System.out.println("7. Color: "+Conocer_invitacion("blanco"));
        } catch (Exception e) {
        }

    }

    /*
    * 1. Construya un algoritmo e implemente la función en Java Escribir_asc que
    * reciba tres números enteros diferentes
    * y devuelva en un String en orden ascendente con el siguiente formato:
    * "##### - ##### - #####", donde el primero es
    * el mayor de todos, el segundo el del medio, el tercero el menor de todos. Si
    * hay al menos dos números iguales,
    * devolverá el mensaje: "Error: La función no considera números iguales". Si
    * hay un error inesperado, deberá mostrar
    * el mensaje: "Ocurrió un error inesperado".
     */
    public static String Escribir_asc(int Num1, int Num2, int Num3) {
        try {
            //Numeros Mayores
            int Orden1 = Math.max(Num1, Num2);
            int Orden2 = Math.max(Num2, Num3);
            int Orden3 = Math.max(Num1, Num3);

            //Numeros Menores
            int Orden4 = Math.min(Num1, Num2);
            int Orden5 = Math.min(Num2, Num3);
            int Orden6 = Math.min(Num1, Num3);

            if (Num1 == Num2 || Num1 == Num3 || Num2 == Num1 || Num2 == Num3 || Num3 == Num2 || Num3 == Num1) {
                return "Error: La función no considera números iguales";
            } //Num1
            else if (Num1 > Num2 && Num1 > Num3) {
                return String.valueOf(Orden1) + " - " + String.valueOf(Orden2) + " - " + String.valueOf(Orden5);
            } //Num2
            else if (Num2 > Num1 && Num2 > Num3) {
                return String.valueOf(Orden1) + " - " + String.valueOf(Orden3) + " - " + String.valueOf(Orden6);
            } //Num3
            else if (Num3 > Num1 && Num3 > Num2) {
                return String.valueOf(Orden2) + " - " + String.valueOf(Orden1) + " - " + String.valueOf(Orden4);
            } else {
                return "Ocurrió un error inesperado";
            }

        } catch (Exception e) {
            return "Ocurrió un error inesperado";
        }
    }

    /*
    * 2. Construya un algoritmo e implemente la función en Java Obtener_cifras que
    * recibe un número entre 0 y 50.000
    * y devuelve byte con las cifras que tiene. Por ejemplo 10 tiene dos cifras,
    * 9999 tiene 4 cifras. Si el número
    * no está en el rango devuelve 0. Y si hay un error inesperado, devuelve -1.
    * 
     */
    public static byte Obtener_cifras(int Num) {
        try {
            byte Cifras = (byte) (Math.log10(Num) + 1);
            if (Num >= 0 && Num <= 50000) {
                return Cifras;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return -1;
        }
    }


    /*
    * 3. Construya un algoritmo e implemente la función en Java Clasificar_char que
    * recibe un caracter, y
    * devuelve un string de acuerdo con las siguientes condiciones: si es un
    * alfabético, deuvelve "ES LETRA";
    * si es numérico, devuelve "ES NUMERO" o si es un carácter especial, devuelve
    * "ESPECIAL".
    * Los caracteres se validan de acuerdo con la tabla ascii básica y lo explicado
    * en clase.
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * ¡TERMINAR!
     */
    public static String Clasificar_char(char Caracter) {
        try {

            if (Character.isLetter(Caracter)) {
                return "ES LETRA";
            } else if (Character.isDigit(Caracter)) {
                return "ES NUMERO";
            } else if (!Character.isLetterOrDigit(Caracter)) {
                return "ESPECIAL";
            } else {
                return "Ocurrió un error inesperado";
            }
        } catch (Exception e) {
            return "Ocurrió un error inesperado";
        }
    }


    /*
    * 
    * 4. Construya un algoritmo e implemente la función en Java
    * Hallar_division_exacta que pida dos números enteros,
    * calcule la división del primero sobre el segundo, y al final si la división
    * es exacta, devuelva "DIVISION EXACTA"
    * y de lo contrario devuelva "DIVISION NO EXACTA". (Exacta significa que tiene
    * cociente, pero no residuo).
    * 
    * Si alguno de los dos números que recibe es cero o negativo, devuelva
    * "NO SE ADMITE CERO O NEGATIVOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * Nota: Revise el funcionamiento del operador mod que le puede ayudar.
    * 
    * 
    * 
     */
    public static String Hallar_division_exacta(int Num1, int Num2) {

      try {

          double Dividir = Num1 % Num2;

          if (Num1 <= 0 || Num2 <= 0) {
              return "NO SE ADMITE CERO O NEGATIVOS";
          }

          
          else if (Dividir == 0) {
              return "DIVISION EXACTA"; 
          }
          else {
              return "DIVISION NO EXACTA";
          }

      } catch (Exception e) {
          return "Ocurrió un error inesperado";
      }

  }
 /*
    * 5. En la siguiente tabla se encuentra la información de las habitaciones de
    * una finca hotel:
    * 
    * Habitación Camas Planta    AA/VENTILADOR
    *    101         2     Primera     AA
    *    102         1     Primera     VE
    *    201         3     Segunda     AA
    *    202         2     Segunda     VE
    *    301         2     Tercera     AA
    * 
    * 
    * Construya un algoritmo e implemente la función en Java Consultar_hab que
    * reciba en un byte el número de camas
    * y en un string si desea VE o AA, y deuvelva en un texto el o los números de
    * habitación que cumplen ese requisito.
    * Si son varias habitaciones, devuelvalas separadas por el caracter |
    * (normalmente, al lado izquierdo de la tecla del 1).
    * Ejemplo: "101|301"
    * Si el número de camas no está entre 1 y 3 o el string es diferente a AA o VE,
    * devuelva "DATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
     */
    public static String Consultar_hab(byte Num_Camas, String Opciones) {
        try {
            String Hab1 = "101";
            String Hab2 = "102";
            String Hab3 = "201";
            String Hab4 = "202";
            String Hab5 = "301";
            String Num_Habitacion = "";
            if (Num_Camas >= 1 && Num_Camas <= 3 || Opciones == "VE" || Opciones == "AA") {
                if (Num_Camas == 2 && Opciones == "AA") {
                    return Hab1 + "|" + Hab5;
                } else if (Num_Camas == 1 && Opciones == "VE") {
                    return Hab2;
                } else if (Num_Camas == 3 && Opciones == "AA") {
                    return Hab3;
                } else if (Num_Camas == 2 && Opciones == "VE") {
                    return Hab4;
                } else {
                    return "DATOS NO VÁLIDOS";
                }

            } else {
                return "DATOS NO VÁLIDOS";
            }
        } catch (Exception e) {
            return "Ocurrió un error inesperado";
        }
    }

    /*
    * 
    * 6. Un restaurante vende 3 platos. Si el cliente solicita el plato 1, le dan
    * el postre gratis; si selecciona los platos
    * 1 y 2, le dan la bebida gratis y si selecciona los platos 1,2 y 3, le dan
    * postre y bebida.
    * Construya un algoritmo e implemente la función Obtener_obs en Java que reciba
    * 3 booleanos, uno para cada plato y en
    * un String devuelva el obsequio ganado en mayúscula, así: "BEBIDA", "POSTRE",
    * "BEBIDA Y POSTRE".
    * Si los 3 platos vienen en false, , devuelva "PLATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
     */
    public static String Obtener_obs(boolean Op1, boolean Op2, boolean Op3) {
        try {
            String Bebida = "BEBIDA";
            String Postre = "POSTRE";
            if (Op1 == true && Op2 == false && Op3 == false) {
                return "POSTRE";
            } else if (Op1 == true && Op2 == true && Op3 == false) {
                return "BEBIDA";
            } else if (Op1 == true && Op2 == true && Op3 == true) {
                return "BEBIDA Y POSTRE";
            } else {
                return "PLATOS NO VÁLIDOS";
            }

        } catch (Exception e) {
            return "PLATOS NO VÁLIDOS";
        }
    }

    /*
    * 7. Un grupo de amigos hace un sorteo semanalmente con pelotas de ping pong,
    * para saber quién invita y a qué  la próxima salida.
    * Las opciones dependen del color que sacan en cada bola y son:
    * 
    * verde: Invita a las cervezas
    * azul: Invita a la pizza
    * rojo: Invita al postre
    * amarillo: Paga el parqueadero de todos
    * blanco o negro: Vaya y disfrute
    * Si la función recibe algo diferente a los colores dados, debe retornar
    * "Error en el color".
    * 
    * Se necesita una función en java Conocer_invitacion que reciba un string con
    * el color de la bola y retorna un
    * String con exactamente el texto de la invitación correspondiente.
    * 
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
     */
    public static String Conocer_invitacion(String Bola) {
        try {
            String Color1 = "verde";
            String Color2 = "azul";
            String Color3 = "rojo";
            String Color4 = "amarillo";
            String Color5 = "blanco";
            String Color6 = "negro";
            if (Bola == Color1) {
                return "Invita a las cervezas";
            } else if (Bola == Color2) {
                return "Invita a la pizza";
            } else if (Bola == Color3) {
                return "Invita al postre";
            } else if (Bola == Color4) {
                return "Paga el parqueadero de todos";
            } else if (Bola == Color5 || Bola == Color6) {
                return "Vaya y disfrute";
            } else {
                return "Error en el color";
            }
        } catch (Exception e) {
            return "Ocurrió un error inesperado";
        }
    }

}
