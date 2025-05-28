import java.util.ArrayList; 
public class DataSet {

    private ArrayList<Double> data = new ArrayList<>();
    
    public DataSet(ArrayList<Double> d) {
        data = d;
        for (int i = 0; i < data.size() - 1; i++) {
            int indexOfMin = i;
            for(int j = i + 1; j < data.size(); j++) {
                if(data.get(j) < data.get(indexOfMin)) {
                   indexOfMin = j;
                }
            }
            double temp = data.get(i);
            data.set(i, data.get(indexOfMin));
            data.set(indexOfMin, temp);  
        }        
    }
}