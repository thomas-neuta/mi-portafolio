import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

double suma=0;
String NombreMateria;
double nota1;
double nota2;
double nota3;

System.out.print("Digite el nombre de la materia: ");
 NombreMateria =Scanner.nextLine();

System.out.print("Su nota 1: ");
 nota1=Scanner.nextDouble();

System.out.print("Su nota 2: ");
 nota2=Scanner.nextDouble();

System.out.print("Su nota 3: ");
 nota3=Scanner.nextDouble();

suma=nota1+nota2+nota3;
System.out.print("su promedio es de: " + suma/3);

    }
}