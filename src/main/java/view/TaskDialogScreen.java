package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;

import model.Task;

public class TaskDialogScreen extends javax.swing.JDialog {
    TaskController controller;
    Project project;
    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        controller = new TaskController();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContent = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelTaskForm = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPaneDescription = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabelDeadLine = new javax.swing.JLabel();
        jLabelNotes = new javax.swing.JLabel();
        jScrollPaneNotes = new javax.swing.JScrollPane();
        jTextAreaNotes = new javax.swing.JTextArea();
        jFormattedTextFieldDeadLine = new javax.swing.JFormattedTextField();
        jLabelCancel = new javax.swing.JLabel();
        jLabelSave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova tarefa");
        setResizable(false);

        jPanelContent.setBackground(new java.awt.Color(36, 41, 46));

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Nova tarefa");

        jPanelTaskForm.setBackground(new java.awt.Color(36, 41, 46));
        jPanelTaskForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));

        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Nome");

        jTextFieldName.setBackground(new java.awt.Color(29, 33, 37));
        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldName.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldName.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        jLabelDescription.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescription.setText("Descrição");

        jTextAreaDescription.setBackground(new java.awt.Color(29, 33, 37));
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDescription.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jScrollPaneDescription.setViewportView(jTextAreaDescription);

        jLabelDeadLine.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDeadLine.setText("Prazo");

        jLabelNotes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNotes.setText("Notas");

        jTextAreaNotes.setBackground(new java.awt.Color(29, 33, 37));
        jTextAreaNotes.setColumns(20);
        jTextAreaNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaNotes.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaNotes.setRows(5);
        jTextAreaNotes.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jScrollPaneNotes.setViewportView(jTextAreaNotes);

        jFormattedTextFieldDeadLine.setBackground(new java.awt.Color(29, 33, 37));
        jFormattedTextFieldDeadLine.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextFieldDeadLine.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldDeadLine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextFieldDeadLine.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelTaskFormLayout = new javax.swing.GroupLayout(jPanelTaskForm);
        jPanelTaskForm.setLayout(jPanelTaskFormLayout);
        jPanelTaskFormLayout.setHorizontalGroup(
            jPanelTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addComponent(jScrollPaneDescription)
                    .addComponent(jScrollPaneNotes)
                    .addGroup(jPanelTaskFormLayout.createSequentialGroup()
                        .addGroup(jPanelTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNotes)
                            .addComponent(jLabelDeadLine)
                            .addComponent(jLabelDescription)
                            .addComponent(jLabelName))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jFormattedTextFieldDeadLine))
                .addContainerGap())
        );
        jPanelTaskFormLayout.setVerticalGroup(
            jPanelTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDeadLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDeadLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCancel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        jLabelCancel.setText("Cancelar");
        jLabelCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelMouseClicked(evt);
            }
        });

        jLabelSave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelSave.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new.png"))); // NOI18N
        jLabelSave.setText("Criar tarefa");
        jLabelSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTaskForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelContentLayout.createSequentialGroup()
                        .addComponent(jLabelCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSave)))
                .addContainerGap())
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTaskForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelSave)
                    .addComponent(jLabelCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    private void jLabelCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelMouseClicked
        dispose();
    }//GEN-LAST:event_jLabelCancelMouseClicked

    private void jLabelSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaveMouseClicked
        try{
            Task task = new Task();
            task.setProjectId(project.getId());
            
            task.setName(jTextFieldName.getText());
            task.setDescription(jTextAreaDescription.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date deadLine = dateFormat.parse(jFormattedTextFieldDeadLine.getText());
            task.setDeadLine(deadLine);
            task.setNotes(jTextAreaNotes.getText());
            
            controller.save(task);
            JOptionPane.showMessageDialog(jPanelContent, "Tarefa salva com sucesso!");
            dispose();
        }catch(Exception ex){
            System.err.println(ex);
            JOptionPane.showMessageDialog(jPanelContent, ex.getMessage());
        }
    }//GEN-LAST:event_jLabelSaveMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldDeadLine;
    private javax.swing.JLabel jLabelCancel;
    private javax.swing.JLabel jLabelDeadLine;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNotes;
    private javax.swing.JLabel jLabelSave;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelTaskForm;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private javax.swing.JScrollPane jScrollPaneNotes;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextArea jTextAreaNotes;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }
}
