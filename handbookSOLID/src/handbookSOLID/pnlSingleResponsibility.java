/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handbookSOLID;

/**
 *
 * @author ozben
 */
public class pnlSingleResponsibility extends javax.swing.JPanel {

    /**
     * Creates new form pnlSingleResponsibility
     */
    public pnlSingleResponsibility() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSingleResponsibilityHeader = new javax.swing.JLabel();
        txtaSRP = new javax.swing.JScrollPane();
        txtaSingleResponsibilityPrinciple = new javax.swing.JTextArea();
        lblImg = new javax.swing.JLabel();

        lblSingleResponsibilityHeader.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSingleResponsibilityHeader.setText("Tek Sorumluluk Prensibi (Single Responsibility Principle)");

        txtaSingleResponsibilityPrinciple.setColumns(20);
        txtaSingleResponsibilityPrinciple.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtaSingleResponsibilityPrinciple.setRows(5);
        txtaSingleResponsibilityPrinciple.setText("Bir sınıfın veya modülün sadece tek bir sorumluluğu yerine getirmesini amaçlayan prensiptir.\nBağımlılık (Cohesion) en aza indirgenmesi amaçlanmaktadır.");
        txtaSingleResponsibilityPrinciple.setToolTipText("");
        txtaSingleResponsibilityPrinciple.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtaSingleResponsibilityPrinciple.setEnabled(false);
        txtaSRP.setViewportView(txtaSingleResponsibilityPrinciple);
        txtaSingleResponsibilityPrinciple.getAccessibleContext().setAccessibleParent(this);

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/SingleResponsibilityPrinciple.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtaSRP)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblSingleResponsibilityHeader)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblSingleResponsibilityHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtaSRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImg)
                .addGap(0, 169, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblSingleResponsibilityHeader;
    private javax.swing.JScrollPane txtaSRP;
    private javax.swing.JTextArea txtaSingleResponsibilityPrinciple;
    // End of variables declaration//GEN-END:variables
}
