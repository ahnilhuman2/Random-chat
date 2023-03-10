package com.example.randomchat.user.request;

import com.example.randomchat.user.User;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class JoinRequest {
    @NotBlank
    private String token;

    @NotBlank(message = "아이디는 필수 입력 값입니다.")
    @Min(4)
    @Max(10)
    private String username;

    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}",
            message = "비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
    private String password;

    @NotBlank(message = "별명을 설정해주세요")
    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z0-9-_]{2,10}$",
            message = "닉네임은 특수문자를 제외한 2~10자리여야 합니다.")
    private String name;

    @NotBlank(message = "전화번호를 입력해주세요")
    @Pattern(regexp = "^\\d{2,3}[- ]?\\d{3,4}[- ]?\\d{4}$",
            message = "전화번호를 올바른 형식으로 입력해주세요.")
    private String phone;

    public User toUser() {
        User user = new User();
        user.setToken(token);
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setPhone(phone);
        return user;
    }

    public void test(String t, String d) {

    }
}
