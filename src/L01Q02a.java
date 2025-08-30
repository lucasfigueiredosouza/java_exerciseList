import java.util.Scanner;

public class L01Q02a {
    public static void main(String[] args){

        Scanner texto = new Scanner(System.in);
        String str;
        Float nota1;
        Float nota2;
        Float media;

        System.out.print("Informe a primeira nota");
        str = texto.nextLine();
        nota1=Float.parseFloat(str);

        System.out.print("Informe a segunda nota");
        str = texto.nextLine();
        nota2=Float.parseFloat(str);

        media=(nota1+nota2)/2;

        System.out.println("Media das notas: "+media);

        texto.close();
    }
}
