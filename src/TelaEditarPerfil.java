
import javax.swing.JOptionPane;


public class TelaEditarPerfil extends javax.swing.JFrame {
    
    private Aluno aluno;
    private MySQL conexao;
    TelaPrincipal envia_email;

    public TelaEditarPerfil() {
        conexao = new MySQL();
         aluno =new Aluno();
        initComponents();
        initComplementos();

    }
    
    public void initComplementos(){
        this.setLocationRelativeTo(null);
    }
    
    public void PreencherInfo(String  email){
        conexao.conectaBanco();
        
                
        try {
            this.conexao.executarSQL(
                   "SELECT "
                    + "nome,"
                    + "semestre,"                    
                    + "email,"
                    + "data_nascimento,"
                    + "cidade,"
                    + "senha,"
                    + "celular,"
                    + "aprendo1,"
                    + "aprendo2,"
                    + "aprendo3,"
                    + "ensino1,"
                    + "ensino2,"
                    + "ensino3"
                    + " FROM"
                    + " aluno"
                    + " WHERE"
                    + "   email = '" + email+ "'"
                + ";"
            );
            //novoCliente.limpaCliente();
            while(this.conexao.getResultSet().next()){ 
                aluno.setNome(this.conexao.getResultSet().getString(1));
                aluno.setSemestre((this.conexao.getResultSet().getString(2)));
                aluno.setEmail(this.conexao.getResultSet().getString(3));
                aluno.setNascimento(this.conexao.getResultSet().getString(4));
                aluno.setCidade(this.conexao.getResultSet().getString(5));
                aluno.setSenha(this.conexao.getResultSet().getString(6));
                aluno.setCelular(this.conexao.getResultSet().getString(7));
                aluno.setAprendo1(this.conexao.getResultSet().getString(8));
                aluno.setAprendo2(this.conexao.getResultSet().getString(9));
                aluno.setAprendo3(this.conexao.getResultSet().getString(10));
                aluno.setEnsino1(this.conexao.getResultSet().getString(11));
                aluno.setEnsino2(this.conexao.getResultSet().getString(12));
                aluno.setEnsino3(this.conexao.getResultSet().getString(13));
                
           }
            
           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente");
            
        } finally{
            editar_nome.setText(aluno.getNome());
            editar_semestre.setSelectedItem(aluno.getSemestre());
            editar_email.setText(aluno.getEmail());
            editar_senha.setText(String.valueOf(senha_cadastro.getPassword()));
            editar_celular.setText(aluno.getCelular());
            editar_cidade.setText(aluno.getCidade());
            editar_nascimento.setText(aluno.getNascimento());
            editar_aprendo1.setSelectedItem(aluno.getAprendo1());
            editar_aprendo2.setSelectedItem(aluno.getAprendo2());
            editar_aprendo3.setSelectedItem(aluno.getAprendo3());
            editar_ensino1.setSelectedItem(aluno.getEnsino1());
            editar_ensino2.setSelectedItem(aluno.getEnsino2());
            editar_ensino3.setSelectedItem(aluno.getEnsino3());
            
            this.conexao.fechaBanco();   
        }               
    }
    
    
    public void atualizarCliente(Aluno aluno){
        this.conexao.conectaBanco();
        
        String editar = this.editar_email.getText();
        
        try {
            this.conexao.updateSQL(
                "UPDATE aluno SET "                    
                    + "nome = '"+ editar_nome.getText()+"',"
                    + "semestre = '" + editar_semestre.getSelectedItem() + "',"
                    + "data_nascimento = '" + editar_nascimento.getText() + "',"
                    + "cidade = '" + editar_cidade.getText() + "',"                   
                    + "celular = '" + editar_celular.getText() + "',"
                    + "email = '"+ editar_email.getText()+"',"
                    + "aprendo1 = '"+editar_aprendo1.getSelectedItem()+"',"
                    + "aprendo2 = '"+editar_aprendo2.getSelectedItem()+"',"
                    + "aprendo3 = '"+editar_aprendo3.getSelectedItem()+"',"
                    + "ensino1 = '"+editar_ensino1.getSelectedItem()+"',"
                    + "ensino2 = '"+editar_ensino2.getSelectedItem()+"',"
                    + "ensino3 = '"+editar_ensino3.getSelectedItem()+"'"
                + " WHERE "
                    + "email = '" + editar + "'"
                + ";"
            );
        } catch(Exception e){
            System.out.println("Erro ao atualizar aluno " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar aluno");
        } finally {
            this.conexao.fechaBanco();
             if ( envia_email == null){
                envia_email= new TelaPrincipal();
                envia_email.setVisible(true);
                envia_email.perfilPrincipal(editar_email.getText());
                this.setVisible(false);
             }else{
                envia_email.setVisible(true);
                envia_email.setState(TelaPrincipal.NORMAL);
                envia_email.perfilPrincipal(editar_email.getText());
                this.setVisible(false);
            }
            JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso");
        }
    }
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        nome_cadastro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        semestre_cadastro = new javax.swing.JComboBox<>();
        nascimento_cadastro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        celular_cadastro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cidade_cadastro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email_cadastro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        confirmacao_email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        senha_cadastro = new javax.swing.JPasswordField();
        confirmar_cadastro = new javax.swing.JButton();
        limpar_cadastro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ensino2 = new javax.swing.JComboBox<>();
        ensino3 = new javax.swing.JComboBox<>();
        ensino1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        aprendo3 = new javax.swing.JComboBox<>();
        aprendo2 = new javax.swing.JComboBox<>();
        aprendo1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        editar_nome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        editar_semestre = new javax.swing.JComboBox<>();
        editar_nascimento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        editar_celular = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        editar_cidade = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        editar_email = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        editar_senha = new javax.swing.JPasswordField();
        salvar_edicao = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        editar_limpar = new javax.swing.JButton();
        editar_ensino2 = new javax.swing.JComboBox<>();
        editar_ensino3 = new javax.swing.JComboBox<>();
        editar_ensino1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        editar_aprendo3 = new javax.swing.JComboBox<>();
        editar_aprendo2 = new javax.swing.JComboBox<>();
        editar_aprendo1 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(253, 245, 230));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");

        semestre_cadastro.setForeground(new java.awt.Color(0, 0, 0));
        semestre_cadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semetre:", "1º Semestre.", "2º Semestre.", "3º Semestre.", "4º Semestre.", "5º Semestre." }));

        nascimento_cadastro.setForeground(new java.awt.Color(0, 0, 0));
        nascimento_cadastro.setText("dia/mês/ano");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Data de Nascimento:");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Semestre:");

        celular_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celular_cadastroActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Celular:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cidade:");

        cidade_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidade_cadastroActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("E-mail:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Confirmar E-mail:");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Senha:");

        senha_cadastro.setForeground(new java.awt.Color(0, 0, 0));
        senha_cadastro.setText("jPasswordField1");

        confirmar_cadastro.setForeground(new java.awt.Color(0, 0, 0));
        confirmar_cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/downlod.png"))); // NOI18N
        confirmar_cadastro.setText("CONFIRMAR");
        confirmar_cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmar_cadastroMouseClicked(evt);
            }
        });

        limpar_cadastro.setForeground(new java.awt.Color(0, 0, 0));
        limpar_cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clean (1).png"))); // NOI18N
        limpar_cadastro.setText("LIMPAR");
        limpar_cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpar_cadastroMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(253, 245, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ensino2.setForeground(new java.awt.Color(0, 0, 0));
        ensino2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 2:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));

        ensino3.setForeground(new java.awt.Color(0, 0, 0));
        ensino3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 3:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));

        ensino1.setForeground(new java.awt.Color(0, 0, 0));
        ensino1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 1:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Posso Ensinar:");

        aprendo3.setForeground(new java.awt.Color(0, 0, 0));
        aprendo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 3:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));

        aprendo2.setForeground(new java.awt.Color(0, 0, 0));
        aprendo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 2:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));

        aprendo1.setForeground(new java.awt.Color(0, 0, 0));
        aprendo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção1:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        aprendo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprendo1ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Quero Aprender:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(editar_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 230, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nome:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        editar_semestre.setForeground(new java.awt.Color(0, 0, 0));
        editar_semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semetre:", "1º Semestre.", "2º Semestre.", "3º Semestre.", "4º Semestre.", "5º Semestre." }));
        getContentPane().add(editar_semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        editar_nascimento.setForeground(new java.awt.Color(0, 0, 0));
        editar_nascimento.setText("dia/mês/ano");
        getContentPane().add(editar_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Data de Nascimento:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Semestre:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 90, 20));

        editar_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_celularActionPerformed(evt);
            }
        });
        getContentPane().add(editar_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 190, -1));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Celular:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Cidade:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        editar_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_cidadeActionPerformed(evt);
            }
        });
        getContentPane().add(editar_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 190, -1));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("E-mail:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));
        getContentPane().add(editar_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 200, -1));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Senha:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        editar_senha.setForeground(new java.awt.Color(0, 0, 0));
        editar_senha.setText("jPasswordField1");
        getContentPane().add(editar_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 200, 20));

        salvar_edicao.setForeground(new java.awt.Color(0, 0, 0));
        salvar_edicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/downlod.png"))); // NOI18N
        salvar_edicao.setText("SALVAR");
        salvar_edicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvar_edicaoMouseClicked(evt);
            }
        });
        getContentPane().add(salvar_edicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 120, -1));

        jPanel4.setBackground(new java.awt.Color(255, 215, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 420));

        editar_limpar.setForeground(new java.awt.Color(0, 0, 0));
        editar_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clean (1).png"))); // NOI18N
        editar_limpar.setText("LIMPAR");
        editar_limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editar_limparMouseClicked(evt);
            }
        });
        getContentPane().add(editar_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 110, -1));

        editar_ensino2.setForeground(new java.awt.Color(0, 0, 0));
        editar_ensino2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 2:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        getContentPane().add(editar_ensino2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        editar_ensino3.setForeground(new java.awt.Color(0, 0, 0));
        editar_ensino3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 3:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        getContentPane().add(editar_ensino3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        editar_ensino1.setForeground(new java.awt.Color(0, 0, 0));
        editar_ensino1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 1:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        getContentPane().add(editar_ensino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Posso Ensinar:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        editar_aprendo3.setForeground(new java.awt.Color(0, 0, 0));
        editar_aprendo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 3:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        getContentPane().add(editar_aprendo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        editar_aprendo2.setForeground(new java.awt.Color(0, 0, 0));
        editar_aprendo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção 2:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        getContentPane().add(editar_aprendo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        editar_aprendo1.setForeground(new java.awt.Color(0, 0, 0));
        editar_aprendo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Opção1:", "JavaScript Básico", "JavaScript Intermediário", "JavaScript Avançado", "HTML Básico", "HTML Intermediário", "HTML Avançado", "Python Básico", "Python Intermediário", "Python Avançado", "SQL Básico", "SQL Intermediário", "SQL Avançado", "Java Básico", "Java Intermediário", "Java Avançado", "Node.js Básico", "Node.js Intermediário", "Node.js Avançado", "TypeScript Básico", "TypeScript Intermediário", "TypeScript Avançado", "C# Básico", "C# Intermediário", "C# Avançado", "Shell Básico", "Shell Intermediário", "Shell Avançado", "C++ Básico", "C++ Intermediário", "C++ Avançado", "PHP Básico", "PHP Intermediário", "PHP Avançado", "C Básico", "C Intermediário", "C Avançado", "PowerShell Básico", "PowerShell Intermediário", "PowerShell Avançado", "Go Básico", "Go Intermediário", "Go Avançado", "Kotlin Básico", "Kotlin Intermediário", "Kotlin Avançado", "Inglês Intermediário", "Inglês Avançado", "Alemão Intermediário", "Alemão Avançado", "Espanhol Intermediário", "Espanhol Avançado", "Word", "PowerPoint", "Excel", " " }));
        editar_aprendo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_aprendo1ActionPerformed(evt);
            }
        });
        getContentPane().add(editar_aprendo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Quero Aprender:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 215, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 330, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1750169-seamless-pattern-of-black-books-on-yellow-background-vetor.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, 0, 970, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void celular_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celular_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celular_cadastroActionPerformed

    private void cidade_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidade_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidade_cadastroActionPerformed

    private void confirmar_cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar_cadastroMouseClicked

    }//GEN-LAST:event_confirmar_cadastroMouseClicked

    private void limpar_cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpar_cadastroMouseClicked
        // TODO add your handling code here:
        nome_cadastro.setText("");
        nascimento_cadastro.setText("");
        email_cadastro.setText("");
        semestre_cadastro.setSelectedItem("");
        cidade_cadastro.setText("");
        celular_cadastro.setText("");
        senha_cadastro.setText("");
        ensino1.setSelectedItem("");
        ensino2.setSelectedItem("");
        ensino3.setSelectedItem("");
        aprendo1.setSelectedItem("");
        aprendo2.setSelectedItem("");
        aprendo3.setSelectedItem("");
    }//GEN-LAST:event_limpar_cadastroMouseClicked

    private void aprendo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprendo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aprendo1ActionPerformed

    private void editar_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editar_celularActionPerformed

    private void editar_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editar_cidadeActionPerformed

    private void salvar_edicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvar_edicaoMouseClicked
            atualizarCliente(aluno);
  
    }//GEN-LAST:event_salvar_edicaoMouseClicked

    private void editar_limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editar_limparMouseClicked
        // TODO add your handling code here:
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
    }//GEN-LAST:event_editar_limparMouseClicked

    private void editar_aprendo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_aprendo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editar_aprendo1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarPerfil().setVisible(true);
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
    private javax.swing.JComboBox<String> editar_aprendo1;
    private javax.swing.JComboBox<String> editar_aprendo2;
    private javax.swing.JComboBox<String> editar_aprendo3;
    private javax.swing.JTextField editar_celular;
    private javax.swing.JTextField editar_cidade;
    private javax.swing.JTextField editar_email;
    private javax.swing.JComboBox<String> editar_ensino1;
    private javax.swing.JComboBox<String> editar_ensino2;
    private javax.swing.JComboBox<String> editar_ensino3;
    private javax.swing.JButton editar_limpar;
    private javax.swing.JTextField editar_nascimento;
    private javax.swing.JTextField editar_nome;
    private javax.swing.JComboBox<String> editar_semestre;
    private javax.swing.JPasswordField editar_senha;
    private javax.swing.JTextField email_cadastro;
    private javax.swing.JComboBox<String> ensino1;
    private javax.swing.JComboBox<String> ensino2;
    private javax.swing.JComboBox<String> ensino3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton limpar_cadastro;
    private javax.swing.JTextField nascimento_cadastro;
    private javax.swing.JTextField nome_cadastro;
    private javax.swing.JButton salvar_edicao;
    private javax.swing.JComboBox<String> semestre_cadastro;
    private javax.swing.JPasswordField senha_cadastro;
    // End of variables declaration//GEN-END:variables
}
