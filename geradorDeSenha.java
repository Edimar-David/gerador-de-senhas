import java.util.Random;

public class geradorDeSenha {
    public static void main(String[] args) {
        String password = "";
        int characterCount = 5;
        char character;
        Boolean isUppercase;
        Boolean isNumber;

        Random random = new Random();

        for (int i = 0; i < characterCount; i++) {

            isNumber = random.nextBoolean();
            if(isNumber){
                character = (char) (random.nextInt(10) + '0');
            }else {
                isUppercase = random.nextBoolean();
                if (isUppercase) {
                    character = (char) (random.nextInt(26) + 'A');
                } else {
                    character = (char) (random.nextInt(26) + 'a');
                }
            }
            password += character;
        }

        System.out.println("a senha sugerida é: "+ passworld);
    }
}
