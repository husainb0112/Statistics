import java.util.ArrayList; 
public class DataSet {

    private ArrayList<Double> data = new ArrayList<>();
    
    public DataSet(ArrayList<Double> d) {
        data = d;
        for (int i = 0; i < d.size(); i++) {
            for(int j = i; j < d.size(); j++) {
                double min = d.get(i);
                if(d.get(j) < min) {
                    double temp = 
                } 
            }
        }

    }
}