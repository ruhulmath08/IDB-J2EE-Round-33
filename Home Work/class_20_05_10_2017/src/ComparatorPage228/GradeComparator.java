package ComparatorPage228;

import java.util.Comparator;

public class GradeComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if (((Student)o1).GPA == ((Student)o2).GPA) {
            return 0;
        }
        else if(((Student)o1).GPA < ((Student)o2).GPA){
            return -1;
        }
        return 1;
    }
    
}
