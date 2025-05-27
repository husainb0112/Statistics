import java.util.ArrayList; 
public class DataSet {

    private ArrayList<Double> data = new ArrayList<>();
    
    public DataSet(ArrayList<Double> d) {
        data = d;
        int indexOfMin = 0;
        double min = data.get(0);
        for (int i = 0; i < data.size(); i++) {
            for(int j = i; j < data.size(); j++) {
                if(data.get(j) < min) {
                    min = data.get(j);
                    indexOfMin = j;
                } 
                }
                double temp = data.get(i);
                if(temp > min) {
                    data.set(indexOfMin, temp);
                    data.set(i, min);
            }

        }
        System.out.println(data);

    }
}