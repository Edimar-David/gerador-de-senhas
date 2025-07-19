import java.util.Scanner;

public class teste01 {
    public static void main(String[] args) {
        String password = "";
        GeradorDeSenha passwordGenerate = new GeradorDeSenha();
        Scanner scan = new Scanner(System.in);
        Boolean vaiternumeros = false;

        System.out.println("quantos carateres a senha deve conter?");
        int characterCount = scan.nextInt();
        System.out.println("ok, a senha vai ter " + characterCount + " caracteres");


        scan.nextLine();
        System.out.println("a senha deve conter numeros? S/N");
        String choose = scan.nextLine();
        if(choose.equals("s")) {
            vaiternumeros = true;
        }else{
            vaiternumeros = false;
        }
        System.out.println("ok " + choose + " vai ter numero");

        System.out.println("a senha deve conter letras maiusculas? S/N");
         choose = scan.nextLine();
        System.out.println("ok " + choose + " vai ter numero");

        System.out.println("a senha deve conter simbolos? S/N");
        choose = scan.nextLine();
        System.out.println("ok " + choose + " vai ter simbolos");

        scan.close();

        password = passwordGenerate.gerarSenha(vaiternumeros, characterCount);

        System.out.println("a senha sugerida é: "+ password);

    }
}
