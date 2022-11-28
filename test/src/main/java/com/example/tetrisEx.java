package com.example;

import java.util.Random;

import javax.security.auth.login.CredentialException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class tetrisEx extends Application {
    // 0: empty, 1: red, 2: blue, 3: green, 4: yellow, 5: purple, 6: orange, 7:
    // cyan
    // 8: gray
    int[][] board = new int[20][10];
    // 0: I, 1: J, 2: L, 3: O, 4: S, 5: T, 6: Z
    int[][][] pieces = new int[][][] {
            { { 0, 0, 0, 0 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } },
            { { 0, 0, 0, 0 }, { 2, 2, 2, 0 }, { 0, 0, 2, 0 }, { 0, 0, 0, 0 } },
            { { 0, 0, 0, 0 }, { 3, 3, 3, 0 }, { 3, 0, 0, 0 }, { 0, 0, 0, 0 } },
            { { 0, 0, 0, 0 }, { 4, 4, 0, 0 }, { 0, 4, 4, 0 }, { 0, 0, 0, 0 } },
            { { 0, 0, 0, 0 }, { 0, 5, 5, 0 }, { 5, 5, 0, 0 }, { 0, 0, 0, 0 } },
            { { 0, 0, 0, 0 }, { 6, 6, 6, 0 }, { 0, 6, 0, 0 }, { 0, 0, 0, 0 } },
            { { 0, 0, 0, 0 }, { 7, 7, 0, 0 }, { 0, 7, 7, 0 }, { 0, 0, 0, 0 } } };
    int[][] piece = new int[4][4];
    int pieceX = 0;
    int pieceY = 0;
    int pieceType = 0;
    int pieceRotation = 0;
    int score = 0;
    int level = 1;
    int lines = 0;
    int speed = 1000;

    Random random = new Random();
    Timeline timeline = new Timeline();
    Label scoreLabel = new Label("Score: 0");
    Label levelLabel = new Label("Level: 1");
    Label linesLabel = new Label("Lines: 0");
    GridPane boardPane = new GridPane();
    BorderPane root = new BorderPane();

    public void start(Stage primaryStage) throws Exception {
        // create the board
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                Rectangle rect = new Rectangle(30, 30);
                rect.setFill(Color.GRAY);
                rect.setStroke(Color.BLACK);
                boardPane.add(rect, j, i);
            }
        }

        // create the next piece
        GridPane nextPiecePane = new GridPane();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Rectangle rect = new Rectangle(30, 30);
                rect.setFill(Color.GRAY);
                rect.setStroke(Color.BLACK);
                nextPiecePane.add(rect, j, i);
            }
        }

        // create the score, level, and lines labels
        StackPane scorePane = new StackPane();
        scorePane.getChildren().add(scoreLabel);
        StackPane levelPane = new StackPane();
        levelPane.getChildren().add(levelLabel);
        StackPane linesPane = new StackPane();

        // create the buttons
        Button startButton = new Button("Start");
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                startGame();
            }
        });
        Button pauseButton = new Button("Pause");

        // create the root pane
        root.setCenter(boardPane);
        root.setRight(nextPiecePane);
        root.setTop(scorePane);
        root.setBottom(levelPane);
        root.setLeft(linesPane);
        root.setBottom(startButton);

        // create the scene
        Scene scene = new Scene(root, 500, 600);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.LEFT) {
                    movePiece(-1, 0);
                } else if (event.getCode() == KeyCode.RIGHT) {
                    movePiece(1, 0);
                } else if (event.getCode() == KeyCode.DOWN) {
                    movePiece(0, 1);
                } else if (event.getCode() == KeyCode.UP) {
                    rotatePiece();
                }
            }
        });

        // create the stage
        primaryStage.setTitle("Tetris");
        primaryStage.setScene(scene);
        primaryStage.show();
    
        // create the timeline
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(new KeyFrame(Duration.millis(speed),
                new EventHandler <ActionEvent>() {
            public void handle(ActionEvent event) {
                movePiece(0, 1);
            }
        }));
        timeline.play();

        // create the first piece
        createPiece();

        // update the board
        updateBoard();

        // update the score, level, and lines labels
        scoreLabel.setText("Score: " + score);
        levelLabel.setText("Level: " + level);
        linesLabel.setText("Lines: " + lines);

        // update the next piece
        updateNextPiece();

        // update the buttons
        root.setBottom(pauseButton);
    }

    public void createPiece() {
        // create a new piece
        pieceType = random.nextInt(7);
        pieceRotation = 0;
        pieceX = 3;
        pieceY = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                piece[i][j] = pieces[pieceType][i][j];
            }
        }
    }

    public void updateBoard() {
        // update the board
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                Rectangle rect = (Rectangle) boardPane.getChildren().get(i * 10 + j);
                if (board[i][j] == 0) {
                    rect.setFill(Color.GRAY);
                } else if (board[i][j] == 1) {
                    rect.setFill(Color.CYAN);
                } else if (board[i][j] == 2) {
                    rect.setFill(Color.BLUE);
                } else if (board[i][j] == 3) {
                    rect.setFill(Color.ORANGE);
                } else if (board[i][j] == 4) {
                    rect.setFill(Color.YELLOW);
                } else if (board[i][j] == 5) {
                    rect.setFill(Color.GREEN);
                } else if (board[i][j] == 6) {
                    rect.setFill(Color.PURPLE);
                } else if (board[i][j] == 7) {
                    rect.setFill(Color.RED);
                }
            }
        }

        // update the current piece
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (piece[i][j] != 0) {
                    Rectangle rect = (Rectangle) boardPane.getChildren().get((i + pieceY) * 10 + j + pieceX);
                    if (piece[i][j] == 1) {
                        rect.setFill(Color.CYAN);
                    } else if (piece[i][j] == 2) {
                        rect.setFill(Color.BLUE);
                    } else if (piece[i][j] == 3) {
                        rect.setFill(Color.ORANGE);
                    } else if (piece[i][j] == 4) {
                        rect.setFill(Color.YELLOW);
                    } else if (piece[i][j] == 5) {
                        rect.setFill(Color.GREEN);
                    } else if (piece[i][j] == 6) {
                        rect.setFill(Color.PURPLE);
                    } else if (piece[i][j] == 7) {
                        rect.setFill(Color.RED);
                    }
                }
            }
        }
    }

    public void updateNextPiece() {
        // update the next piece
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Rectangle rect = (Rectangle) nextPiecePane.getChildren().get(i * 4 + j);
                if (pieces[pieceType][i][j] == 0) {
                    rect.setFill(Color.GRAY);
                } else if (pieces[pieceType][i][j] == 1) {
                    rect.setFill(Color.CYAN);
                } else if (pieces[pieceType][i][j] == 2) {
                    rect.setFill(Color.BLUE);
                } else if (pieces[pieceType][i][j] == 3) {
                    rect.setFill(Color.ORANGE);
                } else if (pieces[pieceType][i][j] == 4) {
                    rect.setFill(Color.YELLOW);
                } else if (pieces[pieceType][i][j] == 5) {
                    rect.setFill(Color.GREEN);
                } else if (pieces[pieceType][i][j] == 6) {
                    rect.setFill(Color.PURPLE);
                } else if (pieces[pieceType][i][j] == 7) {
                    rect.setFill(Color.RED);
                }
            }
        }
    }

    public void movePiece(int x, int y) {
        // check if the piece can move
        boolean canMove = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (piece[i][j] != 0) {
                    if (pieceY + i + y >= 20 || pieceX + j + x < 0 || pieceX + j + x >= 10 || board[pieceY + i + y][pieceX + j + x] != 0) {
                        canMove = false;
                    }
                }
            }
        }

        // move the piece
        if (canMove) {
            pieceX += x;
            pieceY += y;
            updateBoard();
        } else {
            // add the piece to the board
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (piece[i][j] != 0) {
                        board[pieceY + i][pieceX + j] = piece[i][j];
                    }
                }
            }

            // check for completed lines
            for (int i = 0; i < 20; i++) {
                boolean line = true;
                for (int j = 0; j < 10; j++) {
                    if (board[i][j] == 0) {
                        line = false;
                    }
                }
                if (line) {
                    // remove the line
                    for (int k = i; k > 0; k--) {
                        for (int j = 0; j < 10; j++) {
                            board[k][j] = board[k - 1][j];
                        }
                    }
                    for (int j = 0; j < 10; j++) {
                        board[0][j] = 0;
                    }

                    // update the score, level, and lines
                    lines++;
                    score += 100;
                    if (lines % 10 == 0) {
                        level++;
                        speed -= 50;
                        timeline.stop();
                        timeline.getKeyFrames().clear();
                        timeline.getKeyFrames().add(new KeyFrame(Duration.millis(speed),
                                new EventHandler <ActionEvent>() {
                            public void handle(ActionEvent e) {
                                movePiece(0, 1);
                            }
                        }));
                        timeline.play();
                    }
                    linesLabel.setText("Lines: " + lines);
                    levelLabel.setText("Level: " + level);
                    scoreLabel.setText("Score: " + score);
                }
            }

            // get a new piece
            pieceType = nextPieceType;
            nextPieceType = (int) (Math.random() * 7);
            piece = pieces[pieceType];
            pieceX = 3;
            pieceY = 0;
            updateBoard();
            updateNextPiece();
        }
    }

    public void rotatePiece() {
        // check if the piece can rotate
        boolean canRotate = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (piece[i][j] != 0) {
                    if (pieceY + j < 0 || pieceY + j >= 20 || pieceX + 3 - i < 0 || pieceX + 3 - i >= 10 || board[pieceY + j][pieceX + 3 - i] != 0) {
                        canRotate = false;
                    }
                }
            }
        }

        // rotate the piece
        if (canRotate) {
            int[][] newPiece = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    newPiece[i][j] = piece[3 - j][i];
                }
            }
            piece = newPiece;
            updateBoard();
        }
    }

    public void startGame() {
        // initialize the board
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = 0;
            }
        }

        // get a new piece
        pieceType = (int) (Math.random() * 7);
        nextPieceType = (int) (Math.random() * 7);
        piece = pieces[pieceType];
        pieceX = 3;
        pieceY = 0;
        updateBoard();
        updateNextPiece();

        // initialize the score, level, and lines
        score = 0;
        level = 1;
        lines = 0;
        linesLabel.setText("Lines: " + lines);
        levelLabel.setText("Level: " + level);
        scoreLabel.setText("Score: " + score);

        // start the game
        timeline.play();
    }

    public void pauseGame() {
        timeline.pause();
    }

    public void resumeGame() {
        timeline.play();
    }

    public void stopGame() {
        timeline.stop();
    }

    public void handle(KeyEvent event) {
        if (event.getCode() == KeyCode.LEFT) {
            movePiece(-1, 0);
        } else if (event.getCode() == KeyCode.RIGHT) {
            movePiece(1, 0);
        } else if (event.getCode() == KeyCode.DOWN) {
            movePiece(0, 1);
        } else if (event.getCode() == KeyCode.UP) {
            rotatePiece();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}




        
