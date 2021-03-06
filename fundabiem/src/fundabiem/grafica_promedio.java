/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundabiem;

import conexion.conectar;
import java.awt.image.BufferedImage;
import java.sql.*;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import static fundabiem.Menu_estadisticas.jTextidpaciente;
import static fundabiem.Menu_estadisticas.jTextnombre;
import static fundabiem.Menu_estadisticas.jTextapellido;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author rrodas
 */

public class grafica_promedio extends javax.swing.JInternalFrame {

    /**
     * Creates new form grafica_promedio_prueba
     */
    
    
    conectar cc= new conectar();
    Connection cn = cc.conexion();
    
    
    public grafica_promedio() {
        
        setSize(200, 200);
        setLocation(0, 316);
        initComponents();
        
        int idbuscar = Integer.parseInt(jTextidpaciente.getText());
        int valorIsensorial=0;
        int valorItiempo=0;
        int valorIintelectual=0;
        String nombrepaciente = jTextnombre.getText();
        String apellidopaciente = jTextapellido.getText();
        String Sql= "SELECT Avg(indicador_sensorial) AS Promedio1, Avg(indicador_tiempo) AS Promedio2, Avg(indicador_intelectual) AS Promedio3 FROM terapia WHERE paciente_id=" + idbuscar + " ;";
        
        try {
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(Sql);
             while(rs.next()){
              valorIsensorial= rs.getInt("Promedio1");
              valorItiempo= rs.getInt("Promedio2");
              valorIintelectual= rs.getInt("Promedio3");
             } 
        } catch (SQLException ex) {
            Logger.getLogger(niveles.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
                //Se almacenan los datos que seran usados en el gráfico
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(valorIsensorial,"indice","sensorial");
        datos.setValue(valorItiempo,"indice","tiempo");
        datos.setValue(valorIintelectual,"indice","intelectual");
        
        //Se crea el gráfico y se asignan algunas caracteristicas
        JFreeChart grafico_barras = ChartFactory.createBarChart3D("Promedio Sesiones, recuperación por indice","Paciente: " + nombrepaciente + " " + apellidopaciente, "Promedios",datos, PlotOrientation.VERTICAL, true, true, false);
        
        //Se guarda el grafico
        BufferedImage image = grafico_barras.createBufferedImage(390,265);
        
        //Se crea la imagen y se agrega a la etiqueta
        grafico.setIcon(new ImageIcon(image));
        
        pack();
        repaint();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
     /**
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 */
    
        private void initComponents() {

        grafico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(grafico)
                .addContainerGap(381, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grafico)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        pack();
    }
  private javax.swing.JLabel grafico;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
