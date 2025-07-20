import java.util.Scanner;

public class teste01 {
    public static void main(String[] args) {
        String password = "";
        PasswordGenerate passwordGenerate = new PasswordGenerate();

        password = passwordGenerate.generate(true, true, 6);
        System.out.println("a senha sugerida é: "+ password);

    }
}
