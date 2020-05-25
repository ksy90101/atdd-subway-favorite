package wooteco.subway.service.member.dto;

import wooteco.subway.domain.member.Member;

import java.util.Set;

public class MemberResponse {
    private Long id;
    private String email;
    private String name;

    public MemberResponse(Long id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public static MemberResponse of(Member member) {
        return new MemberResponse(member.getId(), member.getEmail(), member.getName());
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
