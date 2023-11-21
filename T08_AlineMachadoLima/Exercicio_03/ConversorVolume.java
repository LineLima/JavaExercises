package Exercicio_03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorVolume extends JFrame {
    private JTextField litrosField;
    private JButton converterButton;
    private JLabel resultadoLabel;

    public ConversorVolume() {
        setTitle("Conversor de Volume");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        litrosField = new JTextField(10);
        converterButton = new JButton("Converter");
        resultadoLabel = new JLabel("Resultado:");

        converterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                converterLitrosParaGaloes();
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Litros:"));
        panel.add(litrosField);
        panel.add(converterButton);
        panel.add(resultadoLabel);

        add(panel);
    }

    private void converterLitrosParaGaloes() {
        try {
            double litros = Double.parseDouble(litrosField.getText());
            double galoes = litros / 3.785;
            resultadoLabel.setText("Resultado: " + litros + " litros é equivalente a " + galoes + " galões.");
        } catch (NumberFormatException ex) {
            resultadoLabel.setText("Por favor, insira um valor válido para litros.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConversorVolume app = new ConversorVolume();
            app.setVisible(true);
        });
    }
}

