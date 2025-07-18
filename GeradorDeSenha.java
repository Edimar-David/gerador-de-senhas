import java.util.Random;

public class GeradorDeSenha {
       private String password = "";
       private char character;
       private Boolean isUppercase;
       private Boolean isNumber;

        Random random = new Random();

        public String gerarSenha(Boolean numeros, int characterCount){
            for (int i = 0; i < characterCount; i++) {
                if(numeros) {
                    isNumber = random.nextBoolean();
                }else{isNumber = false;}

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
            return password;
        }


}
