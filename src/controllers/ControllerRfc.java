
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelRfc;
import views.ViewRfc;
import extras.DataValidation;


public class ControllerRfc implements ActionListener{
  ModelRfc modelRfc;
  ViewRfc viewRfc;
  DataValidation dataValidation = new DataValidation();
  
    public ControllerRfc(ModelRfc modelRfc, ViewRfc viewRfc) {
        this.modelRfc = modelRfc;
        this.viewRfc = viewRfc;
        this.viewRfc.jb_calcular.addActionListener(this);
        initComponets();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewRfc.jb_calcular){
            jb_calcular_action_performed();
        }
    }

    private void jb_calcular_action_performed() {
       modelRfc.setApellido_p(String.valueOf(viewRfc.jtf_ap_p.getText()));
       modelRfc.setApellido_m(String.valueOf(viewRfc.jtf_ap_m.getText()));
       modelRfc.setNombres(String.valueOf(viewRfc.jtf_nombre.getText()));
       modelRfc.setAnio(dataValidation.string2Int(viewRfc.jtf_anio.getText()));
       modelRfc.setMes(String.valueOf(viewRfc.jcb_mes.getSelectedIndex()));
       modelRfc.setDia(String.valueOf(viewRfc.jcb_dia.getSelectedIndex()));
       modelRfc.calcular();
       viewRfc.jl_rfc.setText(String.valueOf(modelRfc.getRfc()));
        
    }

    private void initComponets() {
        viewRfc.setVisible(true);
        viewRfc.jtf_ap_p.setText(String.valueOf(modelRfc.getApellido_p()));
        viewRfc.jtf_ap_m.setText(String.valueOf(modelRfc.getApellido_m()));
        viewRfc.jtf_nombre.setText(String.valueOf(modelRfc.getNombres()));
        viewRfc.jtf_anio.setText(String.valueOf(modelRfc.getAnio()));
        viewRfc.jcb_mes.getSelectedIndex();
        viewRfc.jcb_dia.getSelectedIndex();
        viewRfc.jl_rfc.setText(String.valueOf(modelRfc.getRfc()));
        
    }
    
}
