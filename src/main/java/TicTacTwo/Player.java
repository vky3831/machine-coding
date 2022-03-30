package TicTacTwo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Builder
@Getter
@Setter
public class Player {
    private UUID id;
    private String name;
    private char symbol;
}
