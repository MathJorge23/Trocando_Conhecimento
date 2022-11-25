import javax.swing.JOptionPane;
public class TelaLogin extends javax.swing.JFrame {
    
    MySQL conexao = new MySQL(); //acessar os métodos de conexao com o banco
    Aluno aluno = new Aluno(); //acessar os atributos da classe cliente
    TelaPrincipal envia_email;
    
    public TelaLogin() {
         conexao = new MySQL();
         aluno =new Aluno();
         initComponents();
         initComplementos(); 
    }
    
    public void initComplementos(){
        this.setLocationRelativeTo(null);
    }// centaliza tela
    
    private void Logar(Aluno aluno){
        conexao.conectaBanco();
        
        String login = this.campo_email.getText();
        String senha = this.campo_senha.getText();
                
        try {
            this.conexao.executarSQL(
                   "SELECT "            
                    + "email,"
                    + "senha"
                    + " FROM"
                    + " aluno"
                    + " WHERE"
                    + " email = '" + login + "'"
                + ";"
            );
            while(this.conexao.getResultSet().next()){ 
                  aluno.setEmail(this.conexao.getResultSet().getString(1));
                  aluno.setSenha(this.conexao.getResultSet().getString(2));

           }
            
          if (aluno.getEmail().isEmpty()){
                JOptionPane.showMessageDialog(null, "usuario não encontrado!");
          } 
           
          else if(!login.equals(aluno.getEmail()) || !aluno.getSenha().equals(senha)){
                          JOptionPane.showMessageDialog(this, 
                    "Nome de usuário e/ou senha inválidos", 
                    "Erro de Login", JOptionPane.ERROR_MESSAGE);
               
           }
           
            else if(login.equals(aluno.getEmail()) || aluno.getSenha().equals(senha)){
              if ( envia_email == null){
                envia_email= new TelaPrincipal();
                envia_email.setVisible(true);
                envia_email.perfilPrincipal(campo_email.getText());
                this.setVisible(false);
             }else{
                envia_email.setVisible(true);
                envia_email.setState(TelaPrincipal.NORMAL);
                envia_email.perfilPrincipal(campo_email.getText());
                this.setVisible(false);
             
            }
           }
         
        } catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente");
            
        }             
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao_login = new javax.swing.JButton();
        botao_cancel_tela1 = new javax.swing.JButton();
        botao_registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        campo_senha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botao_login.setText("LOGIN");
        botao_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_loginMouseClicked(evt);
            }
        });
        botao_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_loginActionPerformed(evt);
            }
        });
        getContentPane().add(botao_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 100, 20));

        botao_cancel_tela1.setText("CANCEL");
        botao_cancel_tela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cancel_tela1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao_cancel_tela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 100, 20));

        botao_registrar.setText("REGISTRAR");
        botao_registrar.setToolTipText("");
        botao_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_registrarMouseClicked(evt);
            }
        });
        botao_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 110, 20));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Não é registrado?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 110, 20));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("E-mail:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 50, 20));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 60, 20));

        campo_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_emailActionPerformed(evt);
            }
        });
        getContentPane().add(campo_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 150, -1));

        campo_senha.setText("jPasswordField1");
        campo_senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campo_senhaMouseClicked(evt);
            }
        });
        getContentPane().add(campo_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 150, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Books_-_Freepik.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_cancel_tela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cancel_tela1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_cancel_tela1ActionPerformed

    private void botao_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_registrarMouseClicked
        this.setVisible(false);
        new TelaCadastro().setVisible(true);
    }//GEN-LAST:event_botao_registrarMouseClicked

    private void campo_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_emailActionPerformed

    private void botao_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_loginMouseClicked
         if ( envia_email == null){
             envia_email= new TelaPrincipal();
             envia_email.setVisible(true);
             envia_email.perfilPrincipal(campo_email.getText());
             } else{
             envia_email.setVisible(true);
             envia_email.setState(TelaPrincipal.NORMAL);
             envia_email.perfilPrincipal(campo_email.getText());
             
         }
        Logar(aluno);
            
    }//GEN-LAST:event_botao_loginMouseClicked

    private void botao_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_registrarActionPerformed

    private void botao_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_loginActionPerformed

    private void campo_senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_senhaMouseClicked
        campo_senha.setText("");
    }//GEN-LAST:event_campo_senhaMouseClicked

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_cancel_tela1;
    private javax.swing.JButton botao_login;
    private javax.swing.JButton botao_registrar;
    private javax.swing.JTextField campo_email;
    private javax.swing.JPasswordField campo_senha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
