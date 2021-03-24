package Module4.Theory_task.Dinglemouse;

public class Dinglemouse {

    //final result of areEnemyIn & rowAndColumn & isWallsAround
    public static boolean allAlone(char[][] input) {
        boolean resultFinal = true;

        z:
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == 'o') {

                    if (areEnemyIn(input, i, j)) {
                        resultFinal = false;
                        break z;
                    }
                }
            }
        }
        return resultFinal;
    }



    //form strings from row and column of characters
    static String [] rowAndColumn(char [][] input, int rowIndex, int columnIndex) {
        String rowString = String.valueOf(input[rowIndex]);
        char [] column = new char[input.length];
        for(int i = 0; i < input.length; i++) {
            column[i] = input[i][columnIndex];
        }
        String columnString = String.valueOf(column);


        return new String[]{rowString, columnString};
    }

    //check if both strings return true
    static boolean areEnemyIn(char [][] input, int rowIndex, int columnIndex){

        String [] tmp = rowAndColumn(input, rowIndex, columnIndex);

        return isWallsAround(tmp[0]) && isWallsAround(tmp[1]);
    }


    //check if both ends of string equals '#'
    static boolean isWallsAround(String str) {
        String buf = str.replace(" ","")
                        .replace("#","a")
                        .replace("X", "");

//        System.out.println(buf);
//        System.out.println(buf.matches("a(o*)a") || buf.contains("aoa"));


        return buf.matches("a(o*)a") || buf.contains("aoa");
    }

}
