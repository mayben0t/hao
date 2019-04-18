package third.world.hao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import third.world.hao.model.Chat;
import third.world.hao.model.ChatExample;

@Mapper
public interface ChatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbg.generated
     */
    long countByExample(ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbg.generated
     */
    int deleteByExample(ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbg.generated
     */
    int insert(Chat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbg.generated
     */
    int insertSelective(Chat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbg.generated
     */
    List<Chat> selectByExample(ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbg.generated
     */
    Chat selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Chat record, @Param("example") ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Chat record, @Param("example") ChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Chat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Chat record);
}