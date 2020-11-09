package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;

public class NUEVO extends JFrame {
    public double[][] TrifasicoNuevoSerie35 = new double[22][2];
    public double[][] TrifasicoNuevo = new double[20][2];
    public double[][] MonofasicoNuevo = new double[9][2];
    public double[][] MonofasicoNuevoSerie35 = new double[6][2];
    public Icon bien = new ImageIcon(this.getClass().getResource("/RECURSOS/X64/bien.png"));
    public Icon mal = new ImageIcon(this.getClass().getResource("/RECURSOS/X64/error.png"));
    private DefaultTableModel model;
    public int con = 0;
    private JPanel PanelCalculos;
    private JButton btncalcula;
    private JCheckBox checktapa;
    private JTextField cjaceiteoblea;
    private JTextField cjalto;
    private JTextField cjalturasnmm;
    private JTextField cjancho;
    private JTextField cjdisenocaja;
    private JTextField cjdisipa;
    private JTextField cjelevacion;
    private JTextField cjelevacioncorregida;
    private JTextField cjfase;
    private JTextField cjkva;
    private JTextField cjlargo;
    private JTextField cjnivelalturaaceite;
    private JTextField cjnoobleas;
    private JTextField cjperdidastotales;
    private JTextField cjpesorad;
    private JTextField cjpesotanque;
    private JTextField cjpesototal;
    private JTextField cjtempamb;
    private JTextField cjtipooblea;
    private JTextField cjvp;
    private JComboBox comboLAMINACAJA;
    private JComboBox comboLAMINADUCTO;
    private JComboBox comboobleaseleccionada;
    private JButton jButton7;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel14;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel3;
    private JLabel jLabel31;
    private JLabel jLabel36;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPanel jPanel2;
    private JToolBar jToolBar1;
    private JLabel lblancho;
    private JLabel lbllargo;

    public NUEVO() {
        this.initComponents();
        this.cjelevacion.grabFocus();
        this.comboobleaseleccionada.addItem("400 * 300");
        this.comboobleaseleccionada.addItem("500 * 300");
        this.comboobleaseleccionada.addItem("600 * 300");
        this.comboobleaseleccionada.addItem("700 * 300");
        this.comboobleaseleccionada.addItem("800 * 300");
        this.comboobleaseleccionada.addItem("1050 * 300");
        this.comboobleaseleccionada.addItem("1200 * 300");
        this.comboobleaseleccionada.addItem("800 * 380");
        this.comboobleaseleccionada.addItem("1000 * 800");
        this.comboobleaseleccionada.addItem("1200 * 382");
        this.comboobleaseleccionada.addItem("S. Prog.");
        this.comboobleaseleccionada.setSelectedIndex(10);
        this.comboLAMINACAJA.addItem("Calibre 12");
        this.comboLAMINACAJA.addItem("Calibre 14");
        this.comboLAMINACAJA.addItem("Calibre 18");
        this.comboLAMINACAJA.addItem("Calibre 3/4");
        this.comboLAMINACAJA.addItem("Calibre 1/2");
        this.comboLAMINACAJA.addItem("Calibre 1/4");
        this.comboLAMINACAJA.addItem("Calibre 1/8");
        this.comboLAMINACAJA.addItem("Calibre 3/8");
        this.comboLAMINACAJA.addItem("Calibre 3/16");
        this.comboLAMINACAJA.addItem("Calibre 5/16");
        this.comboLAMINACAJA.setSelectedIndex(8);
        this.comboLAMINADUCTO.addItem("Calibre 16");
        this.comboLAMINADUCTO.addItem("Calibre 18");
        this.comboLAMINADUCTO.addItem("Calibre 20");
        this.TrifasicoNuevoSerie35[0][0] = 75.0D; this.TrifasicoNuevoSerie35[0][1] = 1760.0D;
        this.TrifasicoNuevoSerie35[1][0] = 112.5D; this.TrifasicoNuevoSerie35[1][1] = 2390.0D;
        this.TrifasicoNuevoSerie35[2][0] = 150.0D; this.TrifasicoNuevoSerie35[2][1] = 3010.0D;
        this.TrifasicoNuevoSerie35[3][0] = 225.0D; this.TrifasicoNuevoSerie35[3][1] = 4120.0D;
        this.TrifasicoNuevoSerie35[4][0] = 300.0D; this.TrifasicoNuevoSerie35[4][1] = 5160.0D;
        this.TrifasicoNuevoSerie35[5][0] = 400.0D; this.TrifasicoNuevoSerie35[5][1] = 6470.0D;
        this.TrifasicoNuevoSerie35[6][0] = 500.0D; this.TrifasicoNuevoSerie35[6][1] = 7700.0D;
        this.TrifasicoNuevoSerie35[7][0] = 630.0D; this.TrifasicoNuevoSerie35[7][1] = 9230.0D;
        this.TrifasicoNuevoSerie35[8][0] = 750.0D; this.TrifasicoNuevoSerie35[8][1] = 10590.0D;
        this.TrifasicoNuevoSerie35[9][0] = 800.0D; this.TrifasicoNuevoSerie35[9][1] = 11130.0D;
        this.TrifasicoNuevoSerie35[10][0] = 1000.0D; this.TrifasicoNuevoSerie35[10][1] = 13980.0D;
        this.TrifasicoNuevoSerie35[11][0] = 1250.0D; this.TrifasicoNuevoSerie35[11][1] = 16670.0D;
        this.TrifasicoNuevoSerie35[12][0] = 1600.0D; this.TrifasicoNuevoSerie35[12][1] = 20280.0D;
        this.TrifasicoNuevoSerie35[13][0] = 2000.0D; this.TrifasicoNuevoSerie35[13][1] = 24330.0D;
        this.TrifasicoNuevoSerie35[14][0] = 2500.0D; this.TrifasicoNuevoSerie35[14][1] = 29100.0D;
        this.TrifasicoNuevoSerie35[15][0] = 3000.0D;
        this.TrifasicoNuevoSerie35[15][1] = 33740.0D;
        this.TrifasicoNuevoSerie35[16][0] = 3750.0D;
        this.TrifasicoNuevoSerie35[16][1] = 40050.0D;
        this.TrifasicoNuevoSerie35[17][0] = 4000.0D;
        this.TrifasicoNuevoSerie35[17][1] = 42050.0D;
        this.TrifasicoNuevoSerie35[18][0] = 5000.0D;
        this.TrifasicoNuevoSerie35[18][1] = 49700.0D;
        this.TrifasicoNuevoSerie35[19][0] = 6000.0D;
        this.TrifasicoNuevoSerie35[19][1] = 56400.0D;
        this.TrifasicoNuevoSerie35[20][0] = 7500.0D;
        this.TrifasicoNuevoSerie35[20][1] = 64890.0D;
        this.TrifasicoNuevoSerie35[21][0] = 10000.0D;
        this.TrifasicoNuevoSerie35[21][1] = 73300.0D;
        this.TrifasicoNuevo[0][0] = 15.0D;
        this.TrifasicoNuevo[0][1] = 390.0D;
        this.TrifasicoNuevo[1][0] = 30.0D;
        this.TrifasicoNuevo[1][1] = 650.0D;
        this.TrifasicoNuevo[2][0] = 45.0D;
        this.TrifasicoNuevo[2][1] = 890.0D;
        this.TrifasicoNuevo[3][0] = 75.0D;
        this.TrifasicoNuevo[3][1] = 1355.0D;
        this.TrifasicoNuevo[4][0] = 112.5D;
        this.TrifasicoNuevo[4][1] = 1905.0D;
        this.TrifasicoNuevo[5][0] = 150.0D;
        this.TrifasicoNuevo[5][1] = 2410.0D;
        this.TrifasicoNuevo[6][0] = 225.0D;
        this.TrifasicoNuevo[6][1] = 3505.0D;
        this.TrifasicoNuevo[7][0] = 300.0D;
        this.TrifasicoNuevo[7][1] = 4340.0D;
        this.TrifasicoNuevo[8][0] = 400.0D;
        this.TrifasicoNuevo[8][1] = 5660.0D;
        this.TrifasicoNuevo[9][0] = 500.0D;
        this.TrifasicoNuevo[9][1] = 6870.0D;
        this.TrifasicoNuevo[10][0] = 630.0D;
        this.TrifasicoNuevo[10][1] = 8425.0D;
        this.TrifasicoNuevo[11][0] = 750.0D;
        this.TrifasicoNuevo[11][1] = 9830.0D;
        this.TrifasicoNuevo[12][0] = 800.0D;
        this.TrifasicoNuevo[12][1] = 10420.0D;
        this.TrifasicoNuevo[13][0] = 1000.0D;
        this.TrifasicoNuevo[13][1] = 12880.0D;
        this.TrifasicoNuevo[14][0] = 1250.0D;
        this.TrifasicoNuevo[14][1] = 15590.0D;
        this.TrifasicoNuevo[15][0] = 1600.0D;
        this.TrifasicoNuevo[15][1] = 19220.0D;
        this.TrifasicoNuevo[16][0] = 2000.0D;
        this.TrifasicoNuevo[16][1] = 23410.0D;
        this.TrifasicoNuevo[17][0] = 2500.0D;
        this.TrifasicoNuevo[17][1] = 28620.0D;
        this.TrifasicoNuevo[18][0] = 3000.0D;
        this.TrifasicoNuevo[18][1] = 33930.0D;
        this.TrifasicoNuevo[19][0] = 3750.0D;
        this.TrifasicoNuevo[19][1] = 41760.0D;
        this.MonofasicoNuevo[0][0] = 5.0D;
        this.MonofasicoNuevo[0][1] = 120.0D;
        this.MonofasicoNuevo[1][0] = 10.0D;
        this.MonofasicoNuevo[1][1] = 190.0D;
        this.MonofasicoNuevo[2][0] = 15.0D;
        this.MonofasicoNuevo[2][1] = 265.0D;
        this.MonofasicoNuevo[3][0] = 25.0D;
        this.MonofasicoNuevo[3][1] = 390.0D;
        this.MonofasicoNuevo[4][0] = 37.5D;
        this.MonofasicoNuevo[4][1] = 540.0D;
        this.MonofasicoNuevo[5][0] = 50.0D;
        this.MonofasicoNuevo[5][1] = 670.0D;
        this.MonofasicoNuevo[6][0] = 75.0D;
        this.MonofasicoNuevo[6][1] = 920.0D;
        this.MonofasicoNuevo[7][0] = 100.0D;
        this.MonofasicoNuevo[7][1] = 1160.0D;
        this.MonofasicoNuevo[8][0] = 167.5D;
        this.MonofasicoNuevo[8][1] = 1740.0D;
        this.MonofasicoNuevoSerie35[0][0] = 25.0D;
        this.MonofasicoNuevoSerie35[0][1] = 545.0D;
        this.MonofasicoNuevoSerie35[1][0] = 37.5D;
        this.MonofasicoNuevoSerie35[1][1] = 720.0D;
        this.MonofasicoNuevoSerie35[2][0] = 50.0D;
        this.MonofasicoNuevoSerie35[2][1] = 870.0D;
        this.MonofasicoNuevoSerie35[3][0] = 75.0D;
        this.MonofasicoNuevoSerie35[3][1] = 1150.0D;
        this.MonofasicoNuevoSerie35[4][0] = 100.0D;
        this.MonofasicoNuevoSerie35[4][1] = 1405.0D;
        this.MonofasicoNuevoSerie35[5][0] = 167.5D;
        this.MonofasicoNuevoSerie35[5][1] = 2010.0D;
    }

    public int CalPerdidas(double[][] tabla, double kva) {
        int perdidas = 0;
        double[][] var5 = tabla;
        int var6 = tabla.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            double[] tabla1 = var5[var7];
            if (kva == tabla1[0]) {
                perdidas = (int)tabla1[1];
                break;
            }
        }

        return perdidas;
    }

    public int getPerdidas(double kva, double vp, int fase) {
        int perdidas = 0;
        if (fase == 1) {
            if (vp <= 15000.0D) {
                perdidas = this.CalPerdidas(this.MonofasicoNuevo, kva);
            } else if (15000.0D < vp && vp <= 35000.0D) {
                perdidas = this.CalPerdidas(this.MonofasicoNuevoSerie35, kva);
            }
        } else if (fase == 3) {
            if (vp <= 15000.0D) {
                perdidas = this.CalPerdidas(this.TrifasicoNuevo, kva);
            } else if (15000.0D < vp && vp <= 35000.0D) {
                perdidas = this.CalPerdidas(this.TrifasicoNuevoSerie35, kva);
            }
        }

        return perdidas;
    }

    public void MostrarPerdidas() {
        if (!this.cjkva.getText().isEmpty() && !this.cjfase.getText().isEmpty() && !this.cjvp.getText().isEmpty()) {
            try {
                if (Double.parseDouble(this.cjkva.getText()) > 0.0D) {
                    try {
                        if (Double.parseDouble(this.cjvp.getText()) > 0.0D) {
                            try {
                                if (Integer.parseInt(this.cjfase.getText()) > 0) {
                                    this.cjperdidastotales.setText("" + this.getPerdidas(Double.parseDouble(this.cjkva.getText()), Double.parseDouble(this.cjvp.getText()), Integer.parseInt(this.cjfase.getText())));
                                }
                            } catch (NumberFormatException var2) {
                                JOptionPane.showMessageDialog((Component)null, "LA FASE SE ENCUENTRA MAL ESCRITA");
                            }
                        }
                    } catch (NumberFormatException var3) {
                        JOptionPane.showMessageDialog((Component)null, "EL VOLTAJE PRIMARIO SE ENCUENTRA MAL ESCRITO");
                    }
                }
            } catch (NumberFormatException var4) {
                JOptionPane.showMessageDialog((Component)null, "LA POTENCIA ESTA MAL ESCRITA NO SE PODRA CALCULAR LAS PERDIDAS");
            }
        }

    }

    public double getLaminaCaja(int index) {
        double LAMINA = 0.0D;
        switch(index) {
            case 0:
                LAMINA = 2.77D;
                break;
            case 1:
                LAMINA = 1.98D;
                break;
            case 2:
                LAMINA = 1.27D;
                break;
            case 3:
                LAMINA = 19.05D;
                break;
            case 4:
                LAMINA = 12.7D;
                break;
            case 5:
                LAMINA = 6.35D;
                break;
            case 6:
                LAMINA = 3.175D;
                break;
            case 7:
                LAMINA = 9.525D;
                break;
            case 8:
                LAMINA = 4.7625D;
                break;
            case 9:
                LAMINA = 7.935D;
        }

        return LAMINA;
    }

    public double getLaminaRad(int index) {
        double LAMINA = 0.0D;
        switch(index) {
            case 0:
                LAMINA = 1.588D;
                break;
            case 1:
                LAMINA = 1.27D;
                break;
            case 2:
                LAMINA = 0.952D;
        }

        return LAMINA;
    }

    public double Dou(String n) {
        return Double.parseDouble(n);
    }

    public void M(String m, Icon i) {
        try {
            JOptionPane.showMessageDialog(this, m, "Aviso", 1, i);
        } catch (NoSuchElementException var4) {
        }

    }

    public void Limpiar() {
        this.cjelevacion.setText((String)null);
        this.cjalturasnmm.setText((String)null);
        this.cjtempamb.setText((String)null);
        this.cjkva.setText((String)null);
        this.cjfase.setText((String)null);
        this.cjvp.setText((String)null);
        this.cjlargo.setText((String)null);
        this.cjalto.setText((String)null);
        this.cjancho.setText((String)null);
        this.cjpesotanque.setText((String)null);
        this.cjpesorad.setText((String)null);
        this.cjpesototal.setText((String)null);
        this.cjtipooblea.setText((String)null);
        this.cjnoobleas.setText((String)null);
        this.cjaceiteoblea.setText((String)null);
        this.cjperdidastotales.setText((String)null);
        this.checktapa.setSelected(false);
        this.cjdisipa.setText((String)null);
        this.cjdisenocaja.setText((String)null);
        this.cjnivelalturaaceite.setText((String)null);
        this.cjelevacioncorregida.setText((String)null);
    }

    public void Calcular() {
        double AREA = 0.0D;
        double RACEITL = 0.0D;
        double RAREA = 0.0D;
        double RPESO = 0.0D;
        String TIPRAD = null;

        try {
            if(this.cjperdidastotales.getText().isEmpty()){
                MostrarPerdidas();
            }
            double TAPA = this.checktapa.isSelected() ? 2.0D : 1.0D;
            double D = this.Dou(this.cjancho.getText());
            double LARGO = 0.0D;

            try {
                LARGO = this.Dou(this.cjlargo.getText());
            } catch (Exception var96) {
            }

            double ALTO = this.Dou(this.cjalto.getText());
            double ALTURA_ACEITE = this.Dou(this.cjnivelalturaaceite.getText());
            double ANCHO = this.Dou(this.cjancho.getText());
            double ALTURA = this.Dou(this.cjalturasnmm.getText());
            double TOTLOSS = this.Dou(this.cjperdidastotales.getText());
            int Rads = this.comboobleaseleccionada.getSelectedIndex();
            double ELEV = this.Dou(this.cjelevacion.getText());
            if (Integer.parseInt(this.cjfase.getText()) == 1) {
                AREA = (3.141592653589793D * D * this.Dou(this.cjnivelalturaaceite.getText()) + 3.141592653589793D * Math.pow(D, 2.0D) / 4.0D * TAPA) / 100.0D;
            } else if (Integer.parseInt(this.cjfase.getText()) == 3) {
                AREA = (LARGO * this.Dou(this.cjnivelalturaaceite.getText()) * 2.0D + ANCHO * this.Dou(this.cjnivelalturaaceite.getText()) * 2.0D + LARGO * ANCHO * TAPA) / 100.0D;
            }

            double ELEV1 = ELEV / (1.0D + (ALTURA - 1000.0D) * 4.0E-4D);
            double Wct = 1.854E-4D * Math.pow(ELEV1, 1.2637D) * AREA;
            double Wr = 3.21E-4D * Math.pow(ELEV1, 1.2148D) * AREA;
            double wT = Wct + Wr;
            double Wco = TOTLOSS - wT;
            double Sobl = Wco / (9.0E-5D * Math.pow(ELEV1, 1.3873D));
            this.cjdisipa.setText("" + Math.round(wT));
            this.cjelevacioncorregida.setText(String.valueOf(QuitarDecimales(ELEV1, 1)));
            double h = 0.0D;
            double w = 0.0D;
            double A;
            double B;
            if (ALTURA_ACEITE - 400.0D <= 150.0D && ALTURA_ACEITE > 300.0D && Rads == 10 || Rads == 0) {
                TIPRAD = "400*300";
                A = 260.0D;
                B = 400.0D;
                RACEITL = 1.08D;
                RPESO = 2.25D;
                RAREA = 2640.0D;
                h = 400.0D;
                w = 300.0D;
            }

            if (ALTURA_ACEITE - 500.0D <= 150.0D && ALTURA_ACEITE > 500.0D && Rads == 10 || Rads == 1) {
                TIPRAD = "500*300";
                A = 360.0D;
                B = 500.0D;
                RACEITL = 1.155D;
                RPESO = 3.15D;
                RAREA = 3300.0D;
                h = 500.0D;
                w = 300.0D;
            }

            if (ALTURA_ACEITE - 600.0D <= 150.0D && ALTURA_ACEITE > 600.0D && Rads == 10 || Rads == 2) {
                TIPRAD = "600*300";
                A = 460.0D;
                B = 600.0D;
                RACEITL = 1.23D;
                RPESO = 3.6D;
                RAREA = 3960.0D;
                h = 600.0D;
                w = 300.0D;
            }

            if (ALTURA_ACEITE - 700.0D <= 150.0D && ALTURA_ACEITE > 700.0D && Rads == 10 || Rads == 3) {
                TIPRAD = "700*300";
                A = 560.0D;
                B = 700.0D;
                RACEITL = 1.29D;
                RPESO = 4.0D;
                RAREA = 4620.0D;
                h = 700.0D;
                w = 300.0D;
            }

            if (ALTURA_ACEITE - 800.0D <= 250.0D && ALTURA_ACEITE > 800.0D && Rads == 10 || Rads == 4) {
                TIPRAD = "800*300";
                A = 660.0D;
                B = 800.0D;
                RACEITL = 1.34D;
                RPESO = 4.8D;
                RAREA = 5280.0D;
                h = 800.0D;
                w = 300.0D;
            }

            if (ALTURA_ACEITE - 1050.0D <= 200.0D && ALTURA_ACEITE > 1050.0D && Rads == 10 || Rads == 5) {
                TIPRAD = "1050*300";
                A = 910.0D;
                B = 1050.0D;
                RACEITL = 1.51D;
                RPESO = 6.3D;
                RAREA = 6930.0D;
                h = 1050.0D;
                w = 300.0D;
            }

            if (ALTURA_ACEITE - 1200.0D <= 200.0D && ALTURA_ACEITE > 1200.0D && Rads == 10 || Rads == 6) {
                TIPRAD = "1200*300";
                A = 1060.0D;
                B = 1200.0D;
                RACEITL = 1.815D;
                RPESO = 6.78D;
                RAREA = 7920.0D;
                h = 1200.0D;
                w = 300.0D;
            }

            if (ALTURA_ACEITE - 800.0D <= 250.0D && ALTURA_ACEITE > 800.0D && Rads == 10 || Rads == 7) {
                TIPRAD = "800*380";
                A = 694.0D;
                B = 810.0D;
                RACEITL = 1.52D;
                RPESO = 5.8D;
                RAREA = 5599.0D;
                h = 800.0D;
                w = 380.0D;
            }

            if (ALTURA_ACEITE - 1050.0D <= 200.0D && ALTURA_ACEITE > 1050.0D && Rads == 10 || Rads == 8) {
                TIPRAD = "1050*380";
                A = 894.0D;
                B = 1010.0D;
                RACEITL = 1.92D;
                RPESO = 7.3D;
                RAREA = 6932.0D;
                h = 1050.0D;
                w = 380.0D;
            }

            if (ALTURA_ACEITE - 1200.0D <= 200.0D && ALTURA_ACEITE > 1200.0D && Rads == 10 || Rads == 9) {
                TIPRAD = "1200*382";
                A = 1073.0D;
                B = 1190.0D;
                RACEITL = 2.3D;
                RPESO = 8.6D;
                RAREA = 8120.0D;
                h = 1200.0D;
                w = 382.0D;
            }

            if (ALTURA_ACEITE - 1200.0D > 200.0D && ALTURA_ACEITE > 1200.0D && Rads == 10 || Rads == 6) {
                TIPRAD = "1200*382";
                A = 1073.0D;
                B = 1190.0D;
                RACEITL = 2.3D;
                RPESO = 8.6D;
                RAREA = 8120.0D;
                h = 1200.0D;
                w = 382.0D;
            }

            int NoObleas = (int)Math.round(Sobl / RAREA);
            this.cjnoobleas.setText("" + NoObleas);
            double ESPESORLAM = this.getLaminaCaja(this.comboLAMINACAJA.getSelectedIndex());
            double ESPESORRAD = this.getLaminaRad(this.comboLAMINADUCTO.getSelectedIndex());
            double VOLTOT = 0.0D;
            if (Integer.parseInt(this.cjfase.getText()) == 1) {
                VOLTOT = (3.141592653589793D * D * ALTO * ESPESORLAM * 2.0D + 3.141592653589793D * Math.pow(D, 2.0D) / 4.0D * ESPESORLAM) / 1000.0D;
            } else if (Integer.parseInt(this.cjfase.getText()) == 3) {
                VOLTOT = (LARGO * ALTO * ESPESORLAM * 2.0D + ANCHO * ALTO * ESPESORLAM * 2.0D + LARGO * ANCHO * ESPESORLAM * 2.0D) / 1000.0D;
            }

            double PESO = (double)Math.round(VOLTOT * 0.00786D);
            this.cjpesotanque.setText("" + PESO);
            double VOLRAD = QuitarDecimales(h * w * ESPESORRAD * 2.0D, 1) / 1000.0D;
            double PESORAD = QuitarDecimales(VOLRAD * 0.00786D * (double)NoObleas, 1);
            this.cjpesorad.setText("" + PESORAD);
            this.cjtipooblea.setText(TIPRAD);
            this.cjaceiteoblea.setText("" + QuitarDecimales((double)NoObleas * RACEITL, 1));
            double PESOTOTAL = QuitarDecimales(this.Dou(this.cjpesotanque.getText()) + this.Dou(this.cjpesorad.getText()), 1);
            this.cjpesototal.setText(String.valueOf(PESOTOTAL));
        } catch (NumberFormatException var97) {
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, (String)null, var97);
            JOptionPane.showMessageDialog((Component)null, "ERROR\n" + var97);
        }

    }

    public static double QuitarDecimales(double numerodecimal, int numerodecimales) {
        numerodecimal *= Math.pow(10.0D, (double)numerodecimales);
        numerodecimal = (double)Math.round(numerodecimal);
        numerodecimal /= Math.pow(10.0D, (double)numerodecimales);
        return numerodecimal;
    }

    private void initComponents() {
        this.PanelCalculos = new JPanel();
        this.jToolBar1 = new JToolBar();
        this.btncalcula = new JButton();
        this.jButton7 = new JButton();
        this.jPanel2 = new JPanel();
        this.jLabel7 = new JLabel();
        this.cjkva = new JTextField();
        this.cjtipooblea = new JTextField();
        this.cjpesotanque = new JTextField();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.cjperdidastotales = new JTextField();
        this.jLabel11 = new JLabel();
        this.jLabel14 = new JLabel();
        this.cjfase = new JTextField();
        this.cjnoobleas = new JTextField();
        this.cjpesorad = new JTextField();
        this.jLabel17 = new JLabel();
        this.jLabel18 = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel20 = new JLabel();
        this.cjvp = new JTextField();
        this.cjaceiteoblea = new JTextField();
        this.cjpesototal = new JTextField();
        this.jLabel23 = new JLabel();
        this.jLabel24 = new JLabel();
        this.cjdisipa = new JTextField();
        this.lbllargo = new JLabel();
        this.cjlargo = new JTextField();
        this.lblancho = new JLabel();
        this.cjancho = new JTextField();
        this.jLabel21 = new JLabel();
        this.cjalto = new JTextField();
        this.jLabel1 = new JLabel();
        this.cjelevacion = new JTextField();
        this.cjalturasnmm = new JTextField();
        this.jLabel2 = new JLabel();
        this.cjtempamb = new JTextField();
        this.jLabel3 = new JLabel();
        this.comboLAMINADUCTO = new JComboBox();
        this.jLabel25 = new JLabel();
        this.jLabel26 = new JLabel();
        this.comboLAMINACAJA = new JComboBox();
        this.checktapa = new JCheckBox();
        this.jLabel36 = new JLabel();
        this.cjdisenocaja = new JTextField();
        this.jLabel31 = new JLabel();
        this.comboobleaseleccionada = new JComboBox();
        this.jLabel42 = new JLabel();
        this.cjnivelalturaaceite = new JTextField();
        this.cjelevacioncorregida = new JTextField();
        this.jLabel43 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.PanelCalculos.setBorder(BorderFactory.createEtchedBorder());
        this.jToolBar1.setRollover(true);
        this.btncalcula.setFont(new Font("Tahoma", 1, 14));
        this.btncalcula.setIcon(new ImageIcon(this.getClass().getResource("/RECURSOS/X32/calc.png")));
        this.btncalcula.setText("Calcular");
        this.btncalcula.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NUEVO.this.btncalculaActionPerformed(evt);
            }
        });
        this.jToolBar1.add(this.btncalcula);
        this.jButton7.setFont(new Font("Tahoma", 1, 12));
        this.jButton7.setIcon(new ImageIcon(this.getClass().getResource("/RECURSOS/X32/clean.png")));
        this.jButton7.setText("Limpiar");
        this.jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NUEVO.this.jButton7ActionPerformed(evt);
            }
        });
        this.jToolBar1.add(this.jButton7);
        GroupLayout PanelCalculosLayout = new GroupLayout(this.PanelCalculos);
        this.PanelCalculos.setLayout(PanelCalculosLayout);
        PanelCalculosLayout.setHorizontalGroup(PanelCalculosLayout.createParallelGroup(Alignment.LEADING).addGroup(PanelCalculosLayout.createSequentialGroup().addContainerGap().addComponent(this.jToolBar1, -1, -1, 32767).addContainerGap()));
        PanelCalculosLayout.setVerticalGroup(PanelCalculosLayout.createParallelGroup(Alignment.LEADING).addGroup(PanelCalculosLayout.createSequentialGroup().addContainerGap().addComponent(this.jToolBar1, -2, 25, -2).addContainerGap(-1, 32767)));
        this.jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "DATOS GENERALES", 2, 0, new Font("Tahoma", 1, 12)));
        this.jLabel7.setFont(new Font("Tahoma", 1, 10));
        this.jLabel7.setHorizontalAlignment(2);
        this.jLabel7.setText("KVA");
        this.cjkva.setFont(new Font("Tahoma", 1, 11));
        this.cjkva.setHorizontalAlignment(0);
        this.cjkva.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                NUEVO.this.cjkvaFocusLost(evt);
            }
        });
        this.cjkva.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjkvaKeyTyped(evt);
            }
        });
        this.cjtipooblea.setFont(new Font("Tahoma", 1, 11));
        this.cjtipooblea.setHorizontalAlignment(0);
        this.cjpesotanque.setFont(new Font("Tahoma", 1, 11));
        this.cjpesotanque.setHorizontalAlignment(0);
        this.cjpesotanque.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjpesotanqueKeyTyped(evt);
            }
        });
        this.jLabel9.setFont(new Font("Tahoma", 1, 10));
        this.jLabel9.setHorizontalAlignment(2);
        this.jLabel9.setText("Peso Tanque (Kgr)");
        this.jLabel10.setFont(new Font("Tahoma", 1, 10));
        this.jLabel10.setHorizontalAlignment(2);
        this.jLabel10.setText("Tipo Obleas Escog.");
        this.cjperdidastotales.setFont(new Font("Tahoma", 1, 11));
        this.cjperdidastotales.setHorizontalAlignment(0);
        this.jLabel11.setFont(new Font("Tahoma", 1, 10));
        this.jLabel11.setHorizontalAlignment(2);
        this.jLabel11.setText("Perdidas Totales");
        this.jLabel14.setFont(new Font("Tahoma", 1, 10));
        this.jLabel14.setHorizontalAlignment(2);
        this.jLabel14.setText("FASES:");
        this.cjfase.setFont(new Font("Tahoma", 1, 11));
        this.cjfase.setHorizontalAlignment(0);
        this.cjfase.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                NUEVO.this.cjfaseFocusLost(evt);
            }
        });
        this.cjfase.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjfaseKeyTyped(evt);
            }
        });
        this.cjnoobleas.setFont(new Font("Tahoma", 1, 11));
        this.cjnoobleas.setHorizontalAlignment(0);
        this.cjpesorad.setFont(new Font("Tahoma", 1, 11));
        this.cjpesorad.setHorizontalAlignment(0);
        this.cjpesorad.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjpesoradKeyTyped(evt);
            }
        });
        this.jLabel17.setFont(new Font("Tahoma", 1, 10));
        this.jLabel17.setHorizontalAlignment(2);
        this.jLabel17.setText("Peso Radiador (Kgr)");
        this.jLabel18.setFont(new Font("Tahoma", 1, 10));
        this.jLabel18.setHorizontalAlignment(2);
        this.jLabel18.setText("N° Obleas");
        this.jLabel19.setFont(new Font("Tahoma", 1, 10));
        this.jLabel19.setHorizontalAlignment(2);
        this.jLabel19.setText("Caja Disipa (W)");
        this.jLabel20.setFont(new Font("Tahoma", 1, 10));
        this.jLabel20.setHorizontalAlignment(2);
        this.jLabel20.setText("Voltaje Primario");
        this.cjvp.setFont(new Font("Tahoma", 1, 11));
        this.cjvp.setHorizontalAlignment(0);
        this.cjvp.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                NUEVO.this.cjvpFocusLost(evt);
            }
        });
        this.cjvp.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjvpKeyTyped(evt);
            }
        });
        this.cjaceiteoblea.setFont(new Font("Tahoma", 1, 11));
        this.cjaceiteoblea.setHorizontalAlignment(0);
        this.cjpesototal.setFont(new Font("Tahoma", 1, 11));
        this.cjpesototal.setHorizontalAlignment(0);
        this.jLabel23.setFont(new Font("Tahoma", 1, 10));
        this.jLabel23.setHorizontalAlignment(2);
        this.jLabel23.setText("Peso Total (Kgr)");
        this.jLabel24.setFont(new Font("Tahoma", 1, 10));
        this.jLabel24.setHorizontalAlignment(2);
        this.jLabel24.setText("Aceite Obleas (L)");
        this.cjdisipa.setFont(new Font("Tahoma", 1, 11));
        this.cjdisipa.setHorizontalAlignment(0);
        this.lbllargo.setFont(new Font("Tahoma", 1, 10));
        this.lbllargo.setHorizontalAlignment(2);
        this.lbllargo.setText("Largo (mm)");
        this.cjlargo.setFont(new Font("Tahoma", 1, 11));
        this.cjlargo.setHorizontalAlignment(0);
        this.cjlargo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjlargoKeyTyped(evt);
            }
        });
        this.lblancho.setFont(new Font("Tahoma", 1, 10));
        this.lblancho.setHorizontalAlignment(2);
        this.lblancho.setText("Ancho (mm)");
        this.cjancho.setFont(new Font("Tahoma", 1, 11));
        this.cjancho.setHorizontalAlignment(0);
        this.cjancho.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjanchoKeyTyped(evt);
            }
        });
        this.jLabel21.setFont(new Font("Tahoma", 1, 10));
        this.jLabel21.setHorizontalAlignment(2);
        this.jLabel21.setText("Alto (mm)");
        this.cjalto.setFont(new Font("Tahoma", 1, 11));
        this.cjalto.setHorizontalAlignment(0);
        this.cjalto.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjaltoKeyTyped(evt);
            }
        });
        this.jLabel1.setFont(new Font("Tahoma", 1, 10));
        this.jLabel1.setHorizontalAlignment(2);
        this.jLabel1.setText("ELEVACION Top Oil °C");
        this.cjelevacion.setFont(new Font("Tahoma", 1, 11));
        this.cjelevacion.setHorizontalAlignment(0);
        this.cjelevacion.setText("55");
        this.cjelevacion.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjelevacionKeyTyped(evt);
            }
        });
        this.cjalturasnmm.setFont(new Font("Tahoma", 1, 11));
        this.cjalturasnmm.setHorizontalAlignment(0);
        this.cjalturasnmm.setText("1000");
        this.cjalturasnmm.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjalturasnmmKeyTyped(evt);
            }
        });
        this.jLabel2.setFont(new Font("Tahoma", 1, 10));
        this.jLabel2.setHorizontalAlignment(2);
        this.jLabel2.setText("Altura snmm (m)");
        this.cjtempamb.setFont(new Font("Tahoma", 1, 11));
        this.cjtempamb.setHorizontalAlignment(0);
        this.cjtempamb.setText("30");
        this.cjtempamb.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjtempambKeyTyped(evt);
            }
        });
        this.jLabel3.setFont(new Font("Tahoma", 1, 10));
        this.jLabel3.setHorizontalAlignment(2);
        this.jLabel3.setText("Temp Ambiente °C");
        this.comboLAMINADUCTO.setFont(new Font("Tahoma", 1, 10));
        this.comboLAMINADUCTO.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.comboLAMINADUCTOKeyTyped(evt);
            }
        });
        this.jLabel25.setFont(new Font("Tahoma", 1, 10));
        this.jLabel25.setHorizontalAlignment(2);
        this.jLabel25.setText("Lamina Caja:");
        this.jLabel26.setFont(new Font("Tahoma", 1, 10));
        this.jLabel26.setHorizontalAlignment(2);
        this.jLabel26.setText("Lamina Radiador:");
        this.comboLAMINACAJA.setFont(new Font("Tahoma", 1, 10));
        this.comboLAMINACAJA.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.comboLAMINACAJAKeyTyped(evt);
            }
        });
        this.checktapa.setFont(new Font("Tahoma", 1, 10));
        this.checktapa.setText("Considera Tapa");
        this.checktapa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NUEVO.this.checktapaActionPerformed(evt);
            }
        });
        this.jLabel36.setFont(new Font("Tahoma", 1, 10));
        this.jLabel36.setHorizontalAlignment(2);
        this.jLabel36.setText("DISEÑO CAJA:");
        this.cjdisenocaja.setFont(new Font("Tahoma", 1, 11));
        this.cjdisenocaja.setHorizontalAlignment(0);
        this.cjdisenocaja.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjdisenocajaKeyTyped(evt);
            }
        });
        this.jLabel31.setFont(new Font("Tahoma", 1, 10));
        this.jLabel31.setHorizontalAlignment(2);
        this.jLabel31.setText("Tipo Obleas Seleccio.");
        this.jLabel42.setFont(new Font("Tahoma", 1, 10));
        this.jLabel42.setHorizontalAlignment(2);
        this.jLabel42.setText("Nivel de Aceite:");
        this.cjnivelalturaaceite.setFont(new Font("Tahoma", 1, 11));
        this.cjnivelalturaaceite.setHorizontalAlignment(0);
        this.cjnivelalturaaceite.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjnivelalturaaceiteKeyTyped(evt);
            }
        });
        this.cjelevacioncorregida.setFont(new Font("Tahoma", 1, 11));
        this.cjelevacioncorregida.setHorizontalAlignment(0);
        this.jLabel43.setFont(new Font("Tahoma", 1, 10));
        this.jLabel43.setHorizontalAlignment(2);
        this.jLabel43.setText("Elevacion Corregida");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjtempamb, Alignment.TRAILING, -2, 124, -2).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.cjelevacion).addComponent(this.cjalturasnmm, -1, 124, 32767).addComponent(this.jLabel26).addComponent(this.jLabel1).addComponent(this.jLabel2).addComponent(this.jLabel3).addComponent(this.jLabel25).addComponent(this.comboLAMINADUCTO, 0, -1, 32767)).addGap(0, 0, 32767)).addComponent(this.comboLAMINACAJA, 0, -1, 32767)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjtipooblea, -2, 117, -2).addComponent(this.jLabel10)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjnoobleas, -2, 117, -2).addComponent(this.jLabel18))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjperdidastotales, -2, 117, -2).addComponent(this.jLabel11)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjdisipa, -2, 117, -2).addComponent(this.jLabel19)))).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.cjaceiteoblea).addComponent(this.jLabel24).addComponent(this.checktapa, -1, 117, 32767))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel7).addGap(115, 115, 115).addComponent(this.jLabel14)).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.comboobleaseleccionada, Alignment.LEADING, 0, 117, 32767).addComponent(this.cjkva, Alignment.LEADING)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.cjfase, -1, 117, 32767).addComponent(this.jLabel42).addComponent(this.cjnivelalturaaceite)))).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.cjvp, -1, 117, 32767).addComponent(this.jLabel20).addComponent(this.jLabel43).addComponent(this.cjelevacioncorregida))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.lbllargo).addComponent(this.cjlargo, -2, 117, -2)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.lblancho).addComponent(this.cjancho, -2, 117, -2)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel21).addComponent(this.cjalto, -2, 117, -2))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjpesotanque, -2, 117, -2).addComponent(this.jLabel9)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjpesorad, -2, 117, -2).addComponent(this.jLabel17)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjpesototal, -2, 117, -2).addComponent(this.jLabel23)))).addGap(10, 10, 10)).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel36).addComponent(this.cjdisenocaja, -2, 124, -2)).addGap(18, 18, 18).addComponent(this.jLabel31).addGap(292, 292, 292)))));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel36).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjdisenocaja, -2, -1, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel31).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.comboobleaseleccionada, -2, -1, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel42).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjnivelalturaaceite, -2, -1, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel43).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjelevacioncorregida, -2, -1, -2))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjelevacion, -2, -1, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel7).addComponent(this.jLabel14)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjkva, -2, -1, -2).addComponent(this.cjfase, -2, -1, -2))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel20).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjvp, -2, -1, -2))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lbllargo).addComponent(this.jLabel2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjlargo, -2, -1, -2).addComponent(this.cjalturasnmm, -2, -1, -2))).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.jLabel21).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjalto, -2, -1, -2)))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.lblancho).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjancho, -2, -1, -2))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel9).addComponent(this.jLabel3)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjpesotanque, -2, -1, -2).addComponent(this.cjtempamb, -2, -1, -2))).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.jLabel23).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjpesototal, -2, -1, -2)))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel17).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjpesorad, -2, -1, -2))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel10).addComponent(this.jLabel25)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjtipooblea, -2, -1, -2).addComponent(this.comboLAMINACAJA, -2, 20, -2))).addComponent(this.jLabel24))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel18).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjnoobleas, -2, -1, -2).addComponent(this.cjaceiteoblea, -2, -1, -2)))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel11).addComponent(this.jLabel26)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjperdidastotales, -2, -1, -2).addComponent(this.comboLAMINADUCTO, -2, -1, -2))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel19).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjdisipa, -2, -1, -2).addComponent(this.checktapa)))))).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jPanel2, -1, -1, 32767).addComponent(this.PanelCalculos, -1, -1, 32767)).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.PanelCalculos, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel2, -2, -1, -2).addContainerGap(-1, 32767)));
        this.pack();
        this.setLocationRelativeTo((Component)null);
    }

    private void cjkvaFocusLost(FocusEvent evt) {
        try {
            if (!this.cjkva.getText().isEmpty()) {
                this.MostrarPerdidas();
                this.cjfase.grabFocus();
            }
        } catch (Exception var3) {
        }

    }

    private void cjkvaKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjkva.getText().isEmpty()) {
            this.MostrarPerdidas();
            this.cjfase.grabFocus();
        }

    }

    private void cjpesotanqueKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjpesotanque.getText().isEmpty()) {
            this.cjpesorad.grabFocus();
        }

    }

    private void cjfaseFocusLost(FocusEvent evt) {
        try {
            if (Double.parseDouble(this.cjfase.getText()) == 1.0D) {
                this.lbllargo.setVisible(false);
                this.cjlargo.setVisible(false);
                this.lblancho.setText("Diametro (mm)");
                this.MostrarPerdidas();
                this.cjvp.grabFocus();
            } else if (Double.parseDouble(this.cjfase.getText()) == 3.0D) {
                this.lbllargo.setVisible(true);
                this.cjlargo.setVisible(true);
                this.lblancho.setText("Ancho (mm)");
                this.MostrarPerdidas();
                this.cjvp.grabFocus();
            } else {
                JOptionPane.showMessageDialog((Component)null, "LA FASE QUE HAZ ESCRITO NO ES VALIDA");
            }
        } catch (NumberFormatException var3) {
            JOptionPane.showMessageDialog((Component)null, "UN CARACTER INCONCLUSO EN LA FASE" + var3);
        }

    }

    private void cjfaseKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n') {
            try {
                if (Double.parseDouble(this.cjfase.getText()) == 1.0D) {
                    this.lbllargo.setVisible(false);
                    this.cjlargo.setVisible(false);
                    this.lblancho.setText("Diametro (mm)");
                    this.MostrarPerdidas();
                    this.cjvp.grabFocus();
                } else if (Double.parseDouble(this.cjfase.getText()) == 3.0D) {
                    this.lbllargo.setVisible(true);
                    this.cjlargo.setVisible(true);
                    this.lblancho.setText("Ancho (mm)");
                    this.MostrarPerdidas();
                    this.cjvp.grabFocus();
                } else {
                    JOptionPane.showMessageDialog((Component)null, "LA FASE QUE HAZ ESCRITO NO ES VALIDA");
                }
            } catch (NumberFormatException var3) {
                JOptionPane.showMessageDialog((Component)null, "UN CARACTER INCONCLUSO EN LA FASE" + var3);
            }
        }

    }

    private void cjpesoradKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjpesorad.getText().isEmpty()) {
            this.cjpesototal.grabFocus();
        }

    }

    private void cjvpFocusLost(FocusEvent evt) {
        try {
            if (!this.cjvp.getText().isEmpty()) {
                this.MostrarPerdidas();
                if (this.cjfase.getText().equalsIgnoreCase("3")) {
                    this.cjlargo.grabFocus();
                } else if (this.cjfase.getText().equalsIgnoreCase("1")) {
                    this.cjancho.grabFocus();
                }
            }
        } catch (Exception var3) {
        }

    }

    private void cjvpKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjvp.getText().isEmpty()) {
            this.MostrarPerdidas();
            if (this.cjfase.getText().equalsIgnoreCase("3")) {
                this.cjlargo.grabFocus();
            } else if (this.cjfase.getText().equalsIgnoreCase("1")) {
                this.cjancho.grabFocus();
            }
        }

    }

    private void cjlargoKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjlargo.getText().isEmpty()) {
            this.cjancho.grabFocus();
        }

    }

    private void cjanchoKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjancho.getText().isEmpty()) {
            this.cjalto.grabFocus();
        }

    }

    private void cjaltoKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjalto.getText().isEmpty()) {
            this.cjnivelalturaaceite.grabFocus();
        }

    }

    private void cjelevacionKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjelevacion.getText().isEmpty()) {
            this.cjalturasnmm.grabFocus();
        }

    }

    private void cjalturasnmmKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n') {
            try {
                int Altura = Integer.parseInt(this.cjalturasnmm.getText());
                if (Altura < 1000) {
                    if (JOptionPane.showConfirmDialog(this, "LA ALTURA ES MENOR A 1000, DESEA ASIGNAR 1000 EN LA ALTURA ?") == 0) {
                        this.cjalturasnmm.setText("1000");
                        this.cjtempamb.grabFocus();
                    } else {
                        this.cjtempamb.grabFocus();
                    }
                } else {
                    this.cjtempamb.grabFocus();
                }
            } catch (NumberFormatException var3) {
                JOptionPane.showMessageDialog((Component)null, "SE ENCONTRARON CARACTERES INCONCLUSOS EN LA ALTURA\n" + var3);
            }
        }

    }

    private void cjtempambKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjtempamb.getText().isEmpty()) {
            this.comboLAMINACAJA.grabFocus();
        }

    }

    private void comboLAMINADUCTOKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n') {
            this.cjkva.grabFocus();
        }

    }

    private void comboLAMINACAJAKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n') {
            this.comboLAMINADUCTO.grabFocus();
        }

    }

    private void checktapaActionPerformed(ActionEvent evt) {
        try {
            if (this.comboobleaseleccionada.getSelectedIndex() < 10) {
                double alto = this.Dou(this.comboobleaseleccionada.getSelectedItem().toString().split(" * ")[0]);
                if (alto <= this.Dou(this.cjnivelalturaaceite.getText())) {
                    this.Calcular();
                } else {
                    this.M("EL TAMAÑO DE OBLEA ESCOGIDA ES MAYOR A LA ALTURA DEL NIVEL DE ACEITE\nSELECCIONE UNO MENOR", this.mal);
                }
            } else {
                this.Calcular();
            }
        } catch (Exception var4) {
            this.M("OCURRIO UN ERROR INESPERADO\nCONTACTE CON EL ADMINISTRADOR DEL SISTEMA\n" + var4, this.mal);
        }

    }

    private void cjdisenocajaKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n') {
            try {
                if (this.comboobleaseleccionada.getSelectedIndex() < 10) {
                    double alto = this.Dou(this.comboobleaseleccionada.getSelectedItem().toString().split(" * ")[0]);
                    if (alto <= this.Dou(this.cjnivelalturaaceite.getText())) {
                        this.Calcular();
                    } else {
                        this.M("EL TAMAÑO DE OBLEA ESCOGIDA ES MAYOR A LA ALTURA DEL NIVEL DE ACEITE\nSELECCIONE UNO MENOR", this.mal);
                    }
                } else {
                    this.Calcular();
                }
            } catch (Exception var4) {
                this.M("OCURRIO UN ERROR INESPERADO\nCONTACTE CON EL ADMINISTRADOR DEL SISTEMA\n" + var4, this.mal);
            }
        }

    }

    private void cjnivelalturaaceiteKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjnivelalturaaceite.getText().isEmpty()) {
            this.cjdisenocaja.grabFocus();
        }

    }

    private void btncalculaActionPerformed(ActionEvent evt) {
        try {
            if (this.comboobleaseleccionada.getSelectedIndex() < 10) {
                double alto = this.Dou(this.comboobleaseleccionada.getSelectedItem().toString().split(" * ")[0]);
                if (alto <= this.Dou(this.cjnivelalturaaceite.getText())) {
                    this.Calcular();
                } else {
                    this.M("EL TAMAÑO DE OBLEA ESCOGIDA ES MAYOR A LA ALTURA DEL NIVEL DE ACEITE\nSELECCIONE UNO MENOR", this.mal);
                }
            } else {
                this.Calcular();
            }
        } catch (Exception var4) {
            this.M("OCURRIO UN ERROR INESPERADO\nCONTACTE CON EL ADMINISTRADOR DEL SISTEMA\n" + var4, this.mal);
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, (String)null, var4);
        }

    }

    private void jButton7ActionPerformed(ActionEvent evt) {
        this.Limpiar();
    }

    public static void main(String[] args) {
        try {
            LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                LookAndFeelInfo info = var1[var3];
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new NUEVO()).setVisible(true);
            }
        });
    }
}
