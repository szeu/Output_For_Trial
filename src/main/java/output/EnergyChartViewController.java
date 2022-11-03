package output;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class EnergyChartViewController implements Initializable {

    @FXML
    private LineChart<Integer, Integer> energyLineChart;
    
    @FXML
    private NumberAxis xAxis;

    @FXML
    private NumberAxis yAxis;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		xAxis.setLabel("Number of Students = " + OutputUIApplication.students.size());
		yAxis.setLabel("Energy %");
		
		XYChart.Series<Integer, Integer> K1_series = new XYChart.Series<Integer, Integer>();
		K1_series.setName("K1_energy");
		XYChart.Series<Integer, Integer> K2_series = new XYChart.Series<Integer, Integer>();
		K2_series.setName("K2_energy");
		
		Collections.sort(OutputUIApplication.students);
		
		initK1SeriesData(K1_series, OutputUIApplication.students);
		initK2SeriesData(K2_series, OutputUIApplication.students);
		
		energyLineChart.getData().add(K1_series);
		energyLineChart.getData().add(K2_series);
	}
	
	private void initK1SeriesData(XYChart.Series<Integer, Integer> series, ArrayList<Student> students) {
		for(int i = 0; i < students.size(); i++)
			series.getData().add(new XYChart.Data<Integer, Integer>(i+1, students.get(i).getK1Energy()));
	}

	private void initK2SeriesData(XYChart.Series<Integer, Integer> series, ArrayList<Student> students) {
		for(int i = 0; i < students.size(); i++)
			series.getData().add(new XYChart.Data<Integer, Integer>(i+1, students.get(i).getK2Energy()));
	}
}
