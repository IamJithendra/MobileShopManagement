/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileshopmanagement;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ct
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
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

        mainPanel = new javax.swing.JPanel();
        tvModelName = new javax.swing.JLabel();
        tvModelNo = new javax.swing.JLabel();
        tvBrand = new javax.swing.JLabel();
        tvCamera = new javax.swing.JLabel();
        tvBattery = new javax.swing.JLabel();
        tvVarients = new javax.swing.JLabel();
        tvOs = new javax.swing.JLabel();
        tvProcessor = new javax.swing.JLabel();
        tvYear = new javax.swing.JLabel();
        tvAvailability = new javax.swing.JLabel();
        tvPrice = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        operatingsystem = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        camera = new javax.swing.JTextField();
        processor = new javax.swing.JTextField();
        battery = new javax.swing.JTextField();
        availability = new javax.swing.JTextField();
        modelname = new javax.swing.JTextField();
        modelno = new javax.swing.JTextField();
        varients = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tvHeading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        icClear = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(38, 34, 83));
        mainPanel.setForeground(new java.awt.Color(254, 254, 254));

        tvModelName.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tvModelName.setForeground(new java.awt.Color(254, 254, 254));
        tvModelName.setText("Model Name");

        tvModelNo.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tvModelNo.setForeground(new java.awt.Color(254, 254, 254));
        tvModelNo.setText("Model Number");

        tvBrand.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tvBrand.setForeground(new java.awt.Color(254, 254, 254));
        tvBrand.setText("Brand");

        tvCamera.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tvCamera.setForeground(new java.awt.Color(254, 254, 254));
        tvCamera.setText("Camera");

        tvBattery.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tvBattery.setForeground(new java.awt.Color(254, 254, 254));
        tvBattery.setText("Battery Capacity");

        tvVarients.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tvVarients.setForeground(new java.awt.Color(254, 254, 254));
        tvVarients.setText("Varients");

        tvOs.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tvOs.setForeground(new java.awt.Color(254, 254, 254));
        tvOs.setText("Operating System");

        tvProcessor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tvProcessor.setForeground(new java.awt.Color(254, 254, 254));
        tvProcessor.setText("Processor");

        tvYear.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tvYear.setForeground(new java.awt.Color(254, 254, 254));
        tvYear.setText("Year of Release");

        tvAvailability.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tvAvailability.setForeground(new java.awt.Color(254, 254, 254));
        tvAvailability.setText("Availability");

        tvPrice.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tvPrice.setForeground(new java.awt.Color(254, 254, 254));
        tvPrice.setText("Price");

        register.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        operatingsystem.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N

        brand.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N

        year.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N

        camera.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N

        processor.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N

        battery.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N

        availability.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N

        modelname.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N

        modelno.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N

        varients.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N

        price.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        tvHeading.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        tvHeading.setForeground(new java.awt.Color(254, 254, 254));
        tvHeading.setText("ENTER YOUR DETAILS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_back.png"))); // NOI18N

        icClear.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        icClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img_delete.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(tvHeading)
                .addGap(30, 30, 30)
                .addComponent(icClear))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icClear)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tvHeading))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(varients, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(battery, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(operatingsystem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tvYear)
                                        .addComponent(tvCamera)
                                        .addComponent(tvOs)
                                        .addComponent(tvBattery)
                                        .addComponent(tvVarients)
                                        .addComponent(tvProcessor)
                                        .addComponent(tvPrice)
                                        .addComponent(tvAvailability)
                                        .addComponent(tvBrand)
                                        .addComponent(tvModelNo)
                                        .addComponent(tvModelName))
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addGap(57, 57, 57)
                                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(camera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(processor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(availability, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(modelname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(modelno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvModelName)
                    .addComponent(modelno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvModelNo)
                    .addComponent(modelname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvBrand)
                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvYear)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvOs)
                    .addComponent(operatingsystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvCamera)
                    .addComponent(camera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(battery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvBattery))
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvVarients)
                    .addComponent(varients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvProcessor)
                    .addComponent(processor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvPrice)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tvAvailability))
                .addGap(18, 18, 18)
                .addComponent(register)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        try {
            /*
            model_no = variable to store that value on
            the Text Field and modelno = variable name 
            given on the JFRame Form
            
            .getText is to Get Data  From the textfield
            to the Variable Name Declared
            */
            String model_no=modelno.getText();
            String model_name=modelname.getText();
            String brandname=brand.getText();
            String year_release=year.getText();
            String os=operatingsystem.getText();
            String cam=camera.getText();
            String batt=battery.getText();
            String varints=varients.getText();
            String prossor=processor.getText();
            String cost=price.getText();
            String avail=availability.getText();
            /* 
            To Disable Null Values If any Field is Empty 
            it will show to enter that Value
            */
            if (model_no.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Model Number Cannot be Empty");
            } else if(model_name.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Model Name Cannot be Empty");
            }else if(brandname.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Brand Cannot be Empty");
            }else if(year_release.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Year Cannot be Empty");
            }else if(os.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Operating System Cannot be Empty");
            }else if(cam.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Camera Cannot be Empty");
            }else if(batt.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Battery Cannot be Empty");
            }else if(varints.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Varients Cannot be Empty");
            }else if(prossor.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Processor Cannot be Empty");
            }else if(cost.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Price Cannot be Empty");
            }else if(avail.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Availability Cannot be Empty");
            }else{
            // To Make Connection to Database
            Connection myConnection=database.connection.getConnection();
            String s="insert into mobiles(Model_no,Model_Name,Brand,Year_of_Release,Operating_System,Camera,Battery_Capacity,Varients,Processor,Price,Availability)values('"+model_no+"','"+model_name+"','"+brandname+"','"+year_release+"','"+os+"','"+cam+"','"+batt+"','"+varints+"','"+prossor+"','"+cost+"','"+avail+"')";
            Statement st=myConnection.createStatement();
            int executeUpdate = st.executeUpdate(s);
            // If Value is Inserted Successfully
            if (executeUpdate>0){
                JOptionPane.showMessageDialog(rootPane, "Insertion Success");
                // To Set the Edit Text Box Value to NULL
                modelno.setText("");
                modelname.setText("");
                brand.setText("");
                year.setText("");
                operatingsystem.setText("");
                camera.setText("");
                battery.setText("");
                varients.setText("");
                processor.setText("");
                price.setText("");
                availability.setText("");
                
               // If value Can't Inserted    
            } else {
                JOptionPane.showMessageDialog(rootPane, "Insertion Failed");
            }
            }
        } catch (SQLException | HeadlessException e) {
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availability;
    private javax.swing.JTextField battery;
    private javax.swing.JTextField brand;
    private javax.swing.JTextField camera;
    private javax.swing.JLabel icClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField modelname;
    private javax.swing.JTextField modelno;
    private javax.swing.JTextField operatingsystem;
    private javax.swing.JTextField price;
    private javax.swing.JTextField processor;
    private javax.swing.JButton register;
    private javax.swing.JLabel tvAvailability;
    private javax.swing.JLabel tvBattery;
    private javax.swing.JLabel tvBrand;
    private javax.swing.JLabel tvCamera;
    private javax.swing.JLabel tvHeading;
    private javax.swing.JLabel tvModelName;
    private javax.swing.JLabel tvModelNo;
    private javax.swing.JLabel tvOs;
    private javax.swing.JLabel tvPrice;
    private javax.swing.JLabel tvProcessor;
    private javax.swing.JLabel tvVarients;
    private javax.swing.JLabel tvYear;
    private javax.swing.JTextField varients;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
