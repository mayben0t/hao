package third.world.hao.service;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import third.world.hao.exception.CommonException;
import third.world.hao.mapper.RevenueMapper;
import third.world.hao.model.Revenue;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-10 23:40
 **/
@Service
public class RevenueService {

    @Autowired
    private RevenueMapper revenueMapper;

    public void insert(Revenue revenue){
        revenue.setId(null);
        List<Revenue> revenues = revenueMapper.selectByThree(revenue.getUserId(), revenue.getParent(), revenue.getMonth());
        if(revenues!=null&&revenues.size()>0){ throw new CommonException("对不起，该账号该亲戚名该月已有记录");
        }
        revenueMapper.insertSelective(revenue);
    }

    public void delete(Integer id){
        if(id==null) return;
        revenueMapper.deleteByPrimaryKey(id);
    }

    public void update(Revenue revenue){
        revenueMapper.updateByPrimaryKey(revenue);
    }

    public Revenue get(Integer id){
        return revenueMapper.selectByPrimaryKey(id);
    }

    public List<Map<String,String>> getAll( String userId){
        return revenueMapper.selectByIdAndParent(userId);
    }
}
