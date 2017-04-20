package ui;

import java.awt.Dimension;
import java.util.Iterator;
import java.util.List;

import javax.swing.GroupLayout;

import beans.Albergue;

public class DataTableAlbergues extends javax.swing.JFrame {

	String[] columnas;
	static List albergues;
	int width;
	int heigth;
    /**
     * Creates new form DataTableAlbergues
     */
    public DataTableAlbergues(List albergues) {
    	this.albergues=albergues;
        initComponents(albergues);
        this.setExtendedState(MAXIMIZED_BOTH);
        
        this.setVisible(true);
        
        width=this.getWidth();
        heigth=this.getHeight();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(List albergues) {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfBusqueda = new javax.swing.JTextField();

      //"Tipo";"Nombre";"Direcci�n";"C.Postal";"Provincia";"Municipio";"Localidad";"Nucleo";"Tel�fono 1";"Tel�fono 2";"Tel�fono 3";"Fax";"Email";"web";"Q Calidad";"Central Reservas";
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        columnas=new String [] {   "Tipo", "Nombre", "Direccion", "Codigo postal","Provincia","Municipio","Localidad","Nucleo","Telefono 1","Telefono 2","Telefono 3","Fax","Email","Web","Q Calidad","Central Reservas"};
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            parseList(albergues),columnas        
            
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class,java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        
        jScrollPane1.setViewportView(jTable2);
        
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(DataTableAlbergues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataTableAlbergues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataTableAlbergues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataTableAlbergues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataTableAlbergues(albergues).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfBusqueda;
    // End of variables declaration      
    
    private Object[][] parseList(List albergues){
    	int numReg=albergues.size();
    	Object[][] arrayAlbergues=new Object[numReg][this.columnas.length]; 
    	
    	Iterator it=albergues.iterator();
    	
    	int index=0;
    	System.out.println(numReg);
    	System.out.println(this.columnas.length);
    	while(it.hasNext()){
    		String[] aux=new String[3];
    		Albergue a=(Albergue) it.next();
    		arrayAlbergues[index][0]=a.getTipo();
    		arrayAlbergues[index][1]=a.getNombre();
    		arrayAlbergues[index][2]=a.getDireccion();
    		arrayAlbergues[index][3]=a.getCodigoPostal();
    		arrayAlbergues[index][4]=a.getProvincia();
    		arrayAlbergues[index][5]=a.getLocalidad();
    		arrayAlbergues[index][6]=a.getMunicipio();
    		arrayAlbergues[index][7]=a.getNucleo();
    		aux=a.getTelefono();
    		System.out.println(a.getTelefono().toString());
    		arrayAlbergues[index][8]=a.getTelefono()[0];
    		arrayAlbergues[index][9]=a.getTelefono()[1];
    		arrayAlbergues[index][10]=a.getTelefono()[2];
    		arrayAlbergues[index][11]=a.getFax();
    		arrayAlbergues[index][12]=a.getEmail();
    		arrayAlbergues[index][13]=a.getWeb();
    		arrayAlbergues[index][14]=a.getQcalidad();
    		arrayAlbergues[index][15]=a.getCentralReservas();
    		index=index+1;
    	}
    	
    	return arrayAlbergues;
    } 

}
