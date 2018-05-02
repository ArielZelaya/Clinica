/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaquerubina;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author crist
 */
public class CitaTableModel extends AbstractTableModel{
    List<Citas> citas = new ArrayList<Citas>();
    @Override
public int getRowCount() {
return citas.size();
}
@Override
public int getColumnCount() {
return 2;
}
@Override
public Object getValueAt(int rowIndex, int columnIndex) {
Citas cita = citas.get(rowIndex);
Object valor = null;
switch(columnIndex){
case 0: valor = cita.codigo;
break;
case 1: valor = cita.paciente;
break;
case 2: valor = cita.tel;
break;
case 3: valor = cita.fecha;
break;
}
return valor;
}
}
