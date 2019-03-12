package Application;

import javax.swing.*;
import java.util.List;

// Класс MainFrame
class MainFrame extends javax.swing.JFrame
{
    // Поля
    private javax.swing.JLayeredPane Menu;
    private javax.swing.JButton authorizationB;
    private javax.swing.JButton authorizationButton;
    private javax.swing.JLayeredPane authorizationForm;
    private javax.swing.JLabel currentNameL;
    private javax.swing.JLabel currentRoleL;
    private javax.swing.JTextField expertText;
    private javax.swing.JButton initializationButton;
    private javax.swing.JLayeredPane initializationForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField loginText;
    private javax.swing.JTextField loginText1;
    private javax.swing.JButton logoutB;
    private javax.swing.JTextField minsumText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField passwordText;
    private javax.swing.JTextField passwordText1;
    private javax.swing.JButton projectB;
    private javax.swing.JTextField projectNameText;
    private javax.swing.JLayeredPane projectRegistration;
    private javax.swing.JButton projectSubmit;
    private javax.swing.JButton registrationB;
    private javax.swing.JButton registrationButton;
    private javax.swing.JLayeredPane registrationForm;
    private javax.swing.JButton resultB;
    public GrantSystem grantSystem;

    // Метод инициалиации компонентов фрейма
    // Совершенно ужасный код, сгенерированный NetBeans
    private void initComponents()
    {
        registrationForm = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        loginText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registrationButton = new javax.swing.JButton();
        Menu = new javax.swing.JLayeredPane();
        jLabel14 = new javax.swing.JLabel();
        authorizationB = new javax.swing.JButton();
        registrationB = new javax.swing.JButton();
        projectB = new javax.swing.JButton();
        resultB = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        currentNameL = new javax.swing.JLabel();
        currentRoleL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        logoutB = new javax.swing.JButton();
        initializationForm = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        minsumText = new javax.swing.JTextField();
        initializationButton = new javax.swing.JButton();
        projectRegistration = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        expertText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        projectNameText = new javax.swing.JTextField();
        projectSubmit = new javax.swing.JButton();
        authorizationForm = new javax.swing.JLayeredPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        loginText1 = new javax.swing.JTextField();
        passwordText1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        authorizationButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));

        registrationForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registrationForm.setPreferredSize(new java.awt.Dimension(320, 120));

        jLabel1.setText("Региствация пользователя");

        jLabel3.setText("Имя");

        nameText.setMinimumSize(new java.awt.Dimension(80, 25));
        nameText.setName(""); // NOI18N
        nameText.setPreferredSize(new java.awt.Dimension(80, 20));

        passwordText.setMinimumSize(new java.awt.Dimension(80, 20));
        passwordText.setName(""); // NOI18N
        passwordText.setPreferredSize(new java.awt.Dimension(80, 20));

        loginText.setMinimumSize(new java.awt.Dimension(80, 20));
        loginText.setName(""); // NOI18N
        loginText.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel4.setText("Логин");

        jLabel5.setText("Пароль");

        registrationButton.setText("Подтвердить");
        registrationButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationButtonActionPerformed(evt);
            }
        });

        registrationForm.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        registrationForm.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        registrationForm.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        registrationForm.setLayer(nameText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        registrationForm.setLayer(passwordText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        registrationForm.setLayer(loginText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        registrationForm.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        registrationForm.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        registrationForm.setLayer(registrationButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout registrationFormLayout = new javax.swing.GroupLayout(registrationForm);
        registrationForm.setLayout(registrationFormLayout);
        registrationFormLayout.setHorizontalGroup(
                registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registrationFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registrationFormLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2))
                                        .addGroup(registrationFormLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(loginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(46, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationFormLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrationButton)
                                .addContainerGap())
        );
        registrationFormLayout.setVerticalGroup(
                registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registrationFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(registrationButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Menu.setPreferredSize(new java.awt.Dimension(600, 300));

        jLabel14.setText("Меню программы");

        authorizationB.setText("Войти в систему");
        authorizationB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorizationBActionPerformed(evt);
            }
        });

        registrationB.setText("Регистрация");
        registrationB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationBActionPerformed(evt);
            }
        });

        projectB.setText("Подать заявку");
        projectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectBActionPerformed(evt);
            }
        });

        resultB.setText("Расчет результатов");
        resultB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultBActionPerformed(evt);
            }
        });

        jLabel15.setText("Текущий пользователь:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Автор", "Название", "Баллы", "Выигрыш"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        logoutB.setText("Выйти");
        logoutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBActionPerformed(evt);
            }
        });

        Menu.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Menu.setLayer(authorizationB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Menu.setLayer(registrationB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Menu.setLayer(projectB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Menu.setLayer(resultB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Menu.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Menu.setLayer(currentNameL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Menu.setLayer(currentRoleL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Menu.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Menu.setLayer(logoutB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
                MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MenuLayout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(currentNameL))
                                        .addComponent(currentRoleL)
                                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel14)
                                                .addComponent(resultB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(projectB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(registrationB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(authorizationB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(logoutB))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 14, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
                MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MenuLayout.createSequentialGroup()
                                                .addComponent(authorizationB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(registrationB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(projectB)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(resultB)
                                                .addGap(20, 20, 20)
                                                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel15)
                                                        .addComponent(currentNameL))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(currentRoleL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(logoutB))
                                        .addGroup(MenuLayout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 11, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        initializationForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        initializationForm.setMinimumSize(new java.awt.Dimension(100, 100));
        initializationForm.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel6.setText("Задание грантового фонда");

        jLabel7.setText("Минимальная сумма");

        minsumText.setMinimumSize(new java.awt.Dimension(80, 20));
        minsumText.setName(""); // NOI18N
        minsumText.setPreferredSize(new java.awt.Dimension(80, 20));

        initializationButton.setText("Подтвердить");
        initializationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initializationButtonActionPerformed(evt);
            }
        });

        initializationForm.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        initializationForm.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        initializationForm.setLayer(minsumText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        initializationForm.setLayer(initializationButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout initializationFormLayout = new javax.swing.GroupLayout(initializationForm);
        initializationForm.setLayout(initializationFormLayout);
        initializationFormLayout.setHorizontalGroup(
                initializationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(initializationFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(initializationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(initializationFormLayout.createSequentialGroup()
                                                .addComponent(minsumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(initializationButton))
                                        .addGroup(initializationFormLayout.createSequentialGroup()
                                                .addGroup(initializationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        initializationFormLayout.setVerticalGroup(
                initializationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(initializationFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGroup(initializationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(initializationFormLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minsumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(27, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, initializationFormLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(initializationButton)
                                                .addContainerGap())))
        );

        projectRegistration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        projectRegistration.setPreferredSize(new java.awt.Dimension(320, 120));

        jLabel8.setText("Регистрация проекта");

        jLabel9.setText("Название проекта");

        expertText.setMinimumSize(new java.awt.Dimension(80, 20));
        expertText.setName(""); // NOI18N
        expertText.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel10.setText("Экспертная оценка");

        projectNameText.setMinimumSize(new java.awt.Dimension(80, 20));
        projectNameText.setName(""); // NOI18N
        projectNameText.setPreferredSize(new java.awt.Dimension(80, 20));

        projectSubmit.setText("Подтвердить");
        projectSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectSubmitActionPerformed(evt);
            }
        });

        projectRegistration.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        projectRegistration.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        projectRegistration.setLayer(expertText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        projectRegistration.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        projectRegistration.setLayer(projectNameText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        projectRegistration.setLayer(projectSubmit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout projectRegistrationLayout = new javax.swing.GroupLayout(projectRegistration);
        projectRegistration.setLayout(projectRegistrationLayout);
        projectRegistrationLayout.setHorizontalGroup(
                projectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(projectRegistrationLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(projectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addGroup(projectRegistrationLayout.createSequentialGroup()
                                                .addGroup(projectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(projectNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(projectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(expertText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10))))
                                .addContainerGap(106, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectRegistrationLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(projectSubmit)
                                .addContainerGap())
        );
        projectRegistrationLayout.setVerticalGroup(
                projectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(projectRegistrationLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(projectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(projectRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(expertText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(projectNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(projectSubmit)
                                .addContainerGap())
        );

        authorizationForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        authorizationForm.setPreferredSize(new java.awt.Dimension(320, 120));

        jLabel11.setText("Вход в систему");

        jLabel12.setText("Логин");

        loginText1.setMinimumSize(new java.awt.Dimension(80, 25));
        loginText1.setName(""); // NOI18N
        loginText1.setPreferredSize(new java.awt.Dimension(80, 20));

        passwordText1.setMinimumSize(new java.awt.Dimension(80, 25));
        passwordText1.setName(""); // NOI18N
        passwordText1.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel13.setText("Пароль");

        authorizationButton.setText("Подтвердить");
        authorizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorizationButtonActionPerformed(evt);
            }
        });

        authorizationForm.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        authorizationForm.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        authorizationForm.setLayer(loginText1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        authorizationForm.setLayer(passwordText1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        authorizationForm.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        authorizationForm.setLayer(authorizationButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout authorizationFormLayout = new javax.swing.GroupLayout(authorizationForm);
        authorizationForm.setLayout(authorizationFormLayout);
        authorizationFormLayout.setHorizontalGroup(
                authorizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(authorizationFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(authorizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(authorizationFormLayout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(authorizationFormLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(authorizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(loginText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel12))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(authorizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(authorizationFormLayout.createSequentialGroup()
                                                                .addComponent(jLabel13)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(authorizationFormLayout.createSequentialGroup()
                                                                .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(40, 128, Short.MAX_VALUE))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, authorizationFormLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(authorizationButton)
                                .addContainerGap())
        );
        authorizationFormLayout.setVerticalGroup(
                authorizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(authorizationFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(authorizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                .addGap(2, 2, 2)
                                .addGroup(authorizationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(authorizationButton)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(registrationForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(authorizationForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(initializationForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(projectRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(registrationForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(authorizationForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(initializationForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(projectRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(444, Short.MAX_VALUE))
        );
        pack();
    }

    // Конструктор по-умолчанию
    public MainFrame()
    {
        initComponents();
        authorizationForm.setVisible(false);
        projectRegistration.setVisible(false);
        initializationForm.setVisible(false);
        Menu.setVisible(false);
        registrationForm.setVisible(true);
        grantSystem = new GrantSystem();
    }

    // Метод переинициализации меню
    private void menuInit()
    {
        User user = grantSystem.get_currentUser();
        // Показ имени  и роли текущего пользователя и включение нужных кнопок
        if (user == null)
        {
            currentNameL.setText("Нет");
            currentRoleL.setText("");
            projectB.setEnabled(false);
            resultB.setEnabled(false);
            logoutB.setEnabled(false);
            authorizationB.setEnabled(true);
        }
        else if (user instanceof Admin)
        {
            currentNameL.setText(user.get_name());
            currentRoleL.setText("Администратор");
            projectB.setEnabled(false);
            resultB.setEnabled(true);
            logoutB.setEnabled(true);
            authorizationB.setEnabled(false);
        }
        else if (user instanceof Client)
        {
            currentNameL.setText(user.get_name());
            currentRoleL.setText("Клиент");
            projectB.setEnabled(true);
            resultB.setEnabled(false);
            logoutB.setEnabled(true);
            authorizationB.setEnabled(false);
        }
        List<Project> projects = grantSystem.get_projects();
        //Заполнение таблицы списком проектов
        for (int index = 0; index < projects.size(); index++)
        {
            jTable1.setValueAt(projects.get(index).getAuthor().get_name(),index,0);
            jTable1.setValueAt(projects.get(index).getName(),index,1);
            jTable1.setValueAt(projects.get(index).getExpertMark(),index,2);
            jTable1.setValueAt(projects.get(index).getSum(),index,3);
        }
    }

    // Метод обранотки нажатия кнопки "подтверждение" в форме инициализации
    private void initializationButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        if(minsumText.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Одно из полей не заполнено");
        }
        else
        {
            grantSystem.set_minSum(Integer.parseInt(minsumText.getText()));
            grantSystem.set_grantFond(Integer.parseInt(minsumText.getText()) * 20);
            initializationForm.setVisible(false);
            Menu.setVisible(true);
            menuInit();
        }
    }

    // Метод обранотки нажатия кнопки "подтверждение" в форме регистрации проекта
    private void projectSubmitActionPerformed(java.awt.event.ActionEvent evt)
    {
        if (projectNameText.getText().equals("") || expertText.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Одно из полей не заполнено");
        }
        else
        {
            User currentUser = grantSystem.get_currentUser();
            String name = projectNameText.getText();
            int sum = Integer.parseInt(expertText.getText());
            grantSystem.addProject(currentUser, name, 0, sum);
            projectNameText.setText("");
            expertText.setText("");
            projectRegistration.setVisible(false);
            Menu.setVisible(true);
            menuInit();
        }
    }

    // Метод обранотки нажатия кнопки "подтверждение" в форме регистрации
    private void registrationButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        if (nameText.getText().equals("") || loginText.getText().equals("") || passwordText.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Одно из полей не заполнено");
        }
        else
        {
            if (grantSystem.noUsers())
            {
                Admin admin = new Admin(nameText.getText(), loginText.getText(), passwordText.getText());
                grantSystem.addUser(admin);
                nameText.setText("");
                loginText.setText("");
                passwordText.setText("");
                registrationForm.setVisible(false);
                initializationForm.setVisible(true);
            }
            else
            {
                Client client = new Client(nameText.getText(), loginText.getText(), passwordText.getText());
                grantSystem.addUser(client);
                nameText.setText("");
                loginText.setText("");
                passwordText.setText("");
                registrationForm.setVisible(false);
                Menu.setVisible(true);
                menuInit();
            }
        }
    }

    // Метод обранотки нажатия кнопки "подтверждение" в форме авторизации
    private void authorizationButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        if (loginText1.getText().equals("") || passwordText1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Одно из полей не заполнено");
        }
        else
        {
            User user = grantSystem.findUser(loginText1.getText(),passwordText1.getText());
            if (user == null)
            {
                JOptionPane.showMessageDialog(null, "Неверный логин или пароль");
                loginText1.setText("");
                passwordText1.setText("");
            }
            else
            {
                grantSystem.set_currentUser(user);
                loginText1.setText("");
                passwordText1.setText("");
                authorizationForm.setVisible(false);
                Menu.setVisible(true);
                menuInit();
            }
        }
    }

    // Метод обранотки нажатия кнопки "войти в систему"
    private void authorizationBActionPerformed(java.awt.event.ActionEvent evt)
    {
        Menu.setVisible(false);
        authorizationForm.setVisible(true);
    }

    // Метод обранотки нажатия кнопки "регистрация"
    private void registrationBActionPerformed(java.awt.event.ActionEvent evt)
    {
        Menu.setVisible(false);
        registrationForm.setVisible(true);
    }

    // Метод обранотки нажатия кнопки "подать заявку"
    private void projectBActionPerformed(java.awt.event.ActionEvent evt)
    {
        Menu.setVisible(false);
        projectRegistration.setVisible(true);
    }

    // Метод обранотки нажатия кнопки "расчет результатов"
    private void resultBActionPerformed(java.awt.event.ActionEvent evt)
    {
        grantSystem.genereteResults();
        resultB.setEnabled(false);
        menuInit();
    }

    // Метод обранотки нажатия кнопки "выйти"
    private void logoutBActionPerformed(java.awt.event.ActionEvent evt)
    {
        grantSystem.set_currentUser(null);
        menuInit();
    }

    // Главный метод
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}