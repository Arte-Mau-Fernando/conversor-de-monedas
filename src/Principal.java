import com.aluralatam.conversodemonedas.modelos.ConsultaApiMonedas;
import com.aluralatam.conversodemonedas.modelos.Menu;
import com.aluralatam.conversordemonedas.historial.Historial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String menu = """
                **********************************************************+
                **  Sea Bienvenido/a al Conversor de monedas **
                
                1)  Dólar =>> Peso argentino
                2)  Peso argentino =>> Dólar
                3)  Dólar =>> Real Brasileño
                4)  Real Brasileño =>> Dólar
                5)  Dólar =>> Peso Colombiano
                6)  Peso Colombiano =>> Dólar
                7)  Dólar =>> Sol Peruano
                8)  Sol Perualo =>> Dólar
                9)  Dólar =>> Peso Mexicano
                10) Peso Mexicano =>> Dólar
                11) Historial 
                12) Salir
                Elija una opción valida:
                ***********************************************************""";
        int seleccionDelMenu = 0;
        ConsultaApiMonedas consulta = new ConsultaApiMonedas();
        Historial historial = new Historial();
        Menu opcionSeleccionada = new Menu(historial);
        while (12 != seleccionDelMenu) {
            try {
                System.out.println(menu);
                seleccionDelMenu = lectura.nextInt();
                opcionSeleccionada.menu(seleccionDelMenu);
            } catch (InputMismatchException e) {
                System.out.println("Caracter No valido, solo se admiten numeros enteros");
                System.out.println(">>>>>>>  Intentalo de nuevo <<<<<<<");
                System.out.println(e.getMessage());
                lectura.next();
            }
        }
    }
}
