package third.world.hao.service;

import org.springframework.stereotype.Service;
import third.world.hao.model.QuanWei;

import java.util.List;


//@Service
public interface QuanweiService {
    void insert(QuanWei quanWei);

    void delete(int id);

    void update(QuanWei quanWei);

    List<QuanWei> getAll();
}
