package third.world.hao.dto;

import third.world.hao.model.Authority;
import third.world.hao.model.Policy;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-14 01:10
 **/
public class AuthorityDTO {
    private String userId;

    private Authority authority;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }
}
