package ui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import beans.Albergue;
import ui.listeners.GuardarCambiosListener;

public class ModificarAlbergueGUI extends javax.swing.JFrame {

    /**
     * Creates new form formularioInsertar
     */
	private String[] arrayNombres;
	private List  lista;
    public ModificarAlbergueGUI(List lista) {
    	int numElements=0;
		
		numElements=lista.size();
		int indice=0;
		arrayNombres=new String[numElements];
		for (Object obj : lista) {
			Albergue albergue=(Albergue)obj;
			arrayNombres[indice]=albergue.getNombre();
			indice++;
		}
    	
    	this.lista=lista;
    	
    	
    	initComponents();
    	this.setVisible(true);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btAceptar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        panelFormulario = new javax.swing.JPanel();
        lbTipo = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lbDireccion = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        lbCP = new javax.swing.JLabel();
        tfCP = new javax.swing.JTextField();
        lbProvincia = new javax.swing.JLabel();
        cbProvincia = new javax.swing.JComboBox<>();
        lbMunicipio = new javax.swing.JLabel();
        tfMunicipio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfLocalidad = new javax.swing.JTextField();
        lbNucleo = new javax.swing.JLabel();
        tfNucleo = new javax.swing.JTextField();
        lbTelefono1 = new javax.swing.JLabel();
        tfTelefono1 = new javax.swing.JTextField();
        lbTelefono2 = new javax.swing.JLabel();
        tfTelefono2 = new javax.swing.JTextField();
        lbTelefono3 = new javax.swing.JLabel();
        tfTelefono3 = new javax.swing.JTextField();
        lbFax = new javax.swing.JLabel();
        lbWeb = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbCalidad = new javax.swing.JLabel();
        tfWeb = new javax.swing.JTextField();
        tfFax = new javax.swing.JTextField();
        lbCentralReservas = new javax.swing.JLabel();
        tfReservas = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        cbCalidad = new javax.swing.JComboBox<>();
        lbTitulo = new javax.swing.JLabel();
        cbLista = new javax.swing.JComboBox(arrayNombres);
        cbLista.addItemListener(new ItemListener(){

        	@Override
        	public void itemStateChanged(ItemEvent e) {
        		
        		// TODO Auto-generated method stub
        		if (e.getStateChange() == ItemEvent.SELECTED) {
        	          item =e.getItem();
        	          // do something with object
        	          //
        	          for (Object a : lista) {
						Albergue miAlbergue=(Albergue)a;
						if(((String)item).equalsIgnoreCase(miAlbergue.getNombre())){
							
							//tfId.setText(String.valueOf(miAlbergue.getId()));
							tfNombre.setText(miAlbergue.getNombre());
							tfTipo.setText(miAlbergue.getTipo());
							tfDireccion.setText(miAlbergue.getDireccion());
							cbProvincia.setSelectedItem(miAlbergue.getProvincia());
							tfCP.setText(String.valueOf(miAlbergue.getCodigoPostal()));
							tfMunicipio.setText(miAlbergue.getMunicipio());
							tfLocalidad.setText(miAlbergue.getLocalidad());
							tfTelefono1.setText(miAlbergue.getTelefono()[0]);
							tfTelefono2.setText(miAlbergue.getTelefono()[1]);
							tfTelefono3.setText(miAlbergue.getTelefono()[2]);
							tfFax.setText(miAlbergue.getFax());
							tfWeb.setText(miAlbergue.getWeb());
							tfEmail.setText(miAlbergue.getEmail());
							tfReservas.setText(miAlbergue.getCentralReservas());
						
						}
					}
        	          //System.out.println(item.toString());
        	       }
        		
        	}});
        
        jLabel2 = new javax.swing.JLabel();
        //lbId = new javax.swing.JLabel();
        //tfId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btAceptar.setText("Aceptar");
        Albergue aux=RegistryUpdates();
        btAceptar.addActionListener(new GuardarCambiosListener(aux));
        btCancelar.setText("Cancelar");

        lbTipo.setText("Tipo:");

        lbNombre.setText("Nombre:");

        lbDireccion.setText("Direccion:");

        lbCP.setText("C. Postal:");

        lbProvincia.setText("Provincia:");

        cbProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avila", "Burgos", "Leon", "Palencia", "Salamanca", "Segovia", "Soria", "Valladolid", "Zamora" }));

        lbMunicipio.setText("Municipio:");

        jLabel1.setText("Localidad:");

        lbNucleo.setText("Nucleo:");

        lbTelefono1.setText("Telefono 1:");

        lbTelefono2.setText("Telefono 2:");

        lbTelefono3.setText("Telefono 3:");

        lbFax.setText("Fax:");

        lbWeb.setText("Web:");

        lbEmail.setText("Email:");

        lbCalidad.setText("QCalidad:");

        lbCentralReservas.setText("Central Reservas:");

        cbCalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excelente", "Superior", "Aceptable", "Mala", "Muy Deficiente", " " }));

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCP)
                            .addComponent(lbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 98, Short.MAX_VALUE))
                            .addComponent(tfCP)
                            .addComponent(tfDireccion)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombre)
                            .addComponent(lbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(tfTipo)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(lbNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNucleo))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMunicipio))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(tfLocalidad)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(lbTelefono2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTelefono3)
                            .addComponent(lbFax, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfFax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefono3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefono1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEmail)
                            .addComponent(lbCalidad)
                            .addComponent(lbWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCentralReservas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfReservas)
                            .addComponent(tfWeb)
                            .addComponent(tfEmail)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addComponent(cbCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefono1)
                    .addComponent(tfTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefono2)
                    .addComponent(tfTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDireccion)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefono3)
                    .addComponent(tfTelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCP)
                    .addComponent(tfCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFax)
                    .addComponent(tfFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProvincia)
                    .addComponent(cbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbWeb)
                    .addComponent(tfWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMunicipio)
                    .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCalidad)
                    .addComponent(cbCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNucleo)
                    .addComponent(tfNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCentralReservas)
                    .addComponent(tfReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbTitulo.setText("FORMULARIO DE REGISTRO DE ALBERGUE");

        jLabel2.setText("Selecciona Albergue: ");

        //lbId.setText("ID: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbLista, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                       // .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                       // .addGap(39, 39, 39)
                       // .addComponent(tfId)
                        ))
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       // .addComponent(lbId)
                       // .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    		))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAceptar)
                    .addComponent(btCancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

   public Albergue RegistryUpdates(ModificarAlbergueGUI this){
	   Albergue a=new Albergue();
	   a.setTipo(tfTipo.getText());
	   a.setNombre(tfNombre.getText());
	   a.setDireccion(tfDireccion.getText());
	   a.setProvincia(cbProvincia.getSelectedItem().toString());
	   a.setCodigoPostal(Integer.parseInt(tfCP.getText()));
	   a.setMunicipio(tfMunicipio.getText());
	   a.setLocalidad(tfLocalidad.getText());
	   String[] tfs=new String[3];
	   tfs[0]=tfTelefono1.getText();
	   tfs[1]=tfTelefono2.getText();
	   tfs[2]=tfTelefono3.getText();
	   a.setTelefono(tfs);
	   a.setFax(tfFax.getText());
	   a.setWeb(tfWeb.getText());
	   a.setEmail(tfEmail.getText());
	   a.setCentralReservas(tfReservas.getText());
	   
	   return a;
	   
   }                                       

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
            java.util.logging.Logger.getLogger(ModificarAlbergueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarAlbergueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarAlbergueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarAlbergueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarAlbergueGUI(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JComboBox<String> cbCalidad;
    private javax.swing.JComboBox<String> cbLista;
    private javax.swing.JComboBox<String> cbProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbCP;
    private javax.swing.JLabel lbCalidad;
    private javax.swing.JLabel lbCentralReservas;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFax;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbMunicipio;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNucleo;
    private javax.swing.JLabel lbProvincia;
    private javax.swing.JLabel lbTelefono1;
    private javax.swing.JLabel lbTelefono2;
    private javax.swing.JLabel lbTelefono3;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbWeb;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTextField tfCP;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFax;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfLocalidad;
    private javax.swing.JTextField tfMunicipio;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNucleo;
    private javax.swing.JTextField tfReservas;
    private javax.swing.JTextField tfTelefono1;
    private javax.swing.JTextField tfTelefono2;
    private javax.swing.JTextField tfTelefono3;
    private javax.swing.JTextField tfTipo;
    private javax.swing.JTextField tfWeb;
    private Object item;
    // End of variables declaration                   
}