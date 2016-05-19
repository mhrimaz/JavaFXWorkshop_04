/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxworkshop_04;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.NumberStringConverter;

/**
 *
 * @author mhrimaz
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ProgressBar bar;
    @FXML
    private ProgressIndicator indicator;
    @FXML
    private Slider slider;
    @FXML
    private TextField field;
    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        field.textProperty().bindBidirectional(slider.valueProperty(),
                NumberFormat.getNumberInstance());
        label.textProperty().bind(field.textProperty().concat(" Progress"));
        bar.progressProperty().bind(slider.valueProperty());
        
        indicator.progressProperty().bind(bar.progressProperty());
    }

}
