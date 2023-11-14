package com.forestales.geforex.dto;

import com.forestales.geforex.enums.E_UserAuthority;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
    Long id;
    String login;
    String name;
    String mail;
    String avatar;
    List<E_UserAuthority> rol;
}
