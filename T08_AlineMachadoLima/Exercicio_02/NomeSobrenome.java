package Exercicio_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class NomeSobrenome extends JFrame {
    private JTextField nomeField;
    private JTextField sobrenomeField;
    private JLabel rodapeLabel;

    public NomeSobrenome() {
        setTitle("Concatenador de Nome e Sobrenome");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nomeField = new JTextField();
        sobrenomeField = new JTextField();
        rodapeLabel = new JLabel("Nome Completo:");

        nomeField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                atualizarRodape();
            }
        });

        sobrenomeField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                atualizarRodape();
            }
        });

        setLayout(new GridLayout(3, 1));
        add(nomeField);
        add(sobrenomeField);
        add(rodapeLabel);
    }

    private void atualizarRodape() {
        String nome = nomeField.getText();
        String sobrenome = sobrenomeField.getText();
        rodapeLabel.setText("Nome Completo:  " + nome +" "+ sobrenome);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NomeSobrenome app = new NomeSobrenome();
            app.setVisible(true);
        });
    }
}
