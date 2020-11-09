/*     */ package MUNDO;
/*     */ 
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.URL;
/*     */ import java.util.Calendar;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.sound.sampled.AudioSystem;
/*     */ import javax.sound.sampled.Clip;
/*     */ import javax.sound.sampled.LineUnavailableException;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Metodos
/*     */ {
/*     */   public static Clip sonido;
/*     */   
/*     */   public static void SonidoBotones(JButton j) {
/*  45 */     j.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e)
/*     */           {
/*  49 */             URL pat = getClass().getResource("/sonido/agua.wav");
/*     */             
/*     */             try {
/*  52 */               Metodos.sonido = AudioSystem.getClip();
/*  53 */               Metodos.sonido.open(AudioSystem.getAudioInputStream(pat));
/*  54 */               Metodos.sonido.start();
/*  55 */             } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|IOException fallo) {
/*  56 */               System.out.println("ERROR  " + fallo);
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static void SonidoBotonesClick(JButton j) {
/*  63 */     j.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e)
/*     */           {
/*  67 */             URL pat = getClass().getResource("/sonido/abre.wav");
/*     */             
/*     */             try {
/*  70 */               Metodos.sonido = AudioSystem.getClip();
/*  71 */               Metodos.sonido.open(AudioSystem.getAudioInputStream(pat));
/*  72 */               Metodos.sonido.start();
/*  73 */             } catch (LineUnavailableException|javax.sound.sampled.UnsupportedAudioFileException|IOException fallo) {
/*  74 */               System.out.println("ERROR  " + fallo);
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static void MensajeBienvenido(JButton j, final JLabel lbl, final String men) {
/*  81 */     j.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e)
/*     */           {
/*  85 */             lbl.setText(men);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static void Grabar(String cad, String NombreArchivo) {
/*  92 */     File f = new File(NombreArchivo);
/*     */     
/*     */     try {
/*  95 */       FileWriter fw = new FileWriter(f);
/*  96 */       fw.write(cad);
/*  97 */       fw.close();
/*  98 */       Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + NombreArchivo);
/*  99 */     } catch (IOException ex) {
/* 100 */       Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void Mayusculas(JTextField j) {
/* 106 */     j.setText(j.getText().toUpperCase());
/*     */   }
/*     */   
/*     */   public static void Enter(KeyEvent t, JTextField j) {
/* 110 */     int c = t.getKeyChar();
/* 111 */     if (c == 10) {
/* 112 */       j.requestFocus();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void PasarAOtroCajon(JTextField donde_estoy, final JTextField donde_voy) {
/* 117 */     donde_estoy.addKeyListener(new KeyAdapter()
/*     */         {
/*     */           public void keyTyped(KeyEvent e)
/*     */           {
/* 121 */             if (e.getKeyChar() == '\n')
/*     */             {
/* 123 */               donde_voy.requestFocus();
/*     */             }
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static void GenerarTamañoDeColumnas(JTable tabla, String nombre) {
/* 131 */     String TamañoColTrans = "";
/* 132 */     for (int i = 0; i < tabla.getColumnCount(); i++)
/*     */     {
/* 134 */       TamañoColTrans = TamañoColTrans + tabla.getColumnName(i) + "\t" + tabla.getColumn(tabla.getColumnName(i)).getWidth() + "\n";
/*     */     }
/* 136 */     File f = new File(nombre);
/*     */ 
/*     */     
/* 139 */     try { FileWriter fw = new FileWriter(f);
/* 140 */       fw.write(TamañoColTrans);
/* 141 */       fw.close(); }
/* 142 */     catch (IOException ex) { Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, (String)null, ex); }
/*     */   
/*     */   }
/*     */   
/*     */   public static void LeerArchivoDeTexto(JTextArea text, File archivo, JLabel label) {
/*     */     
/* 148 */     try { text.setText((String)null);
/* 149 */       FileInputStream abrirarchivo = new FileInputStream(archivo);
/* 150 */       DataInputStream entrada = new DataInputStream(abrirarchivo);
/* 151 */       BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
/*     */       
/* 153 */       label.setText("" + archivo); 
/*     */       try { String linea;
/* 155 */         while ((linea = buffer.readLine()) != null)
/*     */         {
/* 157 */           text.setText(text.getText() + linea + "\n"); }  }
/*     */       catch (IOException ex)
/* 159 */       { Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, (String)null, ex); }  }
/* 160 */     catch (FileNotFoundException ex) { Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, (String)null, ex); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public static void MantenerTamañaDeColumnas(String archivo, JTable table) {
/*     */     try {
/* 167 */       FileInputStream fstream = new FileInputStream(archivo);
/*     */ 
/*     */       
/* 170 */       try (DataInputStream entrada = new DataInputStream(fstream)) {
/*     */         
/* 172 */         BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
/*     */         
/*     */         String strLinea;
/* 175 */         while ((strLinea = buffer.readLine()) != null) {
/*     */           
/* 177 */           for (int columna = 0; columna < table.getColumnCount(); columna++) {
/*     */             
/* 179 */             String[] datos = strLinea.split("\t");
/* 180 */             if (table.getColumnName(columna).equalsIgnoreCase(datos[0])) {
/*     */ 
/*     */               
/* 183 */               table.getColumnModel().getColumn(columna).setPreferredWidth(Integer.parseInt(datos[1]));
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 189 */     } catch (Exception e) {
/* 190 */       System.err.println("Ocurrio un error: " + e.getMessage());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static int ObetenerSabados(Calendar cjInicio, Calendar cjFin) {
/* 197 */     int Sabados = 0;
/* 198 */     if (cjInicio != null && cjFin != null) {
/*     */       
/* 200 */       Calendar FechaInicio = cjInicio;
/* 201 */       Calendar FechaFin = cjFin;
/* 202 */       while (FechaInicio.before(FechaFin) || FechaInicio.equals(FechaFin)) {
/*     */         
/* 204 */         if (FechaInicio.get(7) == 7)
/*     */         {
/* 206 */           Sabados++;
/*     */         }
/* 208 */         FechaInicio.add(5, 1);
/*     */       } 
/*     */     } 
/* 211 */     return Sabados;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int ObetenerDomingos(Calendar cjInicio, Calendar cjFin) {
/* 216 */     int Domingos = 0;
/* 217 */     if (cjInicio != null && cjFin != null) {
/*     */       
/* 219 */       Calendar FechaInicio = cjInicio;
/* 220 */       Calendar FechaFin = cjFin;
/* 221 */       while (FechaInicio.before(FechaFin) || FechaInicio.equals(FechaFin)) {
/*     */         
/* 223 */         if (FechaInicio.get(7) == 1)
/*     */         {
/* 225 */           Domingos++;
/*     */         }
/* 227 */         FechaInicio.add(5, 1);
/*     */       } 
/*     */     } 
/* 230 */     return Domingos;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int ObetenerDiasHabiles(Calendar cjInicio, Calendar cjFin) {
/* 235 */     int DiasHabiles = 0;
/* 236 */     if (cjInicio != null && cjFin != null) {
/*     */       
/* 238 */       Calendar FechaInicio = cjInicio;
/* 239 */       Calendar FechaFin = cjFin;
/* 240 */       while (FechaInicio.before(FechaFin) || FechaInicio.equals(FechaFin)) {
/*     */         
/* 242 */         if (FechaInicio.get(7) != 7 && FechaInicio
/* 243 */           .get(7) != 1)
/*     */         {
/* 245 */           DiasHabiles++;
/*     */         }
/* 247 */         FechaInicio.add(5, 1);
/*     */       } 
/*     */     } 
/* 250 */     return DiasHabiles;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean SiEsDomingoOSabado(Calendar cjFin) {
/* 255 */     boolean no = false;
/*     */ 
/*     */     
/* 258 */     return no;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void M(String m) {
/* 263 */     JOptionPane.showMessageDialog(null, m);
/*     */   }
/*     */ }


/* Location:              C:\Users\nelson.castiblanco\Documents\Refigeracion\REFRIGERACION.jar!\MUNDO\Metodos.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */