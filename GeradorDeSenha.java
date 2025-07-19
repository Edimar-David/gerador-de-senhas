import java.util.Random;

public class GeradorDeSenha {
       private StringBuilder password = new StringBuilder();
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
                    getCharacter(10, '0');
                }else {
                    isUppercase = random.nextBoolean();
                    if (isUppercase) {
                        getCharacter(26, 'A');
                    } else {
                        getCharacter(26, 'a');
                    }
                }
                password.append(character);

            }
            return password.toString();
        }

        private char getCharacter(int baseChar, char startingChar){
            character = (char) (random.nextInt(value) + startingChar);
            return character;
        }
}
