import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;

public class Jogodavelha extends JFrame {
    JButton[] bt = new JButton[9];
    boolean xo = false;
    boolean [] click = new boolean[9];
    
    public Jogodavelha () {
        setVisible(true);
        setTitle("Jogo da velha");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(250,100,700,500);
        int cont = 0;
        for (int i = 0; 1 < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bt[cont] = new JButton();
                add(bt[cont]);
                bt[cont].setBounds((100 * i) + 125,(100 * j) + 125, 95, 95);
                bt[cont].setFont (new Font("Arial", Font.BOLD , 40));
                cont++;
        }
        for (int t = 0; 1 < 9; t++) {
            click [t] = false;
    }
}
     

 
      bt[0].addActionListener (new java.awt.event.ActionListener (){
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(click[0] == false){
                click[0] = true;
                 mudar(bt[0]);
        }
    }
      });
      bt[1].addActionListener(new java.awt.event.ActionListener () {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(click[1] == false){
                click[1] = true;
                 mudar(bt[1]);
        }
    }
      });
      bt[2].addActionListener(new java.awt.event.ActionListener () {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(click[2] == false){
                click[2] = true;
                 mudar(bt[2]);
        }
    }
      });
      bt[3].addActionListener(new java.awt.event.ActionListener () {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(click[3] == false){
                click[3] = true;
                 mudar(bt[3]);
        }
    }
      });
      bt[4].addActionListener(new java.awt.event.ActionListener () {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(click[4] == false){
                click[4] = true;
                 mudar(bt[4]);
        }
    }
      });
      bt[5].addActionListener(new java.awt.event.ActionListener () {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(click[5] == false){
                click[5] = true;
                 mudar(bt[5]);
        }
    }
      });
      bt[6].addActionListener(new java.awt.event.ActionListener () {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(click[6] == false){
                click[6] = true;
                 mudar(bt[6]);
        }
    }
      });
      bt[7].addActionListener(new java.awt.event.ActionListener () {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(click[7] == false){
                click[7] = true;
                 mudar(bt[7]);
        }
    }
      });
      bt[8].addActionListener(new java.awt.event.ActionListener () {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(click[8] == false){
                click[8] = true;
                 mudar(bt[8]);
        }
    }
      });
    }
      public void mudar(JButton btn) {
          if (xo){
             
                btn.setText("O"); 
                xo = false;
          }else{
              
              btn.setText("X");
              xo = true;
          }
      } 
      public void ganhou() {
          if ((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X") 
          || (bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
          || (bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
          || (bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
          || (bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
          || (bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
          || (bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
          || (bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")){

          }
      }


    public static void main(String[] args) {
        new Jogodavelha();
    }
}

//16minutos
    
