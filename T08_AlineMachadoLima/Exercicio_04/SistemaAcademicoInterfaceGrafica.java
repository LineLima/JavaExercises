package Exercicio_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaAcademicoInterfaceGrafica extends JFrame {

    private SistemaAcademico sistemaAcademico;

    public SistemaAcademicoInterfaceGrafica() {
        super("Sistema Acadêmico");

        sistemaAcademico = new SistemaAcademico();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Layout principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Botões
        JButton cadastrarAlunoButton = new JButton("Cadastrar Aluno");
        JButton listarAlunosButton = new JButton("Listar Alunos");

        // Adiciona ação aos botões
        cadastrarAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarAluno();
            }
        });

        listarAlunosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarAlunos();
            }
        });

        // Adiciona os botões ao painel principal
        mainPanel.add(cadastrarAlunoButton, BorderLayout.NORTH);
        mainPanel.add(listarAlunosButton, BorderLayout.SOUTH);

        // Adiciona o painel principal ao frame
        add(mainPanel);

        setVisible(true);
    }

    private void cadastrarAluno() {
        // Lógica para cadastrar aluno usando o sistema acadêmico
        // Aqui, você pode abrir uma janela de diálogo para coletar informações do aluno
        // e depois chamar o método correspondente no sistema acadêmico.
        // Exemplo:
        // String nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
        // String matricula = JOptionPane.showInputDialog("Informe a matrícula do aluno:");
        // ... (outros dados)
        // sistemaAcademico.cadastrarAluno(nome, matricula, ...);
        JOptionPane.showMessageDialog(null, "Lógica para cadastrar aluno aqui.");
    }

    private void listarAlunos() {
        // Lógica para listar alunos usando o sistema acadêmico
        // Aqui, você pode simplesmente chamar o método correspondente no sistema acadêmico.
        // Exemplo:
        // sistemaAcademico.listarAlunos();
        JOptionPane.showMessageDialog(null, "Lógica para listar alunos aqui.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SistemaAcademicoInterfaceGrafica();
            }
        });
    }
}
