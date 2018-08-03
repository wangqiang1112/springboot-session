package htjs.tools;

import java.util.List;

/**
 * Created by Administrator on 2018/7/18.
 */
public class Tools {

    public static String list2str(List list){
        String s = "";
        for(int i= 0;i < list.size();i++){
            s += list.get(i).toString()+"\r\n";
        }
        return s;
    }

}
