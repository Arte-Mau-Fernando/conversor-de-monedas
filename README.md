<h1 align="center"> Conversor de Monedas </h1>
![Datos del Autor](https://github.com/user-attachments/assets/9e0c0420-d7fb-414f-ae23-cfe453f017fd)
![GitHub Org's stars](https://img.shields.io/github/stars/Arte-Mau-Fernando?style=social)
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conversor de Monedas</title>
</head>
<body>

<p>Este proyecto es una aplicación de consola en Java 17 que utiliza la API de ExchangeRate-API para realizar 
la conversión de monedas. Los usuarios pueden seleccionar una moneda del menú, ingresar el monto a convertir, 
y recibir el resultado de la conversión. El menú se repite en un ciclo <code>while</code> hasta que el usuario 
elija salir.</p>

<h2>Descripción</h2>

<p>El Conversor de Monedas es una aplicación sencilla y eficiente diseñada para ayudar a los usuarios a convertir montos 
de una moneda a otra utilizando las tasas de cambio más recientes proporcionadas por la API de ExchangeRate-API. 
Esta herramienta es ideal para cualquier persona que necesite realizar conversiones rápidas y precisas entre diversas 
monedas, ya sea para viajes, negocios internacionales, o estudios financieros.</p>

<p>La aplicación presenta un menú interactivo donde los usuarios pueden elegir entre varias opciones de conversión de 
monedas, ingresar el monto deseado y obtener el resultado de la conversión en tiempo real. Además, la aplicación guarda 
un historial de todas las conversiones realizadas durante la sesión, permitiendo a los usuarios revisar las 
transacciones anteriores.</p>

<h2>Tecnologías Usadas</h2>

<ul>
    <li><strong>Java 17</strong>: Lenguaje de programación principal.</li>
    <li><strong>ExchangeRate-API</strong>: API utilizada para obtener las tasas de cambio actuales.</li>
    <li><strong>Gson</strong>: Librería de Google para convertir objetos Java a JSON y viceversa.</li>
    <li><strong>HttpClient</strong>: Cliente HTTP usado para realizar solicitudes a la API.</li>
    <li><strong>Java Time</strong>: Utilidades de tiempo para manejar fechas y horas.</li>
</ul>

<h2>Instalación</h2>

<ol>
    <li>Clona este repositorio en tu máquina local:

        <pre><code>
git clone https://github.com/arte-mau-fernando/conversion-monedas.git
cd conversion-monedas
        </code></pre>
</li>
<li>Obtén una clave de API de <a href="https://www.exchangerate-api.com/" target="_blank">ExchangeRate-API</a>.</li>
<li>Crea un archivo <code>config.properties</code> en la raíz del proyecto con el siguiente contenido:

        <pre><code>
apiKey=TU_CLAVE_DE_API
</code></pre>
</li>
<li>Asegúrate de que tienes instalada la última versión de Java 17 en tu sistema.</li>
</ol>

<h2>Uso</h2>

<p>Para ejecutar la aplicación, utiliza el siguiente comando en tu terminal:</p>

<pre><code>
javac Principal.java
java Principal
</code></pre>

<h3>Menú de opciones</h3>

<p>1. Selecciona la moneda de origen.<br>
2. Selecciona la moneda de destino.<br>
3. Ingresa el monto a convertir.<br>
4. Recibe el resultado de la conversión.<br>
5. Repite el proceso o selecciona la opción para salir.</p>

<h3>Ejemplo de Ejecución</h3>

<pre><code>
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
12)  Salir
Elija una opción valida:
***********************************************************
</code></pre>

<p>Después de seleccionar una opción, ingresa el monto a convertir y recibe el resultado, así como el historial de 
conversiones realizadas.</p>

<h3>Ejemplo de Código</h3>

<pre><code>
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
                12)  Salir
                Elija una opción valida:
                ***********************************************************""";
        
        int seleccionDelMenu = 0;
        Historial historial = new Historial();
        Menu opcionSeleccionada = new Menu(historial);

        while (12 != seleccionDelMenu) {
            try {
                System.out.println(menu);
                seleccionDelMenu = lectura.nextInt();
                opcionSeleccionada.menu(seleccionDelMenu);
            } catch (InputMismatchException e) {
                System.out.println("Caracter No valido, solo se admiten números enteros.");
                System.out.println(">>>>>>>  Inténtalo de nuevo <<<<<<<");
                System.out.println(e.getMessage());
                lectura.next();
            }
        }
    }
}
</code></pre>

<h2>Contribuciones</h2>

<p>Las contribuciones son bienvenidas. Por favor, sigue los pasos a continuación para contribuir:</p>

<ol>
    <li>Haz un fork del proyecto.</li>
    <li>Crea una nueva rama (<code>git checkout -b feature/nueva-caracteristica</code>).</li>
    <li>Realiza tus cambios y haz commit (<code>git commit -am 'Añadir nueva característica'</code>).</li>
    <li>Envía tus cambios a tu fork (<code>git push origin feature/nueva-caracteristica</code>).</li>
    <li>Crea un nuevo pull request.</li>
</ol>
<h3>Autores</h3>

| [<img src="https://avatars.githubusercontent.com/u/172865177?v=4" width=115><br><sub>Luis Fernando Arteaga Mauricio</sub>](https://github.com/arte-mau-fernando) |
</body>
</html>