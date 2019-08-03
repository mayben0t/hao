package third.world.hao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import third.world.hao.mapper.QuanWeiMapper;
import third.world.hao.model.QuanWei;
import third.world.hao.service.QuanweiService;

import java.util.List;


@Service
public class QuanWeiServiceImpl implements QuanweiService {
    @Autowired
    private QuanWeiMapper quanWeiMapper;


    @Override
    public void insert(QuanWei quanWei) {
        quanWeiMapper.insert(quanWei);
    }

    @Override
    public void delete(int id) {
        quanWeiMapper.delete(id);
    }

    @Override
    public void update(QuanWei quanWei) {
        quanWeiMapper.update(quanWei);
    }

    @Override
    public List<QuanWei> getAll() {
        return quanWeiMapper.getAll();
    }
}
