package OfficeHours.day_25_21;

public class TicTacToe {

    public static void main(String[] args) {

        char[] game = {'X', 'X', 'X',
                       '-', 'O', '-',
                       '-', 'O', '-'
        };

    }

    public static String won(char[] x) {
        String winner = "";
        for (int i = 0, y = 0; y < x.length; i++, y += 3) {

            String rows = "" + x[y] + x[y + 1] + x[y + 2];
            String col = "" + x[i] + x[i + 3] + x[i + 6];

            String diag = "";

            if(i == 0) {
                diag ="" + x[i] + x[i + 4] + x[i + 8];
            }else if(i == 2) {
                diag = "" + x[i] + x[i + 2] + x[i + 4];
            }

            if (rows.equals("XXX") || col.equals("XXX") || diag.equals("XXX")) {
                winner = "Player X won";
            } else if (rows.equals("OOO") || col.equals("OOO") || col.equals("OOO")) {
                winner = "Player O won";
            }

        }

        return winner;

    }
}