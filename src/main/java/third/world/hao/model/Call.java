package third.world.hao.model;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table call
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Call implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column call.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column call.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column call.chat_id
     *
     * @mbg.generated
     */
    private Integer chatId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table call
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column call.id
     *
     * @return the value of call.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column call.id
     *
     * @param id the value for call.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column call.user_id
     *
     * @return the value of call.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column call.user_id
     *
     * @param userId the value for call.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column call.chat_id
     *
     * @return the value of call.chat_id
     *
     * @mbg.generated
     */
    public Integer getChatId() {
        return chatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column call.chat_id
     *
     * @param chatId the value for call.chat_id
     *
     * @mbg.generated
     */
    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }
}