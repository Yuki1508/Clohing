/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clothingbusiness;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author khansamaheswari
 */

public class Clothing extends JFrame implements ActionListener {
    private JLabel labelName, labelItemName, labelMembership, labelTransactionDate;
    private JComboBox<String> comboBoxJenisBarang;
    private JTextField textFieldHargaBarang, textFieldDiskon, textFieldTotalHarga;
    private JButton buttonHitung;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        new Clothing();
    }

    public Clothing(){
        initComponent();
    }

private void initComponent(){
        //=======BAGIAN CONTAINER==========
        JFrame form = new JFrame("Clothing Payment Administration");
        form.setSize(500, 500);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);
        //form.setVisible(true);
        
        //====End Container===========
        
        //=======BAGIAN COMPONENT =====
        //Membuat objek komponen
        JLabel labelJudul = new JLabel("Payment Administration");
        //Untuk mengatur posisi dan ukuran dari komponen
        labelJudul.setBounds(100, 30, 155, 25);
        //Memasukkan komponen ke dalam form/container
        form.add(labelJudul);
        
        //Bagian Kode
        JLabel labelKodeBuku = new JLabel("Name");
        labelKodeBuku.setBounds(20, 80, 150, 25);
        form.add(labelKodeBuku);
        JTextField txtKodeBuku = new JTextField();
        txtKodeBuku.setBounds(150, 80, 150, 25);
        form.add(txtKodeBuku);
        
        //Bagian Nama Buku
        JLabel labelNamaBuku = new JLabel("Item Name");
        labelNamaBuku.setBounds(20, 110, 150, 25);
        form.add(labelNamaBuku);
        JTextField txtNamaBuku = new JTextField();
        txtNamaBuku.setBounds(150, 110, 150, 25);
        form.add(txtNamaBuku);
        
        //Bagian Membership menggunakan radio button
        JLabel labelMembership = new JLabel("Membership");
        labelMembership.setBounds(20, 140, 150, 25);
        form.add(labelMembership);
        //Membuat radio button
        JRadioButton radioKhusus = new JRadioButton();
        radioKhusus.setText("Membership");
        radioKhusus.setBounds(150, 140, 140, 25);
        JRadioButton radioUmum = new JRadioButton();
        radioUmum.setText("Non Membership");
        radioUmum.setBounds(250, 140, 140, 25);
        form.add(radioKhusus);
        form.add(radioUmum);
        
        //Untuk memilih salah satu dari pilihan/menambahkan group radio button
        ButtonGroup groupMembership = new ButtonGroup();
        groupMembership.add(radioKhusus);
        groupMembership.add(radioUmum);
        
        
        //Bagian Tanggal Transaksi
        JLabel labelTangalPinjam = new JLabel("Transaction Date");
        labelTangalPinjam.setBounds(20, 200, 150, 25);
        form.add(labelTangalPinjam);
        
        //Combobox tanggal - hari
        //String hari[] = {"1","2","3"}; 
        
        String hari[] = new String[31];
        for (int i = 0; i < hari.length; i++) {
            hari[i] = Integer.toString(i+1);
        }
        
        JComboBox cbHari = new JComboBox(hari);
        cbHari.setBounds(150,200,40,25);
        form.add(cbHari);
        
        //Combobox Bulan
        String bulan[] = {"Jan","Feb","Mar","Apr","Mei","Jun","Jul","Agu","Sep","Okt","Nov","Des"};
        JComboBox cbBulan = new JComboBox(bulan);
        cbBulan.setBounds(200, 200, 70, 25);
        form.add(cbBulan);
        
        //txtField untuk tanggal - tahun
        JTextField txtTahun = new JTextField();
        txtTahun.setBounds(280, 200, 45, 25);
        form.add(txtTahun);
                
        
        
        //Tombol Simpan dan Reset
        JButton btnSimpan = new JButton("Save");
        btnSimpan.setBounds(150, 360, 80, 25);
        form.add(btnSimpan);
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(250, 360, 75, 25);
        form.add(btnReset);     

        
        form.setVisible(true);
        
        //====BLOK EVENT=====
        btnSimpan.addActionListener(this);
        btnReset.addActionListener(this);
        btnSimpan.setActionCommand("Save");
        btnReset.setActionCommand("Reset");
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch(command){
            case "Save" -> JOptionPane.showMessageDialog(null, "Data Has Been Successfully Disseminated");
            case "Reset" -> JOptionPane.showMessageDialog(null, "Data Resetting");
            default -> System.out.println("There is No Action");        
        }
    }  
}

