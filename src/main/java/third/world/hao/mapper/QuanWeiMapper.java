package third.world.hao.mapper;

import org.apache.ibatis.annotations.Mapper;
import third.world.hao.model.QuanWei;

import java.util.List;

@Mapper
public interface QuanWeiMapper {
    void insert(QuanWei quanWei);

    void delete(int id);

    void update(QuanWei quanWei);

    List<QuanWei> getAll();
}
