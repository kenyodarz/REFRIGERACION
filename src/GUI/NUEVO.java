package GUI;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.*;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NUEVO extends JFrame {
    public double[][] TrifasicoNuevoSerie35 = new double[22][2];
    public double[][] TrifasicoNuevo = new double[20][2];
    public double[][] MonofasicoNuevo = new double[9][2];
    public double[][] MonofasicoNuevoSerie35 = new double[6][2];
    public Icon mal = new ImageIcon(this.getClass().getResource("/RECURSOS/X64/error.png"));
    private JCheckBox checkTapa;
    private JTextField cjAceiteOblea;
    private JTextField cjAlto;
    private JTextField cjAlturaSobreNivelDelMar;
    private JTextField cjAncho;
    private JTextField cjDesignCaja; // Diseño Caja
    private JTextField cjDisipa;
    private JTextField cjElevation; // Elevación
    private JTextField cjCorrectedElevation; // Elevación Corregida
    private JTextField cjFase;
    private JTextField cjkVA;
    private JTextField cjLargo;
    private JTextField cjNivelAlturaAceite;
    private JTextField cjNoObleas;
    private JTextField cjPerdidasTotales;
    private JTextField cjPesoRad;
    private JTextField cjPesoTanque;
    private JTextField cjPesoTotal;
    private JTextField cjTemperaturaAmbiente;
    private JTextField cjTipoOblea;
    private JTextField cjVp;
    private JComboBox<String> comboLAMINACAJA;
    private JComboBox<String> comboLAMINADUCTO;
    private JComboBox<String> comboObleaSeleccionada;
    private JLabel labelAncho;
    private JLabel labelLargo;

    public NUEVO() {
        this.initComponents();
        this.cjElevation.grabFocus();
        this.comboObleaSeleccionada.addItem("400 * 300");
        this.comboObleaSeleccionada.addItem("500 * 300");
        this.comboObleaSeleccionada.addItem("600 * 300");
        this.comboObleaSeleccionada.addItem("700 * 300");
        this.comboObleaSeleccionada.addItem("800 * 300");
        this.comboObleaSeleccionada.addItem("1050 * 300");
        this.comboObleaSeleccionada.addItem("1200 * 300");
        this.comboObleaSeleccionada.addItem("800 * 380");
        this.comboObleaSeleccionada.addItem("1000 * 800");
        this.comboObleaSeleccionada.addItem("1200 * 382");
        this.comboObleaSeleccionada.addItem("S. Prog.");
        this.comboObleaSeleccionada.setSelectedIndex(10);
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
        /* Inicializar variable TrifasicoNuevoSerie35[][] */
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
        this.TrifasicoNuevoSerie35[15][0] = 3000.0D; this.TrifasicoNuevoSerie35[15][1] = 33740.0D;
        this.TrifasicoNuevoSerie35[16][0] = 3750.0D; this.TrifasicoNuevoSerie35[16][1] = 40050.0D;
        this.TrifasicoNuevoSerie35[17][0] = 4000.0D; this.TrifasicoNuevoSerie35[17][1] = 42050.0D;
        this.TrifasicoNuevoSerie35[18][0] = 5000.0D; this.TrifasicoNuevoSerie35[18][1] = 49700.0D;
        this.TrifasicoNuevoSerie35[19][0] = 6000.0D; this.TrifasicoNuevoSerie35[19][1] = 56400.0D;
        this.TrifasicoNuevoSerie35[20][0] = 7500.0D; this.TrifasicoNuevoSerie35[20][1] = 64890.0D;
        this.TrifasicoNuevoSerie35[21][0] = 10000.0D; this.TrifasicoNuevoSerie35[21][1] = 73300.0D;
        /* Inicializar variable TrifasicoNuevo[][] */
        this.TrifasicoNuevo[0][0] = 15.0D; this.TrifasicoNuevo[0][1] = 390.0D;
        this.TrifasicoNuevo[1][0] = 30.0D; this.TrifasicoNuevo[1][1] = 650.0D;
        this.TrifasicoNuevo[2][0] = 45.0D; this.TrifasicoNuevo[2][1] = 890.0D;
        this.TrifasicoNuevo[3][0] = 75.0D; this.TrifasicoNuevo[3][1] = 1355.0D;
        this.TrifasicoNuevo[4][0] = 112.5D; this.TrifasicoNuevo[4][1] = 1905.0D;
        this.TrifasicoNuevo[5][0] = 150.0D; this.TrifasicoNuevo[5][1] = 2410.0D;
        this.TrifasicoNuevo[6][0] = 225.0D; this.TrifasicoNuevo[6][1] = 3505.0D;
        this.TrifasicoNuevo[7][0] = 300.0D; this.TrifasicoNuevo[7][1] = 4340.0D;
        this.TrifasicoNuevo[8][0] = 400.0D; this.TrifasicoNuevo[8][1] = 5660.0D;
        this.TrifasicoNuevo[9][0] = 500.0D; this.TrifasicoNuevo[9][1] = 6870.0D;
        this.TrifasicoNuevo[10][0] = 630.0D; this.TrifasicoNuevo[10][1] = 8425.0D;
        this.TrifasicoNuevo[11][0] = 750.0D; this.TrifasicoNuevo[11][1] = 9830.0D;
        this.TrifasicoNuevo[12][0] = 800.0D; this.TrifasicoNuevo[12][1] = 10420.0D;
        this.TrifasicoNuevo[13][0] = 1000.0D; this.TrifasicoNuevo[13][1] = 12880.0D;
        this.TrifasicoNuevo[14][0] = 1250.0D; this.TrifasicoNuevo[14][1] = 15590.0D;
        this.TrifasicoNuevo[15][0] = 1600.0D; this.TrifasicoNuevo[15][1] = 19220.0D;
        this.TrifasicoNuevo[16][0] = 2000.0D; this.TrifasicoNuevo[16][1] = 23410.0D;
        this.TrifasicoNuevo[17][0] = 2500.0D; this.TrifasicoNuevo[17][1] = 28620.0D;
        this.TrifasicoNuevo[18][0] = 3000.0D; this.TrifasicoNuevo[18][1] = 33930.0D;
        this.TrifasicoNuevo[19][0] = 3750.0D; this.TrifasicoNuevo[19][1] = 41760.0D;
        /* Inicializar variable MonofasicoNuevo[][] */
        this.MonofasicoNuevo[0][0] = 5.0D; this.MonofasicoNuevo[0][1] = 120.0D;
        this.MonofasicoNuevo[1][0] = 10.0D; this.MonofasicoNuevo[1][1] = 190.0D;
        this.MonofasicoNuevo[2][0] = 15.0D; this.MonofasicoNuevo[2][1] = 265.0D;
        this.MonofasicoNuevo[3][0] = 25.0D; this.MonofasicoNuevo[3][1] = 390.0D;
        this.MonofasicoNuevo[4][0] = 37.5D; this.MonofasicoNuevo[4][1] = 540.0D;
        this.MonofasicoNuevo[5][0] = 50.0D; this.MonofasicoNuevo[5][1] = 670.0D;
        this.MonofasicoNuevo[6][0] = 75.0D; this.MonofasicoNuevo[6][1] = 920.0D;
        this.MonofasicoNuevo[7][0] = 100.0D; this.MonofasicoNuevo[7][1] = 1160.0D;
        this.MonofasicoNuevo[8][0] = 167.5D; this.MonofasicoNuevo[8][1] = 1740.0D;
        /* Inicializar variable MonofasicoNuevo[][] */
        this.MonofasicoNuevoSerie35[0][0] = 25.0D; this.MonofasicoNuevoSerie35[0][1] = 545.0D;
        this.MonofasicoNuevoSerie35[1][0] = 37.5D; this.MonofasicoNuevoSerie35[1][1] = 720.0D;
        this.MonofasicoNuevoSerie35[2][0] = 50.0D; this.MonofasicoNuevoSerie35[2][1] = 870.0D;
        this.MonofasicoNuevoSerie35[3][0] = 75.0D; this.MonofasicoNuevoSerie35[3][1] = 1150.0D;
        this.MonofasicoNuevoSerie35[4][0] = 100.0D; this.MonofasicoNuevoSerie35[4][1] = 1405.0D;
        this.MonofasicoNuevoSerie35[5][0] = 167.5D; this.MonofasicoNuevoSerie35[5][1] = 2010.0D;
    }

    public int CalPerdidas(double[][] tabla, double kva) {
        int perdidas = 0;
        for (double[] tabla1 : tabla) {
            if (kva == tabla1[0]) {
                perdidas = (int) tabla1[1];
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
        if (!this.cjkVA.getText().isEmpty() && !this.cjFase.getText().isEmpty() && !this.cjVp.getText().isEmpty()) {
            try {
                if (Double.parseDouble(this.cjkVA.getText()) > 0.0D) {
                    try {
                        if (Double.parseDouble(this.cjVp.getText()) > 0.0D) {
                            try {
                                if (Integer.parseInt(this.cjFase.getText()) > 0) {
                                    this.cjPerdidasTotales.setText("" + this.getPerdidas(Double.parseDouble(this.cjkVA.getText()), Double.parseDouble(this.cjVp.getText()), Integer.parseInt(this.cjFase.getText())));
                                }
                            } catch (NumberFormatException var2) {
                                JOptionPane.showMessageDialog(null, "LA FASE SE ENCUENTRA MAL ESCRITA");
                            }
                        }
                    } catch (NumberFormatException var3) {
                        JOptionPane.showMessageDialog(null, "EL VOLTAJE PRIMARIO SE ENCUENTRA MAL ESCRITO");
                    }
                }
            } catch (NumberFormatException var4) {
                JOptionPane.showMessageDialog(null, "LA POTENCIA ESTA MAL ESCRITA NO SE PODRA CALCULAR LAS PERDIDAS");
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
            var4.printStackTrace();
        }

    }

    public void Limpiar() {
        this.cjElevation.setText(null);
        this.cjAlturaSobreNivelDelMar.setText(null);
        this.cjTemperaturaAmbiente.setText(null);
        this.cjkVA.setText(null);
        this.cjFase.setText(null);
        this.cjVp.setText(null);
        this.cjLargo.setText(null);
        this.cjAlto.setText(null);
        this.cjAncho.setText(null);
        this.cjPesoTanque.setText(null);
        this.cjPesoRad.setText(null);
        this.cjPesoTotal.setText(null);
        this.cjTipoOblea.setText(null);
        this.cjNoObleas.setText(null);
        this.cjAceiteOblea.setText(null);
        this.cjPerdidasTotales.setText(null);
        this.checkTapa.setSelected(false);
        this.cjDisipa.setText(null);
        this.cjDesignCaja.setText(null);
        this.cjNivelAlturaAceite.setText(null);
        this.cjCorrectedElevation.setText(null);
    }

    public void Calcular() {
        double AREA = 0.0D;
        double RACEITL = 0.0D;
        double RAREA = 0.0D;
        double RPESO = 0.0D;
        String TIPRAD = null;

        try {
            if(this.cjPerdidasTotales.getText().isEmpty()){
                MostrarPerdidas();
            }
            double TAPA = this.checkTapa.isSelected() ? 2.0D : 1.0D;
            double D = this.Dou(this.cjAncho.getText());
            double LARGO = 0.0D;

            try {
                LARGO = this.Dou(this.cjLargo.getText());
            } catch (Exception var96) {
            }

            double ALTO = this.Dou(this.cjAlto.getText());
            double ALTURA_ACEITE = this.Dou(this.cjNivelAlturaAceite.getText());
            double ANCHO = this.Dou(this.cjAncho.getText());
            double ALTURA = this.Dou(this.cjAlturaSobreNivelDelMar.getText());
            double TOTLOSS = this.Dou(this.cjPerdidasTotales.getText());
            int Rads = this.comboObleaSeleccionada.getSelectedIndex();
            double ELEV = this.Dou(this.cjElevation.getText());
            if (Integer.parseInt(this.cjFase.getText()) == 1) {
                AREA = (3.141592653589793D * D * this.Dou(this.cjNivelAlturaAceite.getText()) + 3.141592653589793D * Math.pow(D, 2.0D) / 4.0D * TAPA) / 100.0D;
            } else if (Integer.parseInt(this.cjFase.getText()) == 3) {
                AREA = (LARGO * this.Dou(this.cjNivelAlturaAceite.getText()) * 2.0D + ANCHO * this.Dou(this.cjNivelAlturaAceite.getText()) * 2.0D + LARGO * ANCHO * TAPA) / 100.0D;
            }

            double ELEV1 = ELEV / (1.0D + (ALTURA - 1000.0D) * 4.0E-4D);
            double Wct = 1.854E-4D * Math.pow(ELEV1, 1.2637D) * AREA;
            double Wr = 3.21E-4D * Math.pow(ELEV1, 1.2148D) * AREA;
            double wT = Wct + Wr;
            double Wco = TOTLOSS - wT;
            double Sobl = Wco / (9.0E-5D * Math.pow(ELEV1, 1.3873D));
            this.cjDisipa.setText("" + Math.round(wT));
            this.cjCorrectedElevation.setText(String.valueOf(QuitarDecimales(ELEV1, 1)));
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
            this.cjNoObleas.setText("" + NoObleas);
            double ESPESORLAM = this.getLaminaCaja(this.comboLAMINACAJA.getSelectedIndex());
            double ESPESORRAD = this.getLaminaRad(this.comboLAMINADUCTO.getSelectedIndex());
            double VOLTOT = 0.0D;
            if (Integer.parseInt(this.cjFase.getText()) == 1) {
                VOLTOT = (3.141592653589793D * D * ALTO * ESPESORLAM * 2.0D + 3.141592653589793D * Math.pow(D, 2.0D) / 4.0D * ESPESORLAM) / 1000.0D;
            } else if (Integer.parseInt(this.cjFase.getText()) == 3) {
                VOLTOT = (LARGO * ALTO * ESPESORLAM * 2.0D + ANCHO * ALTO * ESPESORLAM * 2.0D + LARGO * ANCHO * ESPESORLAM * 2.0D) / 1000.0D;
            }

            double PESO = (double)Math.round(VOLTOT * 0.00786D);
            this.cjPesoTanque.setText("" + PESO);
            double VOLRAD = QuitarDecimales(h * w * ESPESORRAD * 2.0D, 1) / 1000.0D;
            double PESORAD = QuitarDecimales(VOLRAD * 0.00786D * (double)NoObleas, 1);
            this.cjPesoRad.setText("" + PESORAD);
            this.cjTipoOblea.setText(TIPRAD);
            this.cjAceiteOblea.setText("" + QuitarDecimales((double)NoObleas * RACEITL, 1));
            double PESOTOTAL = QuitarDecimales(this.Dou(this.cjPesoTanque.getText()) + this.Dou(this.cjPesoRad.getText()), 1);
            this.cjPesoTotal.setText(String.valueOf(PESOTOTAL));
        } catch (NumberFormatException var97) {
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, null, var97);
            JOptionPane.showMessageDialog(null, "ERROR\n" + var97);
        }

    }

    public static double QuitarDecimales(double numerodecimal, int numerodecimales) {
        numerodecimal *= Math.pow(10.0D, numerodecimales);
        numerodecimal = (double)Math.round(numerodecimal);
        numerodecimal /= Math.pow(10.0D, numerodecimales);
        return numerodecimal;
    }

    private void initComponents() {
        JPanel panelCalculos = new JPanel();
        JToolBar jToolBar1 = new JToolBar();
        JButton btncalcula = new JButton();
        JButton jButton7 = new JButton();
        JPanel jPanel2 = new JPanel();
        JLabel jLabel7 = new JLabel();
        this.cjkVA = new JTextField();
        this.cjTipoOblea = new JTextField();
        this.cjPesoTanque = new JTextField();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel10 = new JLabel();
        this.cjPerdidasTotales = new JTextField();
        JLabel jLabel11 = new JLabel();
        JLabel jLabel14 = new JLabel();
        this.cjFase = new JTextField();
        this.cjNoObleas = new JTextField();
        this.cjPesoRad = new JTextField();
        JLabel jLabel17 = new JLabel();
        JLabel jLabel18 = new JLabel();
        JLabel jLabel19 = new JLabel();
        JLabel jLabel20 = new JLabel();
        this.cjVp = new JTextField();
        this.cjAceiteOblea = new JTextField();
        this.cjPesoTotal = new JTextField();
        JLabel jLabel23 = new JLabel();
        JLabel jLabel24 = new JLabel();
        this.cjDisipa = new JTextField();
        this.labelLargo = new JLabel();
        this.cjLargo = new JTextField();
        this.labelAncho = new JLabel();
        this.cjAncho = new JTextField();
        JLabel jLabel21 = new JLabel();
        this.cjAlto = new JTextField();
        JLabel jLabel1 = new JLabel();
        this.cjElevation = new JTextField();
        this.cjAlturaSobreNivelDelMar = new JTextField();
        JLabel jLabel2 = new JLabel();
        this.cjTemperaturaAmbiente = new JTextField();
        JLabel jLabel3 = new JLabel();
        this.comboLAMINADUCTO = new JComboBox<>();
        JLabel jLabel25 = new JLabel();
        JLabel jLabel26 = new JLabel();
        this.comboLAMINACAJA = new JComboBox<>();
        this.checkTapa = new JCheckBox();
        JLabel jLabel36 = new JLabel();
        this.cjDesignCaja = new JTextField();
        JLabel jLabel31 = new JLabel();
        this.comboObleaSeleccionada = new JComboBox<>();
        JLabel jLabel42 = new JLabel();
        this.cjNivelAlturaAceite = new JTextField();
        this.cjCorrectedElevation = new JTextField();
        JLabel jLabel43 = new JLabel();
        this.setDefaultCloseOperation(3);
        panelCalculos.setBorder(BorderFactory.createEtchedBorder());
        jToolBar1.setRollover(true);
        btncalcula.setFont(new Font("Tahoma", 1, 14));
        btncalcula.setIcon(new ImageIcon(this.getClass().getResource("/RECURSOS/X32/calc.png")));
        btncalcula.setText("Calcular");
        btncalcula.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NUEVO.this.btncalculaActionPerformed(evt);
            }
        });
        jToolBar1.add(btncalcula);
        jButton7.setFont(new Font("Tahoma", 1, 12));
        jButton7.setIcon(new ImageIcon(this.getClass().getResource("/RECURSOS/X32/clean.png")));
        jButton7.setText("Limpiar");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NUEVO.this.jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);
        GroupLayout PanelCalculosLayout = new GroupLayout(panelCalculos);
        panelCalculos.setLayout(PanelCalculosLayout);
        PanelCalculosLayout.setHorizontalGroup(PanelCalculosLayout.createParallelGroup(Alignment.LEADING).addGroup(PanelCalculosLayout.createSequentialGroup().addContainerGap().addComponent(jToolBar1, -1, -1, 32767).addContainerGap()));
        PanelCalculosLayout.setVerticalGroup(PanelCalculosLayout.createParallelGroup(Alignment.LEADING).addGroup(PanelCalculosLayout.createSequentialGroup().addContainerGap().addComponent(jToolBar1, -2, 25, -2).addContainerGap(-1, 32767)));
        jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "DATOS GENERALES", 2, 0, new Font("Tahoma", 1, 12)));
        jLabel7.setFont(new Font("Tahoma", 1, 10));
        jLabel7.setHorizontalAlignment(2);
        jLabel7.setText("KVA");
        this.cjkVA.setFont(new Font("Tahoma", 1, 11));
        this.cjkVA.setHorizontalAlignment(0);
        this.cjkVA.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                NUEVO.this.cjkvaFocusLost(evt);
            }
        });
        this.cjkVA.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjkvaKeyTyped(evt);
            }
        });
        this.cjTipoOblea.setFont(new Font("Tahoma", 1, 11));
        this.cjTipoOblea.setHorizontalAlignment(0);
        this.cjPesoTanque.setFont(new Font("Tahoma", 1, 11));
        this.cjPesoTanque.setHorizontalAlignment(0);
        this.cjPesoTanque.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjpesotanqueKeyTyped(evt);
            }
        });
        jLabel9.setFont(new Font("Tahoma", 1, 10));
        jLabel9.setHorizontalAlignment(2);
        jLabel9.setText("Peso Tanque (Kgr)");
        jLabel10.setFont(new Font("Tahoma", 1, 10));
        jLabel10.setHorizontalAlignment(2);
        jLabel10.setText("Tipo Obleas Escog.");
        this.cjPerdidasTotales.setFont(new Font("Tahoma", 1, 11));
        this.cjPerdidasTotales.setHorizontalAlignment(0);
        jLabel11.setFont(new Font("Tahoma", 1, 10));
        jLabel11.setHorizontalAlignment(2);
        jLabel11.setText("Perdidas Totales");
        jLabel14.setFont(new Font("Tahoma", 1, 10));
        jLabel14.setHorizontalAlignment(2);
        jLabel14.setText("FASES:");
        this.cjFase.setFont(new Font("Tahoma", 1, 11));
        this.cjFase.setHorizontalAlignment(0);
        this.cjFase.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                NUEVO.this.cjfaseFocusLost(evt);
            }
        });
        this.cjFase.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjfaseKeyTyped(evt);
            }
        });
        this.cjNoObleas.setFont(new Font("Tahoma", 1, 11));
        this.cjNoObleas.setHorizontalAlignment(0);
        this.cjPesoRad.setFont(new Font("Tahoma", 1, 11));
        this.cjPesoRad.setHorizontalAlignment(0);
        this.cjPesoRad.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjpesoradKeyTyped(evt);
            }
        });
        jLabel17.setFont(new Font("Tahoma", 1, 10));
        jLabel17.setHorizontalAlignment(2);
        jLabel17.setText("Peso Radiador (Kgr)");
        jLabel18.setFont(new Font("Tahoma", 1, 10));
        jLabel18.setHorizontalAlignment(2);
        jLabel18.setText("N° Obleas");
        jLabel19.setFont(new Font("Tahoma", 1, 10));
        jLabel19.setHorizontalAlignment(2);
        jLabel19.setText("Caja Disipa (W)");
        jLabel20.setFont(new Font("Tahoma", 1, 10));
        jLabel20.setHorizontalAlignment(2);
        jLabel20.setText("Voltaje Primario");
        this.cjVp.setFont(new Font("Tahoma", 1, 11));
        this.cjVp.setHorizontalAlignment(0);
        this.cjVp.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                NUEVO.this.cjvpFocusLost(evt);
            }
        });
        this.cjVp.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjvpKeyTyped(evt);
            }
        });
        this.cjAceiteOblea.setFont(new Font("Tahoma", 1, 11));
        this.cjAceiteOblea.setHorizontalAlignment(0);
        this.cjPesoTotal.setFont(new Font("Tahoma", 1, 11));
        this.cjPesoTotal.setHorizontalAlignment(0);
        jLabel23.setFont(new Font("Tahoma", 1, 10));
        jLabel23.setHorizontalAlignment(2);
        jLabel23.setText("Peso Total (Kgr)");
        jLabel24.setFont(new Font("Tahoma", 1, 10));
        jLabel24.setHorizontalAlignment(2);
        jLabel24.setText("Aceite Obleas (L)");
        this.cjDisipa.setFont(new Font("Tahoma", 1, 11));
        this.cjDisipa.setHorizontalAlignment(0);
        this.labelLargo.setFont(new Font("Tahoma", 1, 10));
        this.labelLargo.setHorizontalAlignment(2);
        this.labelLargo.setText("Largo (mm)");
        this.cjLargo.setFont(new Font("Tahoma", 1, 11));
        this.cjLargo.setHorizontalAlignment(0);
        this.cjLargo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjlargoKeyTyped(evt);
            }
        });
        this.labelAncho.setFont(new Font("Tahoma", 1, 10));
        this.labelAncho.setHorizontalAlignment(2);
        this.labelAncho.setText("Ancho (mm)");
        this.cjAncho.setFont(new Font("Tahoma", 1, 11));
        this.cjAncho.setHorizontalAlignment(0);
        this.cjAncho.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjanchoKeyTyped(evt);
            }
        });
        jLabel21.setFont(new Font("Tahoma", 1, 10));
        jLabel21.setHorizontalAlignment(2);
        jLabel21.setText("Alto (mm)");
        this.cjAlto.setFont(new Font("Tahoma", 1, 11));
        this.cjAlto.setHorizontalAlignment(0);
        this.cjAlto.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjaltoKeyTyped(evt);
            }
        });
        jLabel1.setFont(new Font("Tahoma", 1, 10));
        jLabel1.setHorizontalAlignment(2);
        jLabel1.setText("ELEVACION Top Oil °C");
        this.cjElevation.setFont(new Font("Tahoma", 1, 11));
        this.cjElevation.setHorizontalAlignment(0);
        this.cjElevation.setText("55");
        this.cjElevation.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjelevacionKeyTyped(evt);
            }
        });
        this.cjAlturaSobreNivelDelMar.setFont(new Font("Tahoma", 1, 11));
        this.cjAlturaSobreNivelDelMar.setHorizontalAlignment(0);
        this.cjAlturaSobreNivelDelMar.setText("1000");
        this.cjAlturaSobreNivelDelMar.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjalturasnmmKeyTyped(evt);
            }
        });
        jLabel2.setFont(new Font("Tahoma", 1, 10));
        jLabel2.setHorizontalAlignment(2);
        jLabel2.setText("Altura snmm (m)");
        this.cjTemperaturaAmbiente.setFont(new Font("Tahoma", 1, 11));
        this.cjTemperaturaAmbiente.setHorizontalAlignment(0);
        this.cjTemperaturaAmbiente.setText("30");
        this.cjTemperaturaAmbiente.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjtempambKeyTyped(evt);
            }
        });
        jLabel3.setFont(new Font("Tahoma", 1, 10));
        jLabel3.setHorizontalAlignment(2);
        jLabel3.setText("Temp Ambiente °C");
        this.comboLAMINADUCTO.setFont(new Font("Tahoma", 1, 10));
        this.comboLAMINADUCTO.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.comboLAMINADUCTOKeyTyped(evt);
            }
        });
        jLabel25.setFont(new Font("Tahoma", 1, 10));
        jLabel25.setHorizontalAlignment(2);
        jLabel25.setText("Lamina Caja:");
        jLabel26.setFont(new Font("Tahoma", 1, 10));
        jLabel26.setHorizontalAlignment(2);
        jLabel26.setText("Lamina Radiador:");
        this.comboLAMINACAJA.setFont(new Font("Tahoma", 1, 10));
        this.comboLAMINACAJA.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.comboLAMINACAJAKeyTyped(evt);
            }
        });
        this.checkTapa.setFont(new Font("Tahoma", 1, 10));
        this.checkTapa.setText("Considera Tapa");
        this.checkTapa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NUEVO.this.checktapaActionPerformed(evt);
            }
        });
        jLabel36.setFont(new Font("Tahoma", 1, 10));
        jLabel36.setHorizontalAlignment(2);
        jLabel36.setText("DISEÑO CAJA:");
        this.cjDesignCaja.setFont(new Font("Tahoma", 1, 11));
        this.cjDesignCaja.setHorizontalAlignment(0);
        this.cjDesignCaja.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjdisenocajaKeyTyped(evt);
            }
        });
        jLabel31.setFont(new Font("Tahoma", 1, 10));
        jLabel31.setHorizontalAlignment(2);
        jLabel31.setText("Tipo Obleas Seleccio.");
        jLabel42.setFont(new Font("Tahoma", 1, 10));
        jLabel42.setHorizontalAlignment(2);
        jLabel42.setText("Nivel de Aceite:");
        this.cjNivelAlturaAceite.setFont(new Font("Tahoma", 1, 11));
        this.cjNivelAlturaAceite.setHorizontalAlignment(0);
        this.cjNivelAlturaAceite.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                NUEVO.this.cjnivelalturaaceiteKeyTyped(evt);
            }
        });
        this.cjCorrectedElevation.setFont(new Font("Tahoma", 1, 11));
        this.cjCorrectedElevation.setHorizontalAlignment(0);
        jLabel43.setFont(new Font("Tahoma", 1, 10));
        jLabel43.setHorizontalAlignment(2);
        jLabel43.setText("Elevacion Corregida");
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjTemperaturaAmbiente, Alignment.TRAILING, -2, 124, -2).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.cjElevation).addComponent(this.cjAlturaSobreNivelDelMar, -1, 124, 32767).addComponent(jLabel26).addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel25).addComponent(this.comboLAMINADUCTO, 0, -1, 32767)).addGap(0, 0, 32767)).addComponent(this.comboLAMINACAJA, 0, -1, 32767)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjTipoOblea, -2, 117, -2).addComponent(jLabel10)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjNoObleas, -2, 117, -2).addComponent(jLabel18))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjPerdidasTotales, -2, 117, -2).addComponent(jLabel11)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjDisipa, -2, 117, -2).addComponent(jLabel19)))).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.cjAceiteOblea).addComponent(jLabel24).addComponent(this.checkTapa, -1, 117, 32767))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel7).addGap(115, 115, 115).addComponent(jLabel14)).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.comboObleaSeleccionada, Alignment.LEADING, 0, 117, 32767).addComponent(this.cjkVA, Alignment.LEADING)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.cjFase, -1, 117, 32767).addComponent(jLabel42).addComponent(this.cjNivelAlturaAceite)))).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.cjVp, -1, 117, 32767).addComponent(jLabel20).addComponent(jLabel43).addComponent(this.cjCorrectedElevation))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.labelLargo).addComponent(this.cjLargo, -2, 117, -2)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.labelAncho).addComponent(this.cjAncho, -2, 117, -2)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel21).addComponent(this.cjAlto, -2, 117, -2))).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjPesoTanque, -2, 117, -2).addComponent(jLabel9)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjPesoRad, -2, 117, -2).addComponent(jLabel17)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.cjPesoTotal, -2, 117, -2).addComponent(jLabel23)))).addGap(10, 10, 10)).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel36).addComponent(this.cjDesignCaja, -2, 124, -2)).addGap(18, 18, 18).addComponent(jLabel31).addGap(292, 292, 292)))));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel36).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjDesignCaja, -2, -1, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel31).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.comboObleaSeleccionada, -2, -1, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel42).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjNivelAlturaAceite, -2, -1, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel43).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjCorrectedElevation, -2, -1, -2))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel1).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjElevation, -2, -1, -2)).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel7).addComponent(jLabel14)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjkVA, -2, -1, -2).addComponent(this.cjFase, -2, -1, -2))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel20).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjVp, -2, -1, -2))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.labelLargo).addComponent(jLabel2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjLargo, -2, -1, -2).addComponent(this.cjAlturaSobreNivelDelMar, -2, -1, -2))).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(jLabel21).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjAlto, -2, -1, -2)))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.labelAncho).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjAncho, -2, -1, -2))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel9).addComponent(jLabel3)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjPesoTanque, -2, -1, -2).addComponent(this.cjTemperaturaAmbiente, -2, -1, -2))).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(jLabel23).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjPesoTotal, -2, -1, -2)))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel17).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cjPesoRad, -2, -1, -2))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel10).addComponent(jLabel25)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjTipoOblea, -2, -1, -2).addComponent(this.comboLAMINACAJA, -2, 20, -2))).addComponent(jLabel24))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel18).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjNoObleas, -2, -1, -2).addComponent(this.cjAceiteOblea, -2, -1, -2)))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel11).addComponent(jLabel26)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjPerdidasTotales, -2, -1, -2).addComponent(this.comboLAMINADUCTO, -2, -1, -2))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel19).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cjDisipa, -2, -1, -2).addComponent(this.checkTapa)))))).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(jPanel2, -1, -1, 32767).addComponent(panelCalculos, -1, -1, 32767)).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(panelCalculos, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(jPanel2, -2, -1, -2).addContainerGap(-1, 32767)));
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void cjkvaFocusLost(FocusEvent evt) {
        try {
            if (!this.cjkVA.getText().isEmpty()) {
                this.MostrarPerdidas();
                this.cjFase.grabFocus();
            }
        } catch (Exception var3) {
        }

    }

    private void cjkvaKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjkVA.getText().isEmpty()) {
            this.MostrarPerdidas();
            this.cjFase.grabFocus();
        }

    }

    private void cjpesotanqueKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjPesoTanque.getText().isEmpty()) {
            this.cjPesoRad.grabFocus();
        }

    }

    private void cjfaseFocusLost(FocusEvent evt) {
        try {
            if (Double.parseDouble(this.cjFase.getText()) == 1.0D) {
                this.labelLargo.setVisible(false);
                this.cjLargo.setVisible(false);
                this.labelAncho.setText("Diametro (mm)");
                this.MostrarPerdidas();
                this.cjVp.grabFocus();
            } else if (Double.parseDouble(this.cjFase.getText()) == 3.0D) {
                this.labelLargo.setVisible(true);
                this.cjLargo.setVisible(true);
                this.labelAncho.setText("Ancho (mm)");
                this.MostrarPerdidas();
                this.cjVp.grabFocus();
            } else {
                JOptionPane.showMessageDialog(null, "LA FASE QUE HAZ ESCRITO NO ES VALIDA");
            }
        } catch (NumberFormatException var3) {
            JOptionPane.showMessageDialog(null, "UN CARACTER INCONCLUSO EN LA FASE" + var3);
        }

    }

    private void cjfaseKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n') {
            try {
                if (Double.parseDouble(this.cjFase.getText()) == 1.0D) {
                    this.labelLargo.setVisible(false);
                    this.cjLargo.setVisible(false);
                    this.labelAncho.setText("Diametro (mm)");
                    this.MostrarPerdidas();
                    this.cjVp.grabFocus();
                } else if (Double.parseDouble(this.cjFase.getText()) == 3.0D) {
                    this.labelLargo.setVisible(true);
                    this.cjLargo.setVisible(true);
                    this.labelAncho.setText("Ancho (mm)");
                    this.MostrarPerdidas();
                    this.cjVp.grabFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "LA FASE QUE HAZ ESCRITO NO ES VALIDA");
                }
            } catch (NumberFormatException var3) {
                JOptionPane.showMessageDialog(null, "UN CARACTER INCONCLUSO EN LA FASE" + var3);
            }
        }

    }

    private void cjpesoradKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjPesoRad.getText().isEmpty()) {
            this.cjPesoTotal.grabFocus();
        }

    }

    private void cjvpFocusLost(FocusEvent evt) {
        try {
            if (!this.cjVp.getText().isEmpty()) {
                this.MostrarPerdidas();
                if (this.cjFase.getText().equalsIgnoreCase("3")) {
                    this.cjLargo.grabFocus();
                } else if (this.cjFase.getText().equalsIgnoreCase("1")) {
                    this.cjAncho.grabFocus();
                }
            }
        } catch (Exception var3) {
        }

    }

    private void cjvpKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjVp.getText().isEmpty()) {
            this.MostrarPerdidas();
            if (this.cjFase.getText().equalsIgnoreCase("3")) {
                this.cjLargo.grabFocus();
            } else if (this.cjFase.getText().equalsIgnoreCase("1")) {
                this.cjAncho.grabFocus();
            }
        }

    }

    private void cjlargoKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjLargo.getText().isEmpty()) {
            this.cjAncho.grabFocus();
        }

    }

    private void cjanchoKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjAncho.getText().isEmpty()) {
            this.cjAlto.grabFocus();
        }

    }

    private void cjaltoKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjAlto.getText().isEmpty()) {
            this.cjNivelAlturaAceite.grabFocus();
        }

    }

    private void cjelevacionKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjElevation.getText().isEmpty()) {
            this.cjAlturaSobreNivelDelMar.grabFocus();
        }

    }

    private void cjalturasnmmKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n') {
            try {
                int Altura = Integer.parseInt(this.cjAlturaSobreNivelDelMar.getText());
                if (Altura < 1000) {
                    if (JOptionPane.showConfirmDialog(this, "LA ALTURA ES MENOR A 1000, DESEA ASIGNAR 1000 EN LA ALTURA ?") == 0) {
                        this.cjAlturaSobreNivelDelMar.setText("1000");
                        this.cjTemperaturaAmbiente.grabFocus();
                    } else {
                        this.cjTemperaturaAmbiente.grabFocus();
                    }
                } else {
                    this.cjTemperaturaAmbiente.grabFocus();
                }
            } catch (NumberFormatException var3) {
                JOptionPane.showMessageDialog(null, "SE ENCONTRARON CARACTERES INCONCLUSOS EN LA ALTURA\n" + var3);
            }
        }

    }

    private void cjtempambKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n' && !this.cjTemperaturaAmbiente.getText().isEmpty()) {
            this.comboLAMINACAJA.grabFocus();
        }

    }

    private void comboLAMINADUCTOKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n') {
            this.cjkVA.grabFocus();
        }

    }

    private void comboLAMINACAJAKeyTyped(KeyEvent evt) {
        if (evt.getKeyChar() == '\n') {
            this.comboLAMINADUCTO.grabFocus();
        }

    }

    private void checktapaActionPerformed(ActionEvent evt) {
        try {
            if (this.comboObleaSeleccionada.getSelectedIndex() < 10) {
                double alto = this.Dou(this.comboObleaSeleccionada.getSelectedItem().toString().split(" * ")[0]);
                if (alto <= this.Dou(this.cjNivelAlturaAceite.getText())) {
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
                if (this.comboObleaSeleccionada.getSelectedIndex() < 10) {
                    double alto = this.Dou(this.comboObleaSeleccionada.getSelectedItem().toString().split(" * ")[0]);
                    if (alto <= this.Dou(this.cjNivelAlturaAceite.getText())) {
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
        if (evt.getKeyChar() == '\n' && !this.cjNivelAlturaAceite.getText().isEmpty()) {
            this.cjDesignCaja.grabFocus();
        }

    }

    private void btncalculaActionPerformed(ActionEvent evt) {
        try {
            if (this.comboObleaSeleccionada.getSelectedIndex() < 10) {
                double alto = this.Dou(this.comboObleaSeleccionada.getSelectedItem().toString().split(" * ")[0]);
                if (alto <= this.Dou(this.cjNivelAlturaAceite.getText())) {
                    this.Calcular();
                } else {
                    this.M("EL TAMAÑO DE OBLEA ESCOGIDA ES MAYOR A LA ALTURA DEL NIVEL DE ACEITE\nSELECCIONE UNO MENOR", this.mal);
                }
            } else {
                this.Calcular();
            }
        } catch (Exception var4) {
            this.M("OCURRIO UN ERROR INESPERADO\nCONTACTE CON EL ADMINISTRADOR DEL SISTEMA\n" + var4, this.mal);
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, null, var4);
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
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(NUEVO.class.getName()).log(Level.SEVERE, null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new NUEVO()).setVisible(true);
            }
        });
    }
}
