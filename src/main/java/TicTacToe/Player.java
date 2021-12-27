package TicTacToe;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Player {
    private String name;
    private int id;
    private String address;
    private int rank;
    private char symbol; // X or O
}
