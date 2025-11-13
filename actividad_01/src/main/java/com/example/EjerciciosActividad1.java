package com.example;

public class EjerciciosActividad1 {
    public static void main(String[] args) {

        // --- Declaración de variables ---
        int numero = 10;
        System.out.println("Número entero: " + numero);

        double precio = 19.99;
        System.out.println("Precio (double): " + precio);

        String saludo = "Hola mundo desde Java";
        System.out.println("Mensaje: " + saludo);

        // --- Identificadores ---
        int edadPersona = 25;
        double alturaPromedio = 1.75;
        String nombreCompleto = "Samuel Moreno";
        System.out.println("Edad: " + edadPersona + ", Altura: " + alturaPromedio + ", Nombre: " + nombreCompleto);

        // --- Estilos de convención de codificación ---
        int contadorClientes = 5; // camelCase
        final double PI = 3.1416; // mayúsculas para constantes
        String nombre_empresa = "TechCorp"; // uso de guion bajo (no recomendado)
        System.out.println("Clientes: " + contadorClientes + ", PI: " + PI + ", Empresa: " + nombre_empresa);

        // --- Tipos de datos primitivos ---
        byte edad = 20;
        short año = 2025;
        int poblacion = 500000;
        long distancia = 123456789L;
        float temperatura = 36.6f;
        double salario = 1500.75;
        boolean activo = true;
        char letra = 'A';
        System.out.println("Byte: " + edad + ", Short: " + año + ", Int: " + poblacion + ", Long: " + distancia);
        System.out.println(
                "Float: " + temperatura + ", Double: " + salario + ", Boolean: " + activo + ", Char: " + letra);

        int sumaEnteros = 8 + 4;
        System.out.println("Resultado de la suma: " + sumaEnteros);

        boolean esMayor = (edad > 18);
        if (esMayor) {
            System.out.println("El usuario es mayor de edad.");
        } else {
            System.out.println("El usuario es menor de edad.");
        }

        // --- Tipos de datos no primitivos ---
        String texto = "Esto es un String en Java";
        System.out.println(texto);

        int[] numeros = { 10, 20, 30 };
        System.out.println("Arreglo: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);

        class Persona {
            String nombre;
            int edad;

            Persona(String n, int e) {
                nombre = n;
                edad = e;
            }
        }
        Persona p = new Persona("Laura", 22);
        System.out.println("Persona: " + p.nombre + " - Edad: " + p.edad);

        // --- Operadores aritméticos ---
        int a = 15, b = 4;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        System.out.println("División entera: " + (a / b));
        System.out.println("División decimal: " + ((double) a / b));

        int contador = 5;
        contador++;
        System.out.println("Incremento: " + contador);
        contador--;
        System.out.println("Decremento: " + contador);

        // --- Operadores de asignación ---
        int valor = 10;
        valor += 5;
        System.out.println("+= : " + valor);
        valor -= 3;
        System.out.println("-= : " + valor);

        valor *= 2;
        System.out.println("*= : " + valor);
        valor /= 4;
        System.out.println("/= : " + valor);

        valor %= 3;
        System.out.println("%= : " + valor + " (resto de la división)");

        // --- Operadores de comparación ---
        int x = 8, y = 12;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        if (x < y) {
            System.out.println("x es menor que y");
        } else {
            System.out.println("x no es menor que y");
        }

        // --- Operadores lógicos ---
        boolean cond1 = true, cond2 = false;
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("!cond1: " + (!cond1));

        boolean resultado = (cond1 && !cond2) || (x > y);
        System.out.println("Resultado combinado: " + resultado);

        // --- If ---
        int n1 = 10, n2 = 5;
        if (n1 > n2) {
            System.out.println("n1 es mayor que n2");
        }

        if (n1 > 20) {
            System.out.println("n1 es mayor que 20");
        } else {
            System.out.println("n1 es menor o igual que 20");
        }

        int numeroClasificar = 75;
        if (numeroClasificar < 50) {
            System.out.println("Bajo");
        } else if (numeroClasificar < 80) {
            System.out.println("Medio");
        } else {
            System.out.println("Alto");
        }

        // --- Operador ternario ---
        int edad2 = 17;
        String resultadoEdad = (edad2 >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(resultadoEdad);

        int cantidad = 15;
        double descuento = (cantidad > 10) ? 0.2 : 0.0;
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");

        int numeroPar = 8;
        String paridad = (numeroPar % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es: " + paridad);

        // --- Switch ---
        String dia = "Martes";
        switch (dia) {
            case "Lunes" -> System.out.println("Día 1");
            case "Martes" -> System.out.println("Día 2");
            case "Miércoles" -> System.out.println("Día 3");
            default -> System.out.println("Día no válido");
        }

        int nota = 4;
        switch (nota) {
            case 1, 2 -> System.out.println("Insuficiente");
            case 3 -> System.out.println("Aceptable");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Excelente");
            default -> System.out.println("Nota fuera de rango");
        }

        int estacion = 3;
        switch (estacion) {
            case 1 -> System.out.println("Primavera");
            case 2 -> System.out.println("Verano");
            case 3 -> System.out.println("Otoño");
            case 4 -> System.out.println("Invierno");
            default -> System.out.println("Número de estación no válido");
        }

        // --- Otros ejemplos ---
        int numeroCheck = -3;
        if (numeroCheck > 0) {
            System.out.println("Número positivo");
        } else if (numeroCheck < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Cero");
        }

        String contrasena = "12345";
        if (contrasena.equals("12345")) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        int calificacion = 85;
        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 75) {
            System.out.println("Buena");
        } else if (calificacion >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

    }
}
