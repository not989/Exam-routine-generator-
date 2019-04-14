
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class teacher {
    String[] teach;
    int sz2;
    
    
    teacher(String[] teac){
        
        //SHUFFLING TEACHER ARRAY
        String[] o;
        List<String> strL = Arrays.asList(teac);
        Collections.shuffle(strL);
        o = strL.toArray(new String[strL.size()]);
        sz2=strL.size();
        
        //FILTERING ARRAY
        teach = new String[sz2];
        for(int i=0,j=0; i < sz2; i++){
            if(o[i] != null){
                teach[j]=o[i];
                j++;
            }
        }
    }
    
    int len(){
        //RETURN  LENGTH OF TEACHER ARRAY
        return teach.length;
    }
} 
