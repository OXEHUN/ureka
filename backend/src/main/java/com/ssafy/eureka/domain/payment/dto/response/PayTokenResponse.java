package com.ssafy.eureka.domain.payment.dto.response;

import lombok.Getter;

@Getter
public class PayTokenResponse {
    private int cardId;
    private String cardIdentifier;
    private String grantType;
    private String accessToken;
    private String refreshToken;
}
