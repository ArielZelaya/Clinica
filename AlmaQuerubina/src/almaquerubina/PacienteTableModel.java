/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaquerubina;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author crist
 */
public class PacienteTableModel extends AbstractTableModel {
    List<Paciente> pacientes = new ArrayList<Paciente>();

   @Override
public int getRowCount() {
return pacientes.size();
}
@Override
public int getColumnCount() {
return 5;
}
@Override
public Object getValueAt(int rowIndex, int columnIndex) {
Paciente paciente = pacientes.get(rowIndex);
Object valor = null;
switch(columnIndex){
case 0: valor = paciente.codigo;
break;
case 1: valor = paciente.nombre;
break;
case 2: valor = paciente.direccion;
break;
case 3: valor = paciente.telefono;
break;
case 4: valor=paciente.telefono2;
}
return valor;
}
    
}
