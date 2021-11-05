/**
@author Jyoji Maruishi
@version 11-5-21
*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main {
 public static void main(String args[]) {
   SwingUtilities.invokeLater(new Runnable() {
     public void run() {
        new GuessingGame();
     }
   });
 }
} 