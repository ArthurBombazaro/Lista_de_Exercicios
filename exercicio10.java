import javax.swing.JComponent;
import javax.swing.JOptionPane;
public class exercicio10 {
    public static void main(String[] args){
        String dia= JOptionPane.showInputDialog(null, "digite número entre 1 a 7: ");
        if (dia != null){
            try{
                int diadasemana = Integer.parseInt(dia);
                if (diadasemana==1)
                    dia = "Domingo";
                else if (diadasemana==2)
                    dia = "Segunda-feira";
                else if (diadasemana==3)
                    dia = "Terça-feira";
                else if (diadasemana==4)
                    dia = "Quarta-feira";
                else if (diadasemana==5)
                    dia = "Quinta-feira";
                else if (diadasemana==6)
                    dia = "Sexta-feira";
                else if (diadasemana==7)
                    dia = "Sábado";
                else 
                    dia = "Dia inválido";                    
                JOptionPane.showMessageDialog(null, dia);    
            }    

            catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Formato inválido");

            }
    }    
}

}
