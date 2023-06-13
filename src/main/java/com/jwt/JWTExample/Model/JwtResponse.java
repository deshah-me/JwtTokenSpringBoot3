package com.jwt.JWTExample.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtResponse {

    public String jwtToken;
    public String username;
}
