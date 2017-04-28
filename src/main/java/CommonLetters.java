public class CommonLetters {



    public String find(String first, String second) {

        String inCommon = "";

        for (Character letter: (first + second).toCharArray()) {
            if(first.contains(Character.toString(letter)) && second.contains(Character.toString(letter)) && !inCommon.contains(Character.toString(letter))) {
                inCommon += letter;
            }
        }

        return inCommon;
    }


}
