import java.util.ArrayList;

public class checkArraySum {
    public ArrayList<Integer> givenArr = new ArrayList<Integer>(100);
    private int sum;

    public checkArraySum(ArrayList array, int k){
        this.givenArr = array;
        this.sum = k;
    }

    public boolean sumInArray(){
        ArrayList<Integer> tempArray = new ArrayList<Integer>(100);
        int i = 0;
        int comp;
        while (i < givenArr.size()){
            comp = sum - givenArr.get(i);
            for(int j = 0; j<tempArray.size(); j++) {
                if (givenArr.get(i) == tempArray.get(j)) return true;
            }
            tempArray.add(comp);
            i++;
        }
        return false;
    }
}
