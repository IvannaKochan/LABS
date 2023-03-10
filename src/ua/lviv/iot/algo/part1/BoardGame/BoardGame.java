package ua.lviv.iot.algo.part1.BoardGame;
import lombok.*;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class BoardGame {

    private String title;
    private int minPlayers;
    private int maxPlayers;
    private int currentPlayers;

    private static BoardGame defaultGame = new BoardGame();

    public static BoardGame getInstance(){return defaultGame;}

    public void addPlayer(){
        if (currentPlayers < maxPlayers){
            currentPlayers++;
        }
        else {
            System.out.println("current number of players is maximum");
        }
    }
    public void removePlayers(){
        if (currentPlayers>=1){
            currentPlayers--;
        }
        else {
            System.out.println("there are no players in this game");
        }
    }
    public Boolean canPlay(){
        return currentPlayers >= minPlayers && maxPlayers >= currentPlayers;
    }

    public static void main(String[] args) {
        BoardGame Dixit = new BoardGame();
        BoardGame Twister = new BoardGame("Twister", 2, 6, 3);

        int length = 4;
        BoardGame[] boardGames = new BoardGame[length];

        boardGames[0] = Dixit;
        boardGames[1] = Twister;
        boardGames[2] = getInstance();
        boardGames[3] = getInstance();

        for (BoardGame game : boardGames){
            System.out.println(game.toString());
        }
    }
};

