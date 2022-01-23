package sudoku.problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(SudokuGame) throws IOException;
    SudokuGame getGameData() throws IOException;

}
