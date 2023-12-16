import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatesRange {
    public static LocalDate[] getDatesRange(LocalDate first, LocalDate second){
        if(second.isBefore(first)){
            return new LocalDate[0];
        }
        if(first.isEqual(second)){
            return new LocalDate[]{first};
        }
        LocalDate[] range=new LocalDate[(int) ChronoUnit.DAYS.between(first,second)+1];
        range[0]=first;
        for(int i =1; i< range.length;i++){
            range[i]=range[i-1].plusDays(1);
        }
        return range;
    }
}
