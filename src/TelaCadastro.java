import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
    
    private Aluno aluno;
    private MySQL conexao;
    
    public TelaCadastro() {
        initComponents();
        aluno = new Aluno();
        conexao = new MySQL();
        initComplementos();
    }
    
        public void initComplementos(){
        this.setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        semestre_cadastro = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        aprendo1 = new javax.swing.JComboBox<>();
        aprendo2 = new javax.swing.JComboBox<>();
        ensino1 = new javax.swing.JComboBox<>();
        aprendo3 = new javax.swing.JComboBox<>();
        ensino2 = new javax.swing.JComboBox<>();
        ensino3 = new javax.swing.JComboBox<>();
        nome_cadastro = new javax.swing.JTextField();
        nascimento_cadastro = new javax.swing.JTextField();
        cidade_cadastro = new javax.swing.JTextField();
        email_cadastro = new javax.swing.JTextField();
        confirmacao_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        confirmar_cadastro = new javax.swing.JButton();
        limpar_cadastro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        celular_cadastro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        senha_cadastro = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Data de Nascimento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cidade:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("E-mail:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Confirmar E-mail:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        semestre_cadastro.setForeground(new java.awt.Color(0, 0, 0));
        semestre_cadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semetre:", "1º Semestre.", "2º Semestre.", "3º Semestre.", "4º Semestre.", "5º Semestre." }));
        getContentPane().add(semestre_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Quero Aprender:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Posso Ensinar:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        aprendo1.setForeground(new java.awt.Color(0, 0, 0));
        aprendo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção1:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        aprendo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprendo1ActionPerformed(evt);
            }
        });
        getContentPane().add(aprendo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        aprendo2.setForeground(new java.awt.Color(0, 0, 0));
        aprendo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 2:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        getContentPane().add(aprendo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        ensino1.setForeground(new java.awt.Color(0, 0, 0));
        ensino1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 1:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        getContentPane().add(ensino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        aprendo3.setForeground(new java.awt.Color(0, 0, 0));
        aprendo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 3:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        getContentPane().add(aprendo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        ensino2.setForeground(new java.awt.Color(0, 0, 0));
        ensino2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 2:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        getContentPane().add(ensino2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        ensino3.setForeground(new java.awt.Color(0, 0, 0));
        ensino3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 3:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        getContentPane().add(ensino3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));
        getContentPane().add(nome_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 230, -1));

        nascimento_cadastro.setForeground(new java.awt.Color(0, 0, 0));
        nascimento_cadastro.setText("dia/mês/ano");
        getContentPane().add(nascimento_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        cidade_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidade_cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(cidade_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 190, -1));
        getContentPane().add(email_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 200, -1));
        getContentPane().add(confirmacao_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 200, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Semestre:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 90, 20));

        confirmar_cadastro.setForeground(new java.awt.Color(0, 0, 0));
        confirmar_cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/downlod.png"))); // NOI18N
        confirmar_cadastro.setText("CONFIRMAR");
        confirmar_cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmar_cadastroMouseClicked(evt);
            }
        });
        getContentPane().add(confirmar_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 120, -1));

        limpar_cadastro.setForeground(new java.awt.Color(0, 0, 0));
        limpar_cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clean (1).png"))); // NOI18N
        limpar_cadastro.setText("LIMPAR");
        limpar_cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpar_cadastroMouseClicked(evt);
            }
        });
        getContentPane().add(limpar_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 110, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Celular:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        celular_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celular_cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(celular_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 190, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Senha:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        senha_cadastro.setForeground(new java.awt.Color(0, 0, 0));
        senha_cadastro.setText("jPasswordField1");
        getContentPane().add(senha_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 200, 20));

        jPanel2.setBackground(new java.awt.Color(255, 215, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 330, 420));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 30, 440));

        jPanel3.setBackground(new java.awt.Color(255, 215, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 420));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1750169-seamless-pattern-of-black-books-on-yellow-background-vetor.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 440));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cidade_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidade_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidade_cadastroActionPerformed

    private void aprendo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprendo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aprendo1ActionPerformed

    private void confirmar_cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar_cadastroMouseClicked
                // copia dados dos campos para o objeto carro
        aluno.setNome(nome_cadastro.getText());
        aluno.setNascimento(nascimento_cadastro.getText());
        aluno.setEmail(email_cadastro.getText());
        aluno.setSemestre(String.valueOf(semestre_cadastro.getSelectedItem()));
        aluno.setCidade(cidade_cadastro.getText());
        aluno.setCelular(celular_cadastro.getText());
        aluno.setSenha(String.valueOf(senha_cadastro.getPassword()));
        aluno.setAprendo1(String.valueOf(aprendo1.getSelectedItem()));
        aluno.setAprendo2(String.valueOf(aprendo2.getSelectedItem()));
        aluno.setAprendo3(String.valueOf(aprendo3.getSelectedItem()));
        aluno.setEnsino1(String.valueOf(ensino1.getSelectedItem()));
        aluno.setEnsino2(String.valueOf(ensino2.getSelectedItem()));
        aluno.setEnsino3(String.valueOf(ensino3.getSelectedItem()));
        // conecta com o BD
        conexao.conectaBanco();
        // cria a query para insert
        String query = 
                "INSERT INTO aluno (" + 
                " nome, data_nascimento,email,senha, semestre, cidade, celular,"
                + "aprendo1,aprendo2,aprendo3,"
                + "ensino1,ensino2,ensino3) " + 
                "VALUES (" +
               "'"+ aluno.getNome() + "'," +
               "'"+ aluno.getNascimento() + "',"+
               "'"+ aluno.getEmail() + "',"+
               "'"+ aluno.getSenha()+"',"+
               "'"+ aluno.getSemestre() +"',"+
               "'"+ aluno.getCidade() +"',"+
               "'"+ aluno.getCelular()+"',"+
               "'"+ aluno.getAprendo1()+"',"+
               "'"+ aluno.getAprendo2()+"',"+
               "'"+ aluno.getAprendo3()+"',"+
               "'"+ aluno.getEnsino1()+"',"+
               "'"+ aluno.getEnsino2()+"',"+
               "'"+ aluno.getEnsino3()+"');";
        // faz o insert no BD
        if (conexao.insertSQL(query) == 1) {
            // sucesso
            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso");
        } else {
            // erro
            JOptionPane.showMessageDialog(this, "Erro ao inserir as informacoes");
        }
        // fecha o banco
        conexao.fechaBanco();
        // limpa a tela
        nome_cadastro.setText("");
        nascimento_cadastro.setText("");
        email_cadastro.setText("");
        semestre_cadastro.setSelectedItem(0);
        cidade_cadastro.setText("");
        celular_cadastro.setText("");
        senha_cadastro.setText("");
        ensino1.setSelectedItem(0);
        ensino2.setSelectedItem(0);
        ensino3.setSelectedItem(0);
        aprendo1.setSelectedItem(0);
        aprendo2.setSelectedItem(0);
        aprendo3.setSelectedItem(0);
            
        
        this.setVisible(false);
           new TelaLogin().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_confirmar_cadastroMouseClicked

    private void celular_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celular_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celular_cadastroActionPerformed

    private void limpar_cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpar_cadastroMouseClicked
        // TODO add your handling code here:
                nome_cadastro.setText("");
        nascimento_cadastro.setText("");
        email_cadastro.setText("");
        semestre_cadastro.setSelectedItem("");
        cidade_cadastro.setText("");
        celular_cadastro.setText("");
        senha_cadastro.setText("");
        ensino1.setSelectedItem(0);
        ensino2.setSelectedItem(0);
        ensino3.setSelectedItem(0);
        aprendo1.setSelectedItem(0);
        aprendo2.setSelectedItem(0);
        aprendo3.setSelectedItem(0);
    }//GEN-LAST:event_limpar_cadastroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aprendo1;
    private javax.swing.JComboBox<String> aprendo2;
    private javax.swing.JComboBox<String> aprendo3;
    private javax.swing.JTextField celular_cadastro;
    private javax.swing.JTextField cidade_cadastro;
    private javax.swing.JTextField confirmacao_email;
    private javax.swing.JButton confirmar_cadastro;
    private javax.swing.JTextField email_cadastro;
    private javax.swing.JComboBox<String> ensino1;
    private javax.swing.JComboBox<String> ensino2;
    private javax.swing.JComboBox<String> ensino3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpar_cadastro;
    private javax.swing.JTextField nascimento_cadastro;
    private javax.swing.JTextField nome_cadastro;
    private javax.swing.JComboBox<String> semestre_cadastro;
    private javax.swing.JPasswordField senha_cadastro;
    // End of variables declaration//GEN-END:variables
}
