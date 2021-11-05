import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

class GuessingGame implements ActionListener{
  JTextField userGuess;
  JButton guessButton;
  JButton playAgainButton;

  JLabel enterGuess;
  JLabel highLow;
  JLabel lastGuess;

  Random r;

  int goal;

  GuessingGame(){
    r = new Random();
    goal = r.nextInt(100) + 1;

    JFrame f = new JFrame("Guessing Game");
    f.setLayout(new FlowLayout());
    f.setSize(240,120);

    userGuess = new JTextField(10);
    userGuess.setActionCommand("myTF");
    guessButton = new JButton("Guess");
    playAgainButton = new JButton("Play Again");

    userGuess.addActionListener(this);
    guessButton.addActionListener(this);
    playAgainButton.addActionListener(this);

    enterGuess = new JLabel("Enter your guess: ");
    highLow = new JLabel("");
    lastGuess = new JLabel("");

    f.add(enterGuess);
    f.add(userGuess);
    f.add(guessButton);
    f.add(highLow);
    f.add(lastGuess);
    f.add(playAgainButton);

    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == guessButton){
      int guess = Integer.parseInt(userGuess.getText());

      if(guess < goal){
        highLow.setText("Too low!");
      }
      else if(guess > goal){
        highLow.setText("Too high!");
      }
      else{
        highLow.setText("You got it!");
      }
      lastGuess.setText("Last guess was: " + guess);
    }

    else if(e.getSource() == playAgainButton){
      goal = r.nextInt(100) + 1;
      enterGuess.setText("Enter your guess: ");
      highLow.setText("");
      lastGuess.setText("");
      userGuess.setText("");      
    }

    else{
      highLow.setText("You pressed Enter. Please press the Guess Button.");
    }
  }
}