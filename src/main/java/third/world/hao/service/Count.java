package third.world.hao.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-14 14:48
 **/
@Service
public class Count {
    /**
     * 请求参数
     * @param month 1 当前月份
     * @param salary 2 本月税前工资
     * @param allSalary 3 累计收入
     * @param fivejin 4 五险一金
     * @param allFivejin 5 累计五险一金
     * @param addjin 6 专项附加扣除
     * @param allAddjin 7 累计专项附加扣除
     * @param beforepay 14 累计已缴税额
     * @return
     */
    public Map<String,Object> getData(int month, int salary, Double allSalary, Double fivejin, Double allFivejin, Double addjin , Double allAddjin, Double beforepay){
        Map<String,Object> map = new HashMap<String, Object>();
        Double pay = allSalary-allFivejin-allAddjin-5000*month; //10
        Double allpay;//13
        if (pay<36000){
            allpay =pay*0.03;
        }else if (pay<144000){
            allpay = pay*0.03 +(pay-36000)*0.1-2520;
        }else if (pay<300000){
            allpay = pay*0.03 +(pay-36000)*0.1+(pay-144000)*0.2-16920;
        }else if (pay<420000){
            allpay = pay*0.03 +(pay-36000)*0.1+(pay-144000)*0.2+(pay-300000)*0.25-31920;
        }else if (pay<660000){
            allpay = pay*0.03 +(pay-36000)*0.1+(pay-144000)*0.2+(pay-300000)*0.25+(pay-420000)*0.3-52920;
        }else if (pay<960000){
            allpay = pay*0.03 +(pay-36000)*0.1+(pay-144000)*0.2+(pay-300000)*0.25+(pay-420000)*0.3+(pay-660000)*0.35-85920;
        }else {
            allpay = pay*0.03 +(pay-36000)*0.1+(pay-144000)*0.2+(pay-300000)*0.25+(pay-420000)*0.3+(pay-660000)*0.35+(pay-960000)*0.45-181920;
        }
        Double nowpay =allpay-beforepay;
        //返回值
        map.put("pay",pay); //应纳税所得额
        map.put("allpay",allpay);//累计应纳税额
        map.put("nowpay",nowpay);// 当月个税
        return map;
    }

}
