package cn.elvea.domain;

public class Member extends IdEntity {
    private Long id;
    private String username;
    private String nickname;
    private String password;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
