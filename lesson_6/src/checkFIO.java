public class checkFIO {
    public static void validateName(String fullName) throws invalidNameException{
        String[] parts = fullName.split(" ");

        if(parts.length!=3){
            throw new invalidNameException("ФИО должно содержать 3 слова.");
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<parts[i].length();j++){
                if(!Character.isLetter(parts[i].charAt(j))){
                    throw new invalidNameException("Все слова должны состоять из букв.");
                }
            }
        }

        if(parts[0].equals(parts[1]) || parts[1].equals(parts[2]) || parts[0].equals(parts[2])){
            throw new invalidNameException("Все 3 слова должны быть различны.");
        }

        if(parts[0].length()>15 || parts[1].length()>15 || parts[2].length()>15){
            throw new invalidNameException("Каждое слово должно быть не более 15 символов.");
        }

        if(parts[0].length()<3 || parts[1].length()<3 || parts[2].length()<3){
            throw new invalidNameException("Каждое слово должно быть не менее 3 символов.");
        }

        if(!Character.isUpperCase(parts[0].charAt(0)) || !Character.isUpperCase(parts[1].charAt(0)) ||
                !Character.isUpperCase(parts[2].charAt(0))){
            throw new invalidNameException("Каждое слово должно начинаться с заглавной буквы.");
        }
    }
}

class invalidNameException extends Exception {
    public invalidNameException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}