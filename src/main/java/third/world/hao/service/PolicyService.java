package third.world.hao.service;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import third.world.hao.constant.Info;
import third.world.hao.exception.CommonException;
import third.world.hao.mapper.PolicyMapper;
import third.world.hao.model.Policy;

import java.util.Collection;
import java.util.List;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-13 23:25
 **/
@Service
public class PolicyService {
    @Autowired
    private PolicyMapper policyMapper;

    public void insert(Policy policy,String userId){
        if(Strings.isNullOrEmpty(userId)) throw new CommonException("请检查用户id");
        else if(userId.equalsIgnoreCase(Info.ADMIN.getCode()));
        policyMapper.insert(policy);
    }

    public void delete(Integer id){
        policyMapper.deleteByPrimaryKey(id);
    }

    public void update(Policy policy){
        policyMapper.updateByPrimaryKey(policy);
    }

    public Policy selectById(Integer id){
        if(id==null) return null;
        Optional<Integer> possible = Optional.of(id);
        return policyMapper.selectByPrimaryKey(possible.get());
    }

    public List<Policy> selectAll(){
//        List ls = policyMapper.selectByExample(null);
//        Collection<Policy> filter = Collections2.filter(ls, new Predicate<Policy>() {
//            @Override
//            public boolean apply(Policy input) {
//                if(input.get)
//                return false;
//            }
//        });
        return policyMapper.selectByExampleWithBLOBs(null);
    }


//    public static void main(String[] args) {
//        List<Integer> ls =Lists.newArrayList();
//        for(int i=0;i<10;i++){
//            ls.add(i);
//        }
//        Collection<Integer> filter = Collections2.filter(ls, new Predicate<Integer>() {
//            @Override
//            public boolean apply(Integer input) {
//                if (input > 3) return true;
//                return false;
//            }
//        });
//        System.out.println(filter);
//    }
}
