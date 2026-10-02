/* Tic Tac Toe Game in C*/
#include <stdio.h>

// Function to draw the game board
void drawBoard(char board[3][3]) {
    printf(" %c | %c | %c \n", board[0][0], board[0][1], board[0][2]);
    printf("---+---+---\n");
    printf(" %c | %c | %c \n", board[1][0], board[1][1], board[1][2]);
    printf("---+---+---\n");
    printf(" %c | %c | %c \n", board[2][0], board[2][1], board[2][2]);
}

// Function to check for a win
int checkWin(char board[3][3], char player) {
    // Check rows and columns
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return 1;
        if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return 1;
    }
    // Check diagonals
    if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
        (board[0][2] == player && board[1][1] == player && board[2][0] == player)) return 1;
    return 0;
}

int main() {
    char board[3][3] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    char player = 'X';
    int move;
    int turn = 0;

    while (turn < 9) {
        drawBoard(board);
        printf("Player %c, enter your move (1-9): ", player);
        scanf("%d", &move);

        // Validate move
        if (move < 1 || move > 9) {
            printf("Invalid move. Try again.\n");
            continue;
        }

        // Update board
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        if (board[row][col] == 'X' || board[row][col] == 'O') {
            printf("Position already occupied. Try again.\n");
            continue;
        }
        board[row][col] = player;

        // Check for win
        if (checkWin(board, player)) {
            drawBoard(board);
            printf("Player %c wins!\n", player);
            return 0;
        }

        // Switch player
        player = (player == 'X') ? 'O' : 'X';
        turn++;
    }

    drawBoard(board);
    printf("It's a draw!\n");
    return 0;
}
/*This program allows two players, 'X' and 'O', to play a game of Tic Tac Toe. The game board is displayed after each move, and the program checks for a win or draw after each move.*/ 