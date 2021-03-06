package third.world.hao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import third.world.hao.model.Call;
import third.world.hao.model.CallExample;

@Mapper
public interface CallMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call
     *
     * @mbg.generated
     */
    long countByExample(CallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call
     *
     * @mbg.generated
     */
    int deleteByExample(CallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call
     *
     * @mbg.generated
     */
    int insert(Call record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call
     *
     * @mbg.generated
     */
    int insertSelective(Call record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call
     *
     * @mbg.generated
     */
    List<Call> selectByExample(CallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call
     *
     * @mbg.generated
     */
    Call selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Call record, @Param("example") CallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Call record, @Param("example") CallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Call record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table call
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Call record);
}