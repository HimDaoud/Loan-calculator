package com.example.lanekalkulatorhimsin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

class Kalkulator{
    public static String Inputene(String beløp, String rente, String år) {
        try {
            double innBeløp = Double.parseDouble(beløp);
            double innRente = Double.parseDouble(rente);
            double innÅr = Double.parseDouble(år);
            double renteBeregning = innBeløp * (innRente / 100) * ((innÅr + 1) / 2);
            double resultat = renteBeregning + innBeløp;
            DecimalFormat df1 = new DecimalFormat("#,###,##0.00");
            DecimalFormat df2 = new DecimalFormat("0");
            return "Totallbeløp etter " + df2.format(innÅr) + " blir: " + df1.format(resultat) + " kr.";
        }
        catch (Exception e) {
            return "Skriv inn tall!";
        }
    }
}
public class HelloController {

    @FXML
    private Label lblResultat;

    @FXML
    private Label txtAntallÅr;

    @FXML
    private TextField txtBeløp;

    @FXML
    private TextField txtRente;

    @FXML
    void Beregn(ActionEvent event) {
        String ut= Kalkulator.Inputene(txtBeløp.getText(),txtRente.getText(),txtAntallÅr.getText());
        lblResultat.setText(ut);
    }

}
