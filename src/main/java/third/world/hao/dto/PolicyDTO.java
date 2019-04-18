package third.world.hao.dto;

import third.world.hao.model.Policy;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-14 01:10
 **/
public class PolicyDTO {
    private String userId;

    private Policy policy;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }
}
