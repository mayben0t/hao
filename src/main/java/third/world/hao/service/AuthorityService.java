package third.world.hao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.util.AuthResources;
import third.world.hao.mapper.AuthorityMapper;
import third.world.hao.model.Authority;
import third.world.hao.model.AuthorityExample;

import java.util.List;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-11 22:08
 **/
@Service
public class AuthorityService {
    @Autowired
    private AuthorityMapper authorityMapper;

    public void insert(Authority authority){
        authorityMapper.insert(authority);
    }

    public void delete(int i){
        authorityMapper.deleteByPrimaryKey(i);
    }

    public void update(Authority authority,Integer id){
        authorityMapper.updateByExample(authority,id);
    }

    public List<Authority> getAll(){
        AuthorityExample authorityExample = new AuthorityExample();
        authorityExample.setOrderByClause("id");
        return authorityMapper.selectByExampleWithBLOBs();
    }

    public Authority get(int id){
        return authorityMapper.selectByPrimaryKey(id);
    }
}
