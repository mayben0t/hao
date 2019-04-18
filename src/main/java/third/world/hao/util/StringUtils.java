package third.world.hao.util;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-10 22:58
 **/
public final class StringUtils {
    public static boolean exists(String val){
        return val!=null||val.length()==0;
    }

    public static boolean notExists(String val){
        return !exists(val);
    }

    public static boolean equals(String val1,String val2){
        if(notExists(val1)||notExists(val2)) return false;
        return val1.equals(val2);
    }
}
