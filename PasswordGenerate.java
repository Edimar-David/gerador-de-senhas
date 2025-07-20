import java.util.Random;

public class PasswordGenerate {
       private StringBuilder password = new StringBuilder();
       private char character;
       private Boolean isUppercase;
       private Boolean isNumber;

        Random random = new Random();

        public String generate(boolean canNumbers, boolean canUppercase, int characterCount){
            for (int i = 0; i < characterCount; i++) {

                if(canNumbers){
                    isNumber = random.nextBoolean();
                }else{isNumber = false;}
                if(canUppercase){
                    isUppercase = random.nextBoolean();
                }else{isUppercase = false;}

                if(isNumber){
                    getCharacter(10, '0');
                }else {
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
            character = (char) (random.nextInt(baseChar) + startingChar);
            return character;
        }
}
